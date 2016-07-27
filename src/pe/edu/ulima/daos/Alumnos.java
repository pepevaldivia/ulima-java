package pe.edu.ulima.daos;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.mysql.jdbc.Connection;
import com.mysql.jdbc.PreparedStatement;

import pe.edu.ulima.beans.Alumno;
import pe.edu.ulima.utils.Conexion;

public class Alumnos{
	private Connection conexionMysql;
	private Alumno alumno;

	public Alumnos(Alumno alumno){
		Conexion c = new Conexion();
		this.conexionMysql = c.getConnectionMysql();
		this.alumno = alumno;
	}
	
	public int crear(){
        PreparedStatement psmt = null;
        String consulta = "INSERT INTO alumnos (dni, codigo, nombres, paterno, materno, telefono, celular, correo, id_carrera) VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?);";
        int idGenerado = 0;
        
        try {
			psmt = (PreparedStatement) conexionMysql.prepareStatement(consulta);
			psmt.setInt(1, alumno.getDni());
			psmt.setInt(2, alumno.getCodigo());
			psmt.setString(3, alumno.getNombres());
			psmt.setString(4, alumno.getPaterno());
			psmt.setString(5, alumno.getMaterno());
			psmt.setString(6, alumno.getTelefono());
			psmt.setString(7, alumno.getCelular());
			psmt.setString(8, alumno.getCorreo());
			psmt.setInt(9, alumno.getId_carrera());
			psmt.executeQuery();
			
			int filasAfectadas = psmt.executeUpdate();

	        if (filasAfectadas == 0) {
	            throw new SQLException("Ha ocurrido un error, no se creado un nuevo registro.");
	        }

	        try (ResultSet idGenerados = psmt.getGeneratedKeys()) {
	            if (idGenerados.next()) {
	                alumno.setId(idGenerados.getInt(1));
	                idGenerado = alumno.getId();
	            }
	            else {
	                throw new SQLException("Ha ocurrido un error, no se podido obtener el id del alumno creado.");
	            }
	        }
	        
			psmt.close();
			conexionMysql.close();
			
		} catch (SQLException e) {
			e.printStackTrace();
		}
        
        System.out.println("idGenerado");
        
        return idGenerado;
	}
}
