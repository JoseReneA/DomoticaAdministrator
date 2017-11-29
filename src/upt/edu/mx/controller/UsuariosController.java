
package upt.edu.mx.controller;

import java.util.ArrayList;
import java.util.List;
import upt.edu.upt.daoExtends.UsuariosDaoExtends;
import upt.edu.mx.abstracts.AccionesAbst;
import upt.edu.mx.dao.UsuarioDao;
import upt.edu.mx.modelo.Usuario;

/**
 *
 * @author Jose Rene
 */
public class UsuariosController <E> {
    public UsuariosController() {
    }
	
	public boolean registrar(E _object ) {
	    AccionesAbst dao= new  UsuarioDao();
            return dao.insert(_object);
	}
	
	public boolean actualizar(E _object) {
            AccionesAbst dao= new  UsuarioDao();
            return dao.update(_object);
	}
	
	public boolean eliminar(E _object) {
		AccionesAbst dao= new  UsuarioDao();
		return dao.delete(_object);
	}
	
	public List ver(){
		List<E> object = new ArrayList<E>();
		AccionesAbst dao= new  UsuarioDao();
		return object=dao.get();
	}
        public boolean validaUsuario(Usuario _object)
        {
            UsuariosDaoExtends ude= new UsuariosDaoExtends();
            return ude.validaUsuario(_object);
        }
}
