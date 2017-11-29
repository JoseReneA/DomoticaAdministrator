/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package upt.edu.mx.controller;

import java.util.ArrayList;
import java.util.List;
import upt.edu.mx.abstracts.AccionesAbst;
import upt.edu.mx.dao.DireccionDao;
import upt.edu.mx.dao.UsuarioDao;

/**
 *
 * @author Jose Rene
 */
public class DireccionController <E> {

    public DireccionController() {
    }
    
    public void registrar(E object ) {
	    AccionesAbst dao= new  DireccionDao();
            dao.insert(object);
	}
	
	public void actualizar(E object) {
            AccionesAbst dao= new  DireccionDao();
            dao.update(object);
	}
	
	public void eliminar(E object) {
		AccionesAbst dao= new  DireccionDao();
		dao.delete(object);
	}
	
	public List ver(){
		List<E> object = new ArrayList<E>();
		AccionesAbst dao= new  DireccionDao();
		return object=dao.get();
//		verUsuarios.verUsuarios(usuarios);
	}
}
