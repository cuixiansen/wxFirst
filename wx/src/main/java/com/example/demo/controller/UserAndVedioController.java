package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.example.demo.service.UserAndAudioService;
import com.example.demo.service.UserAndVedioService;
@Controller
public class UserAndVedioController {
	@Autowired
	UserAndVedioService uavs;
	@RequestMapping("/getIfpayByVedioIdByUserId")
	@ResponseBody
	public int getIfpayByAudioIdByUserId(int userId,int vedioId) {
		try {
			int ifpay=uavs.getIfpayByVedioIdByUserId(userId, vedioId);
			return ifpay;
		} catch (Exception e) {
			System.err.println(e);
			return 2;
		}
		
	}
}
