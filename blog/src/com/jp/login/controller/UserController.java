package com.jp.login.controller;

import javax.annotation.Resource;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.jp.login.biz.UserBiz;
import com.jp.login.po.UserPo;

@Controller
public class UserController {
	@Resource
	private UserBiz userBiz;
	
	@RequestMapping(value="/register.do")
	public @ResponseBody int register(UserPo po){
		int result=userBiz.addUser(po);
		System.out.println(result);
		return result;
	}

}
