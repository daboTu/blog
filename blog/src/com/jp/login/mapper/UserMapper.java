package com.jp.login.mapper;

import org.springframework.stereotype.Component;

import com.jp.login.po.UserPo;
@Component("userMapper")

/**
 * 对应数据表blog_user
 * 版权所有：2018-zhuwei
 * 项目名称：blog   
 *
 * 类描述：
 * 类名称：com.jp.login.mapper.UserMapper     
 * 创建人：朱为 
 * 创建时间：2018年1月31日 上午9:21:55   
 * 修改人：
 * 修改时间：2018年1月31日 上午9:21:55   
 * 修改备注：   
 * @version   V1.0
 */
public interface UserMapper {
	
	public int addUser(UserPo po);

}
