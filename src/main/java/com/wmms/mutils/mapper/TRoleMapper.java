package com.wmms.mutils.mapper;

import com.wmms.mutils.entity.TRole;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface TRoleMapper {
    int deleteByPrimaryKey(Long ID);

    int insert(TRole record);

    int insertSelective(TRole record);

    TRole selectByPrimaryKey(Long ID);

    int updateByPrimaryKeySelective(TRole record);

    int updateByPrimaryKey(TRole record);
}