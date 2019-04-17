package com.wenli.skill.mapper;

import com.wenli.skill.pojo.TbSysHis;
import com.wenli.skill.pojo.TbSysHisExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface TbSysHisMapper {
    int countByExample(TbSysHisExample example);

    int deleteByExample(TbSysHisExample example);

    int deleteByPrimaryKey(Integer hisid);

    int insert(TbSysHis record);

    int insertSelective(TbSysHis record);

    List<TbSysHis> selectByExample(TbSysHisExample example);

    TbSysHis selectByPrimaryKey(Integer hisid);

    int updateByExampleSelective(@Param("record") TbSysHis record, @Param("example") TbSysHisExample example);

    int updateByExample(@Param("record") TbSysHis record, @Param("example") TbSysHisExample example);

    int updateByPrimaryKeySelective(TbSysHis record);

    int updateByPrimaryKey(TbSysHis record);
}