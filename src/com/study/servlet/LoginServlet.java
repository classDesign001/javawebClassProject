package com.study.servlet;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.study.bean.ajia_user;
import com.study.util.DBUtil;

public class LoginServlet extends HttpServlet {

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// TODO Auto-generated method stub
		this.doPost(req, resp);
	}

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		String user=req.getParameter("lname").trim();
		String pwd=req.getParameter("lwd").trim();
		PrintWriter out=resp.getWriter();
		
		Connection conn;
		PreparedStatement pstm=null;
		ajia_user user2=new ajia_user();
		try {
			conn=DBUtil.getConnection();
			String sql="select * from ajia_user where username=? and password=?";
			pstm=conn.prepareStatement(sql);
			pstm.setString(1, user);
			pstm.setString(2, pwd);
			ResultSet rs=pstm.executeQuery();
			HttpSession sess=req.getSession();
			if(rs.next()){
				
				user2.setCreated(rs.getString("created"));
				user2.setEmail(rs.getString("email"));
				user2.setId(rs.getInt("id"));
				user2.setPassword(rs.getString("password"));
				user2.setPhone(rs.getString("phone"));
				user2.setUpdated(rs.getString("updated"));
				user2.setUsername(rs.getString("username"));
				out.print("ok");
			}else {
				out.print("’À∫≈¥ÌŒÛ");
			}
			sess.setAttribute("user", user2);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
	}
	
}
