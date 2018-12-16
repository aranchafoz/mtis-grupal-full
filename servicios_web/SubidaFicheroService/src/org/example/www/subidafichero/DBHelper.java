/**
 * 
 */
package org.example.www.subidafichero;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.Properties;

import org.apache.tomcat.jdbc.pool.PoolProperties;

/**
 * @author Jaime
 *
 */
public class DBHelper {
	
    // init database constants
    private static final String DATABASE_DRIVER = "com.mysql.jdbc.Driver";
    private static final String DATABASE_URL = "jdbc:mysql://localhost:3306/tesla_ficheros";
    private static final String USERNAME = "tesla";
    private static final String PASSWORD = "tesla";

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
    
    public boolean existeEmpleado(String idEmpleado) {
    	String sql = "SELECT * FROM `workers` WHERE `id` = '"+idEmpleado+"'";
    	boolean existe = false;
    	
    	try {
    		PreparedStatement statement = this.connect().prepareStatement(sql);
		    ResultSet rs = statement.executeQuery(sql);
		    // Access first row
		    if (rs.next()) {
		    	existe = true;
		    }
		    
    	} catch (SQLException e) {
    		e.printStackTrace();
    	} finally {
    		this.disconnect();
    	}
    	
    	return existe;
    }
    
    public boolean subirFichero(String idWorker, String content, String extension, Date uploaded) {
    	String sql = "INSERT INTO `files` (user_id, content, extension, uploaded_at, sent) VALUES (?, ?, ?, ?, ?)";
    	boolean loaded = false;
    	
    	try {
			// Insert
			PreparedStatement statement = this.connect().prepareStatement(sql);
			statement.setString (1, idWorker);
			statement.setString(2, content);
			statement.setString(3, extension);
			// Convert date
			DateFormat df = new SimpleDateFormat("yyyy/MM/dd");
			statement.setString(4, df.format(uploaded));
			statement.setBoolean(5, false);
		    statement.execute();
		    
		    loaded = true;
		    
    	} catch (SQLException e) {
			e.printStackTrace();
			loaded = false;
		} finally {
			this.disconnect();
		}
    	
    	return loaded;
    }
    
    public ArrayList<String> encolarFichero(String idFichero, String idDepartamento, String idOficina) {
    	ArrayList<String> encolado = new ArrayList<String>();
    	String sql = "SELECT id FROM `workers` WHERE office_id = '"+idOficina+"' AND department_id = '"+idDepartamento+"'";
    	
    	try {
    		PreparedStatement statement = this.connect().prepareStatement(sql);
		    ResultSet rs = statement.executeQuery(sql);
		    
		    // Access first row
		    if (rs.next()) {
		    	String idWorker = rs.getString("id");
		    	
		    	sql = "UPDATE `files` SET destiny_id = '"+idWorker+"' WHERE id = '"+idFichero+"'";
		    	
		    	try {
				    statement.execute();
				    encolado.add(idDepartamento);
			    	encolado.add(idOficina);
			    	
		    	} catch (SQLException e) {
		    		e.printStackTrace();
		    	} finally {
		    		this.disconnect();
		    	}
		    }
		    
    	} catch (SQLException e) {
    		e.printStackTrace();
    	} finally {
    		this.disconnect();
    	}
    	
    	return encolado;
    }
    
    public boolean enviarFichero(String idFichero) {
    	boolean sent = false;
    	String sql = "UPDATE `files` SET sent = true WHERE id = '"+idFichero+"'";
    	
    	try {
    		PreparedStatement statement = this.connect().prepareStatement(sql);
		    if (statement.executeUpdate() >= 1) {
		    	sent = true;
		    }
		    
    	} catch (SQLException e) {
    		sent = false;
    		e.printStackTrace();
    	} finally {
    		this.disconnect();
    	}
    	
    	return sent;
    }
    
    public String obtenerUltimoFichero() {
    	String sql = "SELECT id FROM files ORDER BY id DESC LIMIT 1";
    	String id = "";
    	
    	try {
    		PreparedStatement statement = this.connect().prepareStatement(sql);
    		ResultSet rs = statement.executeQuery(sql);
    		
		    // Access first row
		    if (rs.next()) {
		    	id = rs.getString("id");
		    }
    		
    	} catch (SQLException e) {
    		e.printStackTrace();
    		return "-1";
    	} finally {
    		this.disconnect();
    	}
    	
    	return id;
    }

}