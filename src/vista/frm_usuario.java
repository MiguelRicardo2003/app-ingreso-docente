
package vista;

import javax.swing.JOptionPane;


public class frm_usuario extends javax.swing.JFrame {
    public controlador.Metodos metodos; // Instancia única
    public frm_usuario() {
       
        initComponents();
        txt_docuser.requestFocus();
        this.setLocationRelativeTo(null);
        metodos = new controlador.Metodos(); // Inicializar solo una vez
        metodos.mostrarMunicipio(cmb_municipiouser);
        metodos.mostrarSexo(cmb_sexouser);
        metodos.mostrarRol(cmb_roluser);
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        btn_home1 = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        txt_docuser = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        txt_nomuser = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        txt_apellidouser = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        cmb_sexouser = new javax.swing.JComboBox<>();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        txt_telefonouser = new javax.swing.JTextField();
        btn_buscaruser = new javax.swing.JButton();
        btn_actualizaruser = new javax.swing.JButton();
        btn_eliminaruser = new javax.swing.JButton();
        btn_guardaruser = new javax.swing.JButton();
        fnacimientouser = new com.toedter.calendar.JDateChooser();
        cmb_municipiouser = new javax.swing.JComboBox<>();
        cmb_roluser = new javax.swing.JComboBox<>();
        jLabel10 = new javax.swing.JLabel();
        txt_passuser = new javax.swing.JTextField();
        jButton2 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("POLITECNICO COLOMBIANO JAIME ISAZA CADAVID CENTRO REGIONAL APARTADÓ");
        setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel2.setBackground(new java.awt.Color(0, 108, 52));

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/users.png"))); // NOI18N
        jLabel1.setText("Gestión Usuario");

        btn_home1.setBackground(new java.awt.Color(0, 108, 52));
        btn_home1.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        btn_home1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/home.png"))); // NOI18N
        btn_home1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_home1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addComponent(btn_home1, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(162, 162, 162)
                .addComponent(jLabel1)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(38, 38, 38)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btn_home1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(34, Short.MAX_VALUE))
        );

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel2.setText("Documento:");

