package com.dkte.pizzashop.utils;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DBUtils {
	private static final String URL =
			"jdbc:mysql://localhost:3306/pizzastore_db?useSSL=false&allowPublicKeyRetrieval=true&serverTimezone=UTC";
	private static final String USERNAME = "root";
	private static final String PASSWORD = "Sumit@9822";

	public static Connection getConnection() throws SQLException {
		return DriverManager.getConnection(URL, USERNAME, PASSWORD);
	}
}
