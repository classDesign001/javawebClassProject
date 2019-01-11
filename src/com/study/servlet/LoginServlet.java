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
		try {
			conn=DBUtil.getConnection();
			String sql="select * from ajia_user where username=? and password=?";
			pstm=conn.prepareStatement(sql);
			pstm.setString(1, user);
			pstm.setString(2, pwd);
			ResultSet rs=pstm.executeQuery();
			if(rs.next()){
				HttpSession sess=req.getSession();
				sess.setAttribute("username", rs.getString("username"));
				out.print("ok");
			}else {
				out.print("’À∫≈¥ÌŒÛ");

			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
	}
	
}
