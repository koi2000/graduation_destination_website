package com.sdu.graduate.config;

import com.sdu.graduate.common.annotations.ApiResponseBody;
import com.sdu.graduate.common.entity.ResponseResult;
import com.sdu.graduate.common.utils.SpringContextUtils;
import org.springframework.beans.factory.InitializingBean;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.MethodParameter;
import org.springframework.core.annotation.AnnotatedElementUtils;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.context.request.NativeWebRequest;
import org.springframework.web.method.support.HandlerMethodReturnValueHandler;
import org.springframework.web.method.support.ModelAndViewContainer;
import org.springframework.web.servlet.mvc.method.annotation.RequestMappingHandlerAdapter;
import org.springframework.web.servlet.mvc.method.annotation.RequestResponseBodyMethodProcessor;
import org.springframework.web.servlet.mvc.method.annotation.ViewNameMethodReturnValueHandler;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

/**
 * @author koi
 * @date 2023/2/22 17:21
 */
@Configuration
public class ApiResponseHandlerConfig implements InitializingBean {

    @Autowired
    private RequestMappingHandlerAdapter adapter;

    @Override
    public void afterPropertiesSet() {
        List<HandlerMethodReturnValueHandler> returnValueHandlers = adapter.getReturnValueHandlers();
        ArrayList<HandlerMethodReturnValueHandler> handlers = new ArrayList<>(returnValueHandlers);
        this.decorateHandles(handlers);
        adapter.setReturnValueHandlers(handlers);
    }


    private void decorateHandles(List<HandlerMethodReturnValueHandler> handlers) {
        for (int i = 0; i < handlers.size(); i++) {
            HandlerMethodReturnValueHandler handlerMethodReturnValueHandler = handlers.get(i);
            if (handlerMethodReturnValueHandler instanceof ViewNameMethodReturnValueHandler) {
                handlers.add(i, ResponseProcess());
                return;
            }
        }
    }

    public ResponseResultProcessorDecorator ResponseProcess() {
        return new ResponseResultProcessorDecorator();
    }

    public static class ResponseResultProcessorDecorator implements HandlerMethodReturnValueHandler {
        private RequestResponseBodyMethodProcessor delegate;

        @Override
        public boolean supportsReturnType(MethodParameter returnType) {
            return AnnotatedElementUtils.hasAnnotation(returnType.getContainingClass(), ApiResponseBody.class) ||
                    returnType.hasMethodAnnotation(ApiResponseBody.class);
        }

        @Override
        public void handleReturnValue(Object returnValue, MethodParameter returnType, ModelAndViewContainer mavContainer, NativeWebRequest webRequest) throws Exception {
            if (delegate == null) {
                delegate = (RequestResponseBodyMethodProcessor)
                        Objects.requireNonNull(SpringContextUtils.getBean(RequestMappingHandlerAdapter.class)
                                .getReturnValueHandlers())
                                .stream()
                                .filter(handler -> handler instanceof RequestResponseBodyMethodProcessor)
                                .findFirst()
                                .orElseThrow(RuntimeException::new);
            }
            delegate.handleReturnValue(ResponseResult.ok(returnValue), returnType, mavContainer, webRequest);
        }
    }


}
