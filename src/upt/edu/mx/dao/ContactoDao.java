/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package upt.edu.mx.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import upt.edu.mx.abstracts.AccionesAbst;
import upt.edu.mx.conexion.ConexionBdAzure;
import upt.edu.mx.modelo.Contacto;

/**
 *
 * @author Jose Rene
 */
public class ContactoDao<E> extends AccionesAbst{
    static  ConexionBdAzure conexionbd= new ConexionBdAzure();
    static PreparedStatement preparedStatement;
    private static boolean estado;
    private static Connection co =null;
    private static ResultSet rs=null;
    @Override
	public boolean insert(Object contacto) {
	try{
            Contacto con=(Contacto)contacto;
            estado=false; 
            co= conexionbd.conectar();
            preparedStatement = conexionbd.conectar().prepareStatement("INSERT INTO contacto (NumeroTelefono, Fk_idUsuario) VALUES (?, ?);");
            preparedStatement.setString(1, con.getNumeroTelefonico());
            preparedStatement.setInt(2, con.getFk_idUsuario().getIdUsuario());
            preparedStatement.executeUpdate();
            estado=true;
            preparedStatement.close();
            co.close();
            } catch (SQLException _sqlE) {
                    System.out.println("Error SQL"+_sqlE.getMessage());
                    _sqlE.printStackTrace();
            } catch (ClassNotFoundException _cnfE) {
              System.out.println("Clase no encontrada"+_cnfE);
            }
             return estado;
	}
 
	@Override
	public List<E> get() {
		String sql="SELECT * FROM contacto";	
		List<E> listaUsuario= new ArrayList<E>();
		try {			
			co= conexionbd.conectar();
			preparedStatement=co.prepareStatement(sql);
			rs=preparedStatement.executeQuery();
			while (rs.next()) {
				Contacto c=new Contacto();
				c.setIdContacto(rs.getInt(1));
				c.setNumeroTelefonico(rs.getString(2));
				listaUsuario.add((E) c);
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
		
		return  (List<E>) listaUsuario;
	}
	@Override
	public boolean update(Object contacto) {
            try{
            Contacto cont=(Contacto)contacto;
            estado=false; 
            co= conexionbd.conectar();
            preparedStatement = conexionbd.conectar().prepareStatement("UPDATE contacto SET NumeroTelefono = ? and Fk_idUsuario = ? WHERE idContacto = ?;");
            preparedStatement.setInt(1, cont.getIdContacto());
            preparedStatement.setString(2, cont.getNumeroTelefonico());
            preparedStatement.setInt(3, cont.getFk_idUsuario().getIdUsuario());
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
	public boolean delete(Object contacto) {
		try {
                    Contacto cont=(Contacto)contacto;
	            estado=false; 
                    co= conexionbd.conectar();
                    preparedStatement = conexionbd.conectar().prepareStatement("DELETE FROM contacto WHERE idContacto=?;");
                    preparedStatement.setInt(1, cont.getIdContacto());
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
