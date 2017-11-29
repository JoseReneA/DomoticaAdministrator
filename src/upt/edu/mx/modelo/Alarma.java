/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package upt.edu.mx.modelo;

import java.sql.Time;
import java.sql.Timestamp;
import java.util.Date;
import org.exolab.castor.types.DateTime;

/**
 *
 * @author Jose Rene
 */
public class Alarma {
    private int idAlarma;
    private String estatusAlarma;
    private String accion;
    private Timestamp fecha;
    private Usuario fk_usuario;
    
    public Alarma() {
    }

    public Alarma(int idAlarma, String estatusAlarma, String accion, Timestamp fecha, Usuario fk_usuario) {
        this.idAlarma = idAlarma;
        this.estatusAlarma = estatusAlarma;
        this.accion = accion;
        this.fecha = fecha;
        this.fk_usuario = fk_usuario;
    }
    public String getAccion() {
        return accion;
    }

    @Override
    public String toString() {
        return "Alarma{" + "idAlarma=" + idAlarma + ", estatusAlarma=" + estatusAlarma + ", accion=" + accion + ", fecha=" + fecha + ", fk_usuario=" + fk_usuario + '}';
    }

    public void setAccion(String accion) {
        this.accion = accion;
    }

    /**
     * @return the idAlarma
     */
    public int getIdAlarma() {
        return idAlarma;
    }

    /**
     * @param idAlarma the idAlarma to set
     */
    public void setIdAlarma(int idAlarma) {
        this.idAlarma = idAlarma;
    }

    /**
     * @return the estatusAlarma
     */
    public String getEstatusAlarma() {
        return estatusAlarma;
    }

    /**
     * @param estatusAlarma the estatusAlarma to set
     */
    public void setEstatusAlarma(String estatusAlarma) {
        this.estatusAlarma = estatusAlarma;
    }

    /**
     * @return the fecha
     */
    public Timestamp getFecha() {
        return fecha;
    }

    /**
     * @param fecha the fecha to set
     */
    public void setFecha(Timestamp fecha) {
        this.fecha = fecha;
    }

    /**
     * @return the fk_usuario
     */
    public Usuario getFk_usuario() {
        return fk_usuario;
    }

    /**
     * @param fk_usuario the fk_usuario to set
     */
    public void setFk_usuario(Usuario fk_usuario) {
        this.fk_usuario = fk_usuario;
    }


  
}
