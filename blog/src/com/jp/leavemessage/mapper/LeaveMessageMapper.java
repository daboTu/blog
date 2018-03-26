package com.jp.leavemessage.mapper;

import java.util.List;

import org.springframework.stereotype.Component;

import com.jp.leavemessage.po.LeaveMessagePo;

@Component("leaveMessageMapper")
public interface LeaveMessageMapper {

	public int addLeaveMessagePo(LeaveMessagePo po);
	
	public int deleteLeaveMessagePoById(LeaveMessagePo po);
	
	public List<LeaveMessagePo>getLeaveMessageListPoById(LeaveMessagePo po);
}
