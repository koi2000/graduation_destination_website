package com.sdu.graduate.common.enums;

import lombok.AllArgsConstructor;
import lombok.Getter;

/**
 * @author koi
 * @date 2023/2/24 10:54
 */

// 单位性质

@Getter
@AllArgsConstructor
public enum UnitSelectionEnum {

    HIGHER_EDUCATION_UNITE(0, "高等教育单位"),
    STATE_OWNED_ENTERPRISES(1, "国有企业"),
    AGENCY(2, "机关"),
    OTHER_COMPANIES(3, "其他企业"),
    OTHER_BUSINESS_UNITES(4, "其他事业单位"),
    THREE_FUNDED_ENTERPRISES(5, "三资企业");

    public int code;
    public String message;

}
