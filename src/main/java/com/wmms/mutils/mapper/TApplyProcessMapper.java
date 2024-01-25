package com.wmms.mutils.mapper;

import com.wmms.mutils.entity.TApplyProcess;
import com.wmms.mutils.entity.TApplyProcessExample;
import java.util.List;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

@Mapper
public interface TApplyProcessMapper {
    long countByExample(TApplyProcessExample example);

    int deleteByExample(TApplyProcessExample example);

    /**
     * delete by primary key
     * @param ID primaryKey
     * @return deleteCount
     */
    int deleteByPrimaryKey(Long ID);

    /**
     * insert record to table
     * @param record the record
     * @return insert count
     */
    int insert(TApplyProcess record);

    /**
     * insert record to table selective
     * @param record the record
     * @return insert count
     */
    int insertSelective(TApplyProcess record);

    List<TApplyProcess> selectByExample(TApplyProcessExample example);

    /**
     * select by primary key
     * @param ID primary key
     * @return object by primary key
     */
    TApplyProcess selectByPrimaryKey(Long ID);

    int updateByExampleSelective(@Param("record") TApplyProcess record, @Param("example") TApplyProcessExample example);

    int updateByExample(@Param("record") TApplyProcess record, @Param("example") TApplyProcessExample example);

    /**
     * update record selective
     * @param record the updated record
     * @return update count
     */
    int updateByPrimaryKeySelective(TApplyProcess record);

    /**
     * update record
     * @param record the updated record
     * @return update count
     */
    int updateByPrimaryKey(TApplyProcess record);
}