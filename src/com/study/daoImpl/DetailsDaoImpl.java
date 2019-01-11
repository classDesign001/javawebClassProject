package com.study.daoImpl;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.study.bean.Item;
import com.study.dao.DetailsDao;
import com.study.daoImpl.BaseDaoImpl;
import com.study.util.DBUtil;

public class DetailsDaoImpl extends BaseDaoImpl<Item> implements DetailsDao {

	@Override
	public Item selectItemById(String id) {
		Connection conn = null;
		PreparedStatement pstm=null;
		ResultSet rs=null;
		Item item=new Item();
		String sql="select * from ajia_item where id=?";
		try {
			conn=DBUtil.getConnection();
			pstm=conn.prepareStatement(sql);
			pstm.setString(1, id);
			rs=pstm.executeQuery();
			if(rs.next()) {
				item.setBrand(rs.getString("brand"));
			}
		} catch (ClassNotFoundException e2) {
			e2.printStackTrace();
		} catch (SQLException e2) {
			e2.printStackTrace();
		}
		return item;
	}

}
