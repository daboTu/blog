package com.jp.link.mapper;

import java.util.List;

import org.springframework.stereotype.Component;

import com.jp.link.po.LinkPo;

@Component("linkMapper")
public interface LinkMapper {
	
	
	public int addLinkPo(LinkPo po);
	
	public int deleteLinkPo(LinkPo po);
	
	public List<LinkPo> getList(LinkPo po);

}
