package org.example.www.sensoreswsdl;


import java.sql.ResultSet;
import java.sql.SQLException;

import com.mysql.jdbc.Connection;
import com.mysql.jdbc.Statement;
import com.mysql.jdbc.jdbc2.optional.MysqlDataSource;

public class DataBaseMethods {
	
	public static int consultarTemperatura(int hora) throws SQLException {

		String query = "SELECT * FROM temperatura where hora = '" + hora + "'";
		int result;

		MysqlDataSource dataSource = new MysqlDataSource();
		dataSource.setUser("admin");
		dataSource.setPassword("admin");
		dataSource.setServerName("localhost");
		dataSource.setDatabaseName("mtispracticagrupo");

		Connection conn = (Connection) dataSource.getConnection();
		Statement stmt = (Statement) conn.createStatement();
		ResultSet rs = stmt.executeQuery(query);

		rs.last();
		if (rs.getRow() > 0) {
			result = rs.getInt(3);

		} else {
			result = 0;
		}

		rs.close();
		stmt.close();
		conn.close();

		return result;
	}
	
	public static String consultarGranizo(int hora) throws SQLException {

		String query = "SELECT * FROM granizo where hora = '" + hora + "'";
		String result;

		MysqlDataSource dataSource = new MysqlDataSource();
		dataSource.setUser("admin");
		dataSource.setPassword("admin");
		dataSource.setServerName("localhost");
		dataSource.setDatabaseName("mtispracticagrupo");

		Connection conn = (Connection) dataSource.getConnection();
		Statement stmt = (Statement) conn.createStatement();
		ResultSet rs = stmt.executeQuery(query);

		rs.last();
		if (rs.getRow() > 0) {
			result = rs.getString(3);

		} else {
			result = "baja";
		}

		rs.close();
		stmt.close();
		conn.close();

		return result;
	}
	
	public static String consultarIntensidad(int hora) throws SQLException {

		String query = "SELECT * FROM intensidadsolar where hora = '" + hora + "'";
		String result;

		MysqlDataSource dataSource = new MysqlDataSource();
		dataSource.setUser("admin");
		dataSource.setPassword("admin");
		dataSource.setServerName("localhost");
		dataSource.setDatabaseName("mtispracticagrupo");

		Connection conn = (Connection) dataSource.getConnection();
		Statement stmt = (Statement) conn.createStatement();
		ResultSet rs = stmt.executeQuery(query);

		rs.last();
		if (rs.getRow() > 0) {
			result = rs.getString(3);

		} else {
			result = "baja";
		}

		rs.close();
		stmt.close();
		conn.close();

		return result;
	}
	
	public static int consultarPosicionSolar(int hora) throws SQLException {

		String query = "SELECT * FROM posicionsolar where hora = '" + hora + "'";
		int result;

		MysqlDataSource dataSource = new MysqlDataSource();
		dataSource.setUser("admin");
		dataSource.setPassword("admin");
		dataSource.setServerName("localhost");
		dataSource.setDatabaseName("mtispracticagrupo");

		Connection conn = (Connection) dataSource.getConnection();
		Statement stmt = (Statement) conn.createStatement();
		ResultSet rs = stmt.executeQuery(query);

		rs.last();
		if (rs.getRow() > 0) {
			result = rs.getInt(3);

		} else {
			result = 0;
		}

		rs.close();
		stmt.close();
		conn.close();

		return result;
	}
}
