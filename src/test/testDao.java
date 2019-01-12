package test;

import java.util.List;

import com.study.bean.ajia_shipping;
import com.study.dao.ajiaShippingDao;
import com.study.daoIpml.ajiaShippingImpl;

public class testDao {

	public testDao() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		
		ajiaShippingDao shippingDao=new ajiaShippingImpl();
		List<ajia_shipping> ships=shippingDao.selectAll();
		for (ajia_shipping ajia_shipping : ships) {
			System.out.println(ajia_shipping.toString());
		}
	}
}
