package com.jp.photo.biz;

import java.util.List;

import com.jp.photo.po.PhotoPo;

public interface PhotoBiz {
	

	public int addPhotoPo(PhotoPo po);
	
	public int deletePhotoPoById(PhotoPo po);
	
	public List<PhotoPo> getPhotoListByTimeAndPageAndAlbum_id(PhotoPo po);
	
	public PhotoPo getPhotoPoById(PhotoPo po);
	
	public int deletePhotoPoByAlbum_id(PhotoPo po);
	

}
