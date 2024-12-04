package vista;

public class frm_home extends javax.swing.JFrame {

    public frm_home() {
        initComponents();
        this.setLocationRelativeTo(null);
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        btn_reporte = new javax.swing.JButton();
        btn_crearusuario = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        btn_creardocente = new javax.swing.JButton();
        btn_crearasignatura = new javax.swing.JButton();
        btn_crearhorario = new javax.swing.JButton();
        btn_asignardocente = new javax.swing.JButton();
        btn_crearsalon = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        panelprincipal = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("POLITECNICO COLOMBIANO JAIME ISAZA CADAVID CENTRO REGIONAL APARTADÓ");
        setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btn_reporte.setBackground(new java.awt.Color(0, 108, 52));
        btn_reporte.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btn_reporte.setForeground(new java.awt.Color(255, 255, 255));
        btn_reporte.setText("Ver Reportes");
        btn_reporte.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_reporteActionPerformed(evt);
            }
        });

        btn_crearusuario.setBackground(new java.awt.Color(0, 108, 52));
        btn_crearusuario.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btn_crearusuario.setForeground(new java.awt.Color(255, 255, 255));
        btn_crearusuario.setText("Crear Usuario");
        btn_crearusuario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_crearusuarioActionPerformed(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel2.setText("INGRESAR A");

        btn_creardocente.setBackground(new java.awt.Color(0, 108, 52));
        btn_creardocente.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btn_creardocente.setForeground(new java.awt.Color(255, 255, 255));
        btn_creardocente.setText("Crear Docente");
        btn_creardocente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_creardocenteActionPerformed(evt);
            }
        });

        btn_crearasignatura.setBackground(new java.awt.Color(0, 108, 52));
        btn_crearasignatura.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btn_crearasignatura.setForeground(new java.awt.Color(255, 255, 255));
        btn_crearasignatura.setText("Crear Asignatura");
        btn_crearasignatura.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_crearasignaturaActionPerformed(evt);
            }
        });

        btn_crearhorario.setBackground(new java.awt.Color(0, 108, 52));
        btn_crearhorario.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btn_crearhorario.setForeground(new java.awt.Color(255, 255, 255));
        btn_crearhorario.setText("Crear Horario");
        btn_crearhorario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_crearhorarioActionPerformed(evt);
            }
        });

        btn_asignardocente.setBackground(new java.awt.Color(0, 108, 52));
        btn_asignardocente.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btn_asignardocente.setForeground(new java.awt.Color(255, 255, 255));
        btn_asignardocente.setText("Asignar Docente");
        btn_asignardocente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_asignardocenteActionPerformed(evt);
            }
        });

        btn_crearsalon.setBackground(new java.awt.Color(0, 108, 52));
        btn_crearsalon.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btn_crearsalon.setForeground(new java.awt.Color(255, 255, 255));
        btn_crearsalon.setText("Crear Salón");
        btn_crearsalon.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_crearsalonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(btn_creardocente)
                .addGap(18, 18, 18)
                .addComponent(btn_crearasignatura)
                .addGap(18, 18, 18)
                .addComponent(btn_crearhorario)
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2)
                    .addComponent(btn_crearusuario))
                .addGap(18, 18, 18)
                .addComponent(btn_asignardocente)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 15, Short.MAX_VALUE)
                .addComponent(btn_crearsalon)
                .addGap(18, 18, 18)
                .addComponent(btn_reporte)
                .addGap(25, 25, 25))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btn_reporte, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn_creardocente, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn_crearasignatura, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn_crearusuario, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn_crearhorario, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn_asignardocente, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn_crearsalon, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(17, Short.MAX_VALUE))
        );

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 230, 1030, 100));

        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/cerrar-sesion.png"))); // NOI18N
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(940, 470, -1, -1));

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 108, 52));
        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/user2.png"))); // NOI18N
        jLabel1.setText("ADMINISTRADOR");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(415, 415, 415)
                .addComponent(jLabel1)
                .addContainerGap(425, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addComponent(jLabel1)
                .addContainerGap(14, Short.MAX_VALUE))
        );

        getContentPane().add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1030, 60));

        panelprincipal.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/poli uraba.jpg"))); // NOI18N
        getContentPane().add(panelprincipal, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1030, 540));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btn_reporteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_reporteActionPerformed
        frm_reportes ventanaHome = new frm_reportes();
                    ventanaHome.setVisible(true);
                    this.dispose(); // Cierra la ventana actual
    }//GEN-LAST:event_btn_reporteActionPerformed

    private void btn_creardocenteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_creardocenteActionPerformed
        frm_profesor ventanaHome = new frm_profesor();
                    ventanaHome.setVisible(true);
                    this.dispose(); // Cierra la ventana de login
    }//GEN-LAST:event_btn_creardocenteActionPerformed

    private void btn_crearasignaturaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_crearasignaturaActionPerformed
        frm_asignatura ventanaHome = new frm_asignatura();
                    ventanaHome.setVisible(true);
                    this.dispose(); // Cierra la ventana de login
    }//GEN-LAST:event_btn_crearasignaturaActionPerformed

    private void btn_crearhorarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_crearhorarioActionPerformed
        frm_horario ventanaHome = new frm_horario();
                    ventanaHome.setVisible(true);
                    this.dispose(); // Cierra la ventana actual
    }//GEN-LAST:event_btn_crearhorarioActionPerformed

    private void btn_crearusuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_crearusuarioActionPerformed
        frm_usuario ventanaHome = new frm_usuario();
                    ventanaHome.setVisible(true);
                    this.dispose(); // Cierra la ventana de login
    }//GEN-LAST:event_btn_crearusuarioActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        frm_login ventanaHome = new frm_login();
        ventanaHome.setVisible(true);
        this.dispose(); // Cierra la ventana actual
    }//GEN-LAST:event_jButton1ActionPerformed

    private void btn_asignardocenteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_asignardocenteActionPerformed
         frm_asignar_docente ventanaHome = new frm_asignar_docente();
                    ventanaHome.setVisible(true);
                    this.dispose(); // Cierra la ventana de login
    }//GEN-LAST:event_btn_asignardocenteActionPerformed

    private void btn_crearsalonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_crearsalonActionPerformed
        frm_salon ventanaHome = new frm_salon();
                    ventanaHome.setVisible(true);
                    this.dispose(); // Cierra la ventana de login
    }//GEN-LAST:event_btn_crearsalonActionPerformed

    public static void main(String args[]) {
     
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new frm_home().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_asignardocente;
    private javax.swing.JButton btn_crearasignatura;
    private javax.swing.JButton btn_creardocente;
    private javax.swing.JButton btn_crearhorario;
    private javax.swing.JButton btn_crearsalon;
    private javax.swing.JButton btn_crearusuario;
    private javax.swing.JButton btn_reporte;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    public javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JLabel panelprincipal;
    // End of variables declaration//GEN-END:variables
}
