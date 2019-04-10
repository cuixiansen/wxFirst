package com.example.demo.mapper;

import com.example.demo.entity.Testdetail;
import com.example.demo.entity.Userandtest;
import com.example.demo.entity.UserandtestExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface UserandtestMapper {
    int countByExample(UserandtestExample example);

    int deleteByExample(UserandtestExample example);

    int deleteByPrimaryKey(Integer userTestId);

    int insert(Userandtest record);

    int insertSelective(Userandtest record);

    List<Userandtest> selectByExample(UserandtestExample example);

    Userandtest selectByPrimaryKey(Integer userTestId);

    int updateByExampleSelective(@Param("record") Userandtest record, @Param("example") UserandtestExample example);

    int updateByExample(@Param("record") Userandtest record, @Param("example") UserandtestExample example);

    int updateByPrimaryKeySelective(Userandtest record);

    int updateByPrimaryKey(Userandtest record);
    
    double selectgrade (Userandtest record);
}