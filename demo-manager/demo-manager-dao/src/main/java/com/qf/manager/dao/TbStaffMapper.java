package com.qf.manager.dao;

import com.qf.manager.pojo.po.TbStaff;
import com.qf.manager.pojo.po.TbStaffExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface TbStaffMapper {
    int countByExample(TbStaffExample example);

    int deleteByExample(TbStaffExample example);

    int deleteByPrimaryKey(Long sid);

    int insert(TbStaff record);

    int insertSelective(TbStaff record);

    List<TbStaff> selectByExample(TbStaffExample example);

    TbStaff selectByPrimaryKey(Long sid);

    int updateByExampleSelective(@Param("record") TbStaff record, @Param("example") TbStaffExample example);

    int updateByExample(@Param("record") TbStaff record, @Param("example") TbStaffExample example);

    int updateByPrimaryKeySelective(TbStaff record);

    int updateByPrimaryKey(TbStaff record);
}