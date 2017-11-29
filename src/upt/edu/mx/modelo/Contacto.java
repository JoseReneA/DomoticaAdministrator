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
public class Contacto implements Serializable{

    public Contacto(int idContacto, String NumeroTelefonico, Usuario Fk_idUsuario) {
        this.idContacto = idContacto;
        this.NumeroTelefonico = NumeroTelefonico;
        this.Fk_idUsuario = Fk_idUsuario;
    }

    public Contacto() {
    }

    /**
     * @return the idContacto
     */
    public int getIdContacto() {
        return idContacto;
    }

    /**
     * @param idContacto the idContacto to set
     */
    public void setIdContacto(int idContacto) {
        this.idContacto = idContacto;
    }

    /**
     * @return the NumeroTelefonico
     */
    public String getNumeroTelefonico() {
        return NumeroTelefonico;
    }

    /**
     * @param NumeroTelefonico the NumeroTelefonico to set
     */
    public void setNumeroTelefonico(String NumeroTelefonico) {
        this.NumeroTelefonico = NumeroTelefonico;
    }

    /**
     * @return the Fk_idUsuario
     */
    public Usuario getFk_idUsuario() {
        return Fk_idUsuario;
    }

    /**
     * @param Fk_idUsuario the Fk_idUsuario to set
     */
    public void setFk_idUsuario(Usuario Fk_idUsuario) {
        this.Fk_idUsuario = Fk_idUsuario;
    }
    private int idContacto;
    private String NumeroTelefonico;
    private Usuario Fk_idUsuario;
}
