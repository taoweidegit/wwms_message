package com.wmms.mutils.mapper;

import com.wmms.mutils.entity.TWare;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface TWareMapper {
    int deleteByPrimaryKey(Long ID);

    int insert(TWare record);

    int insertSelective(TWare record);

    TWare selectByPrimaryKey(Long ID);

    int updateByPrimaryKeySelective(TWare record);

    int updateByPrimaryKey(TWare record);
}