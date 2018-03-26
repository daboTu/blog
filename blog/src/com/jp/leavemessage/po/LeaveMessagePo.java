package com.jp.leavemessage.po;

public class LeaveMessagePo {
	
	private String leaveMessage_id;//主键
	
	private String content;//内容
	
	private String cteateTime;//创建时间
	
	private String pId;//回复的父id
	
	private String user_id;//用户的id
	
	private String UserName;//用户的姓名

	public String getLeaveMessage_id() {
		return leaveMessage_id;
	}

	public void setLeaveMessage_id(String leaveMessage_id) {
		this.leaveMessage_id = leaveMessage_id;
	}

	public String getContent() {
		return content;
	}

	public void setContent(String content) {
		this.content = content;
	}

	public String getCteateTime() {
		return cteateTime;
	}

	public void setCteateTime(String cteateTime) {
		this.cteateTime = cteateTime;
	}

	public String getpId() {
		return pId;
	}

	public void setpId(String pId) {
		this.pId = pId;
	}

	public String getUser_id() {
		return user_id;
	}

	public void setUser_id(String user_id) {
		this.user_id = user_id;
	}

	public String getUserName() {
		return UserName;
	}

	public void setUserName(String userName) {
		UserName = userName;
	}
	
	

}
