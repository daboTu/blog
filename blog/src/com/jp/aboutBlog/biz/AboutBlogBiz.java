package com.jp.aboutBlog.biz;

import java.util.List;

import com.jp.aboutBlog.po.AboutBlogPo;

public interface AboutBlogBiz {
	
	public int addAboutBlogPo (AboutBlogPo po);
	
	
	public int deleteAboutBlogById(AboutBlogPo po);
		
	
	public List<AboutBlogPo> getAboutBlogList(AboutBlogPo po);
		

	public int updateAboutById(AboutBlogPo po);
		
}
