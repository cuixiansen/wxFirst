package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.entity.Testitem;
import com.example.demo.service.TestAndTestDetailService;

@RestController

public class TestAndTestDetailController {
	@Autowired
	TestAndTestDetailService tatds;
/*
 * @param testId
 * @return List(包括测评与测评详情)
 * */
	@RequestMapping("/getAllTestById")
	
   public List<Testitem> getTest(int testId){
	   try {
		 List<Testitem> testList= tatds.selectAllTest(testId);
		 if(testList.size()!=0) {
		return testList;}
		 else {return null;}
	} catch (Exception e) {
		System.err.println(e);
		// TODO: handle exception
		return null;
	}
   }
}
