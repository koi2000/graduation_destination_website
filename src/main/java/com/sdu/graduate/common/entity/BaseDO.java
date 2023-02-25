package com.sdu.graduate.common.entity;



import org.apache.commons.lang3.builder.ToStringBuilder;

import java.io.Serializable;

/**
 * @author koi
 * @date 2023/2/22 17:07
 */
public class BaseDO implements Serializable {

    private static final long serialVersionUID = 1L;

    @Override
    public String toString() {
        return ToStringBuilder.reflectionToString(this, new NoNullFieldStringStyle());
    }
}
