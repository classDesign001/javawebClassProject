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

import com.study.bean.ajia_user;
import com.study.dao.UserDao;
import com.study.daoImpl.*;
import com.study.util.DBUtil;

public class RegisterServlet extends HttpServlet {

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// TODO Auto-generated method stub
		this.doPost(req, resp);
	}

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		String uname=req.getParameter("uname").trim();
		String upwd=req.getParameter("upwd").trim();
		String email=req.getParameter("email").trim();
		String phone=req.getParameter("phone").trim();
		PrintWriter out=resp.getWriter();
		ajia_user user=new ajia_user();
		user.setUsername(uname);
		user.setEmail(email);
		user.setPassword(upwd);
		user.setPhone(phone);
		
		UserDao userdao=new UserDaoImpl();
		userdao.add(user);
		
	
		
		
	}
	
}