        txt_docuser.setFont(new java.awt.Font("Segoe UI", 0, 13)); // NOI18N
        txt_docuser.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_docuserActionPerformed(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel3.setText("Nombre:");

        txt_nomuser.setFont(new java.awt.Font("Segoe UI", 0, 13)); // NOI18N
        txt_nomuser.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_nomuserActionPerformed(evt);
            }
        });

        jLabel4.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel4.setText("Apellido:");

        txt_apellidouser.setFont(new java.awt.Font("Segoe UI", 0, 13)); // NOI18N
        txt_apellidouser.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_apellidouserActionPerformed(evt);
            }
        });

        jLabel5.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel5.setText("Fecha_Nac:");

        jLabel6.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel6.setText("Genero:");

        cmb_sexouser.setFont(new java.awt.Font("Segoe UI", 0, 13)); // NOI18N
        cmb_sexouser.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmb_sexouserActionPerformed(evt);
            }
        });

        jLabel7.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel7.setText("Rol:");

        jLabel8.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel8.setText("Muncipio:");

        jLabel9.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel9.setText("Telefono:");

        txt_telefonouser.setFont(new java.awt.Font("Segoe UI", 0, 13)); // NOI18N
        txt_telefonouser.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_telefonouserActionPerformed(evt);
            }
        });

        btn_buscaruser.setBackground(new java.awt.Color(242, 242, 242));
        btn_buscaruser.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/lupa.png"))); // NOI18N
        btn_buscaruser.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_buscaruserActionPerformed(evt);
            }
        });

        btn_actualizaruser.setBackground(new java.awt.Color(0, 108, 52));
        btn_actualizaruser.setFont(new java.awt.Font("Segoe UI", 1, 15)); // NOI18N
        btn_actualizaruser.setForeground(new java.awt.Color(255, 255, 255));
        btn_actualizaruser.setText("Actualizar");
        btn_actualizaruser.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btn_actualizaruser.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_actualizaruserActionPerformed(evt);
            }
        });

        btn_eliminaruser.setBackground(new java.awt.Color(0, 108, 52));
        btn_eliminaruser.setFont(new java.awt.Font("Segoe UI", 1, 15)); // NOI18N
        btn_eliminaruser.setForeground(new java.awt.Color(255, 255, 255));
        btn_eliminaruser.setText("Eliminar");
        btn_eliminaruser.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btn_eliminaruser.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_eliminaruserActionPerformed(evt);
            }
        });

        btn_guardaruser.setBackground(new java.awt.Color(0, 108, 52));
        btn_guardaruser.setFont(new java.awt.Font("Segoe UI", 1, 15)); // NOI18N
        btn_guardaruser.setForeground(new java.awt.Color(255, 255, 255));
        btn_guardaruser.setText("Guardar");
        btn_guardaruser.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btn_guardaruser.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_guardaruserActionPerformed(evt);
            }
        });

        cmb_municipiouser.setFont(new java.awt.Font("Segoe UI", 0, 13)); // NOI18N
        cmb_municipiouser.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmb_municipiouserActionPerformed(evt);
            }
        });

        cmb_roluser.setFont(new java.awt.Font("Segoe UI", 0, 13)); // NOI18N
        cmb_roluser.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmb_roluserActionPerformed(evt);
            }
        });

        jLabel10.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel10.setText("Contraseña:");

        txt_passuser.setFont(new java.awt.Font("Segoe UI", 0, 13)); // NOI18N
        txt_passuser.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_passuserActionPerformed(evt);
            }
        });

        jButton2.setBackground(new java.awt.Color(153, 153, 153));
        jButton2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/cerrar-sesion.png"))); // NOI18N
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jButton2))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(40, 40, 40)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(6, 6, 6)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jLabel6)
                                    .addComponent(jLabel5))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(fnacimientouser, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addGap(94, 94, 94))
                                    .addComponent(cmb_sexouser, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jLabel2)
                                    .addComponent(jLabel3)
                                    .addComponent(jLabel4))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txt_apellidouser, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(txt_docuser, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(txt_nomuser, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btn_buscaruser, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 49, Short.MAX_VALUE)))
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(20, 20, 20)
                                .addComponent(jLabel8)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(cmb_municipiouser, 0, 170, Short.MAX_VALUE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGap(11, 11, 11)
                                        .addComponent(jLabel10))
                                    .addComponent(jLabel9, javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jLabel7, javax.swing.GroupLayout.Alignment.TRAILING))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(cmb_roluser, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(txt_passuser)
                                    .addComponent(txt_telefonouser))))))
                .addGap(37, 37, 37))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(148, 148, 148)
                .addComponent(btn_eliminaruser, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btn_actualizaruser, javax.swing.GroupLayout.PREFERRED_SIZE, 117, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btn_guardaruser, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(47, 47, 47)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel2)
                                    .addComponent(txt_docuser, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel8)
                                    .addComponent(cmb_municipiouser, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                    .addComponent(btn_buscaruser, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txt_nomuser, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel3)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txt_telefonouser, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel9))))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel4)
                            .addComponent(txt_apellidouser, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(cmb_roluser, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel7))))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel5)
                    .addComponent(fnacimientouser, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(txt_passuser, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel10)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cmb_sexouser, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel6))
                .addGap(65, 65, 65)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btn_actualizaruser, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn_eliminaruser, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn_guardaruser, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButton2)
                .addContainerGap(41, Short.MAX_VALUE))
        );

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 690, 540));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txt_docuserActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_docuserActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_docuserActionPerformed

    private void txt_nomuserActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_nomuserActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_nomuserActionPerformed

    private void txt_apellidouserActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_apellidouserActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_apellidouserActionPerformed

    private void txt_telefonouserActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_telefonouserActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_telefonouserActionPerformed

    private void btn_guardaruserActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_guardaruserActionPerformed
        controlador.Metodos objetoprueba = new controlador.Metodos();
        objetoprueba.fnt_guardarUsuario(txt_docuser, txt_nomuser, txt_apellidouser, fnacimientouser, cmb_sexouser, cmb_roluser, cmb_municipiouser, txt_telefonouser, txt_passuser);
        objetoprueba.fnt_limpiarCamposUser(txt_docuser, txt_nomuser, txt_apellidouser, fnacimientouser, cmb_sexouser, cmb_roluser, cmb_municipiouser, txt_telefonouser,txt_passuser);
    }//GEN-LAST:event_btn_guardaruserActionPerformed

    private void cmb_sexouserActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmb_sexouserActionPerformed
        
    }//GEN-LAST:event_cmb_sexouserActionPerformed

    private void cmb_roluserActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmb_roluserActionPerformed
                
    }//GEN-LAST:event_cmb_roluserActionPerformed

    private void cmb_municipiouserActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmb_municipiouserActionPerformed
        
    }//GEN-LAST:event_cmb_municipiouserActionPerformed

    private void btn_actualizaruserActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_actualizaruserActionPerformed
        controlador.Metodos objetoprueba = new controlador.Metodos();
        objetoprueba.fnt_actualizarUsuario(txt_docuser, txt_nomuser, txt_apellidouser, fnacimientouser, cmb_sexouser, cmb_roluser, cmb_municipiouser, txt_telefonouser,txt_passuser);
        objetoprueba.fnt_limpiarCamposUser(txt_docuser, txt_nomuser, txt_apellidouser, fnacimientouser, cmb_sexouser, cmb_roluser, cmb_municipiouser, txt_telefonouser,txt_passuser);
    }//GEN-LAST:event_btn_actualizaruserActionPerformed

    private void btn_buscaruserActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_buscaruserActionPerformed
        controlador.Metodos objetoprueba = new controlador.Metodos();
        objetoprueba.fnt_buscarUsuario(txt_docuser, txt_nomuser, txt_apellidouser, fnacimientouser, cmb_sexouser, cmb_roluser, cmb_municipiouser, txt_telefonouser, txt_passuser);
    }//GEN-LAST:event_btn_buscaruserActionPerformed

    private void btn_eliminaruserActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_eliminaruserActionPerformed
         controlador.Metodos objetoprueba = new controlador.Metodos();
         int confirmacion = JOptionPane.showConfirmDialog(null, "¿Estás seguro de que deseas eliminar este usuario?", 
                                                     "Confirmar eliminación", JOptionPane.YES_NO_OPTION);;
         if(confirmacion == JOptionPane.YES_OPTION){
             objetoprueba.fnt_eliminarUsuario(txt_docuser);
             objetoprueba.fnt_limpiarCamposUser(txt_docuser, txt_nomuser, txt_apellidouser, fnacimientouser, cmb_sexouser, cmb_roluser, cmb_municipiouser, txt_telefonouser,txt_passuser);
         }
         
    }//GEN-LAST:event_btn_eliminaruserActionPerformed

    private void btn_home1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_home1ActionPerformed
        frm_home ventanaHome = new frm_home();
                    ventanaHome.setVisible(true);
                    this.dispose(); // Cierra la ventana actual
    }//GEN-LAST:event_btn_home1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        frm_login ventanaHome = new frm_login();
        ventanaHome.setVisible(true);
        this.dispose(); // Cierra la ventana actual
    }//GEN-LAST:event_jButton2ActionPerformed

    private void txt_passuserActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_passuserActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_passuserActionPerformed
   
    public static void main(String args[]) {
       
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new frm_usuario().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_actualizaruser;
    private javax.swing.JButton btn_buscaruser;
    private javax.swing.JButton btn_eliminaruser;
    private javax.swing.JButton btn_guardaruser;
    private javax.swing.JButton btn_home1;
    private javax.swing.JComboBox<String> cmb_municipiouser;
    private javax.swing.JComboBox<String> cmb_roluser;
    private javax.swing.JComboBox<String> cmb_sexouser;
    private com.toedter.calendar.JDateChooser fnacimientouser;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JTextField txt_apellidouser;
    private javax.swing.JTextField txt_docuser;
    private javax.swing.JTextField txt_nomuser;
    private javax.swing.JTextField txt_passuser;
    private javax.swing.JTextField txt_telefonouser;
    // End of variables declaration//GEN-END:variables

    
}

