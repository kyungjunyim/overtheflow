package com.overtheflow.controller;

import java.sql.Connection;
import java.sql.DriverManager;

import org.junit.Test;

public class MySQLConnectionTest {
	private static final String DRIVER = "com.mysql.cj.jdbc.Driver";
	private static final String URL = "jdbc:mysql://localhost:3306/overtheflow?useSSL=false&serverTimezone=UTC";
	private static final String USER = "jun";
	private static final String PWD = "0493";
	
	@Test
	public void testConnection() throws Exception {
		Class.forName(DRIVER);
		try {
			Connection conn = DriverManager.getConnection(URL, USER, PWD);
			System.out.println(conn);
		} catch(Exception e) {
			e.printStackTrace();
		}
	}
}
