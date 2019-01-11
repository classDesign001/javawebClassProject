package com.study.dao;

import com.study.bean.ajia_user;

public interface UserDao extends BaseDao<ajia_user> {

	public ajia_user selectUserByUsername(String username,String password);
	
}
