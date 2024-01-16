package com.wmms.mutils.mapper;

import com.wmms.mutils.entity.TLogin;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface TLoginMapper {
    int deleteByPrimaryKey(Long ID);

    int insert(TLogin record);

    int insertSelective(TLogin record);

    TLogin selectByPrimaryKey(Long ID);

    int updateByUidAndDevice(TLogin tLogin);

    int updateByPrimaryKeySelective(TLogin record);

    int updateByPrimaryKey(TLogin record);
}