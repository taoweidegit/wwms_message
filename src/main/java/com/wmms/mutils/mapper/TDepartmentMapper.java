package com.wmms.mutils.mapper;

import com.wmms.mutils.entity.TDepartment;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface TDepartmentMapper {
    int deleteByPrimaryKey(Long ID);

    int insert(TDepartment record);

    int insertSelective(TDepartment record);

    TDepartment selectByPrimaryKey(Long ID);

    int updateByPrimaryKeySelective(TDepartment record);

    int updateByPrimaryKey(TDepartment record);
}