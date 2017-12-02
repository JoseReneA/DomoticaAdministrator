
package upt.edu.upt.daoExtends;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import upt.edu.mx.conexion.ConexionBdAzure;
import upt.edu.mx.modelo.Contacto;
import upt.edu.mx.modelo.Usuario;

/**
 *
 * @author Jose Rene
 */
public class UsuariosDaoExtends  {
    static ConexionBdAzure conexionbd= new ConexionBdAzure();
    static PreparedStatement preparedStatement;
    private static boolean estado;
    private static Connection co =null;
    private static ResultSet rs=null;
    private int idUsuario;
    public static boolean validaUsuario(Usuario _usu) {	
        try {	
            co= conexionbd.conectar();
            preparedStatement = co.prepareStatement("SELECT * FROM usuarios where CodigoUsuario = ? and NombreUsuario = ?;");
            preparedStatement.setString(1, _usu.getCodigoUsuario());
            preparedStatement.setString(2, _usu.getNombreUsuario());
            rs=preparedStatement.executeQuery();
                if (rs.next()) {
                    estado=true;
                }else{
                    estado=false;
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

        return  estado;
    }
    public List<Contacto> obtenerUsuario(int idUsuario) {
        String sql="SELECT * FROM usuarios u inner join contacto c on c.fk_idUsuario=u.idUsuarios where idUsuarios=?";	
        List<Contacto> listaUsuario= new ArrayList<Contacto>();
        try {			
                co= conexionbd.conectar();
                preparedStatement=co.prepareStatement(sql);
                preparedStatement.setInt(1, (idUsuario));
                rs=preparedStatement.executeQuery();
                while (rs.next()) {
                        Contacto contacto= new Contacto();
                        Usuario c=new Usuario();
                        c.setIdUsuario(rs.getInt(1));
                        c.setCodigoUsuario(rs.getString(2));
                        c.setNombreUsuario(rs.getString(3));
                        contacto.setNumeroTelefonico(rs.getString("NumeroTelefono"));
                        contacto.setFk_idUsuario(c);
                        listaUsuario.add(contacto);
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
        return   listaUsuario;
    }
    public List<Contacto> buscarUsuario(String _usu) {
        String sql="SELECT * FROM usuarios u inner join contacto c on u.idUsuarios=c.fk_idUsuario where CodigoUsuario like ? or NombreUsuario like ? ";	
        List<Contacto> listaUsuario= new ArrayList<Contacto>();
        try {			
                co= conexionbd.conectar();
                preparedStatement=co.prepareStatement(sql);
                preparedStatement.setString(1, (_usu+"%"));
                preparedStatement.setString(2, (_usu+"%"));
                rs=preparedStatement.executeQuery();
                while (rs.next()) {
                        Contacto contacto= new Contacto();
                        Usuario c=new Usuario();
                        c.setIdUsuario(rs.getInt(1));
                        c.setCodigoUsuario(rs.getString(2));
                        c.setNombreUsuario(rs.getString(3));
                        contacto.setNumeroTelefonico(rs.getString("NumeroTelefono"));
                        contacto.setFk_idUsuario(c);
                        listaUsuario.add(contacto);
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

        return  listaUsuario;
    }
     public List<Contacto> listarUsuariosInnerJoinContacto() {
        String sql="SELECT * FROM usuarios u inner join contacto c on u.idUsuarios=c.fk_idUsuario";	
        List<Contacto> listaUsuario= new ArrayList<Contacto>();
        try {			
                co= conexionbd.conectar();
                preparedStatement=co.prepareStatement(sql);
                rs=preparedStatement.executeQuery();
                while (rs.next()) {
                        Contacto contacto= new Contacto();
                        Usuario c=new Usuario();
                        c.setIdUsuario(rs.getInt(1));
                        c.setCodigoUsuario(rs.getString(2));
                        c.setNombreUsuario(rs.getString(3));
                        contacto.setNumeroTelefonico(rs.getString("NumeroTelefono"));
                        contacto.setFk_idUsuario(c);
                        listaUsuario.add( contacto);
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
        return   listaUsuario;
    }
     public int obtenerIdUsuario() {
        String sql="SELECT MAX(u.idUsuarios) FROM usuarios u ";	
        try {			
                co= conexionbd.conectar();
                preparedStatement=co.prepareStatement(sql);
                rs=preparedStatement.executeQuery();
                while (rs.next()) {
                    idUsuario=(rs.getInt(1));
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
        return  idUsuario;
    }

}
