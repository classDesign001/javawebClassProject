package com.study.dao;

import com.study.bean.Item;

public interface DetailsDao extends BaseDao<Item> {
	Item selectItemById(String id);
}
