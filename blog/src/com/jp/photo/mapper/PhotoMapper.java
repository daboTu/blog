package com.jp.photo.mapper;

import java.util.List;

import org.springframework.stereotype.Component;

import com.jp.photo.po.PhotoPo;

@Component("photoMapper")
public interface PhotoMapper {
	
	public int addPhotoPo(PhotoPo po);
	
	public int deletePhotoPoById(PhotoPo po);
	
	public List<PhotoPo> getPhotoCretaeTimePageByAlbum_id(PhotoPo po);
	
	public List<PhotoPo> getPhotoPoListByAlbum_idAndCreateTime(PhotoPo po);
	
	public PhotoPo getPhotoPoById(PhotoPo po);
	
	public int deletePhotoPoByAlbum_id(PhotoPo po);
	

}
