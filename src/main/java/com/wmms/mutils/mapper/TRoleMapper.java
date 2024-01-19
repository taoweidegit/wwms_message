package com.wmms.mutils.mapper;

import com.wmms.mutils.entity.TRole;
import com.wmms.mutils.entity.TRoleExample;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

@Mapper
public interface TRoleMapper {
    long countByExample(TRoleExample example);

    int deleteByExample(TRoleExample example);

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
    int insert(TRole record);

    /**
     * insert record to table selective
     *
     * @param record the record
     * @return insert count
     */
    int insertSelective(TRole record);

    List<TRole> selectByExample(TRoleExample example);

    /**
     * select by primary key
     *
     * @param ID primary key
     * @return object by primary key
     */
    TRole selectByPrimaryKey(Long ID);

    int updateByExampleSelective(@Param("record") TRole record, @Param("example") TRoleExample example);

    int updateByExample(@Param("record") TRole record, @Param("example") TRoleExample example);

    /**
     * update record selective
     *
     * @param record the updated record
     * @return update count
     */
    int updateByPrimaryKeySelective(TRole record);

    /**
     * update record
     *
     * @param record the updated record
     * @return update count
     */
    int updateByPrimaryKey(TRole record);
}