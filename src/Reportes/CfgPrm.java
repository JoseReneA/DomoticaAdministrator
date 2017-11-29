/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Reportes;

import java.sql.Connection;
import java.sql.DriverManager;
import java.util.HashMap;
import static javax.swing.WindowConstants.DISPOSE_ON_CLOSE;
import net.sf.jasperreports.engine.JasperFillManager;
import net.sf.jasperreports.engine.JasperPrint;
import net.sf.jasperreports.view.JasperViewer;

/**
 *
 * @author Black
 */
public class CfgPrm {

    //Constantes concernientes al servidor de base de datos
    //almacena el nombre o IP del servidor de base de datos
    public static final String direccionIP = "bdmysqldomotica.mysql.database.azure.com";
    //almacena el tipo de servidor de base de datos
    public static final String tipoServidorBD = "MySQL";
    //almacena la base de datos a la cual se accesara
    //public static final String nombreBD = "ensambladora";
    public static final String nombreBD = "domotica";
    //almacena el usuario de la base de datos
    public static final String usuarioBD = "adminR@bdmysqldomotica";
    //almacena el password del usuario de la base de datos
    public static final String pwsBD = "Joserene20";

}
