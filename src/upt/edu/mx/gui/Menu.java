/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package upt.edu.mx.gui;

import java.awt.Color;
import java.awt.MouseInfo;
import java.awt.Point;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;
import upt.edu.mx.paneles.CambiarPanel;

/**
 *
 * @author RojeruSan
 */
public class Menu extends javax.swing.JFrame {

    int x, y;
    /**
     * Creates new form Principal
     */
    public Menu() {
        initComponents();
        this.setExtendedState(MAXIMIZED_BOTH);
        this.setLocationRelativeTo(this);
        this.jbtInicio.setSelected(true);
        new CambiarPanel(pnlPrincipal, new upt.edu.mx.paneles.jpnlInicio());
    }
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {
        java.awt.GridBagConstraints gridBagConstraints;

        jPanel1 = new javax.swing.JPanel();
        pnlMenu = new javax.swing.JPanel();
        jbtInicio = new upt.edu.mx.rsbuttom.RSButtonMetro();
        jPanel4 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jbtHistorial = new upt.edu.mx.rsbuttom.RSButtonMetro();
        jbtReportes = new upt.edu.mx.rsbuttom.RSButtonMetro();
        jbtUsuarios = new upt.edu.mx.rsbuttom.RSButtonMetro();
        jPanel2 = new javax.swing.JPanel();
        jButton1 = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jCTextField1 = new app.bolivia.swing.JCTextField();
        pnlCentro = new javax.swing.JPanel();
        jPanel6 = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        pnlPrincipal = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setLayout(new java.awt.GridBagLayout());

        pnlMenu.setBackground(new java.awt.Color(239, 238, 244));
        pnlMenu.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 5, 0, 0, new java.awt.Color(239, 238, 244)));

        jbtInicio.setForeground(new java.awt.Color(128, 128, 131));
        jbtInicio.setIcon(new javax.swing.ImageIcon(getClass().getResource("/upt/edu/mx/imagenes/inicio_Menu.png"))); // NOI18N
        jbtInicio.setText("Inicio");
        jbtInicio.setColorHover(new java.awt.Color(204, 204, 204));
        jbtInicio.setColorNormal(new java.awt.Color(204, 204, 204));
        jbtInicio.setColorPressed(new java.awt.Color(204, 204, 204));
        jbtInicio.setColorTextHover(new java.awt.Color(128, 128, 131));
        jbtInicio.setColorTextNormal(new java.awt.Color(128, 128, 131));
        jbtInicio.setColorTextPressed(new java.awt.Color(128, 128, 131));
        jbtInicio.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jbtInicio.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);
        jbtInicio.setIconTextGap(25);
        jbtInicio.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jbtInicioMouseClicked(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jbtInicioMousePressed(evt);
            }
        });
        jbtInicio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtInicioActionPerformed(evt);
            }
        });

        jPanel4.setBackground(new java.awt.Color(239, 238, 244));

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(128, 128, 131));
        jLabel1.setText("Menu");

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                .addContainerGap(41, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addContainerGap())
        );

        jbtHistorial.setBackground(new java.awt.Color(239, 238, 244));
        jbtHistorial.setForeground(new java.awt.Color(128, 128, 131));
        jbtHistorial.setIcon(new javax.swing.ImageIcon(getClass().getResource("/upt/edu/mx/imagenes/Historial_Menu.png"))); // NOI18N
        jbtHistorial.setText("Historial");
        jbtHistorial.setColorHover(new java.awt.Color(204, 204, 204));
        jbtHistorial.setColorNormal(new java.awt.Color(239, 238, 244));
        jbtHistorial.setColorPressed(new java.awt.Color(204, 204, 204));
        jbtHistorial.setColorTextHover(new java.awt.Color(128, 128, 131));
        jbtHistorial.setColorTextNormal(new java.awt.Color(128, 128, 131));
        jbtHistorial.setColorTextPressed(new java.awt.Color(128, 128, 131));
        jbtHistorial.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jbtHistorial.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);
        jbtHistorial.setIconTextGap(25);
        jbtHistorial.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jbtHistorialMousePressed(evt);
            }
        });
        jbtHistorial.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtHistorialActionPerformed(evt);
            }
        });

        jbtReportes.setBackground(new java.awt.Color(239, 238, 244));
        jbtReportes.setForeground(new java.awt.Color(128, 128, 131));
        jbtReportes.setIcon(new javax.swing.ImageIcon(getClass().getResource("/upt/edu/mx/imagenes/iconReporte.png"))); // NOI18N
        jbtReportes.setText("Reportes");
        jbtReportes.setColorHover(new java.awt.Color(204, 204, 204));
        jbtReportes.setColorNormal(new java.awt.Color(239, 238, 244));
        jbtReportes.setColorPressed(new java.awt.Color(204, 204, 204));
        jbtReportes.setColorTextHover(new java.awt.Color(128, 128, 131));
        jbtReportes.setColorTextNormal(new java.awt.Color(128, 128, 131));
        jbtReportes.setColorTextPressed(new java.awt.Color(128, 128, 131));
        jbtReportes.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jbtReportes.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);
        jbtReportes.setIconTextGap(25);
        jbtReportes.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jbtReportesMousePressed(evt);
            }
        });
        jbtReportes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtReportesActionPerformed(evt);
            }
        });

        jbtUsuarios.setBackground(new java.awt.Color(239, 238, 244));
        jbtUsuarios.setForeground(new java.awt.Color(128, 128, 131));
        jbtUsuarios.setIcon(new javax.swing.ImageIcon(getClass().getResource("/upt/edu/mx/imagenes/user_Menu.png"))); // NOI18N
        jbtUsuarios.setText("Usuarios");
        jbtUsuarios.setColorHover(new java.awt.Color(204, 204, 204));
        jbtUsuarios.setColorNormal(new java.awt.Color(239, 238, 244));
        jbtUsuarios.setColorPressed(new java.awt.Color(204, 204, 204));
        jbtUsuarios.setColorTextHover(new java.awt.Color(128, 128, 131));
        jbtUsuarios.setColorTextNormal(new java.awt.Color(128, 128, 131));
        jbtUsuarios.setColorTextPressed(new java.awt.Color(128, 128, 131));
        jbtUsuarios.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jbtUsuarios.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);
        jbtUsuarios.setIconTextGap(25);
        jbtUsuarios.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jbtUsuariosMousePressed(evt);
            }
        });
        jbtUsuarios.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtUsuariosActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout pnlMenuLayout = new javax.swing.GroupLayout(pnlMenu);
        pnlMenu.setLayout(pnlMenuLayout);
        pnlMenuLayout.setHorizontalGroup(
            pnlMenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(pnlMenuLayout.createSequentialGroup()
                .addGroup(pnlMenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlMenuLayout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(jbtHistorial, javax.swing.GroupLayout.PREFERRED_SIZE, 268, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(pnlMenuLayout.createSequentialGroup()
                        .addGroup(pnlMenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jbtInicio, javax.swing.GroupLayout.PREFERRED_SIZE, 258, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jbtReportes, javax.swing.GroupLayout.PREFERRED_SIZE, 258, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jbtUsuarios, javax.swing.GroupLayout.PREFERRED_SIZE, 258, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        pnlMenuLayout.setVerticalGroup(
            pnlMenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlMenuLayout.createSequentialGroup()
                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(12, 12, 12)
                .addComponent(jbtInicio, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jbtHistorial, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(31, 31, 31)
                .addComponent(jbtUsuarios, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jbtReportes, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.fill = java.awt.GridBagConstraints.VERTICAL;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.WEST;
        gridBagConstraints.weighty = 8.3;
        gridBagConstraints.insets = new java.awt.Insets(0, 0, 0, 1);
        jPanel1.add(pnlMenu, gridBagConstraints);

        jPanel2.setBackground(new java.awt.Color(38, 86, 186));
        jPanel2.setCursor(new java.awt.Cursor(java.awt.Cursor.MOVE_CURSOR));
        jPanel2.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseDragged(java.awt.event.MouseEvent evt) {
                jPanel2MouseDragged(evt);
            }
        });
        jPanel2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jPanel2MousePressed(evt);
            }
        });

        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/upt/edu/mx/imagenes/Menu_96px.png"))); // NOI18N
        jButton1.setBorder(null);
        jButton1.setContentAreaFilled(false);
        jButton1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jLabel2.setBackground(new java.awt.Color(255, 255, 255));
        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Administracion Home-Secure");

        jCTextField1.setBackground(new java.awt.Color(38, 86, 186));
        jCTextField1.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 2, 0, new java.awt.Color(255, 255, 255)));
        jCTextField1.setForeground(new java.awt.Color(255, 255, 255));
        jCTextField1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jCTextField1.setPhColor(new java.awt.Color(255, 255, 255));
        jCTextField1.setPlaceholder("Buscar");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jButton1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 436, Short.MAX_VALUE)
                .addComponent(jCTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 281, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jButton1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jCTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.gridwidth = 3;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.PAGE_START;
        gridBagConstraints.weightx = 0.2;
        jPanel1.add(jPanel2, gridBagConstraints);

        pnlCentro.setBackground(new java.awt.Color(255, 255, 255));

        jPanel6.setBackground(new java.awt.Color(255, 255, 255));

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(128, 128, 131));
        jLabel4.setText("Administración");

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel4)
                .addContainerGap(555, Short.MAX_VALUE))
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel4)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jScrollPane1.setBorder(null);

        pnlPrincipal.setBackground(new java.awt.Color(255, 255, 255));
        pnlPrincipal.setLayout(new javax.swing.BoxLayout(pnlPrincipal, javax.swing.BoxLayout.LINE_AXIS));
        jScrollPane1.setViewportView(pnlPrincipal);

        javax.swing.GroupLayout pnlCentroLayout = new javax.swing.GroupLayout(pnlCentro);
        pnlCentro.setLayout(pnlCentroLayout);
        pnlCentroLayout.setHorizontalGroup(
            pnlCentroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jScrollPane1)
        );
        pnlCentroLayout.setVerticalGroup(
            pnlCentroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlCentroLayout.createSequentialGroup()
                .addComponent(jPanel6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 558, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.gridwidth = 2;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.weightx = 0.4;
        gridBagConstraints.weighty = 0.1;
        jPanel1.add(pnlCentro, gridBagConstraints);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        int posicion = pnlMenu.getX();
        if(posicion > -1){
            Animacion.Animacion.mover_izquierda(0, -264, 2, 2, pnlMenu);
        }else{
            Animacion.Animacion.mover_derecha(-264, 0, 2, 2, pnlMenu);
        }
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jPanel2MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel2MousePressed
        x = evt.getX();
        y = evt.getY();
    }//GEN-LAST:event_jPanel2MousePressed

    private void jPanel2MouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel2MouseDragged
        Point mueve = MouseInfo.getPointerInfo().getLocation();
        this.setLocation(mueve.x - x, mueve.y - y);
    }//GEN-LAST:event_jPanel2MouseDragged

    private void jbtReportesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtReportesActionPerformed
        new CambiarPanel(pnlPrincipal, new upt.edu.mx.paneles.jpnlReportes());
            if(this.jbtReportes.isSelected()){          
                    this.jbtReportes.setColorNormal(new Color(204,204,204));
                    this.jbtReportes.setColorHover(new Color(204,204,204));
                    this.jbtReportes.setColorPressed(new Color(204,204,204)); 
                    
                    this.jbtHistorial.setColorNormal(new Color(239,238,244));
                    this.jbtHistorial.setColorHover(new Color(204,204,204));
                    this.jbtHistorial.setColorPressed(new Color(204,204,204));

                    this.jbtInicio.setColorNormal(new Color(239,238,244));
                    this.jbtInicio.setColorHover(new Color(204,204,204));
                    this.jbtInicio.setColorPressed(new Color(204,204,204));       
                    
                    this.jbtUsuarios.setColorNormal(new Color(239,238,244));
                    this.jbtUsuarios.setColorHover(new Color(204,204,204));
                    this.jbtUsuarios.setColorPressed(new Color(204,204,204));  
                }else{
                    this.jbtReportes.setColorNormal(new Color(239,238,244));
                    this.jbtReportes.setColorHover(new Color(204,204,204));
                    this.jbtReportes.setColorPressed(new Color(204,204,204)); 
                }
    }//GEN-LAST:event_jbtReportesActionPerformed

    private void jbtReportesMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jbtReportesMousePressed
        this.jbtInicio.setSelected(false);
        this.jbtReportes.setSelected(true);
        this.jbtHistorial.setSelected(false);
    }//GEN-LAST:event_jbtReportesMousePressed

    private void jbtHistorialActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtHistorialActionPerformed
        try {
            new CambiarPanel(pnlPrincipal, new upt.edu.mx.paneles.jpnlHistorial());
        } catch (Exception ex) {
            Logger.getLogger(Menu.class.getName()).log(Level.SEVERE, null, ex);
        }
        if(this.jbtHistorial.isSelected()){
            this.jbtHistorial.setColorNormal(new Color(204,204,204));
            this.jbtHistorial.setColorHover(new Color(204,204,204));
            this.jbtHistorial.setColorPressed(new Color(204,204,204));

            this.jbtInicio.setColorNormal(new Color(239,238,244));
            this.jbtInicio.setColorHover(new Color(204,204,204));
            this.jbtInicio.setColorPressed(new Color(204,204,204));
            
            this.jbtReportes.setColorNormal(new Color(239,238,244));
            this.jbtReportes.setColorHover(new Color(204,204,204));
            this.jbtReportes.setColorPressed(new Color(204,204,204));
            
            this.jbtUsuarios.setColorNormal(new Color(239,238,244));
            this.jbtUsuarios.setColorHover(new Color(204,204,204));
            this.jbtUsuarios.setColorPressed(new Color(204,204,204));

        }else{
            this.jbtHistorial.setColorNormal(new Color(239,238,244));
            this.jbtHistorial.setColorHover(new Color(204,204,204));
            this.jbtHistorial.setColorPressed(new Color(204,204,204));
        }
    }//GEN-LAST:event_jbtHistorialActionPerformed

    private void jbtHistorialMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jbtHistorialMousePressed
        this.jbtInicio.setSelected(false);
        this.jbtHistorial.setSelected(true);
        this.jbtReportes.setSelected(false);
    }//GEN-LAST:event_jbtHistorialMousePressed

    private void jbtInicioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtInicioActionPerformed
        new CambiarPanel(pnlPrincipal, new upt.edu.mx.paneles.jpnlInicio());
        if(this.jbtInicio.isSelected()){
                this.jbtInicio.setColorNormal(new Color(204,204,204));
                this.jbtInicio.setColorHover(new Color(204,204,204));
                this.jbtInicio.setColorPressed(new Color(204,204,204));

                this.jbtHistorial.setColorNormal(new Color(239,238,244));
                this.jbtHistorial.setColorHover(new Color(204,204,204));
                this.jbtHistorial.setColorPressed(new Color(204,204,204));

                this.jbtReportes.setColorNormal(new Color(239,238,244));
                this.jbtReportes.setColorHover(new Color(204,204,204));
                this.jbtReportes.setColorPressed(new Color(204,204,204));   
                
                this.jbtUsuarios.setColorNormal(new Color(239,238,244));
                this.jbtUsuarios.setColorHover(new Color(204,204,204));
                this.jbtUsuarios.setColorPressed(new Color(204,204,204));
            }else{
                this.jbtInicio.setColorNormal(new Color(239,238,244));
                this.jbtInicio.setColorHover(new Color(204,204,204));
                this.jbtInicio.setColorPressed(new Color(204,204,204));
            }
    }//GEN-LAST:event_jbtInicioActionPerformed

    private void jbtInicioMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jbtInicioMousePressed
        this.jbtInicio.setSelected(true);
        this.jbtHistorial.setSelected(false);
        this.jbtReportes.setSelected(false);
    }//GEN-LAST:event_jbtInicioMousePressed

    private void jbtInicioMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jbtInicioMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_jbtInicioMouseClicked

    private void jbtUsuariosMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jbtUsuariosMousePressed
        // TODO add your handling code here:
    }//GEN-LAST:event_jbtUsuariosMousePressed

    private void jbtUsuariosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtUsuariosActionPerformed
       new CambiarPanel(pnlPrincipal, new upt.edu.mx.paneles.jpnlUsuarios());
            if(this.jbtUsuarios.isSelected()){          
                    this.jbtUsuarios.setColorNormal(new Color(204,204,204));
                    this.jbtUsuarios.setColorHover(new Color(204,204,204));
                    this.jbtUsuarios.setColorPressed(new Color(204,204,204)); 
                    
                    this.jbtHistorial.setColorNormal(new Color(239,238,244));
                    this.jbtHistorial.setColorHover(new Color(204,204,204));
                    this.jbtHistorial.setColorPressed(new Color(204,204,204));

                    this.jbtInicio.setColorNormal(new Color(239,238,244));
                    this.jbtInicio.setColorHover(new Color(204,204,204));
                    this.jbtInicio.setColorPressed(new Color(204,204,204));       
                    
                    this.jbtReportes.setColorNormal(new Color(239,238,244));
                    this.jbtReportes.setColorHover(new Color(204,204,204));
                    this.jbtReportes.setColorPressed(new Color(204,204,204));  
                }else{
                    this.jbtUsuarios.setColorNormal(new Color(239,238,244));
                    this.jbtUsuarios.setColorHover(new Color(204,204,204));
                    this.jbtUsuarios.setColorPressed(new Color(204,204,204)); 
                }
    }//GEN-LAST:event_jbtUsuariosActionPerformed

    /**
     * @param args the command line arguments
     */
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
            java.util.logging.Logger.getLogger(Menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
                    new Menu().setVisible(true);
                } catch (ClassNotFoundException | InstantiationException | IllegalAccessException | UnsupportedLookAndFeelException ex) {
                    Logger.getLogger(Menu.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private app.bolivia.swing.JCTextField jCTextField1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JScrollPane jScrollPane1;
    private upt.edu.mx.rsbuttom.RSButtonMetro jbtHistorial;
    private upt.edu.mx.rsbuttom.RSButtonMetro jbtInicio;
    private upt.edu.mx.rsbuttom.RSButtonMetro jbtReportes;
    private upt.edu.mx.rsbuttom.RSButtonMetro jbtUsuarios;
    private javax.swing.JPanel pnlCentro;
    private javax.swing.JPanel pnlMenu;
    private javax.swing.JPanel pnlPrincipal;
    // End of variables declaration//GEN-END:variables
}