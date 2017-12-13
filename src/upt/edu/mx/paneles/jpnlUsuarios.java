
package upt.edu.mx.paneles;

import com.rene.libraries.Jtable_clean;
import com.rene.libraries.builtJtable.Jtable_built;
import static com.rene.libraries.builtJtable.Jtable_built.modeloGenerico;
import java.awt.Color;
import java.awt.Toolkit;
import java.sql.SQLException;
import java.util.List;
import java.util.Locale;
import java.util.Timer;
import java.util.TimerTask;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.table.DefaultTableModel;
import upt.edu.mx.rsbuttom.ValidacionesGenericas;
import upt.edu.upt.daoExtends.UsuariosDaoExtends;
import upt.edu.mx.Notificaciones.Notificaciones;
import upt.edu.mx.controller.ContactoController;
import upt.edu.mx.controller.UsuariosController;
import upt.edu.mx.modelo.Contacto;
import upt.edu.mx.modelo.Usuario;

/**
 *
 * @author Jose Rene
 */
public class jpnlUsuarios extends javax.swing.JPanel {
    UsuariosController usuariosController= new UsuariosController();//Instancia que controla las acciones de usuario
    Notificaciones notificaciones= new Notificaciones(); //Instancia que controla las notificaciones
    Jtable_clean jtableClean= new Jtable_clean();//Instancia que controla el refrescar el JTABLE
    UsuariosDaoExtends usuariosDaoExt= new UsuariosDaoExtends();//Instancia que Maneja acciones que estan fuera de la clase abstracta
    ValidacionesGenericas validacionesGenericas= new ValidacionesGenericas();//Clase que valida datos de los componentes del 
    ContactoController contactoController= new ContactoController();
    /**
     * Creamos un nuevo Panel de Usuarios
     */
    int idUsuario=0;
    boolean valida;
    int idContacto=0;
    public jpnlUsuarios() {
        initComponents();
        this.crearModeloTabla();//Inicializamos el modelo de la tabla
        this.llenarTabla();//Inicilizamos el metodo que muestra los datos en la tabla
        this.CamposPorTiempo();
    }
    /**Metodo que valida los campos vacios o llenos estableciendo un tiempo 
     * 
     */
    public void CamposPorTiempo()
    {
        try
        {
            // Clase en la que está el código a ejecutar 
            TimerTask timerTask = new TimerTask()
            {
                public void run() 
                {
                   validacionesGenericas.verificarEstatusJtextfield(jpTextUsuarios);
                   validacionesGenericas.verificarEstatusCombo(jpTextUsuarios);
                   if(jtNombreUsuario.getText().isEmpty() || jtContrasenia.getText().isEmpty() || jtfNumeroTelefonico.getText().isEmpty())
                   {
                       jbtAgregar.setEnabled(false);
                       jbtEliminar.setEnabled(false);
                       jbtModificar.setEnabled(false);
                   }else if(!(jtNombreUsuario.getText().isEmpty() || jtContrasenia.getText().isEmpty() || jtfNumeroTelefonico.getText().isEmpty()))
                   {
                       jbtAgregar.setEnabled(true);
                       jbtEliminar.setEnabled(true);
                       jbtModificar.setEnabled(true);
                   }
                }
            };
            Timer timer = new Timer();
            timer.scheduleAtFixedRate(timerTask, 0, 1000);//Le colocamos un timer para poder destinar el tiempo de validacion
        }catch(Exception _ex)
        {
            throw _ex;
        }
    }
    /**Metodo para eliminar los usuarios
     * 
     */
    private void eliminarUsuarios()
    {
        try {
            Usuario usuario= new Usuario();
            usuario.setIdUsuario(idUsuario);
            valida=usuariosController.eliminar(usuario);
            if(valida==true)
            {
                this.limpiarJtable();
                this.llenarTabla();
                this.limpiarCamposTexto();
                notificaciones.alertaSuccess("El Usuario ha eliminado correcamente");
            }else
            {
                notificaciones.alertaError("No sepudo eliminar el usuario");
            }
        } catch (Exception _ex) {
            throw _ex;
            //System.out.print("Error:"+" "+e.getMessage());
        }
    }
    /**Metodo para modificar usuarios
     * 
     */
    private void modificarUsuarios()
    {
        try {
            Usuario usuario= new Usuario();
            usuario.setIdUsuario(idUsuario);
            usuario.setCodigoUsuario(jtContrasenia.getText());
            usuario.setNombreUsuario(jtNombreUsuario.getText());
            valida=usuariosController.actualizar(usuario);
            if(valida==true)
            {
                this.updateContacto();
                this.limpiarJtable();
                this.llenarTabla();
                this.limpiarCamposTexto();
                notificaciones.alertaSuccess("El usuario ha sido modificado correctamente");
            }else
            {
                notificaciones.alertaError("No se puede modificar el usuario");
            }
        } catch (Exception _ex) {
            throw _ex;
        }
    }
    /**Metodo que sirve para limpiar o refrescar un jtable
     * 
     */
    private void limpiarJtable()
    {
        try {
            jtableClean.limpiarTabla(modeloGenerico);
        } catch (Exception e) {
        }
    }
    /**Metodo que sirve para insertar usuarios
     * 
     */
    private void insertarUsuarios()
    {
        try {
            if(!validacionesGenericas.verificarCajasTexto(jpTextUsuarios))
            {
                Usuario usuario= new Usuario();
                usuario.setCodigoUsuario(jtContrasenia.getText());
                usuario.setNombreUsuario(jtNombreUsuario.getText());
                 valida=usuariosController.registrar(usuario);
                if(valida==true)
                {
                    this.insertarContacto();//Mandamos llamar al metodo insertar contacto para que se ejecute al mismo tiempo que se registra usuario
                    notificaciones.alertaSuccess("El Usuario ha sido registrado correctamente");
                    this.limpiarJtable();
                    this.llenarTabla();
                    this.limpiarCamposTexto();
                }else
                {
                    notificaciones.alertaError("No se pudo agregar el usuario");
                }
            }else
            {
                notificaciones.alertaError("Aun hay campos vacios, verifica por favor");
            }
        } catch (Exception e) {
        }
    }
    /**Metodo que sirve para llenar la tabla
     * 
     */
    private void llenarTabla()
    {
        try 
        {
           Object A[]= null;
           List<Contacto> _object;
           _object=usuariosDaoExt.listarUsuariosInnerJoinContacto();
            for (int i = 0; i < _object.size(); i++) 
            {
                modeloGenerico.addRow(A);
                modeloGenerico.setValueAt(_object.get(i).getFk_idUsuario().getIdUsuario(), i, 0);
                modeloGenerico.setValueAt(_object.get(i).getFk_idUsuario().getNombreUsuario(), i, 1);
                modeloGenerico.setValueAt(_object.get(i).getFk_idUsuario().getCodigoUsuario(), i, 2);
                modeloGenerico.setValueAt(_object.get(i).getNumeroTelefonico(), i, 3);
            }
        } catch (Exception e) {
        }
    }
    /**Metdo que sirve para mostrar datos en los campos de texto
     * 
     */
    private void mostrarDatosCampos()
    {
        try {
            List<Contacto> _object;
            idUsuario=Integer.parseInt(jtbUsuarios.getValueAt(jtbUsuarios.getSelectedRow(), 0).toString());
           _object=usuariosDaoExt.obtenerUsuario(idUsuario);
            for (int i = 0; i < _object.size(); i++) 
            {
                idUsuario=_object.get(i).getFk_idUsuario().getIdUsuario();
                jtContrasenia.setText(_object.get(i).getFk_idUsuario().getCodigoUsuario());
                jtNombreUsuario.setText(_object.get(i).getFk_idUsuario().getNombreUsuario());
                jtfNumeroTelefonico.setText(_object.get(i).getNumeroTelefonico());
                idContacto=_object.get(i).getIdContacto();
            }
        } catch (Exception _ex) 
        {
            throw _ex;
        }
    }
    private void buscarUsuarios()
    {
        try 
        {
           Object A[]= null;
           List<Contacto> _object;
           _object=usuariosDaoExt.buscarUsuario(this.jtfBuscarUsuarios.getText());
            for (int i = 0; i < _object.size(); i++) 
            {
                modeloGenerico.addRow(A);
                modeloGenerico.setValueAt(_object.get(i).getFk_idUsuario().getIdUsuario(), i, 0);
                modeloGenerico.setValueAt(_object.get(i).getFk_idUsuario().getCodigoUsuario(), i, 1);
                modeloGenerico.setValueAt(_object.get(i).getFk_idUsuario().getNombreUsuario(), i, 2);
                modeloGenerico.setValueAt(_object.get(i).getNumeroTelefonico(), i, 3);
                
            }
        } catch (Exception _ex) 
        {
            System.out.print(_ex.getMessage());
        }
    }
     private void crearModeloTabla ()
    {
        try 
        {
            String[] array = {"ID","Usuario","Contraseña","Numero telefonico"};
            Jtable_built jtb = new Jtable_built();
            jtbUsuarios.setModel(jtb.crearModeloGenerico(array, array.length));
        } catch (Exception _ex) 
        {
            throw _ex;
        }
    }
     /**Metodo que nos permite insertar en la tabla contacto
      * 
      */
     private void insertarContacto()
     {
        try {
             idUsuario=(usuariosDaoExt.obtenerIdUsuario());
             Usuario usuario= new Usuario();
             usuario.setIdUsuario(idUsuario);
             Contacto contacto= new Contacto();
             contacto.setNumeroTelefonico(jtfNumeroTelefonico.getText());
             contacto.setFk_idUsuario(usuario);
             valida=contactoController.registrar(contacto);
             if(valida==true){
                 notificaciones.alertaSuccess("Contacto registrado correctamente");
             }else{
                 notificaciones.alertaError("No se pudo registrar contacto");
             }
         } catch (Exception _ex) {
             System.out.println("Error"+_ex.getMessage());//Mostramos el mensaje de error
         }
     }
     private void updateContacto()
     {
         try {
             Usuario usuario= new Usuario();
             usuario.setIdUsuario(14);
             Contacto contacto= new Contacto();
             contacto.setIdContacto(6);
             contacto.setNumeroTelefonico(jtfNumeroTelefonico.getText());
             contacto.setFk_idUsuario(usuario);
             valida=contactoController.actualizar(contacto);
             if(valida==true){
                 notificaciones.alertaSuccess("Datos de contacto actualizados correctamente");
             }else if(valida==false){
                 notificaciones.alertaError("No se pudo actualizar contacto");
             }
         } catch (Exception _ex) {
             throw _ex;
         }
     }
     private void limpiarCamposTexto()
     {
         try {
             validacionesGenericas.limpiarCamposDeTexto(jpTextUsuarios);
         } catch (Exception e) {
         }
     }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jlbMenuUsuarios = new javax.swing.JLabel();
        jbtAgregar = new javax.swing.JButton();
        jbtModificar = new javax.swing.JButton();
        jbtEliminar = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jtbUsuarios = new javax.swing.JTable();
        jlbBuscarUsuario = new javax.swing.JLabel();
        jtfBuscarUsuarios = new javax.swing.JTextField();
        jpTextUsuarios = new javax.swing.JPanel();
        jtNombreUsuario = new javax.swing.JTextField();
        jtContrasenia = new javax.swing.JTextField();
        jlbNombreUsuario_Usuarios = new javax.swing.JLabel();
        jlbContrasenia_Usuarios = new javax.swing.JLabel();
        jlNumeroTelUsuario = new javax.swing.JLabel();
        jtfNumeroTelefonico = new javax.swing.JTextField();
        jlValidaNumTel_Usuario = new javax.swing.JLabel();
        btnNuevo = new javax.swing.JButton();

