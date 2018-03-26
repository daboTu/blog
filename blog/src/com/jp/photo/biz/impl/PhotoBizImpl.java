package com.jp.photo.biz.impl;

import java.io.File;
import java.util.ArrayList;
import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Component;

import com.jp.photo.biz.PhotoBiz;
import com.jp.photo.mapper.PhotoMapper;
import com.jp.photo.po.PhotoPo;
@Component("photoBiz")
public class PhotoBizImpl implements PhotoBiz{

	@Resource
	private PhotoMapper mapper;
	
	
	
	public int addPhotoPo(PhotoPo po){
		return mapper.addPhotoPo(po);
	}
	
	public int deletePhotoPoById(PhotoPo po){
		//首先要删除文件
		po=mapper.getPhotoPoById(po);
		deletePhotoByPath(po.getRealPath());
		return mapper.deletePhotoPoById(po);
	}
	
	public List<PhotoPo> getPhotoListByTimeAndPageAndAlbum_id(PhotoPo po){
		List<PhotoPo> result=new ArrayList<PhotoPo>();
		List<PhotoPo> timeList=mapper.getPhotoCretaeTimePageByAlbum_id(po);
		for(int i=0;i<timeList.size();i++){
			PhotoPo temPo=new PhotoPo();
			temPo.setAlbum_id(po.getAlbum_id());
			temPo.setCreateTime(timeList.get(i).getCreateTime());
			temPo.setBegin(po.getBegin());
			temPo.setSize(po.getSize());
			List <PhotoPo> sonList=mapper.getPhotoPoListByAlbum_idAndCreateTime(temPo);
			result.addAll(sonList);
		}
		return result;
	}
	
	
	public PhotoPo getPhotoPoById(PhotoPo po){
		return mapper.getPhotoPoById(po);
	}
	
	public int deletePhotoPoByAlbum_id(PhotoPo po){//这里留个坑，删除的时候没有删除相片
		return mapper.deletePhotoPoByAlbum_id(po);
	}
	
	private void deletePhotoByPath(String path){
		File file=new File(path);
		file.delete();
	}
	
}
