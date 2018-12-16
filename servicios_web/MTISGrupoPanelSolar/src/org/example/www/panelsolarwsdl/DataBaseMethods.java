package org.example.www.panelsolarwsdl;


import java.sql.ResultSet;
import java.sql.SQLException;

import com.mysql.jdbc.Connection;
import com.mysql.jdbc.Statement;
import com.mysql.jdbc.jdbc2.optional.MysqlDataSource;

public class DataBaseMethods {
	
	public static Boolean activaDefensas(Boolean defensas) throws SQLException {

		String query = "update posicionpanel set defensa = " + defensas + " where id = 1";
		Boolean result = true;
		
		try{

			MysqlDataSource dataSource = new MysqlDataSource();
			dataSource.setUser("admin");
			dataSource.setPassword("admin");
			dataSource.setServerName("localhost");
			dataSource.setDatabaseName("mtispracticagrupo");
	
			Connection conn = (Connection) dataSource.getConnection();
			Statement stmt = (Statement) conn.createStatement();
			stmt.executeUpdate(query);
	
			
			stmt.close();
			conn.close();
			
		}catch(Exception exc){
			result = false;
		}
		
		return result;
	}
	
	
	public static Boolean moverElPanel(int grados) throws SQLException {

		String query = "update posicionpanel set grados = " + grados + " where id = 1";
		Boolean result = true;
		
		try{

			MysqlDataSource dataSource = new MysqlDataSource();
			dataSource.setUser("admin");
			dataSource.setPassword("admin");
			dataSource.setServerName("localhost");
			dataSource.setDatabaseName("mtispracticagrupo");
	
			Connection conn = (Connection) dataSource.getConnection();
			Statement stmt = (Statement) conn.createStatement();
			stmt.executeUpdate(query);
	
			
			stmt.close();
			conn.close();
			
		}catch(Exception exc){
			result = false;
		}
		
		return result;
	}
	
	public static Boolean rotarElPanel(int grados) throws SQLException {

		String query = "update posicionpanel set rotacion = " + grados + " where id = 1";
		Boolean result = true;
		
		try{

			MysqlDataSource dataSource = new MysqlDataSource();
			dataSource.setUser("admin");
			dataSource.setPassword("admin");
			dataSource.setServerName("localhost");
			dataSource.setDatabaseName("mtispracticagrupo");
	
			Connection conn = (Connection) dataSource.getConnection();
			Statement stmt = (Statement) conn.createStatement();
			stmt.executeUpdate(query);
	
			
			stmt.close();
			conn.close();
			
		}catch(Exception exc){
			result = false;
		}
		
		return result;
	}
}
