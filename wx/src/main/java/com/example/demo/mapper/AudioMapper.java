package com.example.demo.mapper;

import com.example.demo.entity.Audio;
import com.example.demo.entity.AudioExample;
import com.example.demo.entity.Vedio;

import java.util.List;
import java.util.Map;

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
    
    List<Audio> selectAudioByPage(Map map);
    
    List<Audio> selectAudioByConditionByPage (Map map);
    
    List<Audio> selectAudioByNominateByDesc (int nominate);
}