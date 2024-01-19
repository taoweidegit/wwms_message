package com.wmms.mutils.mapper;

import com.wmms.mutils.entity.TUser;
import com.wmms.mutils.entity.TUserExample;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

@Mapper
public interface TUserMapper {
    long countByExample(TUserExample example);

    int deleteByExample(TUserExample example);

    /**
     * delete by primary key
     *
     * @param ID primaryKey
     * @return deleteCount
     */
    int deleteByPrimaryKey(Long ID);

    /**
     * insert record to table
     *
     * @param record the record
     * @return insert count
     */
    int insert(TUser record);

    /**
     * insert record to table selective
     *
     * @param record the record
     * @return insert count
     */
    int insertSelective(TUser record);

    List<TUser> selectByExample(TUserExample example);

    /**
     * select by primary key
     *
     * @param ID primary key
     * @return object by primary key
     */
    TUser selectByPrimaryKey(Long ID);

    int updateByExampleSelective(@Param("record") TUser record, @Param("example") TUserExample example);

    int updateByExample(@Param("record") TUser record, @Param("example") TUserExample example);

    /**
     * update record selective
     *
     * @param record the updated record
     * @return update count
     */
    int updateByPrimaryKeySelective(TUser record);

    /**
     * update record
     *
     * @param record the updated record
     * @return update count
     */
    int updateByPrimaryKey(TUser record);
}