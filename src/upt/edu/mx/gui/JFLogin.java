
package upt.edu.mx.gui;

import javax.swing.JOptionPane;
import upt.edu.mx.controller.UsuariosController;
import upt.edu.mx.modelo.Usuario;

/**
 *
 * @author Jose Rene
 */
public class JFLogin extends javax.swing.JFrame {
    UsuariosController uc= new UsuariosController();
    Menu jfmenu= new Menu();
    /**
     * Creates new form Login
     */
    public JFLogin() {
        initComponents();
        this.setLocationRelativeTo(null);
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        JPLoginPrincipal = new javax.swing.JPanel();
        jtxtUsuario = new javax.swing.JTextField();
        jbtnAcceder = new javax.swing.JButton();
        jpfContrasenia = new javax.swing.JPasswordField();
        jLabel3 = new javax.swing.JLabel();
        JPanelCentral = new javax.swing.JPanel();
        lblLimpiarPassword = new javax.swing.JLabel();
        lblLimpiarUsuario = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        JPanelHeader = new javax.swing.JPanel();
        jLabel7 = new javax.swing.JLabel();
        lblSalir = new javax.swing.JLabel();
        JLPrincipal = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        getContentPane().setLayout(null);

        JPLoginPrincipal.setBackground(new java.awt.Color(255, 255, 255));
        JPLoginPrincipal.setLayout(null);

        jtxtUsuario.setBackground(new java.awt.Color(51, 51, 51));
        jtxtUsuario.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jtxtUsuario.setForeground(new java.awt.Color(255, 255, 255));
        jtxtUsuario.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255)));
        JPLoginPrincipal.add(jtxtUsuario);
        jtxtUsuario.setBounds(170, 250, 320, 50);

        jbtnAcceder.setBackground(new java.awt.Color(0, 204, 51));
        jbtnAcceder.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jbtnAcceder.setForeground(new java.awt.Color(255, 255, 255));
        jbtnAcceder.setIcon(new javax.swing.ImageIcon(getClass().getResource("/upt/edu/mx/imagenes/icons8_Ok_48px.png"))); // NOI18N
        jbtnAcceder.setText("Acceder");
        jbtnAcceder.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnAccederActionPerformed(evt);
            }
        });
        JPLoginPrincipal.add(jbtnAcceder);
        jbtnAcceder.setBounds(130, 420, 410, 50);

        jpfContrasenia.setBackground(new java.awt.Color(51, 51, 51));
        jpfContrasenia.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jpfContrasenia.setForeground(new java.awt.Color(255, 255, 255));
        jpfContrasenia.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255)));
        JPLoginPrincipal.add(jpfContrasenia);
        jpfContrasenia.setBounds(170, 330, 320, 50);

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/upt/edu/mx/imagenes/login.png"))); // NOI18N
        JPLoginPrincipal.add(jLabel3);
        jLabel3.setBounds(270, 70, 130, 130);

        JPanelCentral.setBackground(new java.awt.Color(38, 86, 186));
        JPanelCentral.setLayout(null);

        lblLimpiarPassword.setIcon(new javax.swing.ImageIcon(getClass().getResource("/upt/edu/mx/imagenes/cerrar.png"))); // NOI18N
        JPanelCentral.add(lblLimpiarPassword);
        lblLimpiarPassword.setBounds(420, 120, 40, 50);

        lblLimpiarUsuario.setIcon(new javax.swing.ImageIcon(getClass().getResource("/upt/edu/mx/imagenes/cerrar.png"))); // NOI18N
        lblLimpiarUsuario.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblLimpiarUsuarioMouseClicked(evt);
            }
        });
        JPanelCentral.add(lblLimpiarUsuario);
        lblLimpiarUsuario.setBounds(420, 40, 40, 50);

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/upt/edu/mx/imagenes/icons8_User_Location_48px.png"))); // NOI18N
        jLabel4.setText("jLabel4");
        JPanelCentral.add(jLabel4);
        jLabel4.setBounds(20, 40, 50, 50);

        jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/upt/edu/mx/imagenes/icons8_Keepass_48px.png"))); // NOI18N
        jLabel6.setText("jLabel6");
        JPanelCentral.add(jLabel6);
        jLabel6.setBounds(20, 120, 50, 50);

        JPLoginPrincipal.add(JPanelCentral);
        JPanelCentral.setBounds(90, 210, 490, 300);

        JPanelHeader.setBackground(new java.awt.Color(38, 86, 186));
        JPanelHeader.setLayout(null);

        jLabel7.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("Login");
        JPanelHeader.add(jLabel7);
        jLabel7.setBounds(190, 0, 140, 50);

        JPLoginPrincipal.add(JPanelHeader);
        JPanelHeader.setBounds(90, 10, 490, 50);

        lblSalir.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        lblSalir.setText("X");
        lblSalir.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblSalirMouseClicked(evt);
            }
        });
        JPLoginPrincipal.add(lblSalir);
        lblSalir.setBounds(630, 10, 20, 30);

        JLPrincipal.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseDragged(java.awt.event.MouseEvent evt) {
                JLPrincipalMouseDragged(evt);
            }
        });
        JLPrincipal.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                JLPrincipalMousePressed(evt);
            }
        });
        JPLoginPrincipal.add(JLPrincipal);
        JLPrincipal.setBounds(0, 0, 660, 540);

        getContentPane().add(JPLoginPrincipal);
        JPLoginPrincipal.setBounds(0, 0, 670, 540);

        setBounds(0, 0, 658, 538);
    }// </editor-fold>//GEN-END:initComponents
    int xx;
    int xy;
    private void validaUsuario(){
        Usuario usu= new Usuario();
        usu.setCodigoUsuario(jpfContrasenia.getText());
        usu.setNombreUsuario(jtxtUsuario.getText());
        boolean valida=uc.validaUsuario(usu);
        if(valida==true){
            JOptionPane.showMessageDialog(this, "Datos correctos");
            jfmenu.setVisible(true);
        }else if(valida==false){
            JOptionPane.showMessageDialog(this, "Datos incorrectos");
            jfmenu.setVisible(false);
        }
    }
    private void jbtnAccederActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnAccederActionPerformed
        this.validaUsuario();
    }//GEN-LAST:event_jbtnAccederActionPerformed

    private void JLPrincipalMouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_JLPrincipalMouseDragged
       
    }//GEN-LAST:event_JLPrincipalMouseDragged

    private void JLPrincipalMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_JLPrincipalMousePressed
       
    }//GEN-LAST:event_JLPrincipalMousePressed

    private void lblSalirMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblSalirMouseClicked
        System.exit(0);
    }//GEN-LAST:event_lblSalirMouseClicked

    private void lblLimpiarUsuarioMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblLimpiarUsuarioMouseClicked
        
    }//GEN-LAST:event_lblLimpiarUsuarioMouseClicked
    
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
            java.util.logging.Logger.getLogger(JFLogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(JFLogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(JFLogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(JFLogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new JFLogin().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel JLPrincipal;
    private javax.swing.JPanel JPLoginPrincipal;
    private javax.swing.JPanel JPanelCentral;
    private javax.swing.JPanel JPanelHeader;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JButton jbtnAcceder;
    private javax.swing.JPasswordField jpfContrasenia;
    private javax.swing.JTextField jtxtUsuario;
    private javax.swing.JLabel lblLimpiarPassword;
    private javax.swing.JLabel lblLimpiarUsuario;
    private javax.swing.JLabel lblSalir;
    // End of variables declaration//GEN-END:variables
}
