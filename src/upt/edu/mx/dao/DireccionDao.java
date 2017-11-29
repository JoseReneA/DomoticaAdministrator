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
import upt.edu.mx.conexion.ConexionBd;
import upt.edu.mx.modelo.Direccion;
import upt.edu.mx.modelo.Usuario;

/**
 *
 * @author Jose Rene
 */
public class DireccionDao<E> extends AccionesAbst{
    static ConexionBd conexionbd= new ConexionBd();
    static PreparedStatement preparedStatement;
    private static boolean estado;
    private static Connection co =null;
    private static Statement stm= null;
    private static ResultSet rs=null;
    @Override
	public boolean insert(Object direccion) {
	try{
            Direccion dir=(Direccion)direccion;
            estado=false; 
            co= conexionbd.conectar();
            preparedStatement = conexionbd.conectar().prepareStatement("INSERT INTO Direccion (Colonia, NoExterior,NoInterior,Calle,Fk_usuario) VALUES (?, ?, ?, ?, ?, ?);");
            preparedStatement.setString(1, dir.getColonia());
            preparedStatement.setInt(2, dir.getNoExterior());
            preparedStatement.setInt(3, dir.getNoInterior());
            preparedStatement.setString(4, dir.getCalle());
            preparedStatement.setInt(5, dir.getFk_usuario());
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
	public List<E> get() {
            String sql="SELECT * FROM Direccion";	
            List<E> lista= new ArrayList<E>();
            try {			
                    co= conexionbd.conectar();
                    preparedStatement=co.prepareStatement(sql);
                    rs=preparedStatement.executeQuery();
                    while (rs.next()) {
                            Direccion c=new Direccion();
                            c.setColonia(rs.getString(1));
                            c.setNoExterior(rs.getInt(2));
                            c.setNoInterior(rs.getInt(3));
                            c.setColonia(rs.getString(4));
                            c.setCalle(rs.getString(5));
                            lista.add((E) c);
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

            return  (List<E>) lista;
	}
	@Override
	public boolean update(Object direccion) {
            try{
            Direccion dir=(Direccion)direccion;
            estado=false; 
            co= conexionbd.conectar();
            preparedStatement = conexionbd.conectar().prepareStatement("UPDATE Direccion SET Colonia=?, NoExterior=?, NoInterior=?, Calle=?, Fk_usuario=? WHERE idDireccion = ?;");
            preparedStatement.setString(1, dir.getColonia());
            preparedStatement.setInt(2, dir.getNoExterior());
            preparedStatement.setInt(3, dir.getNoInterior());
            preparedStatement.setString(4, dir.getCalle());
            preparedStatement.setInt(5, dir.getFk_usuario());
            preparedStatement.setInt(6, dir.getIdDomicilio());
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
	public boolean delete(Object usuario) {
		try {
                    Usuario usu=(Usuario)usuario;
	            estado=false; 
                    co= conexionbd.conectar();
                    preparedStatement = conexionbd.conectar().prepareStatement("DELETE FROM Direccion WHERE idDireccion = ?;");
                    preparedStatement.setInt(1, usu.getIdUsuario());
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
