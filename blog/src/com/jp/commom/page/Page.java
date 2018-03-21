package com.jp.commom.page;
/**
 * 
 * 版权所有：2018-zhuwei
 * 项目名称：blog   
 *
 * 类描述：这个类是用来组装分类的参数用的
 * 类名称：com.jp.commom.page.Page     
 * 创建人：朱为 
 * 创建时间：2018年3月19日 下午1:27:17   
 * 修改人：
 * 修改时间：2018年3月19日 下午1:27:17   
 * 修改备注：   
 * @version   V1.0
 */
public class Page {
	
	private String pageNum;//开始页数,注意这里页面页数是从第一个开始的
	
	private String pageSize;//页面记录数
	
	private int begin;//纪录行数的开始
	
	
	private int size;//页面纪录数，这个是考虑mysql的limit不能使用字符串
	


	public String getPageNum() {
		return pageNum;
	}

	public void setPageNum(String pageNum) {
		this.pageNum = pageNum;
	}

	public String getPageSize() {
		return pageSize;
	}

	public void setPageSize(String pageSize) {
		this.pageSize = pageSize;
	}

	public int getBegin() {
		if((pageNum!=null&&!"".equals(pageNum))&&(pageSize!=null&&!pageSize.equals(""))){
			try{
				begin=(Integer.valueOf(pageNum)-1)*Integer.valueOf(pageSize);
			}catch (Exception e){
				begin=0;
			}
		}
		return begin;
	}

	public void setBegin(int begin) {
		this.begin = begin;
	}

	public int getSize() {
		int result=size;
		if(pageSize!=null&&!"".equals(pageSize)){
			try{
				result=Integer.valueOf(pageSize);
			}catch(Exception e){
				result=0;
			}
		}
		return result;
	}

	public void setSize(int size) {
		this.size = size;
	}
	
	
	
	

}
