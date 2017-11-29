/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package upt.edu.mx.abstracts;

import java.util.List;
import upt.edu.mx.modelo.Usuario;

/**
 *
 * @author Jose Rene
 */
public abstract class AccionesAbst <E>{
    public abstract boolean insert(E usuario);
    public abstract List<E> get();
    public abstract boolean update(E usuario);
    public abstract boolean delete(E usuario);

}
