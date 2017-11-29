/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package upt.edu.mx.controller;

import java.util.ArrayList;
import java.util.List;
import upt.edu.mx.abstracts.AccionesAbst;
import upt.edu.mx.dao.ContactoDao;
import upt.edu.mx.dao.DireccionDao;

/**
 *
 * @author Jose Rene
 */
public class ContactoController<E> {
     public ContactoController() {
    }
    
    public boolean registrar(E object ) {
	    AccionesAbst dao= new  ContactoDao();
            return dao.insert(object);
	}
	
	public boolean actualizar(E object) {
            AccionesAbst dao= new  ContactoDao();
            return dao.update(object);
	}
	
	public boolean eliminar(E object) {
		AccionesAbst dao= new  ContactoDao();
		return dao.delete(object);
	}
	
	public List ver(){
		List<E> object = new ArrayList<E>();
		AccionesAbst dao= new  ContactoDao();
		return object=dao.get();
//		verUsuarios.verUsuarios(usuarios);
	}
}
