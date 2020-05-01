package app;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.sql.*;
import oracle.jdbc.*;
import oracle.jdbc.pool.OracleDataSource;

/********
 * Para conectarse con bases de datos individuales, JDBC (la API de conectividad
 * de bases de datos Java ) requiere controladores para cada base de datos. El
 * controlador JDBC proporciona la conexión a la base de datos
 */
/*******
 * Driver class: The driver class for the oracle database is
 * oracle.jdbc.driver.OracleDriver. Connection URL: The connection URL for the
 * oracle10G database is jdbc:oracle:thin:@localhost:1521:xe where jdbc is the
 * API, oracle is the database, thin is the driver, localhost is the server name
 * on which oracle is running, we may also use IP address, 1521 is the port
 * number and XE is the Oracle service name. You may get all these information
 * from the tnsnames.ora file. Username: The default username for the oracle
 * database is system. Password: It is the password given by the user at the
 * time of installing the oracle database.
 */
public class jdbcConnection {

	public static void main(String[] args) throws SQLException {
		OracleDataSource ods = new OracleDataSource();
		ods.setURL("jdbc:oracle:thin:@//localhost:1521/XEPDB1"); // jdbc:oracle:thin@//[hostname]:[port]/[DB service name]
		ods.setUser("hr"); // [username]
		ods.setPassword("hr"); // [password]
		Connection conn = ods.getConnection();
		 
		PreparedStatement stmt = conn.prepareStatement("SELECT 'Hello World!' FROM dual");
		ResultSet rslt = stmt.executeQuery();
		while (rslt.next()) {
		  System.out.println(rslt.getString(1));
		}
	}
	public void proc1() {
		/*Cliente prueba = new Cliente(0,"laura","leon","sdasda","asdasds");
		Connection con = DriverManager.getConnection(URL,USER, PASSWORD);
		CallableStatement stmt = con.prepareCall("BEGIN crearClientex(?,?,?,?); END;");
	      stmt.setString(1, prueba.getNombre()); 
	      stmt.setString(2, prueba.getApellido()); 
	      stmt.setString(3, prueba.getEmail()); 
	      stmt.setString(4, prueba.getFecha()); 
	      stmt.execute();
	      
	      stmt.close();
	      stmt = null;
	      con.close();
	      con = null;
	      
	      System.out.println("Cliente creado");
	    }
	    catch (SQLException | ClassNotFoundException e) {
	      System.out.println(e.getLocalizedMessage());
	    }*/
/*
		*/
	}

}
