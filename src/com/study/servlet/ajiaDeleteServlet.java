package com.study.servlet;

import java.io.IOException;
import java.sql.SQLException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.study.bean.ajia_shipping;
import com.study.dao.ajiaShippingDao;
import com.study.daoImpl.ajiaShippingImpl;

/**
 * Servlet implementation class ajiaDeleteServlet
 */
@WebServlet("/ajiaDeleteServlet")
public class ajiaDeleteServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public ajiaDeleteServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doPost(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		ajiaShippingDao shippingDao=new ajiaShippingImpl();
		ajia_shipping shipping=new ajia_shipping();
		int aid=Integer.parseInt(request.getParameter("id"));
		shipping.setId(aid);
		try {
			shippingDao.delete(shipping);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		response.sendRedirect("addressAdmin.jsp");
	}

}
