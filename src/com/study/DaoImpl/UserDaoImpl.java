package com.study.DaoImpl;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.study.bean.ajia_user;
import com.study.dao.UserDao;
import com.study.util.DBUtil;

public class UserDaoImpl extends BaseDaoImpl<ajia_user> implements UserDao {

	@Override
	public ajia_user selectUserByUsername(String username,String password) {
		Connection conn = null;
		PreparedStatement pstm=null;
		ResultSet rs=null;
		ajia_user user=new ajia_user();
		String sql="select * from ajia_user where username=? and password=?";
		try {
			conn=DBUtil.getConnection();
			pstm=conn.prepareStatement(sql);
			pstm.setString(1, username);
			pstm.setString(2, password);
			rs=pstm.executeQuery();
			if(rs.next()) {
				
				user.setCreated(rs.getString("created"));
				user.setEmail(rs.getString("email"));
				user.setId(rs.getInt("id"));
				user.setPassword(rs.getString("password"));
				user.setPhone(rs.getString("phone"));
				user.setUpdated(rs.getString("updated"));
				user.setUsername(rs.getString("username"));
			}
		} catch (ClassNotFoundException e2) {
			// TODO Auto-generated catch block
			e2.printStackTrace();
		} catch (SQLException e2) {
			// TODO Auto-generated catch block
			e2.printStackTrace();
		}
		
		
		return user;
	}

	
}
