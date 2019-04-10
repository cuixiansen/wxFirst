package com.example.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.entity.Userandaudio;
import com.example.demo.entity.UserandaudioExample;

import com.example.demo.entity.Userandvedio;
import com.example.demo.entity.UserandvedioExample;
import com.example.demo.entity.UserandvedioExample.Criteria;
import com.example.demo.mapper.UserandaudioMapper;
import com.example.demo.mapper.UserandvedioMapper;

@Service
public class UserAndVedioService {
	@Autowired
	UserandvedioMapper uavm;
	
	public int  getIfpayByVedioIdByUserId(int userId ,int vedioId) {
		
		UserandvedioExample example= new UserandvedioExample();
		Criteria c=   example.createCriteria();
		c.andVedioIdEqualTo(vedioId);
		c.andUserIdEqualTo(userId);
		List<Userandvedio> list= uavm.selectByExample(example);
		Userandvedio uaa=list.get(0);
		int ifpay=uaa.getIfPay();
		return ifpay;
	}
}
