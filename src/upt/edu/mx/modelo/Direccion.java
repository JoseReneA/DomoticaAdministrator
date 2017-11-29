
package upt.edu.mx.modelo;

import java.io.Serializable;

/**
 *
 * @author Jose Rene
 */
public class Direccion implements Serializable{
    private int idDomicilio;
    private String colonia;
    private int noExterior;
    private int noInterior;
    private String calle;
    private int fk_usuario;
   public Direccion(int idDomicilio, String colonia, int noExterior, int noInterior, String calle) {
        this.idDomicilio = idDomicilio;
        this.colonia = colonia;
        this.noExterior = noExterior;
        this.noInterior = noInterior;
        this.calle = calle;
    }

    @Override
    public String toString() {
        return "Direccion{" + "idDomicilio=" + idDomicilio + ", colonia=" + colonia + ", noExterior=" + noExterior + ", noInterior=" + noInterior + ", calle=" + calle + ", fk_usuario=" + fk_usuario + '}';
    }
   
    public int getFk_usuario() {
        return fk_usuario;
    }

    public void setFk_usuario(int fk_usuario) {
        this.fk_usuario = fk_usuario;
    } 

    public Direccion() {
    }

    /**
     * @return the idDomicilio
     */
    public int getIdDomicilio() {
        return idDomicilio;
    }

    /**
     * @param idDomicilio the idDomicilio to set
     */
    public void setIdDomicilio(int idDomicilio) {
        this.idDomicilio = idDomicilio;
    }

    /**
     * @return the colonia
     */
    public String getColonia() {
        return colonia;
    }

    /**
     * @param colonia the colonia to set
     */
    public void setColonia(String colonia) {
        this.colonia = colonia;
    }

    /**
     * @return the noExterior
     */
    public int getNoExterior() {
        return noExterior;
    }

    /**
     * @param noExterior the noExterior to set
     */
    public void setNoExterior(int noExterior) {
        this.noExterior = noExterior;
    }

    /**
     * @return the noInterior
     */
    public int getNoInterior() {
        return noInterior;
    }

    /**
     * @param noInterior the noInterior to set
     */
    public void setNoInterior(int noInterior) {
        this.noInterior = noInterior;
    }

    /**
     * @return the calle
     */
    public String getCalle() {
        return calle;
    }

    /**
     * @param calle the calle to set
     */
    public void setCalle(String calle) {
        this.calle = calle;
    }
}
