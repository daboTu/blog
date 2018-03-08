package com.jp.login.biz.impl;

import javax.annotation.Resource;

import org.springframework.stereotype.Component;

import com.jp.commom.util.UUidUtil;
import com.jp.login.biz.UserBiz;
import com.jp.login.mapper.UserMapper;
import com.jp.login.po.UserPo;
@Component("userBiz")
public class UserBizImpl implements UserBiz{
	
	@Resource
	private UserMapper userMapper;
	
	public int addUser(UserPo po){
		if(po.getUserId()==null||!po.getUserId().trim().toString().equals("")){
			po.setUserId(UUidUtil.getUUid());
		}
		return userMapper.addUser(po);
	}

}
