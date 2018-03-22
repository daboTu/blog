package com.jp.photo.biz.impl;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Component;

import com.jp.photo.biz.AlbumBiz;
import com.jp.photo.mapper.AlbumMapper;
import com.jp.photo.mapper.PhotoMapper;
import com.jp.photo.po.AlbumPo;
import com.jp.photo.po.PhotoPo;
@Component("albumnBiz")
public class AlbumBizImpl implements AlbumBiz{
	@Resource
	private AlbumMapper mapper;
	
	@Resource
	private PhotoMapper pMapper;
	
	
	public int addAlbumPo(AlbumPo po){
		return mapper.addAlbumPo(po);
	}
	
	public int deleteAlbumPoById(AlbumPo po){//这里留个坑，不能删除文件
		PhotoPo ppo=new PhotoPo();
		ppo.setAlbum_id(po.getAlbum_id());
		pMapper.deletePhotoPoByAlbum_id(ppo);
		return mapper.deleteAlbumPoById(po);
	}
	
	public List<AlbumPo> getAlbumPoList(AlbumPo po){
		return mapper.getAlbumPoList(po);
	}
	
	public int updateAlbumPoById(AlbumPo po){
		return mapper.updateAlbumPoById(po);
	}
	
	public AlbumPo getAlbumPoById(AlbumPo po){
		return mapper.getAlbumPoById(po);
	}

}
