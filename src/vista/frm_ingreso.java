package vista;

import controlador.Metodos;
import java.awt.HeadlessException;
import java.text.ParseException;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class frm_ingreso extends javax.swing.JFrame {
    
    public frm_ingreso() {
        initComponents();
        this.setLocationRelativeTo(null);
        controlador.Metodos fecha = new controlador.Metodos();
        fecha.fnt_fechaActual(txt_fecha);
        fecha.fnt_horaActual(txt_horaentrada);
        txt_iddocente1.requestFocus();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        txt_fecha = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        txt_nombredocente = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        txt_iddocente1 = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        txt_horaentrada = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        txt_horasalida = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        btn_buscardoc1 = new javax.swing.JButton();
        txt_observacion = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        tbl_ingreso = new javax.swing.JTable();
        btn_confirmaringreso = new javax.swing.JButton();
        cmb_asignaturafrm = new javax.swing.JComboBox<>();
        jButton1 = new javax.swing.JButton();
        btn_actualizaringreso = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("POLITECNICO COLOMBIANO JAIME ISAZA CADAVID CENTRO REGIONAL APARTADÓ");
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel2.setBackground(new java.awt.Color(0, 108, 52));

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("CONTROL ASISTENCIA DOCENTE");

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Sede:  Apartadó Centro Regional Urabá");

        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Fecha:");

        txt_fecha.setBackground(new java.awt.Color(204, 255, 255));
        txt_fecha.setFont(new java.awt.Font("Segoe UI", 1, 13)); // NOI18N

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(58, 58, 58)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txt_fecha, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(69, 69, 69))
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(256, 256, 256)
                .addComponent(jLabel1)
                .addContainerGap(262, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap(23, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jLabel3)
                    .addComponent(txt_fecha, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(20, 20, 20))
        );

        jLabel4.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel4.setText("Id_Docente:");

        txt_nombredocente.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N

        jLabel5.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel5.setText("Nombre:");

        txt_iddocente1.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N

        jLabel6.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel6.setText("Hora Entrada:");

        jLabel7.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel7.setText("Asignatura:");

        txt_horaentrada.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N

        jLabel8.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel8.setText("Hora Salida:");

        txt_horasalida.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N

        jLabel9.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel9.setText("Observación:");

        btn_buscardoc1.setBackground(new java.awt.Color(242, 242, 242));
        btn_buscardoc1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/lupa.png"))); // NOI18N
        btn_buscardoc1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_buscardoc1ActionPerformed(evt);
            }
        });

        txt_observacion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_observacionActionPerformed(evt);
            }
        });

        tbl_ingreso.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {},
                {},
                {},
                {},
                {},
                {},
                {},
                {}
            },
            new String [] {

            }
        ));
        tbl_ingreso.setAutoResizeMode(javax.swing.JTable.AUTO_RESIZE_ALL_COLUMNS);
        jScrollPane1.setViewportView(tbl_ingreso);

        btn_confirmaringreso.setBackground(new java.awt.Color(0, 108, 52));
        btn_confirmaringreso.setFont(new java.awt.Font("Segoe UI", 1, 15)); // NOI18N
        btn_confirmaringreso.setForeground(new java.awt.Color(255, 255, 255));
        btn_confirmaringreso.setText("Registrar Ingreso");
        btn_confirmaringreso.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btn_confirmaringreso.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_confirmaringresoActionPerformed(evt);
            }
        });

        cmb_asignaturafrm.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N

        jButton1.setBackground(new java.awt.Color(153, 153, 153));
        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/cerrar-sesion.png"))); // NOI18N
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        btn_actualizaringreso.setBackground(new java.awt.Color(0, 108, 52));
        btn_actualizaringreso.setFont(new java.awt.Font("Segoe UI", 1, 15)); // NOI18N
        btn_actualizaringreso.setForeground(new java.awt.Color(255, 255, 255));
        btn_actualizaringreso.setText("Actualizar Ingreso");
        btn_actualizaringreso.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btn_actualizaringreso.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_actualizaringresoActionPerformed(evt);
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
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(btn_actualizaringreso)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btn_confirmaringreso)
                        .addGap(146, 146, 146)
                        .addComponent(jButton1))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(53, 53, 53)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel5)
                            .addComponent(jLabel4)
                            .addComponent(jLabel7)
                            .addComponent(jLabel9))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 584, Short.MAX_VALUE)
                            .addComponent(txt_observacion)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addComponent(cmb_asignaturafrm, javax.swing.GroupLayout.Alignment.LEADING, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(txt_nombredocente, javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txt_iddocente1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 230, Short.MAX_VALUE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(btn_buscardoc1)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(jLabel6))
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                        .addGap(0, 0, Short.MAX_VALUE)
                                        .addComponent(jLabel8)))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(txt_horasalida, javax.swing.GroupLayout.DEFAULT_SIZE, 182, Short.MAX_VALUE)
                                    .addComponent(txt_horaentrada))
                                .addGap(1, 1, 1)))))
                .addGap(69, 69, 69))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(39, 39, 39)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(txt_horaentrada, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(11, 11, 11)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txt_horasalida, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel8)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(jLabel4)
                                .addComponent(txt_iddocente1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(btn_buscardoc1))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel5)
                            .addComponent(txt_nombredocente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel7)
                            .addComponent(cmb_asignaturafrm, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(jLabel6))
                .addGap(19, 19, 19)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel9)
                    .addComponent(txt_observacion, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 52, Short.MAX_VALUE)
                        .addComponent(jButton1)
                        .addGap(16, 16, 16))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btn_confirmaringreso, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btn_actualizaringreso, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, 560));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txt_observacionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_observacionActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_observacionActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        frm_login ventanaHome = new frm_login();
        ventanaHome.setVisible(true);
        this.dispose(); // Cierra la ventana actual
    }//GEN-LAST:event_jButton1ActionPerformed

    private void btn_buscardoc1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_buscardoc1ActionPerformed
        controlador.Metodos objetoprueba = new controlador.Metodos();
         try {
                String documento = txt_iddocente1.getText();
                    if (documento.isEmpty()) {JOptionPane.showMessageDialog(null, "Por favor ingrese el documento del docente.");return;   
                    }
                    Metodos.buscarDocentePorDocumento(documento, txt_nombredocente, cmb_asignaturafrm,txt_horaentrada, txt_horasalida);                                                
            } catch (HeadlessException ex) {
                    JOptionPane.showMessageDialog(null, "Error en la búsqueda: " + ex.getMessage());
            }           
    }//GEN-LAST:event_btn_buscardoc1ActionPerformed

    private void btn_confirmaringresoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_confirmaringresoActionPerformed
        controlador.Metodos objetoprueba = new controlador.Metodos();
                try {
                    String documento = txt_iddocente1.getText();
                    String asignatura = (String) cmb_asignaturafrm.getSelectedItem();
                    String horaEntrada = txt_horaentrada.getText();
                    String horaSalida = txt_horasalida.getText();
                    String observacion = txt_observacion.getText();  
                    String fecha = txt_fecha.getText(); 
                    
                    if (documento.isEmpty() || asignatura.isEmpty() || horaEntrada.isEmpty()|| fecha.isEmpty()) {
                        JOptionPane.showMessageDialog(null, "Por favor complete todos los campos.");
                        return;
                    }
            try {
                Metodos.guardarRegistro(documento, asignatura, horaEntrada, horaSalida, observacion, fecha);
                
            } catch (ParseException ex) {
                Logger.getLogger(frm_ingreso.class.getName()).log(Level.SEVERE, null, ex);
            }
                    DefaultTableModel modelo = new DefaultTableModel();
                    modelo.addColumn("ID Registro");
                    modelo.addColumn("Nombre Docente");
                    modelo.addColumn("Nombre Asignatura");
                    modelo.addColumn("Fecha");
                    modelo.addColumn("Hora Llegada");
                    modelo.addColumn("Hora Salida");
                    modelo.addColumn("Nombre Usuario");
                    modelo.addColumn("Observación");
                    objetoprueba.llenarTablaRegistros(tbl_ingreso);  
                    Metodos.limpiarCamposRegistro(txt_iddocente1, txt_horaentrada, txt_horasalida, txt_observacion, txt_fecha,cmb_asignaturafrm,txt_nombredocente);
                } catch (HeadlessException ex) {
                    JOptionPane.showMessageDialog(null, "Error al guardar el registro: " + ex.getMessage());
                }
                controlador.Metodos fecha = new controlador.Metodos();
                fecha.fnt_fechaActual(txt_fecha);
        fecha.fnt_horaActual(txt_horaentrada);
        txt_iddocente1.requestFocus();
    }//GEN-LAST:event_btn_confirmaringresoActionPerformed

    private void btn_actualizaringresoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_actualizaringresoActionPerformed
