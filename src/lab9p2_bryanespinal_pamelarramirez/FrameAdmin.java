package lab9p2_bryanespinal_pamelarramirez;

import java.sql.*;
import java.util.ArrayList;
import javax.swing.*;
import javax.swing.table.DefaultTableModel;

public class FrameAdmin extends javax.swing.JFrame {
    DatosSistema ds = new DatosSistema();

    public FrameAdmin() {
        initComponents();
        this.setLocationRelativeTo(null);
        try {
            ds.cargarDatos();
        } catch (Exception e) {
        }
    }
    
    public void limpiarTab1() {
        txtNombre.setText(null);
        txtUsuario.setText(null);
        txtPass.setText(null);
        txtId.setText(null);
    }
    
    public void limpiarTab2() {
        txtClase.setText(null);
        txtExamen1.setText(null);
        txtExamen2.setText(null);
        try {
            ds.cargarUsuarios();
        } catch (Exception e) {
        }
    }
    
    public void limpiarTab3() {
        try {
            ds.cargarClases();
        } catch (Exception e) {
        }
    }
    
    public void validarPreguntas(Examen examen, Pregunta pregunta) {
        if (examen.getPreguntas().size() < 6) {
            examen.getPreguntas().add(pregunta);
        }
        else {
            JOptionPane.showMessageDialog(this, "No puede agregar mas de 5 preguntas al examen.");
        }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btnGroupResp = new javax.swing.ButtonGroup();
        jTabbedPane1 = new javax.swing.JTabbedPane();
        jPanel4 = new javax.swing.JPanel();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        txtNombre = new javax.swing.JTextField();
        jLabel15 = new javax.swing.JLabel();
        txtUsuario = new javax.swing.JTextField();
        jLabel16 = new javax.swing.JLabel();
        txtPass = new javax.swing.JTextField();
        jLabel17 = new javax.swing.JLabel();
        txtId = new javax.swing.JTextField();
        btnGuardar = new javax.swing.JButton();
        jLabel18 = new javax.swing.JLabel();
        cboTipoUsuario = new javax.swing.JComboBox<>();
        jPanel1 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        txtClase = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        txtExamen1 = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        txtExamen2 = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        cboMaestros = new javax.swing.JComboBox<>();
        btnGuardarClase = new javax.swing.JButton();
        jPanel3 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        txtPregunta = new javax.swing.JTextArea();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        rbtnTrue = new javax.swing.JRadioButton();
        rbtnFalse = new javax.swing.JRadioButton();
        jLabel8 = new javax.swing.JLabel();
        btnGuardarPregunta = new javax.swing.JButton();
        jLabel9 = new javax.swing.JLabel();
        cboExamen = new javax.swing.JComboBox<>();
        jLabel10 = new javax.swing.JLabel();
        cboClases = new javax.swing.JComboBox<>();
        jPanel2 = new javax.swing.JPanel();
        jLabel11 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        tablaNotas = new javax.swing.JTable();
        jLabel12 = new javax.swing.JLabel();
        cboClasesNotas = new javax.swing.JComboBox<>();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        jMenuItem1 = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.DO_NOTHING_ON_CLOSE);

