package com.sdu.graduate.entity;

import java.util.Date;

import com.sdu.graduate.common.entity.BaseDO;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @author koi
 * @date 2023/2/25 21:11
 */
@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class GraduateBachelorDO extends BaseDO {
    /**
    * 主键
    */
    private Long bId;

    /**
    * 创建时间
    */
    private Date bGmtCreate;

    /**
    * 修改时间
    */
    private Date bGmtModified;

    /**
    * 是否删除, 0.否, 1.是
    */
    private Byte bIsDeleted;

    /**
    * 姓名
    */
    private String bName;

    /**
    * 性别，0为男，1为女
    */
    private Byte bSex;

    /**
    * 去向
    */
    private String bDestination;

    /**
    * 单位名称
    */
    private String bOrganizationName;

    /**
    * 单位性质
    */
    private String bOrganizationProperty;

    /**
    * 单位行业
    */
    private String bOrganizationIndustry;

    /**
    * 单位所在地
    */
    private String bOrganizationLocation;

    /**
    * 工作职位类别
    */
    private String bOrganizationCategory;

    /**
    * 单位地址
    */
    private String bOrganizationLocationDetail;

    /**
    * 国家
    */
    private String bCoutry;

    /**
    * 省份
    */
    private String bProvince;

    /**
    * 城市
    */
    private String bCity;
}