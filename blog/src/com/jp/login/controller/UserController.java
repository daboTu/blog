package com.jp.login.controller;

import javax.annotation.Resource;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.portlet.bind.annotation.ResourceMapping;

import com.fasterxml.jackson.databind.util.JSONPObject;
import com.jp.login.biz.UserBiz;
import com.jp.login.po.UserPo;

@Controller
public class UserController {
	@Resource
	private UserBiz userBiz;
	
	@RequestMapping(value="/register.do")
	public @ResponseBody int register(UserPo po){
		int result=userBiz.addUser(po);
		return result;
	}
	
	@RequestMapping(value="/login.do")
	public @ResponseBody UserPo login (UserPo po){
		try{
			po=userBiz.getUserPoByUserNameAndPwd(po);
			po.setCode("0");//登陆成功,此处，要是输入错误用户名密码，则会报空指针异常，此时会进入catch块
			po.setMessage("登陆成功！");
		}catch(Exception e){
			po=new UserPo();//这里要重新new一下不然会空指针
			po.setCode("1");//登录失败
			po.setMessage("登陆失败！");
		}
		return po;
	}

}
