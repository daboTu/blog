package com.jp.aboutBlog.controller;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Properties;

import javax.annotation.Resource;

import oracle.net.aso.a;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.portlet.bind.annotation.ResourceMapping;

import com.jp.aboutBlog.biz.AboutBlogBiz;
import com.jp.aboutBlog.po.AboutBlogPo;
import com.jp.commom.result.ResultHandle;
/**
 * 
 * 版权所有：2018-zhuwei
 * 项目名称：blog   
 *
 * 类描述：这个类可能用不上数据库了,改用文件流操作properties文件
 * 类名称：com.jp.aboutBlog.controller.AboutBlogController     
 * 创建人：朱为 
 * 创建时间：2018年3月19日 下午5:42:19   
 * 修改人：
 * 修改时间：2018年3月19日 下午5:42:19   
 * 修改备注：   
 * @version   V1.0
 */
@Controller
public class AboutBlogController {
	
	@Resource
	private AboutBlogBiz aboutBlogBiz;
	
	private static final String FILEPATH=AboutBlogController.class.getResource("").getPath();//文件的绝对路径
	
	private static final String FILENAME="aboutBlog.properties";//文件名
	
	
	@RequestMapping(value="/updateAboutBlog.do")
	public @ResponseBody ResultHandle updateAboutBlog(AboutBlogPo po){
		ResultHandle result=new ResultHandle();
		Properties pro=new Properties();
		FileInputStream in=null;
		FileOutputStream fos=null;
		try {
			in=new FileInputStream(this.FILEPATH+this.FILENAME);
			fos=new FileOutputStream(this.FILEPATH+this.FILENAME);
			pro.load(in);
			pro.setProperty("name", po.getName()==null?"":po.getName());
			pro.setProperty("sex", po.getSex()==null?"":po.getSex());
			pro.setProperty("constellatory", po.getConstellatory()==null?"":po.getConstellatory());
			pro.setProperty("favorate", po.getFavorate()==null?"":po.getFavorate());
			pro.setProperty("job", po.getJob()==null?"":po.getJob());
			pro.setProperty("other", po.getOther()==null?"":po.getOther());
			pro.setProperty("motto", po.getMotto()==null?"":po.getMotto());
			pro.store(fos, "");//设置属性头，如不想设置，请把后面一个用""替换掉 
			result.setCode("0");
			result.setMessage("修改成功！");
		} catch (FileNotFoundException e) {
			result.setCode("1");
			result.setMessage("修改失败！");
			e.printStackTrace();
		} catch (IOException e) {
			result.setCode("1");
			result.setMessage("修改失败！");
			e.printStackTrace();
		}catch (Exception e){
			result.setCode("1");
			result.setMessage("修改失败！");
		}finally{
			try {
				fos.flush();
				fos.close();
				in.close();
			} catch (IOException e) {
			}
		}
		return result;
	}
	
	@RequestMapping(value="/getAboutBlogPo.do")
	public @ResponseBody AboutBlogPo getAboutBlogPo(){
		AboutBlogPo aboutBlogPo=new AboutBlogPo();
		Properties pro=new Properties();
		FileInputStream fis=null;
		try {
			fis=new FileInputStream(this.FILEPATH+this.FILENAME);
			pro.load(fis);
			aboutBlogPo.setName(pro.getProperty("name"));
			aboutBlogPo.setConstellatory(pro.getProperty("constellatory"));
			aboutBlogPo.setFavorate(pro.getProperty("favorate"));
			aboutBlogPo.setJob(pro.getProperty("job"));
			aboutBlogPo.setOther(pro.getProperty("other"));
			aboutBlogPo.setSex(pro.getProperty("sex"));
			aboutBlogPo.setMotto(pro.getProperty("motto"));
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		return aboutBlogPo;
	}

}
