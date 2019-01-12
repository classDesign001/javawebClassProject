package com.study.servlet;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.study.bean.Item;
import com.study.dao.DetailsDao;
import com.study.daoImpl.DetailsDaoImpl;

public class DetailsServlet extends HttpServlet {
	DetailsDao detailsdao=new DetailsDaoImpl();

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		doPost(req, resp);
	}

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		String id=req.getParameter("id");
		Item item=detailsdao.selectItemById(id);
		System.out.println(item.getBrand());
		resp.sendRedirect("jsp/product_details.jsp?brand="+item.getBrand()+"&price="+item.getPrice());
	}

}
