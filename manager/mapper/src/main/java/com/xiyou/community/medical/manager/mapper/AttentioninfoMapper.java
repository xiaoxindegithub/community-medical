package com.xiyou.community.medical.manager.mapper;

import org.apache.ibatis.annotations.Param;
import com.xiyou.community.medical.manager.pojo.Attentioninfo;
import com.xiyou.community.medical.manager.pojo.AttentioninfoExample;

import java.util.List;

public interface AttentioninfoMapper {
    int countByExample(AttentioninfoExample example);

    int deleteByExample(AttentioninfoExample example);

    int deleteByPrimaryKey(Integer userId);

    void insert(Attentioninfo record);

    int insertSelective(Attentioninfo record);

    List<Attentioninfo> selectByExample(AttentioninfoExample example);

    Attentioninfo selectByPrimaryKey(Integer userId);

    int updateByExampleSelective(@Param("record") Attentioninfo record, @Param("example") AttentioninfoExample example);

    int updateByExample(@Param("record") Attentioninfo record, @Param("example") AttentioninfoExample example);

    int updateByPrimaryKeySelective(Attentioninfo record);

    int updateByPrimaryKey(Attentioninfo record);
}