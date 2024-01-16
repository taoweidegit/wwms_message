package com.wmms.mutils.mapper;

import com.wmms.mutils.entity.TApply;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface TApplyMapper {
    int deleteByPrimaryKey(Long ID);

    int insert(TApply record);

    int insertSelective(TApply record);

    TApply selectByPrimaryKey(Long ID);

    int updateByPrimaryKeySelective(TApply record);

    int updateByPrimaryKey(TApply record);
}