package com.jp.link.biz;

import java.util.List;

import com.jp.link.po.LinkPo;

public interface LinkBiz {
	
	public int addLinkPo(LinkPo po);
	
	public int deleteLinkPo(LinkPo po);
	
	public List<LinkPo> getList(LinkPo po);

}
