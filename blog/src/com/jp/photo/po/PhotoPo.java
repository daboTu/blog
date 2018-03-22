package com.jp.photo.po;

import com.jp.commom.page.Page;

/**
 * 
 * 版权所有：2018-zhuwei
 * 项目名称：blog   
 *
 * 类描述：相片表，对应数据表blog_photo
 * 类名称：com.jp.photo.po.Photo     
 * 创建人：朱为 
 * 创建时间：2018年3月20日 下午4:28:52   
 * 修改人：
 * 修改时间：2018年3月20日 下午4:28:52   
 * 修改备注：   
 * @version   V1.0
 */
public class PhotoPo extends Page{

	private String photo_id;//主键
	
	private String path;//存放路径
	
	private String album_id;//相册主键
	
	private String createTime;//创建时间
	
	private String timePageNum;//这个是相片的时间分页页数
	
	private String timePageSize;//这个是相片的时间页面容量
	
	private int timeBegin;//这个是开始时间分页开始
	
	private int timeSize;//这个是时间分页结束


	public String getPhoto_id() {
		return photo_id;
	}

	public void setPhoto_id(String photo_id) {
		this.photo_id = photo_id;
	}

	public String getPath() {
		return path;
	}

	public void setPath(String path) {
		this.path = path;
	}

	public String getAlbum_id() {
		return album_id;
	}

	public void setAlbum_id(String album_id) {
		this.album_id = album_id;
	}

	public String getCreateTime() {
		return createTime;
	}

	public void setCreateTime(String createTime) {
		this.createTime = createTime;
	}

	public String getTimePageNum() {
		return timePageNum;
	}

	public void setTimePageNum(String timePageNum) {
		this.timePageNum = timePageNum;
	}

	public String getTimePageSize() {
		return timePageSize;
	}

	public void setTimePageSize(String timePageSize) {
		this.timePageSize = timePageSize;
	}

	public int getTimeBegin() {
		int result=0;
		try{
			result=(Integer.valueOf(this.timePageNum)-1)*Integer.valueOf(this.timePageSize);	
		}catch (Exception e){
			result=0;
		}
		return result;
	}

	public void setTimeBegin(int timeBegin) {
		this.timeBegin=timeBegin;
	}

	public int getTimeSize() {
		int result=0;
		try{
			result=Integer.valueOf(this.timePageSize);//这里一定要做异常处理，不然一定会报错
		}catch(Exception e){
			result=0;
		}
		return result;
	}

	public void setTimeSize(int timeSize) {
		this.timeSize = timeSize;
	}
	
	
}
