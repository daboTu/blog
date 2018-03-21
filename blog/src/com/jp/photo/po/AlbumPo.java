package com.jp.photo.po;
/**
 *
 * 版权所有：2018-zhuwei
 * 项目名称：blog   
 *
 * 类描述： 相册实体类对应数据表blog_album
 * 类名称：com.jp.photo.po.Album     
 * 创建人：朱为 
 * 创建时间：2018年3月20日 下午4:24:07   
 * 修改人：
 * 修改时间：2018年3月20日 下午4:24:07   
 * 修改备注：   
 * @version   V1.0
 */
public class AlbumPo {
	
	private String album_id;//主键
	
	private String albumName;//名称
	
	private String summary;//简介
	
	private String createTime;//创建时间
	
	private String isShow;//是否公开,值为y，n，t其中y是完全可见，n是完全不可见，t是回答问题可见
	
	private String question;//如果权限为t，那么此属性才有值，问题
	
	private String answer;//如果权限为t，那么此属性才有值，答案

	public String getAlbum_id() {
		return album_id;
	}

	public void setAlbum_id(String album_id) {
		this.album_id = album_id;
	}

	public String getAlbumName() {
		return albumName;
	}

	public void setAlbumName(String albumName) {
		this.albumName = albumName;
	}

	public String getSummary() {
		return summary;
	}

	public void setSummary(String summary) {
		this.summary = summary;
	}

	public String getCreateTime() {
		return createTime;
	}

	public void setCreateTime(String createTime) {
		this.createTime = createTime;
	}

	public String getIsShow() {
		return isShow;
	}

	public void setIsShow(String isShow) {
		this.isShow = isShow;
	}

	public String getQuestion() {
		return question;
	}

	public void setQuestion(String question) {
		this.question = question;
	}

	public String getAnswer() {
		return answer;
	}

	public void setAnswer(String answer) {
		this.answer = answer;
	}
	
}
