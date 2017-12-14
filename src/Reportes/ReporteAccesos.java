/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Reportes;

import java.sql.Connection;
import java.sql.DriverManager;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.HashMap;
import java.util.logging.Level;
import java.util.logging.Logger;
import static javax.swing.WindowConstants.DISPOSE_ON_CLOSE;
import net.sf.jasperreports.engine.JasperFillManager;
import net.sf.jasperreports.engine.JasperPrint;
import net.sf.jasperreports.view.JasperViewer;

/**
 *
 * @author Jose Rene
 */
public class ReporteAccesos extends javax.swing.JFrame {
    CfgPrm cfgprm= new CfgPrm();
    public ReporteAccesos() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        btnGenerarReporte = new javax.swing.JButton();
        cmbAccesos = new javax.swing.JComboBox<>();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(null);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setLayout(null);

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        jLabel1.setText("Reportes de accesos al domicilio");
        jPanel1.add(jLabel1);
        jLabel1.setBounds(40, 20, 610, 40);

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel2.setText("Fecha inicial");
        jPanel1.add(jLabel2);
        jLabel2.setBounds(70, 90, 110, 17);

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel3.setText("Fecha termino");
        jPanel1.add(jLabel3);
        jLabel3.setBounds(70, 130, 120, 17);

        btnGenerarReporte.setText("Generar reporte");
        btnGenerarReporte.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGenerarReporteActionPerformed(evt);
            }
        });
        jPanel1.add(btnGenerarReporte);
        btnGenerarReporte.setBounds(240, 170, 230, 40);

        cmbAccesos.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "-Seleccionar-", "Acceso", "Intento de  acceso" }));
        jPanel1.add(cmbAccesos);
        cmbAccesos.setBounds(240, 90, 230, 30);

        getContentPane().add(jPanel1);
        jPanel1.setBounds(0, 0, 770, 490);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnGenerarReporteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGenerarReporteActionPerformed

         java.awt.EventQueue.invokeLater(new Runnable() {

            public void run() {
                //Validar que haya datos en grado y grupo

                //Imprimir los datos que se llevaran al reporte
                HashMap map = new HashMap();//AQUI SE AGREGARAN LOS PARAMETROS Y VALORES
                JasperPrint jasperPrint = null;
                String manejador = "com.mysql.jdbc.Driver";
                Connection connection = null;
                try {

                    Class.forName(manejador);

                } catch (Exception e) {
                    System.out.println("Error en la conexion de la base de datos" + e.getMessage());
                    return;
                }
                try {
                    connection = DriverManager.getConnection("jdbc:mysql://" + CfgPrm.direccionIP + "/" + CfgPrm.nombreBD, CfgPrm.usuarioBD, CfgPrm.pwsBD);
                } catch (Exception ex) {
                    System.out.println("Error en la conexion de la base de datos" + ex.getMessage());
                }
                map.put("Accion",cmbAccesos.getSelectedItem().toString());
//                map.put("fecha_2","2017-11-25");

                try {
                    System.out.println("Imprimiendo reporte");
                    
//                    jasperPrint = JasperFillManager.fillReport("C:/Users/Jose Rene/Documents/NetBeansProjects/Sistema_domotica/src/upt/edu/mx/Reportes/ReporteAccesos.jasper", map, connection);
                    jasperPrint = JasperFillManager.fillReport("../src/upt/edu/mx/Reportes/ReporteAccesos.jasper", map, connection);
                    net.sf.jasperreports.view.JasperViewer ac = new JasperViewer(jasperPrint, false);
                    //JFrame ac = new JasperViewer(jasperPrint);

                    ac.setDefaultCloseOperation(DISPOSE_ON_CLOSE);

                    ac.setVisible(true);

                } catch (Exception _ex) {
                    try {
                        // System.out.println("Error en la impresion" + ex.getMessage());
                        throw _ex;
                    } catch (Exception ex) {
                        Logger.getLogger(ReporteAccesos.class.getName()).log(Level.SEVERE, null, ex);
                    }
                }


            }
        });        
    }//GEN-LAST:event_btnGenerarReporteActionPerformed

    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(ReporteAccesos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ReporteAccesos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ReporteAccesos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ReporteAccesos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ReporteAccesos().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnGenerarReporte;
    private javax.swing.JComboBox<String> cmbAccesos;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables
}