controlador.Metodos objetoprueba = new controlador.Metodos();
DefaultTableModel modelo = (DefaultTableModel) tbl_ingreso.getModel();

boolean cambiosRealizados = false; // Bandera para verificar si se realizaron cambios

// Recorrer todas las filas de la tabla y actualizar solo el campo hora_salida
for (int i = 0; i < modelo.getRowCount(); i++) {
    int idRegistro = (int) modelo.getValueAt(i, 0);  // ID del registro 
    Date fecha = (Date) modelo.getValueAt(i, 3);      // Fecha del registro
    String horaSalida = (String) modelo.getValueAt(i, 5);  // Hora de salida editada

    // Verificar si el campo hora_salida fue editado y no está vacío
    if (horaSalida != null && !horaSalida.isEmpty()) {
        // Validar si la hora de salida tiene el formato correcto (HH:mm)
        if (horaSalida.matches("\\d{2}:\\d{2}:\\d{2}")) {
            String[] horaMinuto = horaSalida.split(":");
            int hora = Integer.parseInt(horaMinuto[0]);
            int minuto = Integer.parseInt(horaMinuto[1]);

            // Validar si la hora está en el rango de 00-23 y los minutos en el rango de 00-59
            if (hora >= 0 && hora <= 23 && minuto >= 0 && minuto <= 59) {
                try {
                    // Actualizar solo el campo hora_salida en la base de datos
                    objetoprueba.actualizarHoraSalida(idRegistro, fecha, horaSalida);
                    cambiosRealizados = true;  // Si al menos un registro fue actualizado, marcamos la bandera
                } catch (Exception e) {
                    // Manejo de excepciones en caso de que algo falle en la actualización
                    JOptionPane.showMessageDialog(null, "Error al actualizar el registro con ID " + idRegistro + ": " + e.getMessage());
                }
            } else {
                // Mostrar mensaje si la hora o los minutos no están en el rango correcto
                JOptionPane.showMessageDialog(null, "La hora de salida en la fila " + (i + 1) + " no es válida. Asegúrese de que la hora esté entre 00 y 23 y los minutos entre 00 y 59.");
                return;  // Detener la operación si algún valor no es válido
            }
        } else {
            // Mostrar mensaje si la hora de salida no tiene el formato adecuado
           // JOptionPane.showMessageDialog(null, "La hora de salida en la fila " + (i + 1) + " no tiene el formato adecuado. Por favor use el formato HH:mm.");
            return;  // Detener la operación si el formato no es válido
        }
    }
}

// Confirmación de cambios
if (cambiosRealizados) {
    JOptionPane.showMessageDialog(null, "Los cambios en la hora de salida han sido actualizados.");
} else {
    JOptionPane.showMessageDialog(null, "No se realizaron cambios en la hora de salida.");
}

    }//GEN-LAST:event_btn_actualizaringresoActionPerformed
     

    public static void main(String args[]) {
        
        java.awt.EventQueue.invokeLater(() -> {
            new frm_ingreso().setVisible(true);
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_actualizaringreso;
    private javax.swing.JButton btn_buscardoc1;
    private javax.swing.JButton btn_confirmaringreso;
    private javax.swing.JComboBox<String> cmb_asignaturafrm;
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
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tbl_ingreso;
    private javax.swing.JTextField txt_fecha;
    private javax.swing.JTextField txt_horaentrada;
    private javax.swing.JTextField txt_horasalida;
    private javax.swing.JTextField txt_iddocente1;
    private javax.swing.JTextField txt_nombredocente;
    private javax.swing.JTextField txt_observacion;
    // End of variables declaration//GEN-END:variables
}

