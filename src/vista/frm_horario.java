package vista;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import javax.swing.JFormattedTextField;
import javax.swing.JOptionPane;

public class frm_horario extends javax.swing.JFrame {

    
    public frm_horario() {
        initComponents();
         this.setLocationRelativeTo(null);
        controlador.Metodos salon = new controlador.Metodos();
        salon.mostrarSalon(cmb_salonhor);
         salon.rellenar_dia_sem(cmb_dia_sem);
        try {
        java.text.SimpleDateFormat formatoHora = new java.text.SimpleDateFormat("H:mm:ss");
        javax.swing.text.DefaultFormatterFactory factory = new javax.swing.text.DefaultFormatterFactory(
            new javax.swing.text.DateFormatter(formatoHora)
        );
        txt_horainicio.setFormatterFactory(factory);
        txt_horafin.setFormatterFactory(factory);
        txt_horainicio.setValue(new Date()); // Hora actual
        txt_horafin.setValue(new Date());
        txt_horainicio.setColumns(8);
        txt_horafin.setColumns(8);

    } catch (Exception ex) {
        JOptionPane.showMessageDialog(null, "Error al configurar el formato de hora: " + ex.getMessage());
}

    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        btn_home2 = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        txt_id_hor = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        txt_descripcionhor = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        cmb_salonhor = new javax.swing.JComboBox<>();
        btn_guardarhor = new javax.swing.JButton();
        btn_eliminarhor = new javax.swing.JButton();
        btn_actaulizarhor = new javax.swing.JButton();
        btn_buscarhor = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        txt_horainicio = new javax.swing.JFormattedTextField();
        txt_horafin = new javax.swing.JFormattedTextField();
        jLabel7 = new javax.swing.JLabel();
        cmb_dia_sem = new javax.swing.JComboBox<>();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("POLITECNICO COLOMBIANO JAIME ISAZA CADAVID CENTRO REGIONAL APARTADÓ");
        getContentPane().setLayout(new java.awt.GridBagLayout());

        jPanel2.setBackground(new java.awt.Color(0, 108, 52));

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/horario.png"))); // NOI18N
        jLabel1.setText("Gestión Horarios");

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
                .addGap(197, 197, 197)
                .addComponent(jLabel1)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(44, 44, 44)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(btn_home2)
                    .addComponent(jLabel1))
                .addContainerGap(44, Short.MAX_VALUE))
        );

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel2.setText("Id_Horario:");

        txt_id_hor.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N

        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel3.setText("Descripción:");

        txt_descripcionhor.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N

        jLabel4.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel4.setText("Hora_Inicio:");

        jLabel5.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel5.setText("Salón:");

        jLabel6.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel6.setText("Hora_Fin:");

        cmb_salonhor.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        cmb_salonhor.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Seleccione el salón", "A41", "A42", "A43" }));

        btn_guardarhor.setBackground(new java.awt.Color(0, 108, 52));
        btn_guardarhor.setFont(new java.awt.Font("Segoe UI", 1, 15)); // NOI18N
        btn_guardarhor.setForeground(new java.awt.Color(255, 255, 255));
        btn_guardarhor.setText("Guardar");
        btn_guardarhor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_guardarhorActionPerformed(evt);
            }
        });

        btn_eliminarhor.setBackground(new java.awt.Color(0, 108, 52));
        btn_eliminarhor.setFont(new java.awt.Font("Segoe UI", 1, 15)); // NOI18N
        btn_eliminarhor.setForeground(new java.awt.Color(255, 255, 255));
        btn_eliminarhor.setText("Eliminar");
        btn_eliminarhor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_eliminarhorActionPerformed(evt);
            }
        });

        btn_actaulizarhor.setBackground(new java.awt.Color(0, 108, 52));
        btn_actaulizarhor.setFont(new java.awt.Font("Segoe UI", 1, 15)); // NOI18N
        btn_actaulizarhor.setForeground(new java.awt.Color(255, 255, 255));
        btn_actaulizarhor.setText("Actualizar");
        btn_actaulizarhor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_actaulizarhorActionPerformed(evt);
            }
        });

        btn_buscarhor.setBackground(new java.awt.Color(242, 242, 242));
        btn_buscarhor.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/lupa.png"))); // NOI18N
        btn_buscarhor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_buscarhorActionPerformed(evt);
            }
        });

        jButton1.setBackground(new java.awt.Color(153, 153, 153));
        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/cerrar-sesion.png"))); // NOI18N
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        txt_horainicio.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.DateFormatter(new java.text.SimpleDateFormat("h:mm:ss "))));
        txt_horainicio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_horainicioActionPerformed(evt);
            }
        });

        txt_horafin.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.DateFormatter(new java.text.SimpleDateFormat("hh:mm"))));

        jLabel7.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel7.setText("Dia_Semana:");

        cmb_dia_sem.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btn_eliminarhor, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btn_actaulizarhor, javax.swing.GroupLayout.PREFERRED_SIZE, 129, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btn_guardarhor, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(29, 29, 29)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel5)
                            .addComponent(jLabel2)
                            .addComponent(jLabel3))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(txt_descripcionhor)
                            .addComponent(txt_id_hor)
                            .addComponent(cmb_salonhor, 0, 194, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btn_buscarhor)
                        .addGap(61, 61, 61)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel4)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jLabel7)
                                .addComponent(jLabel6)))
                        .addGap(0, 7, Short.MAX_VALUE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(txt_horainicio, javax.swing.GroupLayout.DEFAULT_SIZE, 175, Short.MAX_VALUE)
                            .addComponent(txt_horafin))
                        .addContainerGap())
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(jButton1)
                        .addGap(63, 63, 63))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(cmb_dia_sem, 0, 175, Short.MAX_VALUE)
                        .addContainerGap())))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(57, 57, 57)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txt_id_hor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel4)
                            .addComponent(btn_buscarhor)
                            .addComponent(txt_horainicio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txt_descripcionhor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel3)
                            .addComponent(txt_horafin, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel6)))
                    .addComponent(jLabel2))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel5)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(cmb_salonhor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel7)
                        .addComponent(cmb_dia_sem, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 59, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(jButton1)
                        .addGap(20, 20, 20))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btn_eliminarhor, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btn_actaulizarhor, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btn_guardarhor, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(54, 54, 54))))
        );

        getContentPane().add(jPanel1, new java.awt.GridBagConstraints());

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btn_home2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_home2ActionPerformed
        frm_home ventanaHome = new frm_home();
                    ventanaHome.setVisible(true);
                    this.dispose(); // Cierra la ventana actual
    }//GEN-LAST:event_btn_home2ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        frm_login ventanaHome = new frm_login();
        ventanaHome.setVisible(true);
        this.dispose(); // Cierra la ventana actual
    }//GEN-LAST:event_jButton1ActionPerformed
    private boolean validarHora(String hora) {
    try {
        SimpleDateFormat sdf = new SimpleDateFormat("H:mm:ss");
        sdf.setLenient(false); // Hace la validación más estricta
        sdf.parse(hora);
        return true;
    } catch (ParseException e) {
        return false;
    }
}
    private void btn_guardarhorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_guardarhorActionPerformed
        controlador.Metodos objetoprueba = new controlador.Metodos();
    
    // Validar campos vacíos
        if (txt_id_hor.getText().isEmpty() || 
            txt_descripcionhor.getText().isEmpty() || 
            txt_horainicio.getText().trim().isEmpty() || 
            txt_horafin.getText().trim().isEmpty()) {

            JOptionPane.showMessageDialog(null,
                "Favor llenar todos los campos",
                "Campo Vacío",
                JOptionPane.WARNING_MESSAGE);  
            return;
        }
        if (!validarHora(txt_horainicio.getText()) || !validarHora(txt_horafin.getText())) {
            JOptionPane.showMessageDialog(null,
                "El formato de hora debe ser H:MM:SS",
                "Formato de hora inválido",
                JOptionPane.WARNING_MESSAGE);
            return;
        }
        try {
            SimpleDateFormat sdf = new SimpleDateFormat("H:mm:ss");
            Date horaInicio = sdf.parse(txt_horainicio.getText());
            Date horaFin = sdf.parse(txt_horafin.getText());
            if (horaFin.before(horaInicio)) {
                JOptionPane.showMessageDialog(null,"La hora de fin debe ser posterior a la hora de inicio","Error en las horas",JOptionPane.WARNING_MESSAGE);return;}
            String horaInicio24 = sdf.format(horaInicio);
            String horaFin24 = sdf.format(horaFin);
            objetoprueba.fnt_guardarHorario(txt_id_hor, txt_descripcionhor,cmb_salonhor, new JFormattedTextField(horaInicio24),new JFormattedTextField(horaFin24),cmb_dia_sem);                                  
            objetoprueba.limpiarCamposHorario(txt_id_hor, txt_descripcionhor, cmb_salonhor, txt_horainicio, txt_horafin);
        } catch (ParseException ex) {
            JOptionPane.showMessageDialog(null, "Error al procesar las horas: " + ex.getMessage(), "Error",JOptionPane.ERROR_MESSAGE);       
        }

    }//GEN-LAST:event_btn_guardarhorActionPerformed

    private void btn_buscarhorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_buscarhorActionPerformed
       if (txt_id_hor.getText().trim().isEmpty()) {
        JOptionPane.showMessageDialog(null, 
            "Por favor ingrese un ID para buscar",
            "Campo vacío",
            JOptionPane.WARNING_MESSAGE);
        return;
    }
    controlador.Metodos objetoMetodos = new controlador.Metodos();
    objetoMetodos.fnt_buscarHorario(txt_id_hor, txt_descripcionhor, cmb_salonhor, 
                                   txt_horainicio, txt_horafin,cmb_dia_sem);
    }//GEN-LAST:event_btn_buscarhorActionPerformed

    private void btn_actaulizarhorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_actaulizarhorActionPerformed
        controlador.Metodos objetoMetodos = new controlador.Metodos();
    objetoMetodos.fnt_actualizarHorario(txt_id_hor, txt_descripcionhor, cmb_salonhor, 
                                   txt_horainicio, txt_horafin,cmb_dia_sem);
    objetoMetodos.limpiarCamposHorario(txt_id_hor, txt_descripcionhor, cmb_salonhor, txt_horainicio, txt_horafin);

    }//GEN-LAST:event_btn_actaulizarhorActionPerformed

    private void btn_eliminarhorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_eliminarhorActionPerformed
        controlador.Metodos objetoprueba = new controlador.Metodos();
         int confirmacion = JOptionPane.showConfirmDialog(null, "¿Estás seguro de que deseas eliminar este horario?", 
                                                     "Confirmar eliminación", JOptionPane.YES_NO_OPTION);
         if(confirmacion == JOptionPane.YES_OPTION){
             objetoprueba.fnt_eliminarHorario(txt_id_hor);
         }
         objetoprueba.limpiarCamposHorario(txt_id_hor, txt_descripcionhor, cmb_salonhor, txt_horainicio, txt_horafin);
    }//GEN-LAST:event_btn_eliminarhorActionPerformed

    private void txt_horainicioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_horainicioActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_horainicioActionPerformed

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
            java.util.logging.Logger.getLogger(frm_horario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(frm_horario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(frm_horario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(frm_horario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            @Override
            public void run() {
                new frm_horario().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_actaulizarhor;
    private javax.swing.JButton btn_buscarhor;
    private javax.swing.JButton btn_eliminarhor;
    private javax.swing.JButton btn_guardarhor;
    private javax.swing.JButton btn_home2;
    private javax.swing.JComboBox<String> cmb_dia_sem;
    private javax.swing.JComboBox<String> cmb_salonhor;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JTextField txt_descripcionhor;
    private javax.swing.JFormattedTextField txt_horafin;
    private javax.swing.JFormattedTextField txt_horainicio;
    private javax.swing.JTextField txt_id_hor;
    // End of variables declaration//GEN-END:variables
}
