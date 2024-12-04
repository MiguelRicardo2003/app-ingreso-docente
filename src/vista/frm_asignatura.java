package vista;

import controlador.Metodos;
import javax.swing.JOptionPane;

public class frm_asignatura extends javax.swing.JFrame {

    
    public frm_asignatura() {
        initComponents();
         this.setLocationRelativeTo(null);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        btn_home2 = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        txt_id_asignatura = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        txt_descripcionasig = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        txt_codigoasignatura = new javax.swing.JTextField();
        btn_guardarasig = new javax.swing.JButton();
        btn_eliminarasig = new javax.swing.JButton();
        btn_actaulizarasig = new javax.swing.JButton();
        btn_buscarasig = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("POLITECNICO COLOMBIANO JAIME ISAZA CADAVID CENTRO REGIONAL APARTADÓ");
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel2.setBackground(new java.awt.Color(0, 108, 52));

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/horario.png"))); // NOI18N
        jLabel1.setText("Gestión Asignaturas");

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
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
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
        jLabel2.setText("Id_Asignatura:");

        txt_id_asignatura.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N

        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel3.setText("Descripción:");

        txt_descripcionasig.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N

        jLabel4.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel4.setText("Codigó:");

        txt_codigoasignatura.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N

        btn_guardarasig.setBackground(new java.awt.Color(0, 108, 52));
        btn_guardarasig.setFont(new java.awt.Font("Segoe UI", 1, 15)); // NOI18N
        btn_guardarasig.setForeground(new java.awt.Color(255, 255, 255));
        btn_guardarasig.setText("Guardar");
        btn_guardarasig.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_guardarasigActionPerformed(evt);
            }
        });

        btn_eliminarasig.setBackground(new java.awt.Color(0, 108, 52));
        btn_eliminarasig.setFont(new java.awt.Font("Segoe UI", 1, 15)); // NOI18N
        btn_eliminarasig.setForeground(new java.awt.Color(255, 255, 255));
        btn_eliminarasig.setText("Eliminar");
        btn_eliminarasig.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_eliminarasigActionPerformed(evt);
            }
        });

        btn_actaulizarasig.setBackground(new java.awt.Color(0, 108, 52));
        btn_actaulizarasig.setFont(new java.awt.Font("Segoe UI", 1, 15)); // NOI18N
        btn_actaulizarasig.setForeground(new java.awt.Color(255, 255, 255));
        btn_actaulizarasig.setText("Actualizar");
        btn_actaulizarasig.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_actaulizarasigActionPerformed(evt);
            }
        });

        btn_buscarasig.setBackground(new java.awt.Color(242, 242, 242));
        btn_buscarasig.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/lupa.png"))); // NOI18N
        btn_buscarasig.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_buscarasigActionPerformed(evt);
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
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel3)
                    .addComponent(jLabel2))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txt_descripcionasig, javax.swing.GroupLayout.DEFAULT_SIZE, 226, Short.MAX_VALUE)
                    .addComponent(txt_id_asignatura))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btn_buscarasig)
                .addGap(26, 26, 26)
                .addComponent(jLabel4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txt_codigoasignatura, javax.swing.GroupLayout.PREFERRED_SIZE, 190, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(25, 25, 25))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jButton2)
                .addGap(40, 40, 40))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(158, 158, 158)
                .addComponent(btn_eliminarasig, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btn_actaulizarasig, javax.swing.GroupLayout.PREFERRED_SIZE, 109, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btn_guardarasig, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(39, 39, 39)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btn_buscarasig, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel2)
                        .addComponent(txt_id_asignatura, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel4)
                        .addComponent(txt_codigoasignatura, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(txt_descripcionasig, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 102, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btn_eliminarasig, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn_actaulizarasig, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn_guardarasig, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(71, 71, 71)
                .addComponent(jButton2)
                .addGap(26, 26, 26))
        );

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 700, 500));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btn_home2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_home2ActionPerformed
        frm_home ventanaHome = new frm_home();
                    ventanaHome.setVisible(true);
                    this.dispose(); // Cierra la ventana actual
    }//GEN-LAST:event_btn_home2ActionPerformed

    private void btn_guardarasigActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_guardarasigActionPerformed
        controlador.Metodos objetoprueba = new controlador.Metodos();
         if (txt_id_asignatura.getText().isEmpty() || txt_descripcionasig.getText().isEmpty() || txt_codigoasignatura.getText().isEmpty()) {
        JOptionPane.showMessageDialog( null,"Favor llenar todos los campos","Campos Vacío",JOptionPane.WARNING_MESSAGE);  
    }else{
          objetoprueba.fnt_guardarAsignatura(txt_id_asignatura, txt_descripcionasig, txt_codigoasignatura);  
           objetoprueba.fnt_limpiarCamposasignatura(txt_id_asignatura, txt_descripcionasig, txt_codigoasignatura);     
         }  
    }//GEN-LAST:event_btn_guardarasigActionPerformed

    private void btn_buscarasigActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_buscarasigActionPerformed
        controlador.Metodos objetoprueba = new controlador.Metodos();
         if (txt_id_asignatura.getText().isEmpty()) {
        JOptionPane.showMessageDialog( null,"Favor ingresar el Id a buscar","Campo Vacío",JOptionPane.WARNING_MESSAGE);  
        }else{
          objetoprueba.fnt_buscarAsignatura(txt_id_asignatura, txt_descripcionasig, txt_codigoasignatura);       
         }  
    }//GEN-LAST:event_btn_buscarasigActionPerformed

    private void btn_actaulizarasigActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_actaulizarasigActionPerformed
          controlador.Metodos objetoprueba = new controlador.Metodos();
          objetoprueba.fnt_actualizarAsignatura(txt_id_asignatura, txt_descripcionasig, txt_codigoasignatura);   
          objetoprueba.fnt_limpiarCamposasignatura(txt_id_asignatura, txt_descripcionasig, txt_codigoasignatura);
    }//GEN-LAST:event_btn_actaulizarasigActionPerformed

    private void btn_eliminarasigActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_eliminarasigActionPerformed
       controlador.Metodos objetoprueba = new controlador.Metodos();
       int confirmacion = JOptionPane.showConfirmDialog(null, "¿Estás seguro de que deseas eliminar esta Asignatura?", 
                                                     "Confirmar eliminación", JOptionPane.YES_NO_OPTION);
         if(confirmacion == JOptionPane.YES_OPTION){
             objetoprueba.fnt_eliminarAsignatura(txt_id_asignatura);
             objetoprueba.fnt_limpiarCamposasignatura(txt_id_asignatura, txt_descripcionasig, txt_codigoasignatura);
         }    
    }//GEN-LAST:event_btn_eliminarasigActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        frm_login ventanaHome = new frm_login();
        ventanaHome.setVisible(true);
        this.dispose(); // Cierra la ventana actual
    }//GEN-LAST:event_jButton2ActionPerformed

    public static void main(String args[]) {
       
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new frm_asignatura().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_actaulizarasig;
    private javax.swing.JButton btn_buscarasig;
    private javax.swing.JButton btn_eliminarasig;
    private javax.swing.JButton btn_guardarasig;
    private javax.swing.JButton btn_home2;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JTextField txt_codigoasignatura;
    private javax.swing.JTextField txt_descripcionasig;
    private javax.swing.JTextField txt_id_asignatura;
    // End of variables declaration//GEN-END:variables
}
