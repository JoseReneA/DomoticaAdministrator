
package upt.edu.mx.dao;

import java.io.Serializable;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import upt.edu.mx.abstracts.AccionesAbst;
import upt.edu.mx.conexion.ConexionBd;
import upt.edu.mx.modelo.Contacto;
import upt.edu.mx.modelo.Usuario;

/**
 *
 * @author Jose Rene
 */
public class UsuarioDao<E> extends AccionesAbst {
    static ConexionBd conexionbd= new ConexionBd();
    static PreparedStatement preparedStatement;
    static private boolean estado;
    static private Connection co =null;
    static private ResultSet rs=null;
    @Override
	public boolean insert(Object usuario) {
	try{
            Usuario usu=(Usuario)usuario;
            estado=false; 
            co= conexionbd.conectar();
            preparedStatement = conexionbd.conectar().prepareStatement("INSERT INTO usuarios (CodigoUsuario, NombreUsuario) VALUES (?, ?);");
            preparedStatement.setString(1, usu.getCodigoUsuario());
            preparedStatement.setString(2, usu.getNombreUsuario());
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
		String sql="SELECT * FROM usuarios";	
		List<E> listaUsuario= new ArrayList<E>();
		try {			
			co= conexionbd.conectar();
			preparedStatement=co.prepareStatement(sql);
			rs=preparedStatement.executeQuery();
			while (rs.next()) {
				Usuario usuario=new Usuario();
				usuario.setIdUsuario(rs.getInt(1));
				usuario.setCodigoUsuario(rs.getString(2));
                                usuario.setNombreUsuario(rs.getString(3));
				listaUsuario.add((E) usuario);
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
	public boolean update(Object usuario) {
            try{
            Usuario usu=(Usuario)usuario;
            estado=false; 
            co= conexionbd.conectar();
            preparedStatement = conexionbd.conectar().prepareStatement("UPDATE usuarios SET CodigoUsuario = ?, NombreUsuario = ? WHERE idUsuarios = ?;");
            preparedStatement.setString(1, usu.getCodigoUsuario());
            preparedStatement.setString(2, usu.getNombreUsuario());
            preparedStatement.setInt(3, usu.getIdUsuario());
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
                    preparedStatement = conexionbd.conectar().prepareStatement("DELETE FROM usuarios WHERE idUsuarios=?;");
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
