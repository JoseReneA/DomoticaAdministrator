
package upt.edu.mx.gui;

import java.awt.Toolkit;
import java.awt.event.KeyEvent;
import upt.edu.mx.Notificaciones.Notificaciones;
import upt.edu.mx.controller.UsuariosController;
import upt.edu.mx.modelo.Usuario;
import upt.edu.mx.rsbuttom.ValidacionesGenericas;

/**
 *
 * @author Jose Rene
 */
public class JFLogin extends javax.swing.JFrame {
    UsuariosController uc= new UsuariosController();
    Menu jfmenu= new Menu();
    ValidacionesGenericas validaciones= new ValidacionesGenericas();
    private String mensaje;
    Notificaciones notificaciones= new Notificaciones();
    public JFLogin() {
        initComponents();
        this.setLocationRelativeTo(null);
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        JPLoginPrincipal = new javax.swing.JPanel();
        txtUsuario = new javax.swing.JTextField();
        jbtnAcceder = new javax.swing.JButton();
        jpfContrasenia = new javax.swing.JPasswordField();
        jLabel3 = new javax.swing.JLabel();
        JPanelCentral = new javax.swing.JPanel();
        lblLimpiarPassword = new javax.swing.JLabel();
        lblLimpiarUsuario = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        lblUsuarioLogin = new javax.swing.JLabel();
        lblContrasenia = new javax.swing.JLabel();
        JPanelHeader = new javax.swing.JPanel();
        jLabel7 = new javax.swing.JLabel();
        lblSalir = new javax.swing.JLabel();
        JLPrincipal = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        getContentPane().setLayout(null);

        JPLoginPrincipal.setBackground(new java.awt.Color(255, 255, 255));
        JPLoginPrincipal.setLayout(null);

        txtUsuario.setBackground(new java.awt.Color(51, 51, 51));
        txtUsuario.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        txtUsuario.setForeground(new java.awt.Color(255, 255, 255));
        txtUsuario.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255)));
        txtUsuario.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtUsuarioKeyReleased(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtUsuarioKeyTyped(evt);
            }
        });
        JPLoginPrincipal.add(txtUsuario);
        txtUsuario.setBounds(170, 250, 320, 50);

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
        jpfContrasenia.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jpfContraseniaKeyPressed(evt);
            }
            public void keyReleased(java.awt.event.KeyEvent evt) {
                jpfContraseniaKeyReleased(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jpfContraseniaKeyTyped(evt);
            }
        });
        JPLoginPrincipal.add(jpfContrasenia);
        jpfContrasenia.setBounds(170, 330, 320, 50);

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/upt/edu/mx/imagenes/login.png"))); // NOI18N
        JPLoginPrincipal.add(jLabel3);
        jLabel3.setBounds(270, 70, 130, 130);

        JPanelCentral.setBackground(new java.awt.Color(38, 86, 186));
        JPanelCentral.setLayout(null);

        lblLimpiarPassword.setIcon(new javax.swing.ImageIcon(getClass().getResource("/upt/edu/mx/imagenes/cerrar.png"))); // NOI18N
        lblLimpiarPassword.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblLimpiarPasswordMouseClicked(evt);
            }
        });
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

        lblUsuarioLogin.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        lblUsuarioLogin.setForeground(new java.awt.Color(255, 255, 255));
        JPanelCentral.add(lblUsuarioLogin);
        lblUsuarioLogin.setBounds(80, 90, 320, 20);

        lblContrasenia.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        lblContrasenia.setForeground(new java.awt.Color(255, 255, 255));
        JPanelCentral.add(lblContrasenia);
        lblContrasenia.setBounds(80, 170, 320, 20);

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
    private void validaAcceso(){
        Usuario usu= new Usuario();
        usu.setCodigoUsuario(jpfContrasenia.getText());
        usu.setNombreUsuario(txtUsuario.getText());
        boolean valida=uc.validaUsuario(usu);
        if(valida==true){
            notificaciones.alertaSuccess("USUARIO Y CONTRASEÑA CORRECTOS, BIENVENIDO");
            jfmenu.setVisible(true);
            this.setVisible(false);
        }else if(valida==false){
            notificaciones.alertaError("USUARIO O CONTRASEÑA INCORRECTOS, VERIFICA TU INFORMACIÓN");
            jfmenu.setVisible(false);
        }
    }
    private void jbtnAccederActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnAccederActionPerformed
        this.validaAcceso();
    }//GEN-LAST:event_jbtnAccederActionPerformed

    private void JLPrincipalMouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_JLPrincipalMouseDragged
       
    }//GEN-LAST:event_JLPrincipalMouseDragged

    private void JLPrincipalMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_JLPrincipalMousePressed
       
    }//GEN-LAST:event_JLPrincipalMousePressed

    private void lblSalirMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblSalirMouseClicked
        System.exit(0);
    }//GEN-LAST:event_lblSalirMouseClicked

    private void lblLimpiarUsuarioMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblLimpiarUsuarioMouseClicked
        this.txtUsuario.setText("");
    }//GEN-LAST:event_lblLimpiarUsuarioMouseClicked

    private void lblLimpiarPasswordMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblLimpiarPasswordMouseClicked
        this.jpfContrasenia.setText("");
    }//GEN-LAST:event_lblLimpiarPasswordMouseClicked

    private void jpfContraseniaKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jpfContraseniaKeyPressed
       if (evt.getKeyCode() == KeyEvent.VK_ENTER) {    
           validaAcceso();
       }
    }//GEN-LAST:event_jpfContraseniaKeyPressed

    private void txtUsuarioKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtUsuarioKeyTyped
        mensaje=validaciones.ValidaCantidadNumerosTextField(evt, Toolkit.getDefaultToolkit(), txtUsuario.getText(), 25);
        lblUsuarioLogin.setText(mensaje);
    }//GEN-LAST:event_txtUsuarioKeyTyped

    private void txtUsuarioKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtUsuarioKeyReleased
        
    }//GEN-LAST:event_txtUsuarioKeyReleased

    private void jpfContraseniaKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jpfContraseniaKeyReleased
        
    }//GEN-LAST:event_jpfContraseniaKeyReleased

    private void jpfContraseniaKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jpfContraseniaKeyTyped
        mensaje=validaciones.ValidaCantidadNumerosTextField(evt, Toolkit.getDefaultToolkit(), jpfContrasenia.getText(), 25);
        lblContrasenia.setText(mensaje);
    }//GEN-LAST:event_jpfContraseniaKeyTyped
    
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
    private javax.swing.JLabel lblContrasenia;
    private javax.swing.JLabel lblLimpiarPassword;
    private javax.swing.JLabel lblLimpiarUsuario;
    private javax.swing.JLabel lblSalir;
    private javax.swing.JLabel lblUsuarioLogin;
    private javax.swing.JTextField txtUsuario;
    // End of variables declaration//GEN-END:variables
}
