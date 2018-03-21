package com.jp.link.po;
/**
 * 版权所有：2018-zhuwei
 * 项目名称：blog   
 *
 * 类描述：友情链接实体类，对应数据表blog_link
 * 类名称：com.jp.link.po.LinkPo     
 * 创建人：朱为 
 * 创建时间：2018年3月20日 下午1:21:09   
 * 修改人：
 * 修改时间：2018年3月20日 下午1:21:09   
 * 修改备注：   
 * @version   V1.0
 */
public class LinkPo {
	
	private String link_id;//id
	
	private String linkName;//链接名称
	
	private String linkUrl;//链接地址


	public String getLink_id() {
		return link_id;
	}

	public void setLink_id(String link_id) {
		this.link_id = link_id;
	}

	public String getLinkName() {
		return linkName;
	}

	public void setLinkName(String linkName) {
		this.linkName = linkName;
	}

	public String getLinkUrl() {
		return linkUrl;
	}

	public void setLinkUrl(String linkUrl) {
		this.linkUrl = linkUrl;
	}
	
	

}
