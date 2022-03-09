 package com.crm.RMGYantra.GenericUtil;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import org.testng.annotations.Test;

import com.mysql.cj.jdbc.Driver;

public class DataBaseUtility {
	public Connection con;
	
	public ResultSet result;
	
	@Test
	public void CreateConnection() throws SQLException {
		try {
			Driver dref=new Driver();
			DriverManager.registerDriver(dref);
			con=DriverManager.getConnection("jdbc:mysql://localhost:3306/projects","root", "root");
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	@Test
	public void Closeconnection() {
		
		try {
			con.close();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	@Test
	public ResultSet ExecuteQuery(String Query) throws SQLException {

		result = con.createStatement().executeQuery(Query);
		return result;
		
	}

}

