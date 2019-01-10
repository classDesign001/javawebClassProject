package com.study.dao;

import java.sql.SQLException;

public interface BaseDao<T> {
	
	void add(T t);

	boolean delete(T t) throws SQLException;
	boolean update(T t);
	T select(T t);
}
