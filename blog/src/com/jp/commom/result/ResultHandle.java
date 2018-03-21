package com.jp.commom.result;
/**
 * 
 * 版权所有：2018-zhuwei
 * 项目名称：blog   
 *
 * 类描述：这个类是用来返回的，比如新增删除纪录是否成功返回给页面
 * 类名称：com.jp.commom.result.ResultHandle     
 * 创建人：朱为 
 * 创建时间：2018年3月19日 下午1:21:42   
 * 修改人：
 * 修改时间：2018年3月19日 下午1:21:42   
 * 修改备注：   
 * @version   V1.0
 */
public class ResultHandle {
	
	private String code;//返回代码

	private String message;//返回信息

	public String getCode() {
		return code;
	}

	public void setCode(String code) {
		this.code = code;
	}

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}
	
	
}
