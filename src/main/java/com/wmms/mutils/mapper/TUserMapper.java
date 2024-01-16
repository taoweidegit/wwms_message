package com.wmms.mutils.mapper;

import com.wmms.mutils.entity.TUser;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface TUserMapper {
    int deleteByPrimaryKey(Long ID);

    int insert(TUser record);

    int insertSelective(TUser record);

    TUser selectByPrimaryKey(Long ID);

    int updateByPrimaryKeySelective(TUser record);

    int updateByPrimaryKey(TUser record);
}