package com.jp.leavemessage.controller;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.jp.commom.result.ResultHandle;
import com.jp.commom.util.DateUtil;
import com.jp.commom.util.UUidUtil;
import com.jp.leavemessage.biz.LeaveMessageBiz;
import com.jp.leavemessage.po.LeaveMessagePo;

@Controller
public class LeaveMessageController {
	@Resource
	private LeaveMessageBiz biz;
	
	
	@RequestMapping(value="/addLeaveMessagePo.do")
	public @ResponseBody ResultHandle addLeaveMessagePo(LeaveMessagePo po){
		ResultHandle result=new ResultHandle();
		if(po.getLeaveMessage_id()==null||"".equals(po.getLeaveMessage_id())){
			po.setLeaveMessage_id(UUidUtil.getUUid());
		}
		po.setCteateTime(DateUtil.getTimeMiao());
		try{
			int num=biz.addLeaveMessagePo(po);
			if(num>0){
				result.setCode("0");
				result.setMessage("新增成功");
			}else{
				result.setCode("1");
				result.setMessage("新增失败");
			}
		}catch (Exception e){
			e.printStackTrace();
			result.setCode("1");
			result.setMessage("新增失败");
		}
		return result;
	}
	@RequestMapping(value="/deleteLeaveMessagePoById.do")
	public @ResponseBody ResultHandle deleteLeaveMessagePoById(LeaveMessagePo po){
		ResultHandle result=new ResultHandle();
		if(po.getLeaveMessage_id()==null||"".equals(po.getLeaveMessage_id())){
			po.setLeaveMessage_id(UUidUtil.getUUid());
		}
		po.setCteateTime(DateUtil.getTimeMiao());
		try{
			int num=biz.deleteLeaveMessagePoById(po);
			if(num>0){
				result.setCode("0");
				result.setMessage("删除成功");
			}else{
				result.setCode("1");
				result.setMessage("删除失败");
			}
		}catch (Exception e){
			e.printStackTrace();
			result.setCode("1");
			result.setMessage("删除失败");
		}
		return result;
	}
	
	@RequestMapping(value="/getLeaveMessageListPoById.do")
	public @ResponseBody List<LeaveMessagePo>getLeaveMessageListPoById(LeaveMessagePo po){
		return biz.getLeaveMessageListPoById(po);
	}
	
	
	
}
