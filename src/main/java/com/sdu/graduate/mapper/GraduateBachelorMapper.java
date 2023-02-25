package com.sdu.graduate.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.sdu.graduate.entity.GraduateBachelorDO;
import org.apache.ibatis.annotations.Mapper;

/**
 * @author koi
 * @date 2023/2/25 21:11
 */
@Mapper
public interface GraduateBachelorMapper extends BaseMapper<GraduateBachelorDO> {
    int deleteByPrimaryKey(Long bId);

    int insert(GraduateBachelorDO record);

    int insertSelective(GraduateBachelorDO record);

    GraduateBachelorDO selectByPrimaryKey(Long bId);

    int updateByPrimaryKeySelective(GraduateBachelorDO record);

    int updateByPrimaryKey(GraduateBachelorDO record);
}