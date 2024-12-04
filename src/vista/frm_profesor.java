
package vista;

import javax.swing.JOptionPane;


public class frm_profesor extends javax.swing.JFrame {
    public controlador.Metodos metodos; // Instancia única
    public frm_profesor() {
       
        initComponents();
        txt_docdoc.requestFocus();
        this.setLocationRelativeTo(null);
        metodos = new controlador.Metodos(); // Inicializar solo una vez
        metodos.mostrarMunicipio(cmb_municipiodoc);
        metodos.mostrarSexo(cmb_sexo);
        metodos.mostrarProfesion(cmb_profesion);
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        btn_home1 = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        txt_docdoc = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        txt_nomdoc = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        txt_apellidoc = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        cmb_sexo = new javax.swing.JComboBox<>();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        txt_telefono = new javax.swing.JTextField();
        btn_buscardoc = new javax.swing.JButton();
        btn_actualizardoc = new javax.swing.JButton();
        btn_eliminardoc = new javax.swing.JButton();
        btn_guardardoc = new javax.swing.JButton();
        fnacimiento = new com.toedter.calendar.JDateChooser();
        cmb_municipiodoc = new javax.swing.JComboBox<>();
        cmb_profesion = new javax.swing.JComboBox<>();
        jButton1 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("POLITECNICO COLOMBIANO JAIME ISAZA CADAVID CENTRO REGIONAL APARTADÓ");
        setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel2.setBackground(new java.awt.Color(0, 108, 52));

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/users.png"))); // NOI18N
        jLabel1.setText("Gestión Docente");

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

        txt_docdoc.setFont(new java.awt.Font("Segoe UI", 0, 13)); // NOI18N
        txt_docdoc.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_docdocActionPerformed(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel3.setText("Nombre:");

        txt_nomdoc.setFont(new java.awt.Font("Segoe UI", 0, 13)); // NOI18N
        txt_nomdoc.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_nomdocActionPerformed(evt);
            }
        });

        jLabel4.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel4.setText("Apellido:");

        txt_apellidoc.setFont(new java.awt.Font("Segoe UI", 0, 13)); // NOI18N
        txt_apellidoc.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_apellidocActionPerformed(evt);
            }
        });

        jLabel5.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel5.setText("Fecha_Nac:");

        jLabel6.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel6.setText("Genero:");

        cmb_sexo.setFont(new java.awt.Font("Segoe UI", 0, 13)); // NOI18N
        cmb_sexo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmb_sexoActionPerformed(evt);
            }
        });

        jLabel7.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel7.setText("Profesión:");

        jLabel8.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel8.setText("Muncipio:");

        jLabel9.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel9.setText("Telefono:");

        txt_telefono.setFont(new java.awt.Font("Segoe UI", 0, 13)); // NOI18N
        txt_telefono.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_telefonoActionPerformed(evt);
            }
        });

        btn_buscardoc.setBackground(new java.awt.Color(242, 242, 242));
        btn_buscardoc.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/lupa.png"))); // NOI18N
        btn_buscardoc.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_buscardocActionPerformed(evt);
            }
        });

        btn_actualizardoc.setBackground(new java.awt.Color(0, 108, 52));
        btn_actualizardoc.setFont(new java.awt.Font("Segoe UI", 1, 15)); // NOI18N
        btn_actualizardoc.setForeground(new java.awt.Color(255, 255, 255));
        btn_actualizardoc.setText("Actualizar");
        btn_actualizardoc.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_actualizardocActionPerformed(evt);
            }
        });

        btn_eliminardoc.setBackground(new java.awt.Color(0, 108, 52));
        btn_eliminardoc.setFont(new java.awt.Font("Segoe UI", 1, 15)); // NOI18N
        btn_eliminardoc.setForeground(new java.awt.Color(255, 255, 255));
        btn_eliminardoc.setText("Eliminar");
        btn_eliminardoc.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_eliminardocActionPerformed(evt);
            }
        });

        btn_guardardoc.setBackground(new java.awt.Color(0, 108, 52));
        btn_guardardoc.setFont(new java.awt.Font("Segoe UI", 1, 15)); // NOI18N
        btn_guardardoc.setForeground(new java.awt.Color(255, 255, 255));
        btn_guardardoc.setText("Guardar");
        btn_guardardoc.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_guardardocActionPerformed(evt);
            }
        });

        cmb_municipiodoc.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        cmb_municipiodoc.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmb_municipiodocActionPerformed(evt);
            }
        });

        cmb_profesion.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        cmb_profesion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmb_profesionActionPerformed(evt);
            }
        });

        jButton1.setBackground(new java.awt.Color(153, 153, 153));
        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/cerrar-sesion.png"))); // NOI18N
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
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
                                .addComponent(fnacimiento, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGap(94, 94, 94))
                            .addComponent(cmb_sexo, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel2)
                            .addComponent(jLabel3)
                            .addComponent(jLabel4))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txt_apellidoc, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(txt_docdoc, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(txt_nomdoc, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btn_buscardoc, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 54, Short.MAX_VALUE)))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(23, 23, 23)
                        .addComponent(jLabel9)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txt_telefono))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel8)
                            .addComponent(jLabel7))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(cmb_profesion, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(cmb_municipiodoc, 0, 175, Short.MAX_VALUE))))
                .addGap(37, 37, 37))
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(150, 150, 150)
                .addComponent(btn_eliminardoc, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btn_actualizardoc, javax.swing.GroupLayout.PREFERRED_SIZE, 117, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btn_guardardoc, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jButton1)
                .addGap(55, 55, 55))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(47, 47, 47)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel2)
                            .addComponent(txt_docdoc, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel7)
                            .addComponent(cmb_profesion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGap(167, 167, 167)
                        .addComponent(btn_buscardoc, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel3)
                            .addComponent(txt_nomdoc, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel4)
                            .addComponent(txt_apellidoc, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel8)
                            .addComponent(cmb_municipiodoc, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel9)
                            .addComponent(txt_telefono, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel5)
                    .addComponent(fnacimiento, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(22, 22, 22)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(cmb_sexo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(81, 81, 81)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btn_actualizardoc, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn_eliminardoc, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn_guardardoc, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 8, Short.MAX_VALUE)
                .addComponent(jButton1)
                .addGap(31, 31, 31))
        );

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 700, 560));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txt_docdocActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_docdocActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_docdocActionPerformed

    private void txt_nomdocActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_nomdocActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_nomdocActionPerformed

    private void txt_apellidocActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_apellidocActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_apellidocActionPerformed

    private void txt_telefonoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_telefonoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_telefonoActionPerformed

    private void btn_guardardocActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_guardardocActionPerformed
        controlador.Metodos objetoprueba = new controlador.Metodos();
        objetoprueba.fnt_guardarDocente(txt_docdoc, txt_nomdoc, txt_apellidoc, fnacimiento, cmb_sexo, cmb_profesion, cmb_municipiodoc, txt_telefono);
        objetoprueba.fnt_limpiarCamposDocente(txt_docdoc, txt_nomdoc, txt_apellidoc, fnacimiento, cmb_sexo, cmb_profesion, cmb_municipiodoc, txt_telefono);
    }//GEN-LAST:event_btn_guardardocActionPerformed

    private void cmb_sexoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmb_sexoActionPerformed
        
    }//GEN-LAST:event_cmb_sexoActionPerformed

    private void cmb_profesionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmb_profesionActionPerformed
                // TODO add your handling code here:
    }//GEN-LAST:event_cmb_profesionActionPerformed

    private void cmb_municipiodocActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmb_municipiodocActionPerformed
         // TODO add your handling code here:
    }//GEN-LAST:event_cmb_municipiodocActionPerformed

    private void btn_actualizardocActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_actualizardocActionPerformed
        controlador.Metodos objetoprueba = new controlador.Metodos();
        objetoprueba.fnt_actualizarDocente(txt_docdoc, txt_nomdoc, txt_apellidoc, fnacimiento, cmb_sexo, cmb_profesion, cmb_municipiodoc, txt_telefono);
        objetoprueba.fnt_limpiarCamposDocente(txt_docdoc, txt_nomdoc, txt_apellidoc, fnacimiento, cmb_sexo, cmb_profesion, cmb_municipiodoc, txt_telefono);
    }//GEN-LAST:event_btn_actualizardocActionPerformed

    private void btn_buscardocActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_buscardocActionPerformed
        controlador.Metodos objetoprueba = new controlador.Metodos();
        if (txt_docdoc.getText().isEmpty()) {
        JOptionPane.showMessageDialog( null,"Favor ingresar el documento del Docente a buscar","Campo Vacío",JOptionPane.WARNING_MESSAGE);  
        }else{
         objetoprueba.fnt_buscarDocente(txt_docdoc, txt_nomdoc, txt_apellidoc, fnacimiento, cmb_sexo, cmb_profesion, cmb_municipiodoc, txt_telefono);     
         }   
    }//GEN-LAST:event_btn_buscardocActionPerformed

    private void btn_eliminardocActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_eliminardocActionPerformed
         controlador.Metodos objetoprueba = new controlador.Metodos();
         int confirmacion = JOptionPane.showConfirmDialog(null, "¿Estás seguro de que deseas eliminar este docente?", 
                                                     "Confirmar eliminación", JOptionPane.YES_NO_OPTION);;
         if(confirmacion == JOptionPane.YES_OPTION){
             objetoprueba.fnt_eliminarDocente(txt_docdoc);
             objetoprueba.fnt_limpiarCamposDocente(txt_docdoc, txt_nomdoc, txt_apellidoc, fnacimiento, cmb_sexo, cmb_profesion, cmb_municipiodoc, txt_telefono);
         }
         
    }//GEN-LAST:event_btn_eliminardocActionPerformed

    private void btn_home1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_home1ActionPerformed
        frm_home ventanaHome = new frm_home();
                    ventanaHome.setVisible(true);
                    this.dispose(); // Cierra la ventana actual
    }//GEN-LAST:event_btn_home1ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        frm_login ventanaHome = new frm_login();
        ventanaHome.setVisible(true);
        this.dispose(); // Cierra la ventana actual
    }//GEN-LAST:event_jButton1ActionPerformed
   
    public static void main(String args[]) {
       
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new frm_profesor().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_actualizardoc;
    private javax.swing.JButton btn_buscardoc;
    private javax.swing.JButton btn_eliminardoc;
    private javax.swing.JButton btn_guardardoc;
    private javax.swing.JButton btn_home1;
    private javax.swing.JComboBox<String> cmb_municipiodoc;
    private javax.swing.JComboBox<String> cmb_profesion;
    private javax.swing.JComboBox<String> cmb_sexo;
    private com.toedter.calendar.JDateChooser fnacimiento;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
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
    private javax.swing.JTextField txt_apellidoc;
    private javax.swing.JTextField txt_docdoc;
    private javax.swing.JTextField txt_nomdoc;
    private javax.swing.JTextField txt_telefono;
    // End of variables declaration//GEN-END:variables

    
}

