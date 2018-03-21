package com.jp.aboutBlog.biz.impl;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Component;

import com.jp.aboutBlog.biz.AboutBlogBiz;
import com.jp.aboutBlog.mapper.AboutBlogMapper;
import com.jp.aboutBlog.po.AboutBlogPo;
@Component("aboutBlogBiz")
public class AboutBlogBizImpl implements AboutBlogBiz{
	
	@Resource
	private AboutBlogMapper aboutBlogMapper;
	
	public int addAboutBlogPo (AboutBlogPo po){
		return aboutBlogMapper.addAboutBlog(po);
	}
	
	public int deleteAboutBlogById(AboutBlogPo po){
		return aboutBlogMapper.deleteAboutBlogById(po);
	}
	
	public List<AboutBlogPo> getAboutBlogList(AboutBlogPo po){
		return aboutBlogMapper.getAboutBlogList(po);
	}

	public int updateAboutById(AboutBlogPo po){
		return aboutBlogMapper.updateAboutById(po);
	}
}
