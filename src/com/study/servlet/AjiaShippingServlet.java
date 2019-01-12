package com.study.servlet;

import java.io.IOException;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.time.format.DateTimeFormatter;
import java.util.Date;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.study.bean.ajia_shipping;
import com.study.bean.ajia_user;
import com.study.dao.ajiaShippingDao;
import com.study.daoImpl.ajiaShippingImpl;

/**
 * Servlet implementation class AjiaShippingServlet
 */
@WebServlet("/AjiaShippingServlet")
public class AjiaShippingServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public AjiaShippingServlet() {
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
		request.setCharacterEncoding("utf-8");
		String recvusername=request.getParameter("recvusername");
		String provices=request.getParameter("provices");
		String cites=request.getParameter("cites");
		String counties=request.getParameter("counties");
		String street=request.getParameter("street");
		String addressinfo=request.getParameter("addressinfo");
		String mobile=request.getParameter("mobile");
		String phone=request.getParameter("phone");
		String zipcode=request.getParameter("zipcode");
		String address=request.getParameter("address");
		ajia_user user=(ajia_user)request.getSession().getAttribute("user");
		
		ajia_shipping shipping=new ajia_shipping();
		shipping.setUser_id(user.getId());
		shipping.setReceiver_address(addressinfo);
		shipping.setReceiver_city(cites);
		shipping.setReceiver_district(counties);
		shipping.setReceiver_mobile(mobile);
		shipping.setReceiver_phone(phone);
		shipping.setReceiver_name(recvusername);
		shipping.setReceiver_state(provices);
		shipping.setReceiver_zip(zipcode);
		DateFormat format = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
		Date date=new Date();
		String datestr=format.format(date);
		shipping.setCereated(datestr);
		shipping.setUpdated(datestr);
		ajiaShippingDao shDao=new ajiaShippingImpl();
		shDao.add(shipping);
		
		response.sendRedirect("addressAdmin.jsp");
	}

}
