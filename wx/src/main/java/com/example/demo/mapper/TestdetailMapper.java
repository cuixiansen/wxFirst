package com.example.demo.mapper;

import com.example.demo.entity.Testdetail;
import com.example.demo.entity.TestdetailExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface TestdetailMapper {
    int countByExample(TestdetailExample example);

    int deleteByExample(TestdetailExample example);

    int deleteByPrimaryKey(Integer testDId);

    int insert(Testdetail record);

    int insertSelective(Testdetail record);

    List<Testdetail> selectByExample(TestdetailExample example);

    Testdetail selectByPrimaryKey(Integer testDId);

    int updateByExampleSelective(@Param("record") Testdetail record, @Param("example") TestdetailExample example);

    int updateByExample(@Param("record") Testdetail record, @Param("example") TestdetailExample example);

    int updateByPrimaryKeySelective(Testdetail record);

    int updateByPrimaryKey(Testdetail record);
   
    double selectValue (Testdetail record);
    
    List<Testdetail> selectTestDetail(Testdetail td);
    
   
}