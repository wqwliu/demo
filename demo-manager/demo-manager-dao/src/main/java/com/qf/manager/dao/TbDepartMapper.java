package com.qf.manager.dao;

import com.qf.manager.pojo.po.TbDepart;
import com.qf.manager.pojo.po.TbDepartExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface TbDepartMapper {
    int countByExample(TbDepartExample example);

    int deleteByExample(TbDepartExample example);

    int deleteByPrimaryKey(Long did);

    int insert(TbDepart record);

    int insertSelective(TbDepart record);

    List<TbDepart> selectByExample(TbDepartExample example);

    TbDepart selectByPrimaryKey(Long did);

    int updateByExampleSelective(@Param("record") TbDepart record, @Param("example") TbDepartExample example);

    int updateByExample(@Param("record") TbDepart record, @Param("example") TbDepartExample example);

    int updateByPrimaryKeySelective(TbDepart record);

    int updateByPrimaryKey(TbDepart record);
}