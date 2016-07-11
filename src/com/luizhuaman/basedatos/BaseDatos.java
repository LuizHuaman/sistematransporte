package com.luizhuaman.basedatos;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class BaseDatos {
 
	private final String URL = "jdbc:mysql//localhost:8080/";
	private final String DB  = "platzijava";
	private final String USUARIO = "platzijava";
	private final String PASSWORD = "platzijava";
	
	public Connection conexion = null;
	
	
	public Connection conectar() throws SQLException{
		try {
			Class.forName("com.mysql.jdbc.driver");
			conexion = DriverManager.getConnection(URL+DB, USUARIO, PASSWORD);
			if (conexion != null) {
				System.out.println("La conexi�n se ejecut� exitosamente");
			}
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}finally {
			return conexion;
		}
	}
	public void desconectar() throws SQLException{
		conexion.close();
	}
}
