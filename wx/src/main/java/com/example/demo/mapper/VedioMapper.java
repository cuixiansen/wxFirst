package com.example.demo.mapper;

import com.example.demo.entity.Audio;
import com.example.demo.entity.Vedio;
import com.example.demo.entity.VedioExample;
import java.util.List;
import java.util.Map;

import org.apache.ibatis.annotations.Param;

public interface VedioMapper {
    int countByExample(VedioExample example);

    int deleteByExample(VedioExample example);

    int deleteByPrimaryKey(Integer vedioId);

    int insert(Vedio record);

    int insertSelective(Vedio record);

    List<Vedio> selectByExample(VedioExample example);

    Vedio selectByPrimaryKey(Integer vedioId);

    int updateByExampleSelective(@Param("record") Vedio record, @Param("example") VedioExample example);

    int updateByExample(@Param("record") Vedio record, @Param("example") VedioExample example);

    int updateByPrimaryKeySelective(Vedio record);

    int updateByPrimaryKey(Vedio record);
    
    List<Vedio> selectVedioByPage(Map map);
    
    List<Vedio> selectVedioByConditionByPage (Map map);
    
    List<Vedio> selectVedioByNominateByDesc (int nominate);
}