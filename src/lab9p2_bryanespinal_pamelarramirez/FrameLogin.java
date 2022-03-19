/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab9p2_bryanespinal_pamelarramirez;

import java.sql.* ;
import java.util.ArrayList;
import javax.swing.* ;
import javax.swing.table.DefaultTableModel;
public class FrameLogin extends javax.swing.JFrame {
DatosSistema ds= new DatosSistema();
adminAlumnos ad=new adminAlumnos(".//Alumnos.cbm");
String nomAdmin = "admin", passAdmin = "admin1234";
String nomma = "profe", pasadm = "profe123";
String nomalum = "alum", pasalum = "alum123";
    /**
     * Creates new form FrameLogin
     */
    public FrameLogin() {
        initComponents();
        this.setLocationRelativeTo(null);
        jLabel8.setVisible(false);
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        FrameRegistro = new javax.swing.JFrame();
        jPanel3 = new javax.swing.JPanel();
        jPanel4 = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        contra1 = new javax.swing.JTextField();
        usu = new javax.swing.JTextField();
        contra2 = new javax.swing.JTextField();
        nombre = new javax.swing.JTextField();
        jButton3 = new javax.swing.JButton();
        jLabel9 = new javax.swing.JLabel();
        id = new javax.swing.JTextField();
        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        contrasenia = new javax.swing.JTextField();
        usuario = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jLabel8 = new javax.swing.JLabel();

        FrameRegistro.setSize(new java.awt.Dimension(592, 560));

        jPanel3.setBackground(new java.awt.Color(204, 255, 255));
        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel4.setBackground(new java.awt.Color(255, 255, 255));
        jPanel4.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel4.setFont(new java.awt.Font("Roboto", 3, 17)); // NOI18N
        jLabel4.setText("Usuario");
        jPanel4.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 90, -1, -1));

        jLabel5.setFont(new java.awt.Font("Roboto", 3, 17)); // NOI18N
        jLabel5.setText("Nombre completo");
        jPanel4.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 10, -1, -1));

        jLabel6.setFont(new java.awt.Font("Roboto", 3, 17)); // NOI18N
        jLabel6.setText("Confirme Contraseña");
        jPanel4.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 250, -1, -1));

        jLabel7.setFont(new java.awt.Font("Roboto", 3, 17)); // NOI18N
        jLabel7.setText("Contraseña");
        jPanel4.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 170, -1, -1));

        contra1.setBackground(new java.awt.Color(204, 255, 255));
        jPanel4.add(contra1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 200, 439, 30));

        usu.setBackground(new java.awt.Color(204, 255, 255));
        jPanel4.add(usu, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 120, 439, 30));

        contra2.setBackground(new java.awt.Color(204, 255, 255));
        contra2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                contra2ActionPerformed(evt);
            }
        });
        jPanel4.add(contra2, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 280, 439, 30));

        nombre.setBackground(new java.awt.Color(204, 255, 255));
        jPanel4.add(nombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 40, 439, 30));

        jButton3.setBackground(new java.awt.Color(204, 255, 255));
        jButton3.setText("Registrar");
        jButton3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton3MouseClicked(evt);
            }
        });
        jPanel4.add(jButton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(403, 423, 90, 40));

        jLabel9.setFont(new java.awt.Font("Roboto", 3, 17)); // NOI18N
        jLabel9.setText("Id");
        jPanel4.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 330, -1, -1));

        id.setBackground(new java.awt.Color(204, 255, 255));
        id.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                idActionPerformed(evt);
            }
        });
        jPanel4.add(id, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 360, 439, 30));

        jPanel3.add(jPanel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 30, 512, 472));

        javax.swing.GroupLayout FrameRegistroLayout = new javax.swing.GroupLayout(FrameRegistro.getContentPane());
        FrameRegistro.getContentPane().setLayout(FrameRegistroLayout);
        FrameRegistroLayout.setHorizontalGroup(
            FrameRegistroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, 608, Short.MAX_VALUE)
        );
        FrameRegistroLayout.setVerticalGroup(
            FrameRegistroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, 541, Short.MAX_VALUE)
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.DO_NOTHING_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(204, 255, 255));

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Roboto", 3, 36)); // NOI18N
        jLabel1.setText("Login");
        jPanel2.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(164, 11, -1, -1));

        jLabel2.setFont(new java.awt.Font("Roboto", 3, 15)); // NOI18N
        jLabel2.setText("Contraseña");
        jPanel2.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 210, -1, -1));

        jLabel3.setFont(new java.awt.Font("Roboto", 3, 15)); // NOI18N
        jLabel3.setText("Usuario");
        jPanel2.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 110, -1, -1));

        contrasenia.setBackground(new java.awt.Color(204, 255, 255));
        jPanel2.add(contrasenia, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 240, 330, 30));

        usuario.setBackground(new java.awt.Color(204, 255, 255));
        jPanel2.add(usuario, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 140, 330, 30));

        jButton1.setBackground(new java.awt.Color(204, 255, 255));
        jButton1.setText("Registrase");
        jButton1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton1MouseClicked(evt);
            }
        });
        jPanel2.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 370, 90, 40));

        jButton2.setBackground(new java.awt.Color(204, 255, 255));
        jButton2.setText("Login");
        jButton2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton2MouseClicked(evt);
            }
        });
        jPanel2.add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(293, 373, 90, 40));

        jLabel8.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 51, 51));
        jLabel8.setText("Usuario O Contraseña incorrecta");
        jPanel2.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 290, 210, -1));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(50, 50, 50)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, 437, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(59, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(39, 39, 39)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, 444, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(41, Short.MAX_VALUE))
        );

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

    private void jButton1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton1MouseClicked
        this.setVisible(false);
        FrameRegistro.setLocationRelativeTo(null);
        FrameRegistro.setVisible(true);
    }//GEN-LAST:event_jButton1MouseClicked

    private void jButton3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton3MouseClicked
        try {
            if (contra1.getText().equals(contra2.getText())) {
                ad.cargarArchivo();
                ad.addAlumno(new Alumno(nombre.getText(), usuario.getText(), contra1.getText(), id.getText()));
                JOptionPane.showMessageDialog(this, "Usuario Creado Exitosamente");
            }else{
                JOptionPane.showMessageDialog(this, "Las Contraseñas con considen verifique esten iguales");
            }
        } catch (Exception e) {
        }
        FrameRegistro.setVisible(false);
        this.setLocationRelativeTo(null);
        this.setVisible(true);
    }//GEN-LAST:event_jButton3MouseClicked

    private void contra2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_contra2ActionPerformed
        
    }//GEN-LAST:event_contra2ActionPerformed

    private void jButton2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton2MouseClicked

        if (usuario.getText().equals(nomAdmin)&&contrasenia.getText().equals(passAdmin)) {
            this.setVisible(false);
            FrameAdmin ad=new FrameAdmin();
            ad.setVisible(true);
        }else{
            if (usuario.getText().equals(nomma)&&contrasenia.getText().equals(pasadm)) {
                this.setVisible(false);
                FrameMaestro ad=new FrameMaestro();
                ad.setVisible(true);
            }else{
                if (usuario.getText().equals(nomalum)&&contrasenia.getText().equals(pasalum)) {
                    this.setVisible(false);
                    FrameAlumno ad=new FrameAlumno();
                    ad.setVisible(true);
                }
            }
        }
        
        
    }//GEN-LAST:event_jButton2MouseClicked

    private void idActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_idActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_idActionPerformed

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
            java.util.logging.Logger.getLogger(FrameLogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FrameLogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FrameLogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FrameLogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FrameLogin().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JFrame FrameRegistro;
    private javax.swing.JTextField contra1;
    private javax.swing.JTextField contra2;
    private javax.swing.JTextField contrasenia;
    private javax.swing.JTextField id;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
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
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JTextField nombre;
    private javax.swing.JTextField usu;
    private javax.swing.JTextField usuario;
    // End of variables declaration//GEN-END:variables
}
