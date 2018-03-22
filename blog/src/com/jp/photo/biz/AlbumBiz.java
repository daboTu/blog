package com.jp.photo.biz;

import java.util.List;

import com.jp.photo.po.AlbumPo;

public interface AlbumBiz {
	
	
public int addAlbumPo(AlbumPo po);
	
	public int deleteAlbumPoById(AlbumPo po);
	
	public List<AlbumPo> getAlbumPoList(AlbumPo po);
	
	public int updateAlbumPoById(AlbumPo po);
	
	public AlbumPo getAlbumPoById(AlbumPo po);

}
