package com.study.daoImpl;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.study.bean.ajia_shipping;
import com.study.bean.ajia_user;
import com.study.dao.ajiaShippingDao;
import com.study.util.DBUtil;

public class ajiaShippingImpl extends BaseDaoImpl<ajia_shipping> implements ajiaShippingDao {

	public ajiaShippingImpl() {
		// TODO Auto-generated constructor stub
	}

	@Override
	public List<ajia_shipping> selectAll() {
		List<ajia_shipping> ajia_shippings=new ArrayList<ajia_shipping>(); 
		
		Connection conn = null;
		PreparedStatement pstm=null;
		ResultSet rs=null;
		ajia_shipping shipping=new ajia_shipping();
		String sql="select * from ajia_shipping";
		try {
			conn=DBUtil.getConnection();
			pstm=conn.prepareStatement(sql);
			rs=pstm.executeQuery();
			while(rs.next()) {
				
				shipping.setCereated(rs.getString("cereated"));
				if(rs.getInt("is_default")==1) {
					shipping.setIs_default(true);
				}else {
					shipping.setIs_default(false);
					
				}
				
				shipping.setId(rs.getInt("id"));
				shipping.setReceiver_address(rs.getString("receiver_address"));
				shipping.setReceiver_city(rs.getString("receiver_city"));
				shipping.setReceiver_district(rs.getString("receiver_district"));
				shipping.setReceiver_mobile(rs.getString("receiver_mobile"));
				shipping.setReceiver_name(rs.getString("receiver_name"));
				shipping.setReceiver_phone(rs.getString("receiver_phone"));
				shipping.setReceiver_state(rs.getString("receiver_state"));
				shipping.setReceiver_zip(rs.getString("receiver_zip"));
				shipping.setStatus(rs.getInt("status"));
				shipping.setUpdated(rs.getString("updated"));
				shipping.setUser_id(rs.getInt("user_id"));
				ajia_shippings.add(shipping);
			}
			rs.close();
			conn.close();
		} catch (ClassNotFoundException e2) {
			// TODO Auto-generated catch block
			e2.printStackTrace();
		} catch (SQLException e2) {
			// TODO Auto-generated catch block
			e2.printStackTrace();
		}
		
		
		
		return ajia_shippings;
	}

	
	
	
	
	
	
}
