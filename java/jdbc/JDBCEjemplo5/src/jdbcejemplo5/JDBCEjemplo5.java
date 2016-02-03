/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jdbcejemplo5;

import java.sql.Connection;
import java.sql.Driver;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Properties;

/**
 *
 * @author hernando
 */
public class JDBCEjemplo5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws SQLException {
         Connection conexion = null;
        Properties propiedades = new Properties();
        propiedades.setProperty("user", "aprendiz");
        propiedades.setProperty("password", "12345");
        
        
        try {
            conexion
                    = DriverManager.getConnection("jdbc:mysql://localhost/prueba1",propiedades);
                  Driver driver = DriverManager.getDriver("jdbc:mysql://localhost/pijamax?"
                            + "user=nicolas&password=12345");
                  
            System.out.println("se conecto");
            
        } catch (SQLException e) {
            System.err.println(e.toString());
        }finally{
            if (conexion!=null) {
                conexion.close();
                System.out.println("se cerro la conexion correctamente");
            }
        
        }
    }
    
}
