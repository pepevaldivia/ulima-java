package pe.edu.ulima.utils;

import java.sql.DriverManager;
import java.sql.SQLException;

import com.mongodb.MongoClient;
import com.mongodb.client.MongoDatabase;
import com.mysql.jdbc.Connection;

public class Conexion {
    private static String url = "jdbc:mysql://localhost:3306/db_tesis_ulima";
    private static String user = "root";
    private static String password = "";
	private MongoClient mongoClient;
	
	public Conexion(){
		
	}
 
    public Connection getConnectionMysql() {
        Connection con = null;
           try {
               Class.forName("com.mysql.jdbc.Driver");
               con = (Connection) DriverManager.getConnection(url, user, password);
           } catch (ClassNotFoundException ex) {
               System.out.println("Verifica tu driver en el classpath");
           } catch (SQLException ex) {
               System.out.println("Verifica tus parametros de conexion");
           }
       
           return con;
    }
    
    public MongoDatabase getConnectionMongoDB(){
    	mongoClient = new MongoClient();
    	MongoDatabase db = mongoClient.getDatabase("db_peru");
    	
    	return db;
    } 
}
