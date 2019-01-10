package com.study.util;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class DaoHepler {
	public DaoHepler() {
		try {
			Class.forName("com.mysql.jdbc.Driver");
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
	}

	// ���� --------------------------
	private static Connection conn;
	private Statement stm;
	private PreparedStatement pstm;
	private ResultSet rs;

	// �������--------------------------
	public static Connection getConn() {
		try {
			if (conn == null || conn.isClosed()) {
				conn = DriverManager.getConnection(
						"jdbc:mysql://localhost:3306/bbs?useUnicode=true&characterEncoding=UTF-8",
						"root", "root");
			}
		} catch (SQLException e) {
			e.printStackTrace();
			System.out.println("getConnection��������");
		}
		return conn;
	}

	// ִ������ɾ����SQL���--------------------
	public int executeUpdate(String sql) throws SQLException {
		if (getConn() == null) {
			System.out.println("�����ݿ�����ʧ��!");
			return -1;
		}
		stm = conn.createStatement();
		return stm.executeUpdate(sql);
	}

	// ����ִ������ɾ����SQL���--------------------
	public int executeUpdate(String sql, Object[] obj) throws SQLException {
		if (getConn() == null) {
			System.out.println("�����ݿ�����ʧ��!");
			return -1;
		}
		pstm = conn.prepareStatement(sql);
		if (obj != null) {
			for (int i = 0; i < obj.length; i++) {
				pstm.setObject(i + 1, obj[i]);
			}
		}
		return pstm.executeUpdate();
	}

	 public static PreparedStatement getPreparedStatement(String sql)
	            throws SQLException {
		 
	        return getConn().prepareStatement(sql);
	    }
	
	 
	 public static PreparedStatement setPreparedStatementParam(
	            PreparedStatement statement, Object obj[]) throws SQLException {
		 
	        for (int i = 0; i < obj.length; i++) {
	            statement.setObject(i + 1, obj[i]);
	        }
	        return statement;
	    }
	 
	 public static boolean openAutoCommit() throws SQLException {
			conn=getConn();
			if(conn.getAutoCommit()) {
				conn.setAutoCommit(false);
			}
			return true;
		}
	
	// ִ�в�ѯSQL���----------------------------
	public ResultSet executeQuery(String sql) throws SQLException {
		if (getConn() == null) {
			System.out.println("�����ݿ�����ʧ��!");
			return null;
		}
		stm = conn.createStatement();
		rs = stm.executeQuery(sql);
		return rs;
	}

	// ����ִ�в�ѯSQL���----------------------------
	public ResultSet executeQuery(String sql, Object[] obj) throws SQLException {
		if (getConn() == null) {
			System.out.println("�����ݿ�����ʧ��!");
			return null;
		}
		pstm = conn.prepareStatement(sql);
		if (obj != null) {
			for (int i = 0; i < obj.length; i++) {
				pstm.setObject(i + 1, obj[i]);
			}
		}
		rs = pstm.executeQuery();
		return rs;
	}

	// �ر�ResultSet
	public void closeResultSet() {
		if (rs != null) {
			try {
				rs.close();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}

	// �ر�Connection
	public void closeConnection() {
		if (conn != null) {
			try {
				conn.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
	}

	// �ر�Statement��PreparedStatement
	public void closeStatement() {
		if (stm != null) {
			try {
				stm.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}

		if (pstm != null) {
			try {
				pstm.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
	}
}
