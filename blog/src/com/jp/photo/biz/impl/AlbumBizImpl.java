package com.jp.photo.biz.impl;

import javax.annotation.Resource;

import org.springframework.stereotype.Component;

import com.jp.photo.biz.AlbumBiz;
import com.jp.photo.mapper.AlbumMapper;
@Component("albumnBiz")
public class AlbumBizImpl implements AlbumBiz{
	@Resource
	private AlbumMapper mapper;

}
