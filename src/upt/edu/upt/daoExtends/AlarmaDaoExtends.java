/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package upt.edu.upt.daoExtends;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.sql.Timestamp;
import java.text.Format;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import javax.swing.table.DefaultTableModel;
import org.exolab.castor.types.DateTime;
import upt.edu.mx.conexion.ConexionBdAzure;
import upt.edu.mx.modelo.Alarma;
import upt.edu.mx.modelo.Usuario;

/**
 *
 * @author Jose Rene
 */
public class AlarmaDaoExtends<E> {
    ConexionBdAzure conexionbd= new ConexionBdAzure();
    PreparedStatement preparedStatement;
    private boolean estado;
    private Connection co =null;
    private ResultSet rs=null;
    DefaultTableModel dtm;

    public List<Alarma> listarUsuariosAlarma() throws ParseException {
        String sql="SELECT a.estatusAlarma,a.accion,a.fecha,u.NombreUsuario,u.CodigoUsuario,u.idUsuarios FROM alarma a inner join usuarios u on a.fk_usuario=u.idUsuarios";	
        List<Alarma> lista= new ArrayList<>();
           try {			
                co= conexionbd.conectar();
                preparedStatement=co.prepareStatement(sql);
                rs=preparedStatement.executeQuery();
                while (rs.next()) {
                Alarma c=new Alarma();
                Usuario u= new Usuario();
                c.setEstatusAlarma(rs.getString("estatusAlarma"));
                c.setAccion(rs.getString("accion"));
                c.setFecha(Timestamp.valueOf(rs.getObject("fecha").toString()));
                u.setNombreUsuario(rs.getString("NombreUsuario"));
                u.setCodigoUsuario(rs.getString("CodigoUsuario"));
                u.setIdUsuario(rs.getInt("idUsuarios"));
                c.setFk_usuario(u);
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
    public int obtenerNumeroAccesos(Date _fecha) throws Exception
    {
        try {
             String sql="SELECT COUNT(*) FROM alarma a where a.fechaNormal=?";	
             co= conexionbd.conectar();
             preparedStatement=co.prepareStatement(sql);
             preparedStatement.setDate(1, (java.sql.Date) _fecha);
             rs=preparedStatement.executeQuery();
             while (rs.next()) {
                 int numeroAccesos=rs.getInt(1);
                 return numeroAccesos;
             }
             preparedStatement.close();
             rs.close();
             co.close();
        } catch (Exception _ex) {
            throw _ex;
        }
        return 0;
    }
    
}
