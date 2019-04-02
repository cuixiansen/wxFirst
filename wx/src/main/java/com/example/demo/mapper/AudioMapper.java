package com.example.demo.mapper;

import com.example.demo.entity.Audio;
import com.example.demo.entity.AudioExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface AudioMapper {
    int countByExample(AudioExample example);

    int deleteByExample(AudioExample example);

    int deleteByPrimaryKey(Integer audioId);

    int insert(Audio record);

    int insertSelective(Audio record);

    List<Audio> selectByExample(AudioExample example);

    Audio selectByPrimaryKey(Integer audioId);

    int updateByExampleSelective(@Param("record") Audio record, @Param("example") AudioExample example);

    int updateByExample(@Param("record") Audio record, @Param("example") AudioExample example);

    int updateByPrimaryKeySelective(Audio record);

    int updateByPrimaryKey(Audio record);
}