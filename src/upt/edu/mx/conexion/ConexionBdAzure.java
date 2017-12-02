
package upt.edu.mx.conexion;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Properties;

/**
 *
 * @author Jose Rene
 */
public class ConexionBdAzure {
    /**Establesco los parametros 
     * 
     */
    private static String HOST = "bdmysqldomotica.mysql.database.azure.com";
    private static String DATABASE = "domotica";
    private static String USER = "adminR@bdmysqldomotica";
    private static String PASSWORD = "Joserene20";   
    public Connection conectar() throws ClassNotFoundException 
    {
        Connection con = null;
        String url = String.format("jdbc:mysql://%s/%s", HOST, DATABASE);
        try{
            Class.forName("com.mysql.jdbc.Driver");
        }
        catch (ClassNotFoundException e){
            throw new ClassNotFoundException("Driver de MYSQL no encontrado", e);
        }
            //Establesco las conexiones y propiedades con AZURE
            Properties properties = new Properties();
            properties.setProperty("user", USER);
            properties.setProperty("password", PASSWORD);
            properties.setProperty("useSSL", "true");
            properties.setProperty("verifyServerCertificate", "true");
            properties.setProperty("requireSSL", "false");
        try {
            con = DriverManager.getConnection(url, properties);//Obtenemos las prpiedades de coneccion a partir de la URL y de las propiedades o variables
            if (con != null) {
            }
        } catch (SQLException e) {
                System.out.println("No se pudo conectar a la base de datos");
                e.printStackTrace();
        }
        return con;
    }
}
