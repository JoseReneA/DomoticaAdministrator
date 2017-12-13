
package upt.edu.mx.paneles;

import com.sun.pdfview.PDFFile;
import com.sun.pdfview.PDFPage;
import com.sun.pdfview.PagePanel;
import java.awt.BorderLayout;
import java.awt.Dimension;
import java.io.File;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.nio.ByteBuffer;
import java.nio.channels.FileChannel;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

/**
 *
 * @author Jose Rene
 */
public class jpnlAbout extends javax.swing.JPanel {
        PagePanel panelpdf;
	JFileChooser selector;
	PDFFile pdffile;
	int indice=0;
    public jpnlAbout() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel4 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();

        jLabel4.setText("jLabel4");

        setBackground(new java.awt.Color(255, 255, 255));
        setLayout(null);

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel2.setText("Acerca de Automatización de seguridad en hogares");
        add(jLabel2);
        jLabel2.setBounds(10, 10, 520, 22);

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel1.setText("Propósito");
        add(jLabel1);
        jLabel1.setBounds(30, 180, 90, 20);

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel3.setText("Autores");
        add(jLabel3);
        jLabel3.setBounds(30, 220, 100, 15);

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel5.setText("Tiempo de desarrollo");
        add(jLabel5);
        jLabel5.setBounds(30, 250, 140, 15);

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel6.setText("Versión");
        add(jLabel6);
        jLabel6.setBounds(30, 280, 140, 15);

        jLabel7.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel7.setText("Cumplimiento asignatura");
        add(jLabel7);
        jLabel7.setBounds(30, 310, 160, 15);

        jLabel8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/upt/edu/mx/imagenes/login.png"))); // NOI18N
        add(jLabel8);
        jLabel8.setBounds(10, 40, 130, 130);

        jLabel9.setText("Administrar los accesos o negaciones de acceso en un hogar");
        add(jLabel9);
        jLabel9.setBounds(230, 180, 310, 20);

        jLabel10.setText("José René Avalos Almaraz");
        add(jLabel10);
        jLabel10.setBounds(230, 220, 290, 14);

        jLabel11.setText("1 mes");
        add(jLabel11);
        jLabel11.setBounds(230, 250, 300, 14);

        jLabel12.setText("1.0");
        add(jLabel12);
        jLabel12.setBounds(230, 280, 300, 14);

        jLabel13.setText("Programación orientada a objetos y analisis de desarrollo");
        add(jLabel13);
        jLabel13.setBounds(230, 310, 300, 14);
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    // End of variables declaration//GEN-END:variables
}
