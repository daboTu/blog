package com.jp.link.controller;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.jp.commom.result.ResultHandle;
import com.jp.commom.util.UUidUtil;
import com.jp.link.biz.LinkBiz;
import com.jp.link.po.LinkPo;

@Controller
public class LinkController {

	
	@Resource
	private LinkBiz biz;
	
	@RequestMapping(value="/addLinkPo.do")
	public @ResponseBody ResultHandle addLinkPo(LinkPo po){
		ResultHandle result=new ResultHandle();
		if(po.getLink_id()==null||po.getLink_id().equals("")){
			po.setLink_id(UUidUtil.getUUid());
		}
		try{
			int num=biz.addLinkPo(po);
			if(num>0){
				result.setCode("0");
				result.setMessage("新增成功！");
			}else{
				result.setCode("1");
				result.setMessage("新增失败！");
			}
		}catch (Exception e){
			result.setCode("1");
			result.setMessage("新增失败！");
			e.printStackTrace();
		}
		return result;
	}
	@RequestMapping(value="/deleteLinkPo.do")
	public @ResponseBody ResultHandle deleteLinkPo(LinkPo po){
		ResultHandle result=new ResultHandle();
		try{
			int num=biz.deleteLinkPo(po);
			if(num>0){
				result.setCode("0");
				result.setMessage("删除成功！");
			}else{
				result.setCode("1");
				result.setMessage("删除失败！");
			}
		}catch (Exception e){
			result.setCode("1");
			result.setMessage("删除失败！");
		}
		return result;
	}
	
	
	@RequestMapping(value="/getLinkList.do")
	public @ResponseBody List<LinkPo> getList(LinkPo po){
		return biz.getList(po);
	}
}