        setBackground(new java.awt.Color(255, 255, 255));
        setLayout(null);

        jlbMenuUsuarios.setFont(new java.awt.Font("Roboto", 1, 36)); // NOI18N
        jlbMenuUsuarios.setForeground(new java.awt.Color(38, 86, 186));
        jlbMenuUsuarios.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jlbMenuUsuarios.setText("Usuarios");
        add(jlbMenuUsuarios);
        jlbMenuUsuarios.setBounds(240, 20, 570, 43);

        jbtAgregar.setBackground(new java.awt.Color(255, 255, 255));
        jbtAgregar.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jbtAgregar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/upt/edu/mx/imagenes/iconAgregarBtn.png"))); // NOI18N
        jbtAgregar.setText("Agregar");
        jbtAgregar.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jbtAgregar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtAgregarActionPerformed(evt);
            }
        });
        add(jbtAgregar);
        jbtAgregar.setBounds(160, 250, 140, 40);

        jbtModificar.setBackground(new java.awt.Color(255, 255, 255));
        jbtModificar.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jbtModificar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/upt/edu/mx/imagenes/iconModificarBtn.png"))); // NOI18N
        jbtModificar.setText("Modificar");
        jbtModificar.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jbtModificar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtModificarActionPerformed(evt);
            }
        });
        add(jbtModificar);
        jbtModificar.setBounds(350, 250, 140, 40);

        jbtEliminar.setBackground(new java.awt.Color(255, 255, 255));
        jbtEliminar.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jbtEliminar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/upt/edu/mx/imagenes/iconCancelarBtn.png"))); // NOI18N
        jbtEliminar.setText("Eliminar");
        jbtEliminar.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jbtEliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtEliminarActionPerformed(evt);
            }
        });
        add(jbtEliminar);
        jbtEliminar.setBounds(560, 250, 140, 40);

        jtbUsuarios.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jtbUsuarios.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jtbUsuarios.setRequestFocusEnabled(false);
        jtbUsuarios.setRowMargin(3);
        jtbUsuarios.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jtbUsuariosMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(jtbUsuarios);

        add(jScrollPane1);
        jScrollPane1.setBounds(100, 380, 870, 210);

        jlbBuscarUsuario.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jlbBuscarUsuario.setIcon(new javax.swing.ImageIcon(getClass().getResource("/upt/edu/mx/imagenes/buscar_usuarios.png"))); // NOI18N
        jlbBuscarUsuario.setText("Buscar");
        add(jlbBuscarUsuario);
        jlbBuscarUsuario.setBounds(230, 320, 90, 50);

        jtfBuscarUsuarios.setToolTipText("Buscar usuarios");
        jtfBuscarUsuarios.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 2, 0, new java.awt.Color(0, 0, 0)));
        jtfBuscarUsuarios.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                jtfBuscarUsuariosKeyReleased(evt);
            }
        });
        add(jtfBuscarUsuarios);
        jtfBuscarUsuarios.setBounds(320, 330, 240, 30);

        jpTextUsuarios.setLayout(null);

        jtNombreUsuario.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                jtNombreUsuarioKeyReleased(evt);
            }
        });
        jpTextUsuarios.add(jtNombreUsuario);
        jtNombreUsuario.setBounds(290, 20, 300, 30);

        jtContrasenia.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                jtContraseniaKeyReleased(evt);
            }
        });
        jpTextUsuarios.add(jtContrasenia);
        jtContrasenia.setBounds(290, 60, 300, 30);

        jlbNombreUsuario_Usuarios.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jlbNombreUsuario_Usuarios.setText("Nombre del usuario");
        jpTextUsuarios.add(jlbNombreUsuario_Usuarios);
        jlbNombreUsuario_Usuarios.setBounds(60, 17, 140, 30);

        jlbContrasenia_Usuarios.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jlbContrasenia_Usuarios.setText("Contraseña");
        jpTextUsuarios.add(jlbContrasenia_Usuarios);
        jlbContrasenia_Usuarios.setBounds(60, 57, 90, 30);

        jlNumeroTelUsuario.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jlNumeroTelUsuario.setText("Numero de telefono");
        jpTextUsuarios.add(jlNumeroTelUsuario);
        jlNumeroTelUsuario.setBounds(60, 110, 150, 17);

        jtfNumeroTelefonico.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                jtfNumeroTelefonicoKeyReleased(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jtfNumeroTelefonicoKeyTyped(evt);
            }
        });
        jpTextUsuarios.add(jtfNumeroTelefonico);
        jtfNumeroTelefonico.setBounds(290, 100, 300, 30);

        jlValidaNumTel_Usuario.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jlValidaNumTel_Usuario.setForeground(new java.awt.Color(255, 0, 0));
        jpTextUsuarios.add(jlValidaNumTel_Usuario);
        jlValidaNumTel_Usuario.setBounds(600, 100, 240, 30);

        add(jpTextUsuarios);
        jpTextUsuarios.setBounds(110, 60, 850, 180);

        btnNuevo.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        btnNuevo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/upt/edu/mx/imagenes/iconNuevoBtn.png"))); // NOI18N
        btnNuevo.setText("Nuevo");
        btnNuevo.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btnNuevo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNuevoActionPerformed(evt);
            }
        });
        add(btnNuevo);
        btnNuevo.setBounds(760, 250, 150, 40);
    }// </editor-fold>//GEN-END:initComponents

    private void jbtAgregarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtAgregarActionPerformed
        this.insertarUsuarios();
    }//GEN-LAST:event_jbtAgregarActionPerformed

    private void jtbUsuariosMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jtbUsuariosMouseClicked
       this.mostrarDatosCampos();
    }//GEN-LAST:event_jtbUsuariosMouseClicked

    private void jbtModificarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtModificarActionPerformed
        this.modificarUsuarios();
    }//GEN-LAST:event_jbtModificarActionPerformed

    private void jbtEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtEliminarActionPerformed
        this.eliminarUsuarios();
    }//GEN-LAST:event_jbtEliminarActionPerformed

    private void jtfBuscarUsuariosKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jtfBuscarUsuariosKeyReleased
        this.limpiarJtable();
        this.buscarUsuarios();
    }//GEN-LAST:event_jtfBuscarUsuariosKeyReleased

    private void jtNombreUsuarioKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jtNombreUsuarioKeyReleased
       
    }//GEN-LAST:event_jtNombreUsuarioKeyReleased

    private void jtContraseniaKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jtContraseniaKeyReleased
   
    }//GEN-LAST:event_jtContraseniaKeyReleased

    private void jtfNumeroTelefonicoKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jtfNumeroTelefonicoKeyReleased
        
    }//GEN-LAST:event_jtfNumeroTelefonicoKeyReleased

    private void btnNuevoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNuevoActionPerformed
        this.limpiarCamposTexto();
    }//GEN-LAST:event_btnNuevoActionPerformed

    private void jtfNumeroTelefonicoKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jtfNumeroTelefonicoKeyTyped
       jlValidaNumTel_Usuario.setText(validacionesGenericas.ValidaSoloNumeros(evt, Toolkit.getDefaultToolkit()));
    }//GEN-LAST:event_jtfNumeroTelefonicoKeyTyped


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnNuevo;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JButton jbtAgregar;
    private javax.swing.JButton jbtEliminar;
    private javax.swing.JButton jbtModificar;
    private javax.swing.JLabel jlNumeroTelUsuario;
    private javax.swing.JLabel jlValidaNumTel_Usuario;
    private javax.swing.JLabel jlbBuscarUsuario;
    private javax.swing.JLabel jlbContrasenia_Usuarios;
    private javax.swing.JLabel jlbMenuUsuarios;
    private javax.swing.JLabel jlbNombreUsuario_Usuarios;
    private javax.swing.JPanel jpTextUsuarios;
    private javax.swing.JTextField jtContrasenia;
    private javax.swing.JTextField jtNombreUsuario;
    private javax.swing.JTable jtbUsuarios;
    private javax.swing.JTextField jtfBuscarUsuarios;
    private javax.swing.JTextField jtfNumeroTelefonico;
    // End of variables declaration//GEN-END:variables
}
