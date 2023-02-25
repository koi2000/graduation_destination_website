package com.sdu.graduate.entity;

import java.util.Date;

import com.sdu.graduate.common.entity.BaseDO;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @author koi
 * @date 2023/2/25 21:46
 */
@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class GraduateMasterDO extends BaseDO{
    /**
    * 主键
    */
    private Long mId;

    /**
    * 创建时间
    */
    private Date mGmtCreate;

    /**
    * 修改时间
    */
    private Date mGmtModified;

    /**
    * 是否删除, 0.否, 1.是
    */
    private Byte mIsDeleted;

    /**
    * 姓名
    */
    private String mName;

    /**
    * 性别，0为男，1为女
    */
    private Byte mSex;

    /**
    * 学历
    */
    private String mQualification;

    /**
    * 专业
    */
    private String mMajor;

    /**
    * 专业方向
    */
    private String mMajorDirection;

    /**
    * 培养方式
    */
    private String mCultivationMethod;

    /**
    * 毕业去向
    */
    private String mDestination;

    /**
    * 毕业时间
    */
    private String mGraduationTime;

    /**
    * 所在班级
    */
    private String mClass;

    /**
    * 学号
    */
    private String mStuid;

    /**
    * 单位名称
    */
    private String mOrganizationName;

    /**
    * 单位性质
    */
    private String mOrganizationProperty;

    /**
    * 单位行业
    */
    private String mOrganizationIndustry;

    /**
    * 单位所在地
    */
    private String mOrganizationLocation;

    /**
    * 工作职位类别
    */
    private String mOrganizationCategory;

    /**
    * 单位地址
    */
    private String mOrganizationLocationDetail;

    /**
    * 国家
    */
    private String mCoutry;

    /**
    * 省份
    */
    private String mProvince;

    /**
    * 城市
    */
    private String mCity;
}