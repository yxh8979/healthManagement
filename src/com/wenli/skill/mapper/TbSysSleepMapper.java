package com.wenli.skill.mapper;

import com.wenli.skill.pojo.TbSysSleep;
import com.wenli.skill.pojo.TbSysSleepExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface TbSysSleepMapper {
    int countByExample(TbSysSleepExample example);

    int deleteByExample(TbSysSleepExample example);

    int deleteByPrimaryKey(Integer sleepid);

    int insert(TbSysSleep record);

    int insertSelective(TbSysSleep record);

    List<TbSysSleep> selectByExample(TbSysSleepExample example);

    TbSysSleep selectByPrimaryKey(Integer sleepid);

    int updateByExampleSelective(@Param("record") TbSysSleep record, @Param("example") TbSysSleepExample example);

    int updateByExample(@Param("record") TbSysSleep record, @Param("example") TbSysSleepExample example);

    int updateByPrimaryKeySelective(TbSysSleep record);

    int updateByPrimaryKey(TbSysSleep record);
}