package com.jp.commom.util;

import java.util.UUID;
/**
 * 获取uuid的工具类
 * 版权所有：2018-zhuwei
 * 项目名称：blog   
 *
 * 类描述：
 * 类名称：com.jp.commom.util.UUidUtil     
 * 创建人：朱为 
 * 创建时间：2018年1月31日 上午9:35:03   
 * 修改人：
 * 修改时间：2018年1月31日 上午9:35:03   
 * 修改备注：   
 * @version   V1.0
 */
public class UUidUtil {
	
	/**
	 * 获取一个uuid
	 * @author 朱为
	 * @Description: TODO
	 * @date 2018年1月31日 上午9:35:13
	 * @return 一个uuid
	 */
	public static String getUUid(){
		return UUID.randomUUID().toString();
	}
	/**
	 * 获取指定数量的uuid
	 * @author 朱为
	 * @Description: TODO
	 * @date 2018年1月31日 上午9:35:23
	 * @param num
	 * @return uuid数组
	 */
	public static String[] getUUids(int num){
		String [] uuids=new String[num];
		for (int i=0;i<num;i++){
			uuids[i]=UUID.randomUUID().toString();
		}
		return uuids;
	}

}
