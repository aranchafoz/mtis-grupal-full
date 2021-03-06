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
		String sql = "INSERT into `resultadotests` "
				+ "VALUES ('" + test.getTipoTest() + "',"
						+ "'" + test.getPorcentajeCompletado() + "',"
						+ "'" + test.getCompletado() + "',"
						+ "'" + test.getError() + "',"
						+ "'" + test.getError() + "'";

		try {
			PreparedStatement statement = this.connect().prepareStatement(sql);
			ResultSet rs = statement.executeQuery(sql);
			
		} catch (SQLException e) {
			e.printStackTrace();
			return false;
		} finally {
			this.disconnect();
		}
		return true;
	}


	public int compruebaStock(String referenciaProducto) {
		int unidades = 0;
		String sql = "SELECT `numeroUnidades` FROM `almacenlocal` WHERE `referenciaProducto` = '" + referenciaProducto + "'";

		try {
			PreparedStatement statement = this.connect().prepareStatement(sql);
			ResultSet rs = statement.executeQuery(sql);

			// Get values
			if (rs.next()) {
				unidades = rs.getInt("numeroUnidades");
			} else {
				unidades = -1;
			}
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			this.disconnect();
		}

		return unidades;
	}
	
	public boolean actualizarStock(int unidades, String referenciaProducto) {
		String sql1 = "SELECT `numeroUnidades` from `almacenlocal` WHERE `referenciaProducto` = '" + referenciaProducto + "'";
		
		boolean exito = false;
		int num = 0;
		int unidadesActualizado = 0;
		
		try {
			PreparedStatement statement = this.connect().prepareStatement(sql1);
			ResultSet rs = statement.executeQuery(sql1);
			
			if(rs.next()){
				num = rs.getInt("numeroUnidades");
			}
			
			if(unidades<=num){
				unidadesActualizado = num-unidades;
				
				String sql2 = "UPDATE `almacenlocal` SET `numeroUnidades` = '" + unidadesActualizado + "' WHERE `referenciaProducto` = '" + referenciaProducto + "'";
				
				PreparedStatement statement2 = this.connect().prepareStatement(sql2);
				int rs2 = statement2.executeUpdate(sql2);
				
				if (rs2==1) {
					exito = true;
				}
			}
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			this.disconnect();
		}

		return exito;
	}

}
