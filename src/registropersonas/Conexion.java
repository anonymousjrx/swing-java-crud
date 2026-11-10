
package registropersonas;

import java.sql.Connection;
import java.sql.SQLException;
import java.sql.DriverManager;

public class Conexion {
    private static final String URL = "jdbc:mysql://localhost:3306/registro_personas";
    private static final String USER = "root";
    private static final String PASSWORD = "tu_clave";
    
    public static Connection getConnection(){
        Connection cn = null;
        
        try{
            Class.forName("com.mysql.cj.jdbc.Driver");
            cn = DriverManager.getConnection(URL, USER, PASSWORD);
        }catch(ClassNotFoundException | SQLException e){
            System.out.println("Error de conexion: " + e.getMessage());
        }
        return cn;
    } 
}
