/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package upt.edu.mx.modelo;

import java.io.Serializable;

/**
 *
 * @author Jose Rene
 */
/** 
   Esta clase almacenará todos los usuarios
 */
public class Usuario implements Serializable{ 
    private int idUsuario;       //Numero que identifica al usuario en la base de datos
    private String codigoUsuario;//Numero que identifica al usuario en el sistema
    private String nombreUsuario;//Nombre completo del usuario
    public Usuario() {
    }

    @Override
    public String toString() {
        return "Usuario{" + "idUsuario=" + idUsuario + ", codigoUsuario=" + codigoUsuario + ", nombreUsuario=" + nombreUsuario + '}';
    }

    public Usuario(int idUsuario, String codigoUsuario, String nombreUsuario) {
        this.idUsuario = idUsuario;
        this.codigoUsuario = codigoUsuario;
        this.nombreUsuario = nombreUsuario;
    }

    /**
     * @return the idUsuario
     */
    public int getIdUsuario() {
        return idUsuario;
    }

    /**
     * @param idUsuario the idUsuario to set
     */
    public void setIdUsuario(int idUsuario) {
        this.idUsuario = idUsuario;
    }

    /**
     * @return the codigoUsuario
     */
    public String getCodigoUsuario() {
        return codigoUsuario;
    }

    /**
     * @param codigoUsuario the codigoUsuario to set
     */
    public void setCodigoUsuario(String codigoUsuario) {
        this.codigoUsuario = codigoUsuario;
    }

    /**
     * @return the nombreUsuario
     */
    public String getNombreUsuario() {
        return nombreUsuario;
    }

    /**
     * @param nombreUsuario the nombreUsuario to set
     */
    public void setNombreUsuario(String nombreUsuario) {
        this.nombreUsuario = nombreUsuario;
    }

    
}
