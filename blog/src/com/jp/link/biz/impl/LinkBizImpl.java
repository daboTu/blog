package com.jp.link.biz.impl;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Component;

import com.jp.link.biz.LinkBiz;
import com.jp.link.mapper.LinkMapper;
import com.jp.link.po.LinkPo;
@Component("linkBiz")
public class LinkBizImpl implements LinkBiz{

	
	@Resource
	private LinkMapper mapper;
	
	public int addLinkPo(LinkPo po){
		return mapper.addLinkPo(po);
	}
	
	public int deleteLinkPo(LinkPo po){
		return mapper.deleteLinkPo(po);
	}
	
	public List<LinkPo> getList(LinkPo po){
		return mapper.getList(po);
	}
}
