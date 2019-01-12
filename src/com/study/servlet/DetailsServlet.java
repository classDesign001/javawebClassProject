package com.study.servlet;

import java.io.IOException;

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
		req.setAttribute("brand", item.getBrand());
		req.setAttribute("model", item.getModel());
		req.setAttribute("titile", item.getTitle());
		req.setAttribute("sell_point", item.getSell_point());
		req.setAttribute("price", item.getPrice());
		req.getRequestDispatcher("product_details.jsp").forward(req, resp);
	}

}
