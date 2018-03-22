package com.jp.photo.controller;

import java.io.File;
import java.io.IOException;
import java.util.List;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.multipart.MultipartFile;

import com.jp.commom.result.ResultHandle;
import com.jp.commom.util.DateUtil;
import com.jp.commom.util.UUidUtil;
import com.jp.photo.biz.PhotoBiz;
import com.jp.photo.po.PhotoPo;

@Controller
public class PhotoController {
	@Resource
	private PhotoBiz biz;
	
	
	
	@RequestMapping(value="/addPhotoPo.do")
	public @ResponseBody ResultHandle addPhotoPo(MultipartFile file, HttpServletRequest request,PhotoPo po){
		ResultHandle result=new ResultHandle();
		if(po.getPhoto_id()==null||po.getPhoto_id().equals("")){
			po.setPhoto_id(UUidUtil.getUUid());
		}
		po.setCreateTime(DateUtil.getTimeRi());
		try{
			String path= uploadSavePhoto(request,file);
			po.setPath(path);
			int num=biz.addPhotoPo(po);
			if(num>0){
				result.setCode("0");
				result.setMessage("新增成功！");
			}else{
				result.setCode("0");
				result.setMessage("新增失败！");
			}
		}catch (Exception e){
			e.printStackTrace();
			result.setCode("0");
			result.setMessage("新增失败！");
		}
		return result;
	}
	@RequestMapping(value="/deletePhotoPoById.do")
	public @ResponseBody ResultHandle deletePhotoPoById(PhotoPo po){
		ResultHandle result=new ResultHandle();
		try{
			int num=biz.deletePhotoPoById(po);
			if(num>0){
				result.setCode("0");
				result.setMessage("删除成功！");
			}else{
				result.setCode("0");
				result.setMessage("删除失败！");
			}
		}catch (Exception e){
			e.printStackTrace();
			result.setCode("0");
			result.setMessage("删除失败！");
		}
		return result;
	}
	@RequestMapping(value="/getPhotoListByTimeAndPageAndAlbum_id.do")
	public @ResponseBody List<PhotoPo> getPhotoListByTimeAndPageAndAlbum_id(PhotoPo po){
		List <PhotoPo> result=biz.getPhotoListByTimeAndPageAndAlbum_id(po);
		return result;
	}
	
	private String uploadSavePhoto(HttpServletRequest request,MultipartFile file) throws IllegalStateException, IOException{
		String realPath = request.getSession().getServletContext().getRealPath("");
	 	String path = realPath+"upload/photo/"+DateUtil.getTimeRi(); 
        String fileName = String.valueOf(System.currentTimeMillis())+file.getOriginalFilename().substring( file.getOriginalFilename().indexOf("."));   
        File dir = new File(path,fileName);          
        if(!dir.exists()){  
            dir.mkdirs();  
        }  
        //MultipartFile自带的解析方法  
        file.transferTo(dir);  
        return path+"/"+fileName;  
	}
	
	

}
