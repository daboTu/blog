package com.jp.notice.po;

import com.jp.commom.page.Page;

/**
 * 
 * 版权所有：2018-zhuwei
 * 项目名称：blog   
 *
 * 类描述：公告类，对应数据表blog_notice
 * 类名称：com.jp.notice.po.Notice     
 * 创建人：朱为 
 * 创建时间：2018年3月19日 下午7:48:23   
 * 修改人：
 * 修改时间：2018年3月19日 下午7:48:23   
 * 修改备注：   
 * @version   V1.0
 */
public class NoticePo extends Page{
	
	
	private String title;//标题
	
	private String notice_id;//id,以后主键都这样定义了，防止和数据库的关键字id冲突
	
	private String content;//内容
	
	private String createTime;//创建时间
	
	private String updateTime;//更新时间,这里注意一下，更新时间在创建纪录的时候赋值和创建时间是一样的
	
	private String isShow;//是否展示给用户，值为y，n

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}


	public String getContent() {
		return content;
	}

	public void setContent(String content) {
		this.content = content;
	}

	public String getCreateTime() {
		return createTime;
	}

	public void setCreateTime(String createTime) {
		this.createTime = createTime;
	}

	public String getUpdateTime() {
		return updateTime;
	}

	public void setUpdateTime(String updateTime) {
		this.updateTime = updateTime;
	}

	public String getNotice_id() {
		return notice_id;
	}

	public void setNotice_id(String notice_id) {
		this.notice_id = notice_id;
	}

	public String getIsShow() {
		return isShow;
	}

	public void setIsShow(String isShow) {
		this.isShow = isShow;
	}
	
	

}
