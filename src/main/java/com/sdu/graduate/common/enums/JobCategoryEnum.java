package com.sdu.graduate.common.enums;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;

/**
 * @author koi
 * @date 2023/2/24 11:17
 */

// 工作性质
@Getter
@AllArgsConstructor
public enum JobCategoryEnum {

    INFORMATION(0, "信息传输、软件和信息技术服务业"),
    ERROR(1, "教育"),
    T1(0, "金融业"),
    T2(1, "教学人员"),
    T3(0, "金融业务人员"),
    T4(1, "科学研究人员"),
    T5(0, "其他人员"),
    T6(1, "其他专业技术人员"),
    T7(0, "商业和"),
    T8(1, "失败");

    public int code;
    public String message;
}
