package com.jp.photo.mapper;

import java.util.List;

import org.springframework.stereotype.Component;

import com.jp.photo.po.AlbumPo;

@Component("albumMapper")
public interface AlbumMapper {
	
	public int addAlbumPo(AlbumPo po);
	
	public int deleteAlbumPoById(AlbumPo po);
	
	public List<AlbumPo> getAlbumPoList(AlbumPo po);
	
	public int updateAlbumPoById(AlbumPo po);
	
	public AlbumPo getAlbumPoById(AlbumPo po);

}
