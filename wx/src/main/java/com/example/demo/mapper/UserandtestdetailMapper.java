package com.example.demo.mapper;

import com.example.demo.entity.Userandtestdetail;
import com.example.demo.entity.UserandtestdetailExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface UserandtestdetailMapper {
    int countByExample(UserandtestdetailExample example);

    int deleteByExample(UserandtestdetailExample example);

    int deleteByPrimaryKey(Integer userDetailId);

    int insert(Userandtestdetail record);

    int insertSelective(Userandtestdetail record);

    List<Userandtestdetail> selectByExample(UserandtestdetailExample example);

    Userandtestdetail selectByPrimaryKey(Integer userDetailId);

    int updateByExampleSelective(@Param("record") Userandtestdetail record, @Param("example") UserandtestdetailExample example);

    int updateByExample(@Param("record") Userandtestdetail record, @Param("example") UserandtestdetailExample example);

    int updateByPrimaryKeySelective(Userandtestdetail record);

    int updateByPrimaryKey(Userandtestdetail record);
}