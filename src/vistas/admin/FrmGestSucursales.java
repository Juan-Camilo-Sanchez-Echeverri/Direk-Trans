package vistas.admin;

import clases.Conexion;
import java.awt.event.KeyEvent;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JComboBox;
import javax.swing.JOptionPane;

public class FrmGestSucursales extends javax.swing.JInternalFrame {

    public static String gsu;

    public FrmGestSucursales() {
        initComponents();
        llenardestinosuc(cbxBuscarSuc);
        listargerente(cbxGerente);
        cbxBuscarSuc.removeItem("Seleccione");
        cbxGerente.removeItem("Seleccione");

        gsu = "gsu";
        txtId.setVisible(false);
//******************************************nos sirve para centrar el internalframe dentro del destokpane****************************
        int a = FrmAdmin.FondoAdmin.getWidth() - this.getWidth();
        int b = FrmAdmin.FondoAdmin.getHeight() - this.getHeight();
        setLocation(a / 2, b / 2);
//************************************************************************************************************************************

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        lblcodigo = new javax.swing.JLabel();
        lblnombre = new javax.swing.JLabel();
        lblciudad = new javax.swing.JLabel();
        lbltelefono = new javax.swing.JLabel();
        lbldireccion = new javax.swing.JLabel();
        lblgerente = new javax.swing.JLabel();
        txtciudad = new javax.swing.JTextField();
        txtdireccion = new javax.swing.JTextField();
        txtnombre = new javax.swing.JTextField();
        txtcodigo = new javax.swing.JTextField();
        btnmodificar = new javax.swing.JButton();
        btnbuscar = new javax.swing.JButton();
        btnagregar = new javax.swing.JButton();
        btneliminar = new javax.swing.JButton();
        lblimagen = new javax.swing.JLabel();
        btnsalir = new javax.swing.JButton();
        txtId = new javax.swing.JTextField();
        btnLimpiar = new javax.swing.JButton();
        cbxBuscarSuc = new javax.swing.JComboBox<>();
        txttelefono = new javax.swing.JTextField();
        cbxGerente = new javax.swing.JComboBox<>();

        setIconifiable(true);
        setMaximizable(true);
        setTitle("GESTIONAR SUCURSALES");
        setPreferredSize(new java.awt.Dimension(1335, 679));
        addInternalFrameListener(new javax.swing.event.InternalFrameListener() {
            public void internalFrameActivated(javax.swing.event.InternalFrameEvent evt) {
            }
            public void internalFrameClosed(javax.swing.event.InternalFrameEvent evt) {
            }
            public void internalFrameClosing(javax.swing.event.InternalFrameEvent evt) {
                formInternalFrameClosing(evt);
            }
            public void internalFrameDeactivated(javax.swing.event.InternalFrameEvent evt) {
            }
            public void internalFrameDeiconified(javax.swing.event.InternalFrameEvent evt) {
            }
            public void internalFrameIconified(javax.swing.event.InternalFrameEvent evt) {
            }
            public void internalFrameOpened(javax.swing.event.InternalFrameEvent evt) {
            }
        });

        jPanel1.setBackground(new java.awt.Color(24, 106, 240));
        jPanel1.setPreferredSize(new java.awt.Dimension(1335, 679));

        lblcodigo.setFont(new java.awt.Font("Centaur", 1, 18)); // NOI18N
        lblcodigo.setForeground(new java.awt.Color(255, 255, 255));
        lblcodigo.setText("Codigo:");

        lblnombre.setFont(new java.awt.Font("Centaur", 1, 18)); // NOI18N
        lblnombre.setForeground(new java.awt.Color(255, 255, 255));
        lblnombre.setText("Nombre:");

        lblciudad.setFont(new java.awt.Font("Centaur", 1, 18)); // NOI18N
        lblciudad.setForeground(new java.awt.Color(255, 255, 255));
        lblciudad.setText("Ciudad:");

        lbltelefono.setFont(new java.awt.Font("Centaur", 1, 18)); // NOI18N
        lbltelefono.setForeground(new java.awt.Color(255, 255, 255));
        lbltelefono.setText("Telefono:");

        lbldireccion.setFont(new java.awt.Font("Centaur", 1, 18)); // NOI18N
        lbldireccion.setForeground(new java.awt.Color(255, 255, 255));
        lbldireccion.setText("Direccion:");

        lblgerente.setFont(new java.awt.Font("Centaur", 1, 18)); // NOI18N
        lblgerente.setForeground(new java.awt.Color(255, 255, 255));
        lblgerente.setText("Gerente:");

        txtciudad.setFont(new java.awt.Font("Centaur", 0, 18)); // NOI18N
        txtciudad.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtciudadActionPerformed(evt);
            }
        });

        txtdireccion.setFont(new java.awt.Font("Centaur", 0, 18)); // NOI18N
        txtdireccion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtdireccionActionPerformed(evt);
            }
        });

        txtnombre.setFont(new java.awt.Font("Centaur", 0, 18)); // NOI18N
        txtnombre.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtnombreActionPerformed(evt);
            }
        });

        txtcodigo.setFont(new java.awt.Font("Centaur", 0, 18)); // NOI18N
        txtcodigo.setSelectionStart(1);
        txtcodigo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtcodigoActionPerformed(evt);
            }
        });

        btnmodificar.setBackground(new java.awt.Color(255, 255, 255));
        btnmodificar.setFont(new java.awt.Font("Centaur", 1, 14)); // NOI18N
        btnmodificar.setForeground(new java.awt.Color(24, 106, 240));
        btnmodificar.setText("MODIFICAR");
        btnmodificar.setPreferredSize(new java.awt.Dimension(160, 30));
        btnmodificar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnmodificarActionPerformed(evt);
            }
        });

        btnbuscar.setBackground(new java.awt.Color(255, 255, 255));
        btnbuscar.setFont(new java.awt.Font("Centaur", 1, 14)); // NOI18N
        btnbuscar.setForeground(new java.awt.Color(24, 106, 240));
        btnbuscar.setText("BUSCAR");
        btnbuscar.setPreferredSize(new java.awt.Dimension(160, 30));
        btnbuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnbuscarActionPerformed(evt);
            }
        });

        btnagregar.setBackground(new java.awt.Color(255, 255, 255));
        btnagregar.setFont(new java.awt.Font("Centaur", 1, 14)); // NOI18N
        btnagregar.setForeground(new java.awt.Color(24, 106, 240));
        btnagregar.setText("AGREGAR");
        btnagregar.setPreferredSize(new java.awt.Dimension(160, 30));
        btnagregar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnagregarActionPerformed(evt);
            }
        });

        btneliminar.setBackground(new java.awt.Color(255, 255, 255));
        btneliminar.setFont(new java.awt.Font("Centaur", 1, 14)); // NOI18N
        btneliminar.setForeground(new java.awt.Color(24, 106, 240));
        btneliminar.setText("ELIMINAR");
        btneliminar.setToolTipText("");
        btneliminar.setPreferredSize(new java.awt.Dimension(160, 30));
        btneliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btneliminarActionPerformed(evt);
            }
        });

        lblimagen.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/logpq.jpg"))); // NOI18N

        btnsalir.setBackground(new java.awt.Color(255, 255, 255));
        btnsalir.setFont(new java.awt.Font("Centaur", 1, 14)); // NOI18N
        btnsalir.setForeground(new java.awt.Color(24, 106, 240));
        btnsalir.setText("SALIR");
        btnsalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnsalirActionPerformed(evt);
            }
        });

        btnLimpiar.setBackground(new java.awt.Color(255, 255, 255));
        btnLimpiar.setFont(new java.awt.Font("Centaur", 1, 14)); // NOI18N
        btnLimpiar.setForeground(new java.awt.Color(24, 106, 240));
        btnLimpiar.setText("LIMPIAR");
        btnLimpiar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLimpiarActionPerformed(evt);
            }
        });

        cbxBuscarSuc.setFont(new java.awt.Font("Centaur", 0, 18)); // NOI18N
        cbxBuscarSuc.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Seleccione" }));
        cbxBuscarSuc.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                cbxBuscarSucKeyPressed(evt);
            }
        });

        txttelefono.setFont(new java.awt.Font("Centaur", 0, 18)); // NOI18N
        txttelefono.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txttelefonoActionPerformed(evt);
            }
        });
        txttelefono.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txttelefonoKeyPressed(evt);
            }
        });

        cbxGerente.setFont(new java.awt.Font("Centaur", 0, 18)); // NOI18N
        cbxGerente.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Seleccione" }));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(26, 26, 26)
                        .addComponent(lblimagen)
                        .addGap(312, 312, 312)
                        .addComponent(txtId, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(73, 73, 73)
                        .addComponent(cbxBuscarSuc, javax.swing.GroupLayout.PREFERRED_SIZE, 234, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(49, 49, 49)
                        .addComponent(btnbuscar, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(418, 418, 418)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(lblciudad, javax.swing.GroupLayout.PREFERRED_SIZE, 78, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                        .addComponent(lblcodigo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(lblnombre, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(lbldireccion))
                                    .addComponent(lbltelefono, javax.swing.GroupLayout.PREFERRED_SIZE, 78, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(lblgerente, javax.swing.GroupLayout.PREFERRED_SIZE, 78, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(26, 26, 26)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(txtdireccion)
                                    .addComponent(txtciudad)
                                    .addComponent(txtnombre)
                                    .addComponent(txttelefono, javax.swing.GroupLayout.DEFAULT_SIZE, 331, Short.MAX_VALUE)
                                    .addComponent(txtcodigo, javax.swing.GroupLayout.DEFAULT_SIZE, 331, Short.MAX_VALUE)
                                    .addComponent(cbxGerente, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(0, 324, Short.MAX_VALUE)
                .addComponent(btnagregar, javax.swing.GroupLayout.PREFERRED_SIZE, 121, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(30, 30, 30)
                .addComponent(btnmodificar, javax.swing.GroupLayout.PREFERRED_SIZE, 121, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(30, 30, 30)
                .addComponent(btneliminar, javax.swing.GroupLayout.PREFERRED_SIZE, 121, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(30, 30, 30)
                .addComponent(btnLimpiar, javax.swing.GroupLayout.PREFERRED_SIZE, 121, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(30, 30, 30)
                .addComponent(btnsalir, javax.swing.GroupLayout.PREFERRED_SIZE, 121, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(286, 286, 286))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(28, 28, 28)
                        .addComponent(lblimagen, javax.swing.GroupLayout.PREFERRED_SIZE, 78, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(24, 24, 24))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtId, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(cbxBuscarSuc, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnbuscar, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(47, 47, 47)))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(txtcodigo)
                    .addComponent(lblcodigo, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(35, 35, 35)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblnombre, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtnombre, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(35, 35, 35)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbldireccion, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtdireccion, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(35, 35, 35)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblciudad, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtciudad, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(35, 35, 35)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txttelefono, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lbltelefono, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(35, 35, 35)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblgerente, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cbxGerente, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(58, 58, 58)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(btnmodificar, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(btnagregar, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(btneliminar, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(btnLimpiar, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(btnsalir, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(83, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 649, 649)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtciudadActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtciudadActionPerformed
        txttelefono.requestFocus();
    }//GEN-LAST:event_txtciudadActionPerformed

    private void txtdireccionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtdireccionActionPerformed
        txtciudad.requestFocus();
    }//GEN-LAST:event_txtdireccionActionPerformed

    private void txtnombreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtnombreActionPerformed
        txtdireccion.requestFocus();
    }//GEN-LAST:event_txtnombreActionPerformed

    private void txtcodigoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtcodigoActionPerformed
        txtnombre.requestFocus();
    }//GEN-LAST:event_txtcodigoActionPerformed

    private void btnmodificarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnmodificarActionPerformed
        modificar();

    }//GEN-LAST:event_btnmodificarActionPerformed

    private void btnbuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnbuscarActionPerformed
        btnagregar.setEnabled(false);
        txtcodigo.setEditable(false);
        cbxGerente.setEnabled(false);
        buscar();

    }//GEN-LAST:event_btnbuscarActionPerformed

    private void btnagregarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnagregarActionPerformed
        if (txtcodigo.getText().length() == (0) || txtnombre.getText().length() == (0) || txtdireccion.getText().length() == (0) || txtciudad.getText().length() == (0) || txttelefono.getText().length() == (0)) {
            JOptionPane.showMessageDialog(null, "Todos los campos deben tener la informacio requerida, verifique por favor");
            limpiarCajas();
        } else if (validarsuc() == false && validargerente() == false) {
            guardar();

        } else {
            JOptionPane.showMessageDialog(null, "No se puede crear la sucursal");
        }

    }//GEN-LAST:event_btnagregarActionPerformed

    private void btneliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btneliminarActionPerformed
        if (txtcodigo.getText().length() == (0) || txtId.getText().length() == (0)) {
            JOptionPane.showMessageDialog(null, "Los campos deben tener la informacio requerida, verifique por favor");
            limpiarCajas();
        } else {

            eliminar();
        }

    }//GEN-LAST:event_btneliminarActionPerformed

    private void btnsalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnsalirActionPerformed
        gsu = null;
        dispose();

    }//GEN-LAST:event_btnsalirActionPerformed

    private void btnLimpiarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLimpiarActionPerformed

        limpiarCajas();

    }//GEN-LAST:event_btnLimpiarActionPerformed

    private void formInternalFrameClosing(javax.swing.event.InternalFrameEvent evt) {//GEN-FIRST:event_formInternalFrameClosing
        gsu = null;
    }//GEN-LAST:event_formInternalFrameClosing

    private void cbxBuscarSucKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_cbxBuscarSucKeyPressed
        if (evt.getKeyCode() == KeyEvent.VK_ENTER) {
            if (cbxBuscarSuc.getSelectedItem().equals("Seleccione")) {
                JOptionPane.showMessageDialog(null, "El campo debe tener informacion, por favor verifique");
            } else {
                btnagregar.setEnabled(false);
                txtcodigo.setEditable(false);
                cbxGerente.setEnabled(false);
                buscar();
            }

        }
    }//GEN-LAST:event_cbxBuscarSucKeyPressed

    private void txttelefonoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txttelefonoActionPerformed
//  txtgerente.requestFocus();
    }//GEN-LAST:event_txttelefonoActionPerformed

    private void txttelefonoKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txttelefonoKeyPressed
        char validar = evt.getKeyChar();

        if (Character.isLetter(validar)) {
            getToolkit().beep();
            evt.consume();

            JOptionPane.showMessageDialog(null, "Por Favor Ingrese Solo Numeros");
        }
    }//GEN-LAST:event_txttelefonoKeyPressed

    private void limpiarCajas() {
        cbxBuscarSuc.setSelectedIndex(0);
        txtcodigo.setText(null);
        txtnombre.setText(null);
        txtdireccion.setText(null);
        txtciudad.setText(null);
        txttelefono.setText(null);
        cbxGerente.setSelectedIndex(0);
        cbxGerente.setSelectedIndex(0);
        txtcodigo.requestFocus();
        btnagregar.setEnabled(true);
        txtcodigo.setEditable(true);
        cbxGerente.setEnabled(true);
        actualizar();

    }

    void actualizar() {
        cbxBuscarSuc.removeAllItems();
        llenardestinosuc(cbxBuscarSuc);
        cbxGerente.removeAllItems();
        listargerente(cbxGerente);

    }

    private void eliminar() {
        Conexion conn = new Conexion();
        Connection con = conn.getConnection();
        PreparedStatement ps;

        String id = txtId.getText();
        String sql = "delete from sucursales where id='" + id + "'";
        try {

            ps = con.prepareStatement(sql);
            ps.executeUpdate();
            JOptionPane.showMessageDialog(null, "La sucursal ha sido eliminada correctamente!!!");
            limpiarCajas();

        } catch (Exception e) {
        }

    }

    private void modificar() {
        Conexion conn = new Conexion();
        Connection con = conn.getConnection();

        try {

            PreparedStatement ps;
            ResultSet rs;

            ps = con.prepareStatement("UPDATE sucursales SET codigo=?, nombre=?, direccion=?, ciudad=?, telefono=?, gerente=? WHERE codigo=?");
            ps.setString(1, txtcodigo.getText());
            ps.setString(2, txtnombre.getText());
            ps.setString(3, txtdireccion.getText());
            ps.setString(4, txtciudad.getText());
            ps.setString(5, txttelefono.getText());
            ps.setString(6, cbxGerente.getSelectedItem().toString());
            ps.setString(7, cbxBuscarSuc.getSelectedItem().toString());

            int res = ps.executeUpdate();

            if (txtcodigo.getText().length() == (0) || txtnombre.getText().length() == (0) || txtdireccion.getText().length() == (0) || txtciudad.getText().length() == (0) || txttelefono.getText().length() == (0)) {
                JOptionPane.showMessageDialog(null, "Los campos deben tener informacion, por favor verifique");
            } else if (res > 0) {
                JOptionPane.showMessageDialog(null, "Sucursal Modificada Exitosamente");
                limpiarCajas();

            } else {
                JOptionPane.showMessageDialog(null, "Error Al Modificar La Sucursal");
                limpiarCajas();
            }
            con.close();
        } catch (Exception e) {
            System.err.println(e);
        }
    }

    private void guardar() {
        try {
            Conexion conn = new Conexion();
            Connection con = conn.getConnection();
            PreparedStatement ps;
            ResultSet rs;
            ps = con.prepareStatement("INSERT INTO sucursales (codigo,nombre,direccion,ciudad,telefono,gerente) VALUES(?,?,?,?,?,?)");
            ps.setString(1, txtcodigo.getText());
            ps.setString(2, txtnombre.getText());
            ps.setString(3, txtdireccion.getText());
            ps.setString(4, txtciudad.getText());
            ps.setString(5, txttelefono.getText());
            ps.setString(6, cbxGerente.getSelectedItem().toString());

            int res = ps.executeUpdate();

            if (res > 0) {
                JOptionPane.showMessageDialog(null, "Sucursal guardada con exito");
                limpiarCajas();
            } else {
                JOptionPane.showMessageDialog(null, "Error al guardar la Sucursal");
                limpiarCajas();

            }
            con.close();
        } catch (SQLException ex) {
            Logger.getLogger(FrmGestSucursales.class.getName()).log(Level.SEVERE, null, ex);
        }

    }

    private boolean validarsuc() {

        try {
            Conexion conn = new Conexion();
            Connection con = conn.getConnection();
            PreparedStatement ps;
            ResultSet rs;

            ps = con.prepareStatement("SELECT codigo FROM  sucursales WHERE codigo=?");
            ps.setString(1, txtcodigo.getText());
            rs = ps.executeQuery();

            if (rs.next()) {
                txtcodigo.getText().equals(rs.getString("codigo"));
                JOptionPane.showMessageDialog(null, "La Sucursal  ya existe, verifique por favor");

                return true;

            }
        } catch (SQLException ex) {
            Logger.getLogger(FrmGestSucursales.class.getName()).log(Level.SEVERE, null, ex);
        }
        return false;
    }

    private void buscar() {
        Conexion conn = new Conexion();
        Connection con = conn.getConnection();

        try {

            PreparedStatement ps;
            ResultSet rs;

            ps = con.prepareStatement("SELECT * FROM  sucursales WHERE codigo=?");
            ps.setString(1, cbxBuscarSuc.getSelectedItem().toString());

            rs = ps.executeQuery();

            if (rs.next()) {
                txtId.setText(rs.getString("id"));
                txtcodigo.setText(rs.getString("codigo"));
                txtnombre.setText(rs.getString("nombre"));
                txtdireccion.setText(rs.getString("direccion"));
                txttelefono.setText(rs.getString("telefono"));
                txtciudad.setText(rs.getString("ciudad"));
                cbxGerente.setSelectedItem(rs.getString("gerente"));

                if (cbxBuscarSuc.getSelectedItem().equals("Seleccione")) {
                    JOptionPane.showMessageDialog(null, "El campo debe tener informacion, por favor verifique");
                }

            } else {
                JOptionPane.showMessageDialog(null, "No Existe Sucursal Con Este codigo");
            }
        } catch (Exception e) {
            System.err.println(e);
        }
    }

    //********************************************************************************************************************************************
    private void llenardestinosuc(JComboBox destinosuc) {
        Conexion conn = new Conexion();
        Connection con = conn.getConnection();
        PreparedStatement ps;
        ResultSet rs;

        String sql = "SELECT codigo  FROM sucursales";
        try {
            ps = con.prepareStatement(sql);
            rs = ps.executeQuery();
            destinosuc.addItem("Seleccione");
            while (rs.next()) {
                destinosuc.addItem(rs.getString("codigo"));
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
        }
    }

    private void listargerente(JComboBox gerente) {
        Conexion conn = new Conexion();
        Connection con = conn.getConnection();
        PreparedStatement ps;
        ResultSet rs;

        String sql = "select nombre from usuarios where rol ='gerente'";
        try {
            ps = con.prepareStatement(sql);
            rs = ps.executeQuery();
            gerente.addItem("Seleccione");
            while (rs.next()) {
                gerente.addItem(rs.getString("nombre"));
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
        }
    }

    private boolean validargerente() {

        try {
            Conexion conn = new Conexion();
            Connection con = conn.getConnection();
            PreparedStatement ps;
            ResultSet rs;

            ps = con.prepareStatement("SELECT gerente FROM  sucursales WHERE gerente=?");
            ps.setString(1, cbxGerente.getSelectedItem().toString());
            rs = ps.executeQuery();

            if (rs.next()) {
                cbxGerente.getSelectedItem().equals(rs.getString("gerente"));
                JOptionPane.showMessageDialog(null, "El gerente ya esta asignado en una sucursal, verifique por favor");

                return true;

            }
        } catch (SQLException ex) {
            Logger.getLogger(FrmGestSucursales.class.getName()).log(Level.SEVERE, null, ex);
        }
        return false;
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnLimpiar;
    private javax.swing.JButton btnagregar;
    private javax.swing.JButton btnbuscar;
    private javax.swing.JButton btneliminar;
    private javax.swing.JButton btnmodificar;
    private javax.swing.JButton btnsalir;
    private javax.swing.JComboBox<String> cbxBuscarSuc;
    private javax.swing.JComboBox<String> cbxGerente;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel lblciudad;
    private javax.swing.JLabel lblcodigo;
    private javax.swing.JLabel lbldireccion;
    private javax.swing.JLabel lblgerente;
    private javax.swing.JLabel lblimagen;
    private javax.swing.JLabel lblnombre;
    private javax.swing.JLabel lbltelefono;
    private javax.swing.JTextField txtId;
    private javax.swing.JTextField txtciudad;
    private javax.swing.JTextField txtcodigo;
    private javax.swing.JTextField txtdireccion;
    private javax.swing.JTextField txtnombre;
    private javax.swing.JTextField txttelefono;
    // End of variables declaration//GEN-END:variables

}
