package com.study.servlet;

import java.io.IOException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.text.SimpleDateFormat;
import java.util.Date;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.apache.catalina.User;

import com.study.bean.ajia_collect_item;
import com.study.bean.ajia_item;
import com.study.dao.BaseDao;
import com.study.dao.ajiaItemDao;
import com.study.daoIpml.BaseDaoImpl;
import com.study.daoIpml.UserDaoImpl;
import com.study.daoIpml.ajiaItemDaoImpl;
import com.study.util.DBUtil;
import com.sun.org.apache.bcel.internal.generic.NEW;

public class CollectServlet extends HttpServlet{

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		this.doPost(req, resp);
	}

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		int status = Integer.parseInt(req.getParameter("status"));
		if(status == 1)	//添加
		{
			String username = req.getParameter("username");
			int user_id = 0;

			Connection conn;
			PreparedStatement pstm=null;
			try {
					conn=DBUtil.getConnection();
					String sql="select * from ajia_user where username=? ";
					pstm=conn.prepareStatement(sql);
					pstm.setString(1, username);
					ResultSet rs=pstm.executeQuery();
					if(rs.next())
					{
						user_id = rs.getInt("id");
					}
				}
			catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} catch (ClassNotFoundException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
//			
//			User user = new UserDaoImpl().select(t)
//			int user_id = Integer.parseInt(req.getParameter("username"));		//用户id
			int item_id = Integer.parseInt(req.getParameter("item_id"));		//商品id
			ajia_item item = new ajia_item();
			item.setId(item_id);
			ajiaItemDao ajItemDao = new ajiaItemDaoImpl();
			item = ajItemDao.select(item);
			ajia_collect_item collect = new ajia_collect_item();
			collect.setUser_id(user_id);
			collect.setItem_id(item.getId());
			collect.setTitle(item.getTitle());
			collect.setPrice(item.getPrice());
			collect.setPic_path(item.getImage());
			//collect.setItem_param_data(item_param_data);			//商品参数
			collect.setStatus(1);
			SimpleDateFormat dateFormat = new SimpleDateFormat(
                    "yyyy-MM-dd HH:mm:ss");
            String strTime = dateFormat.format(new Date());
            collect.setCreated(strTime);
            collect.setUpdated(strTime);
            new ajiaItemDaoImpl().add(item);
      //      req.getRequestDispatcher("./").forward(req, resp);
		}
		else
		{
			int id = Integer.parseInt(req.getParameter("id"));
			ajia_collect_item collect = new ajia_collect_item();
			collect.setId(id);
			try {
				new BaseDaoImpl<>().delete(collect);
	            req.getRequestDispatcher("./").forward(req, resp);
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
	
}
