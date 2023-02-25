package com.sdu.graduate.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.sdu.graduate.entity.GraduateMasterDO;
import org.apache.ibatis.annotations.Mapper;

/**
 * @author koi
 * @date 2023/2/25 21:46
 */
@Mapper
public interface GraduateMasterMapper extends BaseMapper<GraduateMasterDO> {
    int deleteByPrimaryKey(Long mId);

    int insert(GraduateMasterDO record);

    int insertSelective(GraduateMasterDO record);

    GraduateMasterDO selectByPrimaryKey(Long mId);

    int updateByPrimaryKeySelective(GraduateMasterDO record);

    int updateByPrimaryKey(GraduateMasterDO record);
}