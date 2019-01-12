package com.study.dao;

import java.util.List;

import com.study.bean.ajia_cart_item;


public interface AjiaCartItemDao extends BaseDao<ajia_cart_item> {
	
	public List<ajia_cart_item> selectAll();
		
	public List<ajia_cart_item> selectCartItemByUserId(int userid);
}
