package com.jp.photo.biz.impl;

import javax.annotation.Resource;

import org.springframework.stereotype.Component;

import com.jp.photo.biz.PhotoBiz;
import com.jp.photo.mapper.PhotoMapper;
@Component("photoBiz")
public class PhotoBizImpl implements PhotoBiz{

	@Resource
	private PhotoMapper mapper;
}
