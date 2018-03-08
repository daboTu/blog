package com.jp.login.po;
/**
 * 
 * 版权所有：2018-zhuwei
 * 项目名称：blog   
 *
 * 类描述：
 * 类名称：com.jp.login.po.UserPo     
 * 创建人：朱为 
 * 创建时间：2018年1月31日 上午9:00:15   
 * 修改人：
 * 修改时间：2018年1月31日 上午9:00:15   
 * 修改备注：   
 * @version   V1.0
 */
public class UserPo {
	
	private String userId;//唯一标识
	
	private String userName;//用户名
	
	private String passWord;//密码
	
	private String sex;//性别，值为0，1,0代表为女，1代表为男
	
	private String isAdmin;//是否是管理员，值y，n

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getPassWord() {
		return passWord;
	}

	public void setPassWord(String passWord) {
		this.passWord = passWord;
	}

	public String getSex() {
		return sex;
	}

	public void setSex(String sex) {
		this.sex = sex;
	}

	public String getIsAdmin() {
		return isAdmin;
	}

	public void setIsAdmin(String isAdmin) {
		this.isAdmin = isAdmin;
	}

	public String getUserId() {
		return userId;
	}

	public void setUserId(String userId) {
		this.userId = userId;
	}
	

}
