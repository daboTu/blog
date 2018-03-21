package com.jp.commom.util;

import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * 
 * 版权所有：2018-zhuwei
 * 项目名称：blog   
 *
 * 类描述：时间工具类
 * 类名称：com.jp.commom.util.DateUtil     
 * 创建人：朱为 
 * 创建时间：2018年3月19日 下午10:11:31   
 * 修改人：
 * 修改时间：2018年3月19日 下午10:11:31   
 * 修改备注：   
 * @version   V1.0
 */
public class DateUtil {
	
	/**
	 * 获取当前时间yyyy-MM-dd
	 * @author 朱为
	 * @Description: TODO
	 * @date 2018年3月19日 下午10:16:19
	 * @return
	 */
	public static String getTimeRi(){
		Date date=new Date();
		SimpleDateFormat sdf=new SimpleDateFormat("yyyy-MM-dd");
		String strDate=sdf.format(date);
		return strDate;
	}
	/**
	 * 获取当前时间yyyy-MM-dd hh:mm:ss
	 * @author 朱为
	 * @Description: TODO
	 * @date 2018年3月19日 下午10:16:41
	 * @return
	 */
	public static String getTimeMiao(){
		Date date=new Date();
		SimpleDateFormat sdf=new SimpleDateFormat("yyyy-MM-dd hh:mm:ss");
		String strDate=sdf.format(date);
		return strDate;
	}

}
