package com.wenli.skill.mapper;

import com.wenli.skill.pojo.TbSysSport;
import com.wenli.skill.pojo.TbSysSportExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface TbSysSportMapper {
    int countByExample(TbSysSportExample example);

    int deleteByExample(TbSysSportExample example);

    int deleteByPrimaryKey(Integer sportid);

    int insert(TbSysSport record);

    int insertSelective(TbSysSport record);

    List<TbSysSport> selectByExample(TbSysSportExample example);

    TbSysSport selectByPrimaryKey(Integer sportid);

    int updateByExampleSelective(@Param("record") TbSysSport record, @Param("example") TbSysSportExample example);

    int updateByExample(@Param("record") TbSysSport record, @Param("example") TbSysSportExample example);

    int updateByPrimaryKeySelective(TbSysSport record);

    int updateByPrimaryKey(TbSysSport record);
}