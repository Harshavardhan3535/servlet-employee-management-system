package com.ty.employee_management_system.connection;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class GetConnection {
	public static Connection getConnectionObject() {
		String url="jdbc:postgresql://localhost:5432/employee-management-system";
		String user="postgres";
		String pwd="test";
		try {
			Class.forName("org.postgresql.Driver");
			Connection con = DriverManager.getConnection(url,user,pwd);
			System.out.println(con);
			return con;
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return null;	
	}

}
