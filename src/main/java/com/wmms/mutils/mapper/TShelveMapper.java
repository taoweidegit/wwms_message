package com.wmms.mutils.mapper;

import com.wmms.mutils.entity.TShelve;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface TShelveMapper {
    int deleteByPrimaryKey(Long ID);

    int insert(TShelve record);

    int insertSelective(TShelve record);

    TShelve selectByPrimaryKey(Long ID);

    int updateByPrimaryKeySelective(TShelve record);

    int updateByPrimaryKey(TShelve record);
}