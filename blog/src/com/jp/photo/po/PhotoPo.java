package com.jp.photo.po;
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
public class PhotoPo {

	private String photo_id;//主键
	
	private String path;//存放路径
	
	private String album_id;//相册主键
	
	private String createTime;//创建时间


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
	
	
}
