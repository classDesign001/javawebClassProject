package com.study.daoIpml;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import com.study.bean.ajia_cart_item;
import com.study.dao.AjiaCartItemDao;
import com.study.util.DaoHepler;

public class AjiaCartItemImpl extends BaseDaoImpl<ajia_cart_item> implements AjiaCartItemDao {
	
	public AjiaCartItemImpl() {
		
	}

	@Override
	public List<ajia_cart_item> selectAll() {
		List<ajia_cart_item>lists=new ArrayList<ajia_cart_item>();
		String sql="select * from ajiacartitem";
		
		Connection con=DaoHepler.getConn();
		/*id	userid	itemid	num	status	createdTime	2019-03-03 00:00:00.000000*/
		try {
			Statement stmt=con.createStatement();
			ResultSet rs=stmt.executeQuery(sql);
			ajia_cart_item cartItem;
			while(rs.next()) {
				cartItem=new ajia_cart_item();
				cartItem.setId(rs.getInt(1));
				cartItem.setUserId(rs.getInt(2));
				cartItem.setItemId(rs.getInt(3));
				cartItem.setNum(rs.getInt(4));
				cartItem.setStatus(rs.getInt(5));
				cartItem.setCreated(rs.getString(6));
				cartItem.setUpdated(rs.getString(7));
				lists.add(cartItem);
			}				
		} catch (SQLException e) {
			try {
				con.close();
			} catch (SQLException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
			e.printStackTrace();
		}
		return lists;	
	}

	@Override
	public List<ajia_cart_item> selectCartItemByUserId(int userid) {
		List<ajia_cart_item>lists=new ArrayList<ajia_cart_item>();
		String sql="select * from ajia_cart_item where user_id="+String.valueOf(userid);
		
		Connection con=DaoHepler.getConn();
	
		try {
			Statement stmt=con.createStatement();
			ResultSet rs=stmt.executeQuery(sql);
			ajia_cart_item cartItem;
			while(rs.next()) {
				cartItem=new ajia_cart_item();
				cartItem.setId(rs.getInt(1));
				cartItem.setUserId(rs.getInt(2));
				cartItem.setItemId(rs.getInt(3));
				cartItem.setNum(rs.getInt(4));
				cartItem.setStatus(rs.getInt(5));
				cartItem.setCreated(rs.getString(6));
				cartItem.setUpdated(rs.getString(7));
				lists.add(cartItem);
			}				
		} catch (SQLException e) {
			try {
				con.close();
			} catch (SQLException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
			e.printStackTrace();
		}
		return lists;	
	}
	
	
	

}
