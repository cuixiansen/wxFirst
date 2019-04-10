package com.example.demo.mapper;

import com.example.demo.entity.Userandvedio;
import com.example.demo.entity.UserandvedioExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface UserandvedioMapper {
    int countByExample(UserandvedioExample example);

    int deleteByExample(UserandvedioExample example);

    int deleteByPrimaryKey(Integer userVedioId);

    int insert(Userandvedio record);

    int insertSelective(Userandvedio record);

    List<Userandvedio> selectByExample(UserandvedioExample example);

    Userandvedio selectByPrimaryKey(Integer userVedioId);

    int updateByExampleSelective(@Param("record") Userandvedio record, @Param("example") UserandvedioExample example);

    int updateByExample(@Param("record") Userandvedio record, @Param("example") UserandvedioExample example);

    int updateByPrimaryKeySelective(Userandvedio record);

    int updateByPrimaryKey(Userandvedio record);
}