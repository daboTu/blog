package com.jp.photo.controller;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.jp.commom.result.ResultHandle;
import com.jp.commom.util.DateUtil;
import com.jp.commom.util.UUidUtil;
import com.jp.photo.biz.AlbumBiz;
import com.jp.photo.po.AlbumPo;
@Controller
public class AlbumController {
	@Resource
	private AlbumBiz biz;
	@RequestMapping(value="/addAlbumPo.do")
	public @ResponseBody ResultHandle addAlbumPo(AlbumPo po){
		ResultHandle result=new ResultHandle();
		if(po.getAlbum_id()==null||po.getAlbum_id().equals("")){
			po.setAlbum_id(UUidUtil.getUUid());
		}
		po.setCreateTime(DateUtil.getTimeMiao());
		try{
			int num=biz.addAlbumPo(po);
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
	@RequestMapping(value="/deleteAlbumPoById.do")
	public @ResponseBody ResultHandle deleteAlbumPoById(AlbumPo po){
		ResultHandle result=new ResultHandle();
		try{
			int num=biz.deleteAlbumPoById(po);
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
	@RequestMapping(value="/getAlbumPoList.do")
	public @ResponseBody List<AlbumPo> getAlbumPoList(AlbumPo po){
		return biz.getAlbumPoList(po);
	}
	@RequestMapping(value="/updateAlbumPoById.do")
	public @ResponseBody ResultHandle updateAlbumPoById(AlbumPo po){
		ResultHandle result=new ResultHandle();
		try{
			int num=biz.updateAlbumPoById(po);
			if(num>0){
				result.setCode("0");
				result.setMessage("更新成功");
			}else{
				result.setCode("1");
				result.setMessage("更新失败");
			}
		}catch (Exception e){
			e.printStackTrace();
			result.setCode("1");
			result.setMessage("更新失败");
		}
		return result;
		
	}
	@RequestMapping(value="/getAlbumPoById.do")
	public @ResponseBody AlbumPo getAlbumPoById(AlbumPo po){
		return biz.getAlbumPoById(po);
	}

}
