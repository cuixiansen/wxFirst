package com.example.demo.mapper;

import com.example.demo.entity.Userandaudio;
import com.example.demo.entity.UserandaudioExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface UserandaudioMapper {
    int countByExample(UserandaudioExample example);

    int deleteByExample(UserandaudioExample example);

    int deleteByPrimaryKey(Integer userAudioId);

    int insert(Userandaudio record);

    int insertSelective(Userandaudio record);

    List<Userandaudio> selectByExample(UserandaudioExample example);

    Userandaudio selectByPrimaryKey(Integer userAudioId);

    int updateByExampleSelective(@Param("record") Userandaudio record, @Param("example") UserandaudioExample example);

    int updateByExample(@Param("record") Userandaudio record, @Param("example") UserandaudioExample example);

    int updateByPrimaryKeySelective(Userandaudio record);

    int updateByPrimaryKey(Userandaudio record);
}