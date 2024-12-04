package vista;

import controlador.Metodos;
import javax.swing.JOptionPane;

public class frm_salon extends javax.swing.JFrame {

    
    public frm_salon() {
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
        jPanel3 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        txt_id_salon = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        txt_descripcionsalon = new javax.swing.JTextField();
        btn_guardarsalon = new javax.swing.JButton();
        btn_eliminarsalon = new javax.swing.JButton();
        btn_actaulizarsalon = new javax.swing.JButton();
        btn_buscarsalon = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("POLITECNICO COLOMBIANO JAIME ISAZA CADAVID CENTRO REGIONAL APARTADÓ");
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel2.setBackground(new java.awt.Color(0, 108, 52));

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/salon.png"))); // NOI18N
        jLabel1.setText("Gestión Salón");

        btn_home2.setBackground(new java.awt.Color(0, 108, 52));
        btn_home2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/home.png"))); // NOI18N
        btn_home2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_home2ActionPerformed(evt);
            }
        });

        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addGap(37, 37, 37)
                .addComponent(btn_home2)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 454, Short.MAX_VALUE)
                        .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(71, 71, 71))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(164, 164, 164)
                        .addComponent(jLabel1)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(49, 49, 49)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btn_home2)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(7, 7, 7)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel1))))
                .addContainerGap(33, Short.MAX_VALUE))
        );

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel2.setText("Id_Salón:");

        txt_id_salon.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N

        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel3.setText("Descripción:");

        txt_descripcionsalon.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N

        btn_guardarsalon.setBackground(new java.awt.Color(0, 108, 52));
        btn_guardarsalon.setFont(new java.awt.Font("Segoe UI", 1, 15)); // NOI18N
        btn_guardarsalon.setForeground(new java.awt.Color(255, 255, 255));
        btn_guardarsalon.setText("Guardar");
        btn_guardarsalon.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_guardarsalonActionPerformed(evt);
            }
        });

        btn_eliminarsalon.setBackground(new java.awt.Color(0, 108, 52));
        btn_eliminarsalon.setFont(new java.awt.Font("Segoe UI", 1, 15)); // NOI18N
        btn_eliminarsalon.setForeground(new java.awt.Color(255, 255, 255));
        btn_eliminarsalon.setText("Eliminar");
        btn_eliminarsalon.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_eliminarsalonActionPerformed(evt);
            }
        });

        btn_actaulizarsalon.setBackground(new java.awt.Color(0, 108, 52));
        btn_actaulizarsalon.setFont(new java.awt.Font("Segoe UI", 1, 15)); // NOI18N
        btn_actaulizarsalon.setForeground(new java.awt.Color(255, 255, 255));
        btn_actaulizarsalon.setText("Actualizar");
        btn_actaulizarsalon.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_actaulizarsalonActionPerformed(evt);
            }
        });

        btn_buscarsalon.setBackground(new java.awt.Color(242, 242, 242));
        btn_buscarsalon.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/lupa.png"))); // NOI18N
        btn_buscarsalon.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_buscarsalonActionPerformed(evt);
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
                .addContainerGap(98, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(jButton2)
                        .addGap(36, 36, 36))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jLabel3)
                                    .addComponent(jLabel2))
                                .addGap(18, 18, 18)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txt_descripcionsalon)
                                    .addComponent(txt_id_salon))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btn_buscarsalon))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(btn_eliminarsalon, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(btn_actaulizarsalon, javax.swing.GroupLayout.PREFERRED_SIZE, 109, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(btn_guardarsalon, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(157, 157, 157))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(54, 54, 54)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btn_buscarsalon, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel2)
                        .addComponent(txt_id_salon, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(txt_descripcionsalon, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 133, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btn_eliminarsalon, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn_actaulizarsalon, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn_guardarsalon, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jButton2)
                .addGap(35, 35, 35))
        );

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 600, 500));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btn_home2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_home2ActionPerformed
        frm_home ventanaHome = new frm_home();
                    ventanaHome.setVisible(true);
                    this.dispose(); // Cierra la ventana actual
    }//GEN-LAST:event_btn_home2ActionPerformed

    private void btn_guardarsalonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_guardarsalonActionPerformed
        controlador.Metodos objetoprueba = new controlador.Metodos();
         if (txt_id_salon.getText().isEmpty() || txt_descripcionsalon.getText().isEmpty()) {
        JOptionPane.showMessageDialog( null,"Favor llenar todos los campos","Campos Vacío",JOptionPane.WARNING_MESSAGE);  
    }else{
          objetoprueba.fnt_guardarSalon(txt_id_salon, txt_descripcionsalon);
           objetoprueba.fnt_limpiarCampossalon(txt_id_salon, txt_descripcionsalon);
         }  
    }//GEN-LAST:event_btn_guardarsalonActionPerformed

    private void btn_buscarsalonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_buscarsalonActionPerformed
        controlador.Metodos objetoprueba = new controlador.Metodos();
         if (txt_id_salon.getText().isEmpty()) {
        JOptionPane.showMessageDialog( null,"Favor ingresar el Id a buscar","Campo Vacío",JOptionPane.WARNING_MESSAGE);  
        }else{
          objetoprueba.fnt_buscarSalon(txt_id_salon, txt_descripcionsalon);
         }  
    }//GEN-LAST:event_btn_buscarsalonActionPerformed

    private void btn_actaulizarsalonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_actaulizarsalonActionPerformed
          controlador.Metodos objetoprueba = new controlador.Metodos();
          objetoprueba.fnt_actualizarSalon(txt_id_salon, txt_descripcionsalon);
          objetoprueba.fnt_limpiarCampossalon(txt_id_salon, txt_descripcionsalon);
    }//GEN-LAST:event_btn_actaulizarsalonActionPerformed

    private void btn_eliminarsalonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_eliminarsalonActionPerformed
       controlador.Metodos objetoprueba = new controlador.Metodos();
       int confirmacion = JOptionPane.showConfirmDialog(null, "¿Estás seguro de que deseas eliminar este Salón?", 
                                                     "Confirmar eliminación", JOptionPane.YES_NO_OPTION);
         if(confirmacion == JOptionPane.YES_OPTION){
             objetoprueba.fnt_eliminarSalon(txt_id_salon);
             objetoprueba.fnt_limpiarCampossalon(txt_id_salon, txt_descripcionsalon);
         }    
    }//GEN-LAST:event_btn_eliminarsalonActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        frm_login ventanaHome = new frm_login();
        ventanaHome.setVisible(true);
        this.dispose(); // Cierra la ventana actual
    }//GEN-LAST:event_jButton2ActionPerformed

    public static void main(String args[]) {
       
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new frm_salon().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_actaulizarsalon;
    private javax.swing.JButton btn_buscarsalon;
    private javax.swing.JButton btn_eliminarsalon;
    private javax.swing.JButton btn_guardarsalon;
    private javax.swing.JButton btn_home2;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JTextField txt_descripcionsalon;
    private javax.swing.JTextField txt_id_salon;
    // End of variables declaration//GEN-END:variables
}
