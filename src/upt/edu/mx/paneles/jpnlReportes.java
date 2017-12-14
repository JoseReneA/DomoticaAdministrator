
package upt.edu.mx.paneles;
import Reportes.CfgPrm;
import java.sql.Connection;
import java.sql.DriverManager;
import java.util.HashMap;
import static javax.swing.WindowConstants.DISPOSE_ON_CLOSE;
import net.sf.jasperreports.engine.JasperFillManager;
import net.sf.jasperreports.engine.JasperPrint;
import net.sf.jasperreports.view.JasperViewer;
/**
 *
 * @author Jose Rene
 */
public class jpnlReportes extends javax.swing.JPanel {

    /**
     * Creates new form panel inicio
     */
    public jpnlReportes() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btnGenerarReporte = new javax.swing.JButton();
        cmbAccesos = new javax.swing.JComboBox<>();
        jLabel2 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();

        setBackground(new java.awt.Color(255, 255, 255));
        setLayout(null);

        btnGenerarReporte.setText("Generar reporte");
        btnGenerarReporte.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGenerarReporteActionPerformed(evt);
            }
        });
        add(btnGenerarReporte);
        btnGenerarReporte.setBounds(330, 230, 310, 40);

        cmbAccesos.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "-Seleccionar-", "Acceso", "Intento de  acceso" }));
        add(cmbAccesos);
        cmbAccesos.setBounds(330, 160, 310, 40);

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/upt/edu/mx/imagenes/buscar_Menu.png"))); // NOI18N
        jLabel2.setText("Filtrar por ");
        add(jLabel2);
        jLabel2.setBounds(170, 150, 140, 50);

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        jLabel1.setText("Reportes de accesos al domicilio");
        add(jLabel1);
        jLabel1.setBounds(180, 80, 610, 40);
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

                    jasperPrint = JasperFillManager.fillReport("C:\\Users\\Jose Rene\\Documents\\NetBeansProjects\\Sistema_domotica\\src\\Reportes\\ReporteAccesos.jasper", map, connection);
                    net.sf.jasperreports.view.JasperViewer ac = new JasperViewer(jasperPrint, false);
                    //JFrame ac = new JasperViewer(jasperPrint);

                    ac.setDefaultCloseOperation(DISPOSE_ON_CLOSE);

                    ac.setVisible(true);

                } catch (Exception ex) {
                    System.out.println("Error en la impresion" + ex.getMessage());
                }

            }
        });
    }//GEN-LAST:event_btnGenerarReporteActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnGenerarReporte;
    private javax.swing.JComboBox<String> cmbAccesos;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    // End of variables declaration//GEN-END:variables
}
