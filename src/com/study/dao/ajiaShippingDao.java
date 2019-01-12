package com.study.dao;

import java.util.List;

import com.study.bean.ajia_shipping;

public interface ajiaShippingDao extends BaseDao<ajia_shipping> {

	List<ajia_shipping> selectAll();
}
