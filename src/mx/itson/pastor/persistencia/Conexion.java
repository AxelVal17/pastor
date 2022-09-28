
package mx.itson.pastor.persistencia;

import java.sql.Connection;
import java.sql.DriverManager;


/**
 *
 * @author axelg
 */
public class Conexion {
    public static Connection obtener(){
        Connection conexion = null;
        try{
        
            conexion = DriverManager.getConnection("jdbc:mysql://localhost:3307/pastordb?user=root&password=");
            
        }catch(Exception e){
        
            System.out.println(e.getMessage());
            
        }
        return conexion;
    }
    
}
