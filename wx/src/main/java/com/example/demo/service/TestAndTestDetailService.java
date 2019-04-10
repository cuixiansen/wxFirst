package com.example.demo.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.entity.Test;
import com.example.demo.entity.Testdetail;
import com.example.demo.entity.TestdetailExample;
import com.example.demo.entity.TestdetailExample.Criteria;
import com.example.demo.entity.Testitem;
import com.example.demo.mapper.TestMapper;
import com.example.demo.mapper.TestdetailMapper;

@Service
public class TestAndTestDetailService {
@Autowired
TestMapper tm ;
@Autowired
TestdetailMapper tdm;
//找出所有的对应测试编号的测试题,返回一个包含所有题目标题，题目文本 选项信息的
public List<Testitem> selectAllTest(int testId){
	//Testitem s=new Testitem() ;
	List<Testitem> tlist= new ArrayList<>();
      Test test= tm.selectByPrimaryKey(testId);
      int problemNum = test.getTestProblemNum();

	 for(int i=1;i<=problemNum;i++) {
		 Testitem s=new Testitem() ;
		  List<Testdetail> list= findOptionByProblemId( testId,i );
		  System.out.println(list.get(0).getTestProblemText());
		  s.setTestProblemId(i);
		  s.setTestProblemText(list.get(0).getTestProblemText());
		  //System.out.println("-------"+s.getTestProblemText());
		  s.setOptionList(list);
		  
		  tlist.add(s);
		  System.out.println("-------||"+tlist.get(i-1).getTestProblemText());
	  }
	 System.out.println(tlist);
	  return tlist;
	 
	
}

//找到题号的对应选项方法
public List<Testdetail> findOptionByProblemId(int  testId,int problemId ) {
	Testdetail td =new Testdetail();
	td.setTestId(testId);
	td.setTestProblemId(problemId);
	
	List<Testdetail> detailList=tdm.selectTestDetail(td);
	//System.out.println(detailList.size());
	return detailList;
}

}
