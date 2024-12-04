package vista;

import java.io.FileNotFoundException;
import java.util.logging.Level;
import java.util.logging.Logger;

public class frm_reportes extends javax.swing.JFrame {
  
    public frm_reportes() {
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
        jLabel3 = new javax.swing.JLabel();
        jButton2 = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        btn_generardocente = new javax.swing.JButton();
        btn_generarasignatura = new javax.swing.JButton();
        btn_generarhorario = new javax.swing.JButton();
        btn_generarusuario = new javax.swing.JButton();
        jButton6 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("POLITECNICO COLOMBIANO JAIME ISAZA CADVID CENTRO REGIONAL APARTADÓ");
        setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel2.setBackground(new java.awt.Color(0, 108, 52));

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/asignar.png"))); // NOI18N
        jLabel1.setText("Gestión Reportes");

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
                .addGap(173, 173, 173)
                .addComponent(jLabel1)
                .addContainerGap(191, Short.MAX_VALUE))
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
        jLabel2.setText("Reporte Usuario:");

        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel3.setText("Reporte Docente:");

        jButton2.setBackground(new java.awt.Color(153, 153, 153));
        jButton2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/cerrar-sesion.png"))); // NOI18N
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jLabel5.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel5.setText("Reporte Asignatura:");

        jLabel6.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel6.setText("Reporte Horario:");

        jLabel7.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel7.setText("Reporte Ingreso Diario:");

        btn_generardocente.setBackground(new java.awt.Color(0, 108, 52));
        btn_generardocente.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btn_generardocente.setForeground(new java.awt.Color(255, 255, 255));
        btn_generardocente.setText("Generar");
        btn_generardocente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_generardocenteActionPerformed(evt);
            }
        });

        btn_generarasignatura.setBackground(new java.awt.Color(0, 108, 52));
        btn_generarasignatura.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btn_generarasignatura.setForeground(new java.awt.Color(255, 255, 255));
        btn_generarasignatura.setText("Generar");
        btn_generarasignatura.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_generarasignaturaActionPerformed(evt);
            }
        });

        btn_generarhorario.setBackground(new java.awt.Color(0, 108, 52));
        btn_generarhorario.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btn_generarhorario.setForeground(new java.awt.Color(255, 255, 255));
        btn_generarhorario.setText("Generar");
        btn_generarhorario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_generarhorarioActionPerformed(evt);
            }
        });

        btn_generarusuario.setBackground(new java.awt.Color(0, 108, 52));
        btn_generarusuario.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btn_generarusuario.setForeground(new java.awt.Color(255, 255, 255));
        btn_generarusuario.setText("Generar");
        btn_generarusuario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_generarusuarioActionPerformed(evt);
            }
        });

        jButton6.setBackground(new java.awt.Color(0, 108, 52));
        jButton6.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jButton6.setForeground(new java.awt.Color(255, 255, 255));
        jButton6.setText("Generar");
        jButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton6ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(156, 156, 156)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel3)
                    .addComponent(jLabel2)
                    .addComponent(jLabel5)
                    .addComponent(jLabel6)
                    .addComponent(jLabel7))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btn_generardocente)
                    .addComponent(btn_generarasignatura)
                    .addComponent(btn_generarhorario)
                    .addComponent(btn_generarusuario)
                    .addComponent(jButton6))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jButton2)
                .addGap(46, 46, 46))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(37, 37, 37)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(btn_generarusuario))
                .addGap(12, 12, 12)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(btn_generardocente))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(btn_generarasignatura))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(btn_generarhorario))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(jButton6))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 59, Short.MAX_VALUE)
                .addComponent(jButton2)
                .addGap(29, 29, 29))
        );

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 620, 470));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btn_home2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_home2ActionPerformed
        frm_home ventanaHome = new frm_home();
                    ventanaHome.setVisible(true);
                    this.dispose(); // Cierra la ventana actual
    }//GEN-LAST:event_btn_home2ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        frm_login ventanaHome = new frm_login();
        ventanaHome.setVisible(true);
        this.dispose(); // Cierra la ventana actual
    }//GEN-LAST:event_jButton2ActionPerformed

    private void btn_generarasignaturaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_generarasignaturaActionPerformed
      controlador.Metodos pdf1 = new controlador.Metodos();
      pdf1.fnt_pdfAsignatura();
    }//GEN-LAST:event_btn_generarasignaturaActionPerformed

    private void btn_generarhorarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_generarhorarioActionPerformed
      controlador.Metodos pdf1 = new controlador.Metodos();
      pdf1.fnt_pdfHorario();
    }//GEN-LAST:event_btn_generarhorarioActionPerformed

    private void btn_generarusuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_generarusuarioActionPerformed
      controlador.Metodos pdf1 = new controlador.Metodos();
        try {
            pdf1.fnt_pdfUsuario();
        } catch (FileNotFoundException ex) {
            Logger.getLogger(frm_reportes.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_btn_generarusuarioActionPerformed

    private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton6ActionPerformed
        controlador.Metodos pdf1 = new controlador.Metodos();
      pdf1.fnt_pdfIngresoDiario();
    }//GEN-LAST:event_jButton6ActionPerformed

    private void btn_generardocenteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_generardocenteActionPerformed
      controlador.Metodos pdf1 = new controlador.Metodos();
      pdf1.fnt_pdfDocente();
    }//GEN-LAST:event_btn_generardocenteActionPerformed

    public static void main(String args[]) {
       
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new frm_reportes().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_generarasignatura;
    private javax.swing.JButton btn_generardocente;
    private javax.swing.JButton btn_generarhorario;
    private javax.swing.JButton btn_generarusuario;
    private javax.swing.JButton btn_home2;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton6;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    // End of variables declaration//GEN-END:variables
}
