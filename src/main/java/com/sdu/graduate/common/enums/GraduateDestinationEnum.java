package com.sdu.graduate.common.enums;

import lombok.AllArgsConstructor;
import lombok.Getter;

/**
 * @author koi
 * @date 2023/2/24 10:11
 */
@Getter
@AllArgsConstructor
public enum GraduateDestinationEnum {
    ABOARD(0, "出国出境深造"),
    ADVANCEMENT(1, "升学"),
    EMPLOYMENT_AGREEMENT(2, "签就业协议形式就业"),
    EMPLOYMENT_CONTRACT(3, "签劳动合同就业"),
    OTHER_EMPLOYMENT_CERTIFICATES(4,"其他录用证明就业"),
    NON_EMPLOYMENT_FOR_ADVANCEMENT(5,"不就业拟升学"),
    PENGDING_EMPLOYMENT(6, "待就业"),
    OTHER_TEMPORARY_NON_EMPLOYMENT(7, "其他暂不就业");

    public int code;
    public String message;
}
