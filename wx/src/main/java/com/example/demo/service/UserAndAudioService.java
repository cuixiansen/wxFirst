package com.example.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.example.demo.entity.Userandaudio;
import com.example.demo.entity.UserandaudioExample;
import com.example.demo.entity.UserandaudioExample.Criteria;
import com.example.demo.mapper.UserandaudioMapper;

@Service
public class UserAndAudioService {
	@Autowired
	UserandaudioMapper uaam;
	

public int  getIfpayByAudioIdByUserId(int userId ,int audioId) {
	
	UserandaudioExample example= new UserandaudioExample();
	Criteria c=   example.createCriteria();
	c.andAudioIdEqualTo(audioId);
	c.andUserIdEqualTo(userId);
	List<Userandaudio> list= uaam.selectByExample(example);
	Userandaudio uaa=list.get(0);
	int ifpay=uaa.getIfPay();
	return ifpay;
}
}
