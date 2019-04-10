package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.example.demo.service.UserAndAudioService;
@Controller
public class UserAndAudioController {
	@Autowired
	UserAndAudioService uaas;
	@RequestMapping("/getIfpayByAudioIdByUserId")
	@ResponseBody
	public int getIfpayByAudioIdByUserId(int userId,int audioId) {
		try {
			int ifpay=uaas.getIfpayByAudioIdByUserId(userId, audioId);
			return ifpay;
		} catch (Exception e) {
			System.err.println(e);
			return 2;
		}
		
	}
}
