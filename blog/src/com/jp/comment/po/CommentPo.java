package com.jp.comment.po;
/**
 *
 * 版权所有：2018-zhuwei
 * 项目名称：blog   
 *
 * 类描述：评论表实体类，对应数据表blog_commont
 * 类名称：com.jp.comment.po.CommentPo     
 * 创建人：朱为 
 * 创建时间：2018年3月21日 下午5:45:38   
 * 修改人：
 * 修改时间：2018年3月21日 下午5:45:38   
 * 修改备注：   
 * @version   V1.0
 */
public class CommentPo {
	
	private String comment_id;//主键
	
	private String objId;//业务主键id
	
	private String content;//评论内容;
	
	private String user_id;//评论的用户id
	
	private String isTop;//是否置顶
	
	private String isHot;//是否是热评
	
	private String likeNum;//点赞次数
	
	private String createTime;//创建时间

	public String getComment_id() {
		return comment_id;
	}

	public void setComment_id(String comment_id) {
		this.comment_id = comment_id;
	}

	public String getObjId() {
		return objId;
	}

	public void setObjId(String objId) {
		this.objId = objId;
	}

	public String getContent() {
		return content;
	}

	public void setContent(String content) {
		this.content = content;
	}

	public String getUser_id() {
		return user_id;
	}

	public void setUser_id(String user_id) {
		this.user_id = user_id;
	}

	public String getIsTop() {
		return isTop;
	}

	public void setIsTop(String isTop) {
		this.isTop = isTop;
	}

	public String getIsHot() {
		return isHot;
	}

	public void setIsHot(String isHot) {
		this.isHot = isHot;
	}

	public String getLikeNum() {
		return likeNum;
	}

	public void setLikeNum(String likeNum) {
		this.likeNum = likeNum;
	}

	public String getCreateTime() {
		return createTime;
	}

	public void setCreateTime(String createTime) {
		this.createTime = createTime;
	}
	
	
	
	
	
	
	

}
