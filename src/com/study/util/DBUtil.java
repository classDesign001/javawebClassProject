package com.study.util;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DBUtil {
	
	private static String driver="com.mysql.jdbc.Driver";
	private static String url="jdbc:mysql://111.230.27.166:3306/ajiaMall";
	private static String user="ajiaMall";
	private static String password="nshCpGyMSL";
	
	/*
	 * ��̬����飺�������ʱ����Զ�ִ�о�̬�������������ݣ�ֻ��ִ��һ��
	 * */
	static{
		
		try {
			Class.forName(driver);
		
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	
	public static Connection  getConnection() throws SQLException, ClassNotFoundException{
		return DriverManager.getConnection(url, user, password);
		
	}
	
	public  static  void  close(Connection con){
		if (con!=null) {
			try {
				con.close();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
	}
	
	//static----ͨ������+��
	//jvm����������
	
}
