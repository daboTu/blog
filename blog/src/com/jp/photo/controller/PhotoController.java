package com.jp.photo.controller;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.util.Base64;
import java.util.Base64.Decoder;
import java.util.List;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.jp.commom.result.ResultHandle;
import com.jp.commom.util.DateUtil;
import com.jp.commom.util.UUidUtil;
import com.jp.photo.biz.PhotoBiz;
import com.jp.photo.po.PhotoPo;

@Controller
public class PhotoController {
	@Resource
	private PhotoBiz biz;
	
	
	/**
	 * @author 朱为
	 * @Description: TODO
	 * @date 2018年3月25日 上午11:50:12
	 * @param file  这个是一个base64编码的字符串，解析后保存
	 * @param fileType这个是文件类型，不带“.”
	 * @param request
	 * @param po
	 * @return
	 */
	@RequestMapping(value="/addPhotoPo.do")
	public @ResponseBody ResultHandle addPhotoPo(String file,String fileType, HttpServletRequest request,PhotoPo po){
		ResultHandle result=new ResultHandle();
		file = file.replaceAll("data:image/jpeg;base64,", ""); //这里要处理一下文件的开头
		if(po.getPhoto_id()==null||po.getPhoto_id().equals("")){
			po.setPhoto_id(UUidUtil.getUUid());
		}
		po.setCreateTime(DateUtil.getTimeRi());
		try{
			String dirPath= uploadSavePhoto(request,file,fileType);
			String realPath = request.getSession().getServletContext().getRealPath("");
			po.setPath(getBasePath(request)+dirPath);
			po.setRealPath(realPath+dirPath);
			System.out.println(po.getRealPath());
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
	
	private String uploadSavePhoto(HttpServletRequest request,String file,String fileType) throws IllegalStateException, IOException{
		String realPath = request.getSession().getServletContext().getRealPath("");
		String dirPath="upload/photo/"+DateUtil.getTimeRi(); 
	 	String path = realPath+dirPath;
        String fileName = String.valueOf(System.currentTimeMillis())+"."+fileType;
        File dir = new File(path);
      //  System.out.println(file);
        if(!dir.exists()){  
            dir.mkdirs();  
        }  
        File imageFile=new File(path+"/"+fileName);
        if(!imageFile.exists()){
        	imageFile.createNewFile();
        }
        //BASE64Decoder decode=new BASE64Decoder();
        Decoder decoder=Base64.getDecoder();
       byte[] bytes= decoder.decode(file);
        OutputStream ops = new FileOutputStream(imageFile);
        ops.write(bytes);
        ops.flush();ops.close();
        //MultipartFile自带的解析方法  
        //file.transferTo(dir);  
        return dirPath+"/"+fileName;  
	}
	
	private String getBasePath(HttpServletRequest request){
		return request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+request.getContextPath()+"/";
	}
	

}
