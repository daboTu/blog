package com.jp.aboutBlog.mapper;

import java.util.List;

import org.springframework.stereotype.Component;

import com.jp.aboutBlog.po.AboutBlogPo;

@Component("aboutBlogMapper")
public interface AboutBlogMapper {

	public int addAboutBlog(AboutBlogPo po);
	
	public int deleteAboutBlogById(AboutBlogPo po);
	
	public List<AboutBlogPo> getAboutBlogList(AboutBlogPo po);
	
	public int updateAboutById(AboutBlogPo po);
}
