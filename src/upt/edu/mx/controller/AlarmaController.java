
package upt.edu.mx.controller;

import java.util.ArrayList;
import java.util.List;
import upt.edu.mx.abstracts.AccionesAbst;
import upt.edu.mx.dao.AlarmaDao;
import upt.edu.mx.modelo.Alarma;


/**
 *
 * @author Jose Rene
 */
public class AlarmaController {
    public void registrar(Alarma object ) {
	    AccionesAbst dao= new  AlarmaDao();
            dao.insert(object);
	}
	
	public void actualizar(Alarma object) {
            AccionesAbst dao= new  AlarmaDao();
            dao.update(object);
	}
	
	public void eliminar(Alarma object) {
		AccionesAbst dao= new  AlarmaDao();
		dao.delete(object);
	}
	
	public List ver(){
		List<Alarma> object = new ArrayList<Alarma>();
		AccionesAbst dao= new  AlarmaDao();
		return object=dao.get();
//		verUsuarios.verUsuarios(object);
	}
}
