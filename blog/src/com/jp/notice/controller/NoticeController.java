package com.jp.notice.controller;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.jp.commom.result.ResultHandle;
import com.jp.commom.util.DateUtil;
import com.jp.commom.util.UUidUtil;
import com.jp.notice.biz.NoticeBiz;
import com.jp.notice.po.NoticePo;

@Controller
public class NoticeController {

	@Resource
	private NoticeBiz biz;
	
	
	@RequestMapping(value="/addNoticePo.do")
	public @ResponseBody ResultHandle addNoticePo(NoticePo po){
		ResultHandle result=new ResultHandle();
		po.setCreateTime(DateUtil.getTimeMiao());
		po.setUpdateTime(DateUtil.getTimeMiao());
		if(po.getNotice_id()==null||"".equals(po.getNotice_id())){
			po.setNotice_id(UUidUtil.getUUid());
		}
		try{
			int num=biz.addNoticePo(po);
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
	@RequestMapping(value="/deleteNoticePo.do")
	public @ResponseBody ResultHandle deleteNoticePo(NoticePo po){
		ResultHandle result=new ResultHandle();
		try{
			int num=biz.deleteNoticeById(po);
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
	@RequestMapping(value="/getNoticeList.do")
	public @ResponseBody List<NoticePo> getList(NoticePo po){
		System.out.println(biz.getCount(po));
		return biz.getNoticeList(po);
	}
	@RequestMapping(value="/updateNoticePo.do")
	public @ResponseBody ResultHandle updateNoticePo(NoticePo po){
		ResultHandle result=new ResultHandle();
		po.setUpdateTime(DateUtil.getTimeMiao());
		try{
			int num=biz.updateNoticePoById(po);
			if(num>0){
				result.setCode("0");
				result.setMessage("更新成功！");
			}else{
				result.setCode("1");
				result.setMessage("更新失败！");
			}
		}catch (Exception e){
			result.setCode("1");
			result.setMessage("更新失败！");
		}
		return result;
	}
	
	
}
