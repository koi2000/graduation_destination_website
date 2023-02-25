package com.sdu.graduate.common.enums;

import lombok.AllArgsConstructor;
import lombok.Getter;

/**
 * @author koi
 * @date 2023/2/24 11:45
 */

// 单位所属行业
@Getter
@AllArgsConstructor
public enum UnitIndustryEnum {
    T1(0, "办事人员和有关人员"),
    T2(1, "工程技术人员"),
    T3(0, "公务员"),
    T4(1, "教学人员"),
    T5(0, "金融业务人员"),
    T6(1, "科学研究人员"),
    T7(0, "其他人员"),
    T8(1, "其他专业技术人员"),
    T9(0, "商业和"),
    T10(1, "失败");
    public int code;
    public String message;
}
