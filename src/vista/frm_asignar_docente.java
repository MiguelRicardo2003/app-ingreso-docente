package vista;

import controlador.Metodos;
import javax.swing.JOptionPane;

public class frm_asignar_docente extends javax.swing.JFrame {
    controlador.Metodos asignacion = new controlador.Metodos();
    public frm_asignar_docente() {
        initComponents();
         this.setLocationRelativeTo(null);
         asignacion.mostrarDocente(cmb_asignaciondocente);
         asignacion.mostrarHorario(cmb_horarioasignacion, dia);
         asignacion.mostrarAsignatura(cmb_asignaturaasignacion);
         cmb_id_consulta.setVisible(false);
         txt_horarioasignado.setVisible(false);
         btn_actualizarasignacion.setVisible(false);
         btn_eliminarasignacion.setVisible(false);


    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        btn_home2 = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        btn_eliminarasignacion = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        cmb_asignaciondocente = new javax.swing.JComboBox<>();
        cmb_asignaturaasignacion = new javax.swing.JComboBox<>();
        jLabel5 = new javax.swing.JLabel();
        cmb_horarioasignacion = new javax.swing.JComboBox<>();
        btn_guardarasignacion = new javax.swing.JButton();
        btn_actualizarasignacion = new javax.swing.JButton();
        cmb_id_consulta = new javax.swing.JComboBox<>();
        txt_horarioasignado = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        txt_consultadocente = new javax.swing.JTextField();
        btn_buscarasignacion = new javax.swing.JButton();
        dia = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("POLITECNICO COLOMBIANO JAIME ISAZA CADAVID CENTRO REGIONAL APARTADÓ");
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel2.setBackground(new java.awt.Color(0, 108, 52));

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/asignardocente.png"))); // NOI18N
        jLabel1.setText("Asignar Docente");

        btn_home2.setBackground(new java.awt.Color(0, 108, 52));
        btn_home2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/home.png"))); // NOI18N
        btn_home2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_home2ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addGap(37, 37, 37)
                .addComponent(btn_home2)
                .addGap(183, 183, 183)
                .addComponent(jLabel1)
                .addContainerGap(235, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(44, 44, 44)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel1)
                    .addComponent(btn_home2))
                .addContainerGap(40, Short.MAX_VALUE))
        );

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel2.setText("Seleccionar Docente:");

        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel3.setText("Seleccionar Asignatura:");

        btn_eliminarasignacion.setBackground(new java.awt.Color(0, 108, 52));
        btn_eliminarasignacion.setFont(new java.awt.Font("Segoe UI", 1, 15)); // NOI18N
        btn_eliminarasignacion.setForeground(new java.awt.Color(255, 255, 255));
        btn_eliminarasignacion.setText("Eliminar");
        btn_eliminarasignacion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_eliminarasignacionActionPerformed(evt);
            }
        });

        jButton2.setBackground(new java.awt.Color(153, 153, 153));
        jButton2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/cerrar-sesion.png"))); // NOI18N
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        cmb_asignaciondocente.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N

        cmb_asignaturaasignacion.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        cmb_asignaturaasignacion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmb_asignaturaasignacionActionPerformed(evt);
            }
        });

        jLabel5.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel5.setText("Seleccionar Horario");

        cmb_horarioasignacion.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N

        btn_guardarasignacion.setBackground(new java.awt.Color(0, 108, 52));
        btn_guardarasignacion.setFont(new java.awt.Font("Segoe UI", 1, 15)); // NOI18N
        btn_guardarasignacion.setForeground(new java.awt.Color(255, 255, 255));
        btn_guardarasignacion.setText("Guardar");
        btn_guardarasignacion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_guardarasignacionActionPerformed(evt);
            }
        });

        btn_actualizarasignacion.setBackground(new java.awt.Color(0, 108, 52));
        btn_actualizarasignacion.setFont(new java.awt.Font("Segoe UI", 1, 15)); // NOI18N
        btn_actualizarasignacion.setForeground(new java.awt.Color(255, 255, 255));
        btn_actualizarasignacion.setText("Actualizar");
        btn_actualizarasignacion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_actualizarasignacionActionPerformed(evt);
            }
        });

        cmb_id_consulta.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        cmb_id_consulta.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                cmb_id_consultaItemStateChanged(evt);
            }
        });

        txt_horarioasignado.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        txt_horarioasignado.setText("Horarios del Docente:");

        jLabel6.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel6.setText("Consultar Docente:");

        txt_consultadocente.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        txt_consultadocente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_consultadocenteActionPerformed(evt);
            }
        });

        btn_buscarasignacion.setBackground(new java.awt.Color(242, 242, 242));
        btn_buscarasignacion.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/lupa.png"))); // NOI18N
        btn_buscarasignacion.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btn_buscarasignacionMouseClicked(evt);
            }
        });
        btn_buscarasignacion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_buscarasignacionActionPerformed(evt);
            }
        });

        dia.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                diaActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(jButton2)
                        .addGap(68, 68, 68))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel6)
                            .addComponent(jLabel5)
                            .addComponent(jLabel3)
                            .addComponent(jLabel2)
                            .addComponent(txt_horarioasignado))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(btn_eliminarasignacion, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(btn_actualizarasignacion)
                                .addGap(18, 18, 18)
                                .addComponent(btn_guardarasignacion))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(cmb_asignaturaasignacion, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(cmb_id_consulta, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(txt_consultadocente)
                                    .addComponent(cmb_asignaciondocente, javax.swing.GroupLayout.PREFERRED_SIZE, 332, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                        .addComponent(cmb_horarioasignacion, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(dia, javax.swing.GroupLayout.PREFERRED_SIZE, 151, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btn_buscarasignacion)))
                        .addGap(85, 85, 85))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(35, 35, 35)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel6)
                        .addComponent(txt_consultadocente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(btn_buscarasignacion))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txt_horarioasignado)
                    .addComponent(cmb_id_consulta, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(cmb_asignaciondocente, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(cmb_asignaturaasignacion, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(cmb_horarioasignacion, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(dia, javax.swing.GroupLayout.DEFAULT_SIZE, 30, Short.MAX_VALUE))
                .addGap(47, 47, 47)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btn_eliminarasignacion, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn_guardarasignacion, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn_actualizarasignacion, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(41, 41, 41)
                .addComponent(jButton2)
                .addGap(12, 12, 12))
        );

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 670, 550));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btn_home2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_home2ActionPerformed
        frm_home ventanaHome = new frm_home();
                    ventanaHome.setVisible(true);
                    this.dispose(); // Cierra la ventana actual
    }//GEN-LAST:event_btn_home2ActionPerformed

    private void btn_eliminarasignacionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_eliminarasignacionActionPerformed
            controlador.Metodos objetoprueba = new controlador.Metodos();
            if(cmb_id_consulta.getSelectedItem()!=""&&cmb_asignaciondocente.getSelectedItem()!=""&&cmb_asignaturaasignacion.getSelectedItem()!=""&&cmb_horarioasignacion.getSelectedItem()!=""){
            objetoprueba.fnt_Eliminar_Horario_asignado(cmb_id_consulta);
            objetoprueba.fnt_limpiar_campos_Hor_asignado(txt_consultadocente,cmb_id_consulta, cmb_asignaciondocente, cmb_asignaturaasignacion, cmb_horarioasignacion);
            btn_actualizarasignacion.setVisible(false);
            btn_eliminarasignacion.setVisible(false);
            cmb_id_consulta.setVisible(false);
            }else{
             JOptionPane.showMessageDialog(null, "Los campos no pueden estar vacíos","ERROR",JOptionPane.ERROR_MESSAGE);
            }    
    }//GEN-LAST:event_btn_eliminarasignacionActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        frm_login ventanaHome = new frm_login();
        ventanaHome.setVisible(true);
        this.dispose(); // Cierra la ventana actual
    }//GEN-LAST:event_jButton2ActionPerformed

    private void btn_guardarasignacionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_guardarasignacionActionPerformed
        controlador.Metodos objetoprueba = new controlador.Metodos();
        if(cmb_asignaciondocente.getSelectedItem()!=""&&cmb_asignaturaasignacion.getSelectedItem()!=""&&cmb_horarioasignacion.getSelectedItem()!=""){
         objetoprueba.fnt_AsignarHorario(cmb_asignaciondocente, cmb_asignaturaasignacion, cmb_horarioasignacion);
        }else{
            JOptionPane.showMessageDialog(null, "Ninguno de los campos puede estar vacío","ERROR",JOptionPane.ERROR_MESSAGE);
        }

    }//GEN-LAST:event_btn_guardarasignacionActionPerformed

    private void btn_actualizarasignacionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_actualizarasignacionActionPerformed
       controlador.Metodos objetoPrueba = new controlador.Metodos();
       if(cmb_id_consulta.getSelectedItem()!=""&&cmb_asignaciondocente.getSelectedItem()!=""&&cmb_asignaturaasignacion.getSelectedItem()!=""&&cmb_horarioasignacion.getSelectedItem()!=""){
       objetoPrueba.fnt_Actualizar_Horario(cmb_id_consulta, cmb_asignaturaasignacion, cmb_horarioasignacion);
       btn_actualizarasignacion.setVisible(false);
       btn_eliminarasignacion.setVisible(false);
       cmb_id_consulta.setVisible(false);
      objetoPrueba.fnt_limpiar_campos_Hor_asignado(txt_consultadocente, cmb_id_consulta, cmb_asignaciondocente, cmb_asignaturaasignacion, cmb_horarioasignacion);
      JOptionPane.showMessageDialog(null, "Se ha actualziado correctamente!");
       }else{
           JOptionPane.showMessageDialog(null, "Los campos no pueden estar vacíos","ERROR",JOptionPane.ERROR_MESSAGE);
       }
    }//GEN-LAST:event_btn_actualizarasignacionActionPerformed

    private void btn_buscarasignacionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_buscarasignacionActionPerformed
   
    }//GEN-LAST:event_btn_buscarasignacionActionPerformed

    private void btn_buscarasignacionMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_buscarasignacionMouseClicked
         if (txt_consultadocente.getText().isEmpty()) {
        JOptionPane.showMessageDialog( null,"Favor ingresar el documento del Docente a buscar","Campo Vacío",JOptionPane.WARNING_MESSAGE);  
        }
        cmb_id_consulta.removeAllItems();
        controlador.Metodos objetoPrueba = new controlador.Metodos();
        objetoPrueba.fnt_buscar_docente_asinarH(cmb_id_consulta,cmb_asignaciondocente, cmb_asignaturaasignacion, cmb_horarioasignacion, Integer.parseInt(txt_consultadocente.getText()));
        
        cmb_id_consulta.setVisible(true);
        txt_horarioasignado.setVisible(true);
        btn_actualizarasignacion.setVisible(true);
        btn_eliminarasignacion.setVisible(true);

    }//GEN-LAST:event_btn_buscarasignacionMouseClicked

    private void cmb_id_consultaItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_cmb_id_consultaItemStateChanged
        controlador.Metodos objetoPrueba = new controlador.Metodos();
       String objeto = (String) cmb_id_consulta.getSelectedItem();
       objetoPrueba.fnt_seleccion_Horario(objeto, cmb_asignaciondocente, cmb_asignaturaasignacion, cmb_horarioasignacion);
    }//GEN-LAST:event_cmb_id_consultaItemStateChanged

    private void cmb_asignaturaasignacionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmb_asignaturaasignacionActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cmb_asignaturaasignacionActionPerformed

    private void diaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_diaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_diaActionPerformed

    private void txt_consultadocenteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_consultadocenteActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_consultadocenteActionPerformed

    public static void main(String args[]) {
       
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new frm_asignar_docente().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_actualizarasignacion;
    private javax.swing.JButton btn_buscarasignacion;
    private javax.swing.JButton btn_eliminarasignacion;
    private javax.swing.JButton btn_guardarasignacion;
    private javax.swing.JButton btn_home2;
    private javax.swing.JComboBox<String> cmb_asignaciondocente;
    private javax.swing.JComboBox<String> cmb_asignaturaasignacion;
    private javax.swing.JComboBox<String> cmb_horarioasignacion;
    private javax.swing.JComboBox<String> cmb_id_consulta;
    private javax.swing.JTextField dia;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JTextField txt_consultadocente;
    private javax.swing.JLabel txt_horarioasignado;
    // End of variables declaration//GEN-END:variables
}
