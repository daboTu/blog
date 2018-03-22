package com.jp.comment.po;
/**
 * 
 * 版权所有：2018-zhuwei
 * 项目名称：blog   
 *
 * 类描述：评论回复实体类，对应数据表blog_reply
 * 类名称：com.jp.comment.po.ReplyPo     
 * 创建人：朱为 
 * 创建时间：2018年3月21日 下午5:51:42   
 * 修改人：
 * 修改时间：2018年3月21日 下午5:51:42   
 * 修改备注：   
 * @version   V1.0
 */
public class ReplyPo {
	
	private String reply_id;//主键
	
	private String comment_id;//评论表主键
	
	private String type;//回复评论的类型，值为0和1，为0时表示回复评论，为1时表示回复别人的回复
	
	private String preId;//父评论id，当type值为0时存放-1，当type值为1时存放的是回复表的id
	
	private String content;//回复内容
	
	private String userId;//回复者id
	
	private String createTime;//回复时间
	
	private String isAuth;//是否是管理员回复，0表示其它普通用户回复，1表示管理员回复


}
