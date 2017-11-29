
package upt.edu.mx.dao;

import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.sql.Timestamp;
import java.text.Format;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import org.exolab.castor.types.DateTime;
import upt.edu.mx.abstracts.AccionesAbst;
import upt.edu.mx.conexion.ConexionBd;
import upt.edu.mx.modelo.Alarma;
import upt.edu.mx.modelo.Usuario;

/**
 *
 * @author Jose Rene
 */
public class AlarmaDao extends AccionesAbst  {
    static ConexionBd conexionbd= new ConexionBd();
    static PreparedStatement preparedStatement;
    private static boolean estado;
    private static Connection co =null;
    private static ResultSet rs=null;
    @Override
	public  boolean insert(Object alarma) {
	try{
            Alarma ala=(Alarma)alarma;
            estado=false; 
            co= conexionbd.conectar();
            preparedStatement = conexionbd.conectar().prepareStatement("INSERT INTO alarma (estatusAlarma, accion, fecha, fk_usuario) VALUES (?, ?, ?, ?);");
            preparedStatement.setString(1, ala.getEstatusAlarma());
            preparedStatement.setString(2, ala.getAccion());
            preparedStatement.setDate(3, Date.valueOf(ala.getFecha().toString()));
            preparedStatement.setInt(4, ala.getFk_usuario().getIdUsuario());
            preparedStatement.executeUpdate();
            estado=true;
            preparedStatement.close();
            co.close();
            } catch (SQLException _sqlE) {
                    System.out.println("Error SQL"+_sqlE.getMessage());
                    _sqlE.printStackTrace();
            } catch (ClassNotFoundException _cnfE) {
              System.out.println("Clase no encontrada"+_cnfE.getMessage());
            }
             return estado;
	}
 
	@Override
	public List<Alarma> get() {
		String sql="SELECT * FROM alarma";	
		List<Alarma> lista= new ArrayList<Alarma>();
		try {			
			co= conexionbd.conectar();
			preparedStatement=co.prepareStatement(sql);
			rs=preparedStatement.executeQuery();
			while (rs.next()) {
				Alarma c=new Alarma();
				c.setEstatusAlarma(rs.getString(1));
				c.setAccion(rs.getString(2));
                                c.setFecha(Timestamp.valueOf(rs.getObject("Fecha").toString()));
				lista.add(c);
			}
			preparedStatement.close();
			rs.close();
			co.close();
		} catch (SQLException _sqlE) {
			System.out.println("Error "+_sqlE.getMessage());
			_sqlE.printStackTrace();
		} catch (ClassNotFoundException _cnfE) {
                  System.out.print("Clase no encontrada:"+_cnfE.getMessage());
        }
		
		return  lista;
	}
	@Override
	public boolean update(Object alarma) {
            try{
            Alarma ala=(Alarma)alarma;
            estado=false; 
            co= conexionbd.conectar();
            preparedStatement = conexionbd.conectar().prepareStatement("UPDATE Alarma SET estatusAlarma = ?, accion = ?, fecha = ?, fk_usuario = ?  WHERE idAlarma = ?;");
            preparedStatement.setString(1, ala.getEstatusAlarma());
            preparedStatement.setString(2, ala.getAccion());
            preparedStatement.setDate(3, Date.valueOf(ala.getFecha().toString()));
            preparedStatement.setInt(4, ala.getFk_usuario().getIdUsuario());
            preparedStatement.executeUpdate();
            estado=true;
            preparedStatement.close();
            co.close();
            } catch (SQLException _sqlE) {
                    System.out.println("Error SQL al momento de actualizar"+_sqlE.getMessage());
                    _sqlE.printStackTrace();
            } catch (ClassNotFoundException _cnfE) {		
                    System.out.print("Clase no encontrada:"+_cnfE.getMessage());
        }
            return estado;
	}

	@Override
	public boolean delete(Object alarma) {
		try {
                    Alarma ala=(Alarma)alarma;
	            estado=false; 
                    co= conexionbd.conectar();
                    preparedStatement = conexionbd.conectar().prepareStatement("DELETE FROM Alarma WHERE idAlarma=?;");
                    preparedStatement.setInt(1, ala.getIdAlarma());
                    preparedStatement.executeUpdate();
                    estado=true;
                    preparedStatement.close();
                    co.close();
		} catch (SQLException _sqlE) {
			System.out.println("Error no se pudo eliminar el usuario"+_sqlE.getMessage());
			_sqlE.printStackTrace();
		} catch (ClassNotFoundException _cnfE) {		
                    System.out.println("No se encontro la clase solicitada"+_cnfE.getMessage());
            }
		return estado;
	}
}
