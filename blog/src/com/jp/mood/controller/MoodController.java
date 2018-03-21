package com.jp.mood.controller;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.jp.commom.result.ResultHandle;
import com.jp.commom.util.DateUtil;
import com.jp.commom.util.UUidUtil;
import com.jp.mood.biz.MoodBiz;
import com.jp.mood.po.MoodPo;

@Controller
public class MoodController {
	
	@Resource
	private MoodBiz biz;
	
	
	
	
	
	@RequestMapping(value="/addMoodPo.do")
	public @ResponseBody ResultHandle addMoodPo(MoodPo po){
		ResultHandle result=new ResultHandle();
		po.setCreateTime(DateUtil.getTimeMiao());
		if(po.getMood_id()==null||"".equals(po.getMood_id())){
			po.setMood_id(UUidUtil.getUUid());
		}
		try{
			int num=biz.addMoodPo(po);
			if(num>0){
				result.setCode("0");
				result.setMessage("新增成功！");
			}else{
				result.setCode("1");
				result.setMessage("新增失败！");
			}
		}catch (Exception e){
			e.printStackTrace();
			result.setCode("1");
			result.setMessage("新增失败！");
		}
		return result;
	}
	@RequestMapping(value="/deleteMoodById.do")
	public @ResponseBody ResultHandle deleteMoodById(MoodPo po){
		ResultHandle result=new ResultHandle();
		try{
			int num=biz.deleteMoodById(po);
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
	@RequestMapping(value="/updateMoodById.do")
	public @ResponseBody ResultHandle updateMoodById(MoodPo po){
		ResultHandle result=new ResultHandle();
		try{
			int num=biz.updateMoodById(po);
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
	@RequestMapping(value="/getMoodList.do")
	public @ResponseBody List<MoodPo> getList(MoodPo po){
	
		List<MoodPo> list=null;
		try{
			System.out.println(biz.getCount(po));
			list=biz.getList(po);
		}catch (Exception e){
			e.printStackTrace();
		}
		
		return list;
	}
	
	

}
