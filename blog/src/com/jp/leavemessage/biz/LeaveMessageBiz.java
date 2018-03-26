package com.jp.leavemessage.biz;

import java.util.List;

import com.jp.leavemessage.po.LeaveMessagePo;

public interface LeaveMessageBiz {
	
	
	public int addLeaveMessagePo(LeaveMessagePo po);
	
	public int deleteLeaveMessagePoById(LeaveMessagePo po);
	
	public List<LeaveMessagePo>getLeaveMessageListPoById(LeaveMessagePo po);

}
