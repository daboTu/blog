package com.jp.leavemessage.biz.impl;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Component;

import com.jp.leavemessage.biz.LeaveMessageBiz;
import com.jp.leavemessage.mapper.LeaveMessageMapper;
import com.jp.leavemessage.po.LeaveMessagePo;

@Component("leaveMessageBiz")
public class LeaveMessageBizImpl implements LeaveMessageBiz{
	
	@Resource
	private LeaveMessageMapper mapper;

	public int addLeaveMessagePo(LeaveMessagePo po){
		return mapper.addLeaveMessagePo(po);
	}
	
	public int deleteLeaveMessagePoById(LeaveMessagePo po){
		return mapper.deleteLeaveMessagePoById(po);
	}
	
	public List<LeaveMessagePo>getLeaveMessageListPoById(LeaveMessagePo po){
		return mapper.getLeaveMessageListPoById(po);
	}
}