        jTabbedPane1.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                jTabbedPane1StateChanged(evt);
            }
        });

        jLabel13.setFont(new java.awt.Font("Helvetica Neue", 1, 18)); // NOI18N
        jLabel13.setText("Administrar usuarios");

        jLabel14.setText("Nombre");

        jLabel15.setText("Nombre de usuario");

        jLabel16.setText("Contrasena");

        jLabel17.setText("Id");

        btnGuardar.setText("Guardar");
        btnGuardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGuardarActionPerformed(evt);
            }
        });

        jLabel18.setText("Tipo de usuario");

        cboTipoUsuario.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "- Seleccionar -", "Maestro", "Alumno" }));

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(100, 100, 100)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel13, javax.swing.GroupLayout.PREFERRED_SIZE, 230, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addComponent(cboTipoUsuario, javax.swing.GroupLayout.Alignment.LEADING, 0, 220, Short.MAX_VALUE)
                        .addComponent(btnGuardar, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel17, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel16, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(txtUsuario, javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jLabel15, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(txtNombre, javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jLabel14, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(txtPass)
                        .addComponent(txtId, javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jLabel18, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addContainerGap(350, Short.MAX_VALUE))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(60, 60, 60)
                .addComponent(jLabel13)
                .addGap(18, 18, 18)
                .addComponent(jLabel14)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(txtNombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel15)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(txtUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel16)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(txtPass, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel17)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(txtId, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel18)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(cboTipoUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btnGuardar)
                .addContainerGap(79, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("Usuarios", jPanel4);

        jLabel2.setFont(new java.awt.Font("Helvetica Neue", 1, 18)); // NOI18N
        jLabel2.setText("Administrar clases");

        jLabel1.setText("Nombre");

        jLabel3.setText("ID Examen 1");

        jLabel4.setText("ID Examen 2");

        jLabel5.setText("Maestro");

        cboMaestros.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "- Seleccionar -" }));

        btnGuardarClase.setText("Guardar");
        btnGuardarClase.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGuardarClaseActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(100, 100, 100)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(txtExamen2, javax.swing.GroupLayout.DEFAULT_SIZE, 220, Short.MAX_VALUE)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(txtExamen1, javax.swing.GroupLayout.DEFAULT_SIZE, 220, Short.MAX_VALUE))
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(txtClase)
                            .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, 220, Short.MAX_VALUE)))
                    .addComponent(jLabel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(cboMaestros, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnGuardarClase, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(360, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(60, 60, 60)
                .addComponent(jLabel2)
                .addGap(18, 18, 18)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(txtClase, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel5)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(cboMaestros, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(txtExamen1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(txtExamen2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btnGuardarClase)
                .addContainerGap(149, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("Clases", jPanel1);

        txtPregunta.setColumns(20);
        txtPregunta.setRows(5);
        jScrollPane1.setViewportView(txtPregunta);

        jLabel6.setText("Pregunta");

        jLabel7.setFont(new java.awt.Font("Helvetica Neue", 1, 18)); // NOI18N
        jLabel7.setText("Administrar examenes");

        btnGroupResp.add(rbtnTrue);
        rbtnTrue.setText("Verdadero");

        btnGroupResp.add(rbtnFalse);
        rbtnFalse.setText("Falso");

        jLabel8.setText("Respuesta");

        btnGuardarPregunta.setText("Guardar pregunta");
        btnGuardarPregunta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGuardarPreguntaActionPerformed(evt);
            }
        });

        jLabel9.setText("Categoria del examen");

        cboExamen.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "- Seleccionar -", "Examen 1", "Examen 2" }));

        jLabel10.setText("Clase");

        cboClases.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "- Seleccionar -" }));

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(100, 100, 100)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addComponent(cboClases, javax.swing.GroupLayout.Alignment.LEADING, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel10, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 220, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jLabel8)
                    .addComponent(jLabel7)
                    .addComponent(jLabel6)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(rbtnTrue)
                        .addGap(44, 44, 44)
                        .addComponent(rbtnFalse))
                    .addComponent(btnGuardarPregunta, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addComponent(cboExamen, javax.swing.GroupLayout.Alignment.LEADING, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel9, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 220, Short.MAX_VALUE))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 280, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(300, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(60, 60, 60)
                .addComponent(jLabel7)
                .addGap(18, 18, 18)
                .addComponent(jLabel10)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(cboClases, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel9)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(cboExamen, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel6)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel8)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(rbtnTrue)
                    .addComponent(rbtnFalse))
                .addGap(18, 18, 18)
                .addComponent(btnGuardarPregunta)
                .addContainerGap(114, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("Examenes", jPanel3);

        jLabel11.setFont(new java.awt.Font("Helvetica Neue", 1, 18)); // NOI18N
        jLabel11.setText("Centro de calificaciones");

        tablaNotas.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane2.setViewportView(tablaNotas);

        jLabel12.setText("Clase");

        cboClasesNotas.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "- Seleccionar -" }));
        cboClasesNotas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cboClasesNotasActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(100, 100, 100)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addComponent(cboClasesNotas, javax.swing.GroupLayout.Alignment.LEADING, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel12, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 220, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jLabel11)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 480, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(100, 100, 100))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(60, 60, 60)
                .addComponent(jLabel11)
                .addGap(18, 18, 18)
                .addComponent(jLabel12)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(cboClasesNotas, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 270, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(112, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("Calificaciones", jPanel2);

        jMenu1.setText("Usuario");

        jMenuItem1.setText("Cerrar sesion");
        jMenuItem1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem1ActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem1);

        jMenuBar1.add(jMenu1);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jTabbedPane1)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jTabbedPane1)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jMenuItem1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem1ActionPerformed
        this.setVisible(false);
        new FrameLogin().setVisible(true);
    }//GEN-LAST:event_jMenuItem1ActionPerformed

    private void btnGuardarClaseActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGuardarClaseActionPerformed
        if (cboMaestros.getSelectedIndex() >= 0) {
            try {
                Maestro maestro = (Maestro) cboMaestros.getSelectedItem();
                ds.agregarClase(txtClase.getText(), String.valueOf(maestro.getId()), txtExamen1.getText(), txtExamen2.getText());
                ds.cargarClases();
                limpiarTab2();
                JOptionPane.showMessageDialog(this, "Clase agregada exitosamente.");
            } catch (Exception e) {
                
            }
        }
        else {
            JOptionPane.showMessageDialog(this, "Debe seleccionar el tipo de usuario.");
        }
    }//GEN-LAST:event_btnGuardarClaseActionPerformed

    private void btnGuardarPreguntaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGuardarPreguntaActionPerformed
        Clase clase = (Clase) cboClases.getSelectedItem();
        boolean respuesta = false;
        if (rbtnTrue.isSelected()) {
            respuesta = true;
        }
        Pregunta pregunta = new Pregunta(txtPregunta.getText(), respuesta);
        if (cboExamen.getSelectedIndex() == 1) {
            validarPreguntas(clase.getExamen1(), pregunta);
        }
        else if (cboExamen.getSelectedIndex() == 2) {
            validarPreguntas(clase.getExamen2(), pregunta);
        }
        System.out.println(clase.getExamen1().getPreguntas());
    }//GEN-LAST:event_btnGuardarPreguntaActionPerformed

    private void jTabbedPane1StateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_jTabbedPane1StateChanged
        int tab = jTabbedPane1.getSelectedIndex();
        switch(tab) {
            case 0: {
                limpiarTab1();
                break;
            }
            case 1: {
                limpiarTab2();
                try {
                    cboMaestros.setModel(ds.llenarCboMaestros());
                } catch (Exception e) {
                }
                break;
            }
            case 2: {
                try {
                    cboClases.setModel(ds.llenarCboClases());
                } catch (Exception e) {
                }
                break;
            }
            case 3: {
                try {
                    cboClasesNotas.setModel(ds.llenarCboClases());
                } catch (Exception e) {
                }
                break;
            }
        }
    }//GEN-LAST:event_jTabbedPane1StateChanged

    private void btnGuardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGuardarActionPerformed
        try {
            if (cboTipoUsuario.getSelectedIndex() == 1) {
                ds.agregarMaestro(txtNombre.getText(), txtUsuario.getText(), txtPass.getText(), txtId.getText());
                limpiarTab1();
                JOptionPane.showMessageDialog(this, "Maestro agregado exitosamente.");
            } else if (cboTipoUsuario.getSelectedIndex() == 2) {
                ds.addAlumno(new Alumno(txtNombre.getText(), txtUsuario.getText(), txtPass.getText(), txtId.getText()));
                limpiarTab1();
                System.out.println(ds.getAlumnos());
                JOptionPane.showMessageDialog(this, "Alumno agregado exitosamente.");
            }
            ds.cargarUsuarios();
        } catch (Exception e) {
        }
    }//GEN-LAST:event_btnGuardarActionPerformed

    private void cboClasesNotasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cboClasesNotasActionPerformed
        if (cboClasesNotas.getSelectedIndex() >= 0) {
            try {
                Clase clase = (Clase) cboClasesNotas.getSelectedItem();
                tablaNotas.setModel(ds.llenarTablaNotas(clase));
            } catch (Exception e) {
            }
        }
    }//GEN-LAST:event_cboClasesNotasActionPerformed

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
            java.util.logging.Logger.getLogger(FrameAdmin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FrameAdmin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FrameAdmin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FrameAdmin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FrameAdmin().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.ButtonGroup btnGroupResp;
    private javax.swing.JButton btnGuardar;
    private javax.swing.JButton btnGuardarClase;
    private javax.swing.JButton btnGuardarPregunta;
    private javax.swing.JComboBox<String> cboClases;
    private javax.swing.JComboBox<String> cboClasesNotas;
    private javax.swing.JComboBox<String> cboExamen;
    private javax.swing.JComboBox<String> cboMaestros;
    private javax.swing.JComboBox<String> cboTipoUsuario;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JRadioButton rbtnFalse;
    private javax.swing.JRadioButton rbtnTrue;
    private javax.swing.JTable tablaNotas;
    private javax.swing.JTextField txtClase;
    private javax.swing.JTextField txtExamen1;
    private javax.swing.JTextField txtExamen2;
    private javax.swing.JTextField txtId;
    private javax.swing.JTextField txtNombre;
    private javax.swing.JTextField txtPass;
    private javax.swing.JTextArea txtPregunta;
    private javax.swing.JTextField txtUsuario;
    // End of variables declaration//GEN-END:variables
}
