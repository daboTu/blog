package com.jp.mood.po;

import com.jp.commom.page.Page;
/**
 * 
 * 版权所有：2018-zhuwei
 * 项目名称：blog   
 *
 * 类描述：心情管理实体类，对应数据表blog_mood
 * 类名称：com.jp.mood.po.MoodPo     
 * 创建人：朱为 
 * 创建时间：2018年3月20日 下午3:08:44   
 * 修改人：
 * 修改时间：2018年3月20日 下午3:08:44   
 * 修改备注：   
 * @version   V1.0
 */
public class MoodPo extends Page{
	
	private String mood_id;//主键
	
	private String createTime;//创建时间
	
	private String content;//心情内容

	public String getMood_id() {
		return mood_id;
	}

	public void setMood_id(String mood_id) {
		this.mood_id = mood_id;
	}

	public String getCreateTime() {
		return createTime;
	}

	public void setCreateTime(String createTime) {
		this.createTime = createTime;
	}

	public String getContent() {
		return content;
	}

	public void setContent(String content) {
		this.content = content;
	}
	
	

}
