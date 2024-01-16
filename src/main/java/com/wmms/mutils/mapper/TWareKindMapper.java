package com.wmms.mutils.mapper;

import com.wmms.mutils.entity.TWareKind;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface TWareKindMapper {
    int deleteByPrimaryKey(Long ID);

    int insert(TWareKind record);

    int insertSelective(TWareKind record);

    TWareKind selectByPrimaryKey(Long ID);

    int updateByPrimaryKeySelective(TWareKind record);

    int updateByPrimaryKey(TWareKind record);
}