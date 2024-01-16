package com.wmms.mutils.mapper;

import com.wmms.mutils.entity.TUnit;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface TUnitMapper {
    int deleteByPrimaryKey(Long ID);

    int insert(TUnit record);

    int insertSelective(TUnit record);

    TUnit selectByPrimaryKey(Long ID);

    int updateByPrimaryKeySelective(TUnit record);

    int updateByPrimaryKey(TUnit record);
}