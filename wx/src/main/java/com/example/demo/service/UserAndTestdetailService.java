package com.example.demo.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Conditional;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.example.demo.entity.Result;
import com.example.demo.entity.ResultExample;
import com.example.demo.entity.ResultExample.Criterion;
import com.example.demo.entity.TestExample;
import com.example.demo.entity.Testdetail;
import com.example.demo.entity.Userandtest;
import com.example.demo.entity.UserandtestExample;
import com.example.demo.entity.TestdetailExample.Criteria;
import com.example.demo.entity.TestdetailExample;
import com.example.demo.entity.Userandtestdetail;
import com.example.demo.entity.UserandtestdetailExample;
import com.example.demo.mapper.ResultMapper;
import com.example.demo.mapper.TestMapper;
import com.example.demo.mapper.TestdetailMapper;
import com.example.demo.mapper.UserandtestMapper;
import com.example.demo.mapper.UserandtestdetailMapper;


@Service
public class UserAndTestdetailService {
	@Autowired
	UserandtestdetailMapper uatdm;
	@Autowired
	TestMapper tm;
	@Autowired
	TestdetailMapper tdm;
	@Autowired
	UserandtestMapper uatm;
	@Autowired
	ResultMapper rm;
	//提交以后的插入 是指user与testdetail表的charu
@Transactional
public int  CommitInsert(int userId,int testId,String result) {
	//先删掉用户之前的记录 ，再插入
	UserandtestdetailExample u =new UserandtestdetailExample(); 
	u.createCriteria().andUserIdEqualTo(userId).andTestIdEqualTo(testId);
	uatdm.deleteByExample(u);
	String[] resultList=result.split("\\,");
	int length=resultList.length;
	List num=new ArrayList<>();
	for(int i=0;i<length;i++) {
		Userandtestdetail a= new Userandtestdetail();
		a.setTestId(testId);
		a.setUserId(userId);
		a.setTestProblemId(i+1);
		a.setUserAnswer(resultList[i]);
		int s=uatdm.insertSelective(a);
		num.add(s);
	}
	if(num.size()==length) {
		return 1;
	}else {return 0;}
	
}

//userAnd test 进行xiugai 因为关系的话一开始付钱成功就录入了，后面修改就行了
public int updateUserAndTest(int userId,int testId,String result,int complete) {
	String[] resultList= result.split("\\,");
	List<Double> valueList=new ArrayList<Double> ();
	int length=resultList.length;
	double grade=0.0;
	
	//成绩叠加
	for(int i=0;i<length;i++) {
		Testdetail a=new Testdetail();
		a.setTestId(testId);
		a.setTestProblemId(i+1);
		a.setTestOptionPrefix(resultList[i]);
		Double num=tdm.selectValue(a);
		grade+=num;	
	}
	Userandtest  aa=new Userandtest();
	aa.setIfComplete(complete);
	aa.setResultGrade(grade);
	UserandtestExample example=new UserandtestExample();
	example.createCriteria().andTestIdEqualTo(testId).andUserIdEqualTo(userId);
	int i=uatm.updateByExampleSelective(aa, example);
	if(i==1) {
		return i;
	}else {
		return 0;
	}
	
}
//下一个是判断jieguo的方法 拿到两个列表 min max grade  进行比较  if（true）就返回jieguo;
public List<Result> getResult(int testId) {
	ResultExample r =new ResultExample();
	r.createCriteria().andTestIdEqualTo(testId);
	List<Result> resultList=rm.selectByExample(r);
	return resultList;
}
//往userandTest表中插入结果字段
public int insertResult(int testId,int userId ) {
	Userandtest record=new Userandtest();
	record.setTestId(testId);
	record.setUserId(userId);
	double grade=uatm.selectgrade(record);
	Userandtest uat = new Userandtest();
	Result aResult=new Result();
	List<Result> rlist= getResult( testId);
	if(grade==0) {
		grade+=1;
	}
	for(int i=0;i<rlist.size();i++) {
		if(rlist.get(i).getMaxGrade()>=grade&&grade>rlist.get(i).getMinGrade())
		{
			aResult= rlist.get(i);
			break;
			
		}
	}
	UserandtestExample e= new UserandtestExample();
	e.createCriteria().andTestIdEqualTo(testId).andUserIdEqualTo(userId);
//	uat.setTestId(testId);
//	uat.setUserId(userId);
	uat.setResultGrade(grade);
	uat.setResultText(aResult.getResultText());
	int i=uatm.updateByExampleSelective(uat, e);
	return i;
}
/*
 *@Param testId userId
 *@Return Userandtest
 */
public Userandtest getResultByTestIdByUserId(int testId,int userId) {
	UserandtestExample example=new UserandtestExample();
	example.createCriteria().andTestIdEqualTo(testId).andUserIdEqualTo(userId);
	List<Userandtest> resultList=uatm.selectByExample(example);
	Userandtest result=resultList.get(0);
	return result;
} 
/*
 * 插入userAndtest
 * @param userId testId ifpay
 * 
 * */
public int insertUserAndTest (int testId,int userId ,int ifPay) {
	Userandtest userandtest=new Userandtest();
	userandtest.setIfPay(ifPay);
	userandtest.setUserId(userId);
	userandtest.setTestId(testId);
	int i=uatm.insertSelective(userandtest);
	return i;
} 
}
