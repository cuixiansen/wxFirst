package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.entity.Userandtest;
import com.example.demo.service.UserAndTestdetailService;

@RestController
public class UserAndTestDetailController {
@Autowired
UserAndTestdetailService detailService;

//把答案插入user与testdetail
@RequestMapping("/detail/insertUserAndDetail")
public  String insertUserAndDetail(int userId,int testId,String result) {
	try {
	int i=detailService.CommitInsert(userId, testId, result);
	if(i==1) {
		
		return "ok";
	}else {
		return "filed";
	}
	}catch (Exception e) {
		// TODO: handle exception
		return "filed";
	}
	}
@RequestMapping("/detail/updateUserAndTest")
public  String insertUserAndTest(int userId,int testId,String result,int complete) {
	try {
	int i=detailService.updateUserAndTest(userId, testId, result, complete);
	if(i==1) {
		
		return "ok";
	}else {
		
		return "filed";
	}
	}catch (Exception e) {
		System.err.println(e);
		// TODO: handle exception
		return "filed";
	}
	}
		
@RequestMapping("/detail/updateResultText")
public  String updateResultText(int testId,int userId,Double grade) {
	try {
	int i=detailService.insertResult(testId, userId);
	if(i==1) {
		
		return "ok";
	}else {
		
		return "filed";
	}
	}catch (Exception e) {
		System.err.println(e);
		// TODO: handle exception
		return "filed";
	}
	}
//获得报告内容 result-text
@RequestMapping("/detail/getResult")
public  Userandtest getResult(int testId,int userId) {
	try {
	Userandtest a=detailService.getResultByTestIdByUserId(testId, userId);
	if(a!=null) {
		
		return a;
	}else {
		
		return null;
	}
	}catch (Exception e) {
		System.err.println(e);
		// TODO: handle exception
		return null;
	}
	}
@RequestMapping("/detail/insertUserandtest")
public  String insert(int testId,int userId,int ifPay) {
	try {
	int i=detailService.insertUserAndTest(testId, userId, ifPay);
	if(i==1) {
		
		return "ok";
	}else {
		
		return "filed";
	}
	}catch (Exception e) {
		System.err.println(e);
		// TODO: handle exception
		return "filed";
	}
	}
}
