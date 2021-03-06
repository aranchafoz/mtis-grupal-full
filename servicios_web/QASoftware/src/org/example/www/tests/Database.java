package org.example.www.tests;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.Properties;

/**
 * @author Ã�lvaro MuÃ±oz Delgado
 *
 */
public class Database {

	// init database constants
	private static final String DATABASE_DRIVER = "com.mysql.jdbc.Driver";
	private static final String DATABASE_URL = "jdbc:mysql://localhost:3306/proceso_qa";
	private static final String USERNAME = "root";
	private static final String PASSWORD = "";

	// init connection object
	private Connection connection;
	// init properties object
	private Properties properties;

	// create properties
	private Properties getProperties() {
		if (properties == null) {
			properties = new Properties();
			properties.setProperty("user", USERNAME);
			properties.setProperty("password", PASSWORD);
		}
		return properties;
	}

	// connect database
	public Connection connect() {
		if (connection == null) {
			try {
				Class.forName(DATABASE_DRIVER);
				connection = DriverManager.getConnection(DATABASE_URL, getProperties());
			} catch (ClassNotFoundException | SQLException e) {
				e.printStackTrace();
			}
		}
		return connection;
	}

	// disconnect database
	public void disconnect() {
		if (connection != null) {
			try {
				connection.close();
				connection = null;
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
	}
	
	public boolean guardaTest(EjecutarTestsResponse test) {
		String sql = "INSERT INTO `resultadotests`(`porcentajeCompletado`, `completado`, `error`, `descripcionError`) "
				+ "VALUES ('" + test.getPorcentajeCompletado() + "',"
						+ "" + test.getCompletado() + ","
						+ "" + test.getError() + ","
						+ "'" + test.getDescripcionError() + "')";

		try {
			PreparedStatement statement = this.connect().prepareStatement(sql);
			statement.execute();
			
		} catch (SQLException e) {
			e.printStackTrace();
			return false;
		} finally {
			this.disconnect();
		}
		return true;
	}

}
