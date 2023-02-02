package vistas.admin;

import clases.Conexion;
import java.awt.event.KeyEvent;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import javax.swing.JComboBox;
import javax.swing.JOptionPane;

public class FrmGestionClientes extends javax.swing.JInternalFrame {

    public static String gcl;

    public FrmGestionClientes() {
        initComponents();
        llenarnombre(cbxBuscarCli);
        txtid.setVisible(false);
//******************************************nos sirve para centrar el internalframe dentro del destokpane****************************
        int a = FrmAdmin.FondoAdmin.getWidth() - this.getWidth();
        int b = FrmAdmin.FondoAdmin.getHeight() - this.getHeight();
        setLocation(a / 2, b / 2);
//*********************************************************MARCELA***************************************************************************
        gcl = "gcl";
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        lblimagen = new javax.swing.JLabel();
        lblnombre = new javax.swing.JLabel();
        lblempresa = new javax.swing.JLabel();
        lblcodigo = new javax.swing.JLabel();
        lbldireccion = new javax.swing.JLabel();
        lbltelefono = new javax.swing.JLabel();
        lblcorreo = new javax.swing.JLabel();
        txtdireccion = new javax.swing.JTextField();
        txtcodigo = new javax.swing.JTextField();
        txttelefono = new javax.swing.JTextField();
        txtcorreo = new javax.swing.JTextField();
        txtempresa = new javax.swing.JTextField();
        btnbuscar = new javax.swing.JButton();
        btnagregar = new javax.swing.JButton();
        btnmodificar = new javax.swing.JButton();
        btneliminar = new javax.swing.JButton();
        btnsalir = new javax.swing.JButton();
        txtid = new javax.swing.JTextField();
        btnLimpiar = new javax.swing.JButton();
        cbxBuscarCli = new javax.swing.JComboBox<>();

        setIconifiable(true);
        setMaximizable(true);
        setTitle("GESTIONAR CLIENTES");
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

        lblimagen.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/logpq.jpg"))); // NOI18N

        lblnombre.setFont(new java.awt.Font("Centaur", 1, 18)); // NOI18N
        lblnombre.setForeground(new java.awt.Color(255, 255, 255));
        lblnombre.setText("Empresa");

        lblempresa.setBackground(new java.awt.Color(255, 255, 255));
        lblempresa.setFont(new java.awt.Font("Centaur", 1, 18)); // NOI18N
        lblempresa.setForeground(new java.awt.Color(255, 255, 255));
        lblempresa.setText("Nombre ");

        lblcodigo.setBackground(new java.awt.Color(255, 255, 255));
        lblcodigo.setFont(new java.awt.Font("Centaur", 1, 18)); // NOI18N
        lblcodigo.setForeground(new java.awt.Color(255, 255, 255));
        lblcodigo.setText("Codigo:");

        lbldireccion.setBackground(new java.awt.Color(255, 255, 255));
        lbldireccion.setFont(new java.awt.Font("Centaur", 1, 18)); // NOI18N
        lbldireccion.setForeground(new java.awt.Color(255, 255, 255));
        lbldireccion.setText("Dirección:");

        lbltelefono.setBackground(new java.awt.Color(255, 255, 255));
        lbltelefono.setFont(new java.awt.Font("Centaur", 1, 18)); // NOI18N
        lbltelefono.setForeground(new java.awt.Color(255, 255, 255));
        lbltelefono.setText("Telefono:");

        lblcorreo.setBackground(new java.awt.Color(255, 255, 255));
        lblcorreo.setFont(new java.awt.Font("Centaur", 1, 18)); // NOI18N
        lblcorreo.setForeground(new java.awt.Color(255, 255, 255));
        lblcorreo.setText("Correo:");

        txtdireccion.setFont(new java.awt.Font("Centaur", 0, 18)); // NOI18N
        txtdireccion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtdireccionActionPerformed(evt);
            }
        });

        txtcodigo.setFont(new java.awt.Font("Centaur", 0, 18)); // NOI18N
        txtcodigo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtcodigoActionPerformed(evt);
            }
        });
        txtcodigo.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtcodigoKeyTyped(evt);
            }
        });

        txttelefono.setFont(new java.awt.Font("Centaur", 0, 18)); // NOI18N
        txttelefono.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txttelefonoActionPerformed(evt);
            }
        });
        txttelefono.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txttelefonoKeyTyped(evt);
            }
        });

        txtcorreo.setFont(new java.awt.Font("Centaur", 0, 18)); // NOI18N

        txtempresa.setFont(new java.awt.Font("Centaur", 0, 18)); // NOI18N
        txtempresa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtempresaActionPerformed(evt);
            }
        });

        btnbuscar.setBackground(new java.awt.Color(255, 255, 255));
        btnbuscar.setFont(new java.awt.Font("Centaur", 1, 14)); // NOI18N
        btnbuscar.setForeground(new java.awt.Color(24, 106, 240));
        btnbuscar.setText("BUSCAR");
        btnbuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnbuscarActionPerformed(evt);
            }
        });

        btnagregar.setBackground(new java.awt.Color(255, 255, 255));
        btnagregar.setFont(new java.awt.Font("Centaur", 1, 14)); // NOI18N
        btnagregar.setForeground(new java.awt.Color(24, 106, 240));
        btnagregar.setText("AGREGAR");
        btnagregar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnagregarActionPerformed(evt);
            }
        });

        btnmodificar.setBackground(new java.awt.Color(255, 255, 255));
        btnmodificar.setFont(new java.awt.Font("Centaur", 1, 14)); // NOI18N
        btnmodificar.setForeground(new java.awt.Color(24, 106, 240));
        btnmodificar.setText("MODIFICAR");
        btnmodificar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnmodificarActionPerformed(evt);
            }
        });

        btneliminar.setBackground(new java.awt.Color(255, 255, 255));
        btneliminar.setFont(new java.awt.Font("Centaur", 1, 14)); // NOI18N
        btneliminar.setForeground(new java.awt.Color(24, 106, 240));
        btneliminar.setText("ELIMINAR");
        btneliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btneliminarActionPerformed(evt);
            }
        });

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

        cbxBuscarCli.setFont(new java.awt.Font("Centaur", 0, 18)); // NOI18N
        cbxBuscarCli.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Seleccione" }));
        cbxBuscarCli.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                cbxBuscarCliKeyPressed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addComponent(lblimagen)
                .addGap(254, 254, 254)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtid, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(lblnombre)
                                    .addComponent(lblempresa)
                                    .addComponent(lbldireccion)
                                    .addComponent(lblcodigo))
                                .addGap(29, 29, 29)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(txtempresa)
                                    .addComponent(txtcodigo)
                                    .addComponent(txtdireccion, javax.swing.GroupLayout.PREFERRED_SIZE, 408, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                                .addComponent(btnagregar, javax.swing.GroupLayout.PREFERRED_SIZE, 104, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(30, 30, 30)
                                .addComponent(btnmodificar)
                                .addGap(40, 40, 40)
                                .addComponent(btneliminar, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(49, 49, 49)
                                .addComponent(btnLimpiar, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                                    .addComponent(lbltelefono)
                                    .addGap(35, 35, 35)
                                    .addComponent(txttelefono))
                                .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                                    .addComponent(lblcorreo)
                                    .addGap(50, 50, 50)
                                    .addComponent(txtcorreo, javax.swing.GroupLayout.PREFERRED_SIZE, 412, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addGap(33, 33, 33)
                        .addComponent(btnsalir, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(176, 176, 176)
                        .addComponent(cbxBuscarCli, javax.swing.GroupLayout.PREFERRED_SIZE, 234, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(108, 108, 108)
                        .addComponent(btnbuscar, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(238, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(40, 40, 40)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(btnbuscar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(cbxBuscarCli, javax.swing.GroupLayout.DEFAULT_SIZE, 30, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtid, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(35, 35, 35))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(lblimagen, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblcodigo)
                    .addComponent(txtcodigo, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(42, 42, 42)
                        .addComponent(txtempresa, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(32, 32, 32)
                        .addComponent(lblempresa)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lblnombre)))
                .addGap(38, 38, 38)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtdireccion, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lbldireccion))
                .addGap(40, 40, 40)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbltelefono)
                    .addComponent(txttelefono, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(42, 42, 42)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblcorreo)
                    .addComponent(txtcorreo, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 96, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnagregar, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnmodificar, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btneliminar, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnLimpiar, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnsalir, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(80, 80, 80))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtdireccionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtdireccionActionPerformed
        txttelefono.requestFocus();
    }//GEN-LAST:event_txtdireccionActionPerformed

    private void txtcodigoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtcodigoActionPerformed
        txtempresa.requestFocus();
    }//GEN-LAST:event_txtcodigoActionPerformed

    private void txtcodigoKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtcodigoKeyTyped

    }//GEN-LAST:event_txtcodigoKeyTyped

    private void txttelefonoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txttelefonoActionPerformed
        txtcorreo.requestFocus();
    }//GEN-LAST:event_txttelefonoActionPerformed

    private void txttelefonoKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txttelefonoKeyTyped
        char validar = evt.getKeyChar();

        if (Character.isLetter(validar)) {
            getToolkit().beep();
            evt.consume();

            JOptionPane.showMessageDialog(null, "Por Favor Ingrese Solo Numeros");
        }
    }//GEN-LAST:event_txttelefonoKeyTyped

    private void txtempresaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtempresaActionPerformed
        txtdireccion.requestFocus();
    }//GEN-LAST:event_txtempresaActionPerformed

    private void btnbuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnbuscarActionPerformed
         btnagregar.setEnabled(false);
        buscar();
    }//GEN-LAST:event_btnbuscarActionPerformed

    private void btnagregarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnagregarActionPerformed
        agregar();
    }//GEN-LAST:event_btnagregarActionPerformed

    private void btnmodificarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnmodificarActionPerformed
        modificar();
    }//GEN-LAST:event_btnmodificarActionPerformed

    private void btneliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btneliminarActionPerformed
        if (txtcodigo.getText().length() == (0) || txtid.getText().length() == (0)) {
            JOptionPane.showMessageDialog(null, "Los campos deben tener la informacio requerida, verifique por favor");
            limpiarCajas();
        } else {

            eliminar();
        }


    }//GEN-LAST:event_btneliminarActionPerformed

    private void btnsalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnsalirActionPerformed
        gcl = null;
        dispose();
    }//GEN-LAST:event_btnsalirActionPerformed

    private void btnLimpiarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLimpiarActionPerformed
        limpiarCajas();
    }//GEN-LAST:event_btnLimpiarActionPerformed

    private void formInternalFrameClosing(javax.swing.event.InternalFrameEvent evt) {//GEN-FIRST:event_formInternalFrameClosing
        gcl = null;
    }//GEN-LAST:event_formInternalFrameClosing

    private void cbxBuscarCliKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_cbxBuscarCliKeyPressed
        if (evt.getKeyCode() == KeyEvent.VK_ENTER) {
            if (cbxBuscarCli.getSelectedItem().equals("Seleccione")) {
                JOptionPane.showMessageDialog(null, "El campo debe tener informacion, por favor verifique");
                limpiarCajas();
                
            } else {
                 btnagregar.setEnabled(false);
                buscar();
            }

        }
    }//GEN-LAST:event_cbxBuscarCliKeyPressed
    private void buscar() {
        Conexion conn = new Conexion();
        Connection con = conn.getConnection();

        try {

            PreparedStatement ps;
            ResultSet rs;
            ps = con.prepareStatement("SELECT * FROM clientes WHERE nombre_empresa = ?");
            ps.setString(1, cbxBuscarCli.getSelectedItem().toString());

            rs = ps.executeQuery();

            if (rs.next()) {
                txtcodigo.setText(rs.getString("codigo"));
                txtempresa.setText(rs.getString("nombre_empresa"));
                txtdireccion.setText(rs.getString("direccion"));
                txttelefono.setText(rs.getString("telefono"));
                txtcorreo.setText(rs.getString("correo"));
                txtid.setText(rs.getString("id"));

                if (cbxBuscarCli.getSelectedItem().equals("Seleccione")) {
                    JOptionPane.showMessageDialog(null, "El campo debe tener informacion, por favor verifique");
                    limpiarCajas();

                }

            } else {
                JOptionPane.showMessageDialog(null, "No Existe Cliente Con Este Nombre");
                limpiarCajas();
            }
        } catch (Exception e) {
            System.err.println(e);
        }

    }

    private void agregar() {
        Conexion conn = new Conexion();
        Connection con = conn.getConnection();

        try {

            PreparedStatement ps;
            ResultSet rs;
            ps = con.prepareStatement("INSERT INTO clientes (codigo, nombre_empresa, direccion, telefono, correo) VALUES (?,?,?,?,?)");
            ps.setString(1, txtcodigo.getText());
            ps.setString(2, txtempresa.getText());
            ps.setString(3, txtdireccion.getText());
            ps.setString(4, txttelefono.getText());
            ps.setString(5, txtcorreo.getText());

            int res = ps.executeUpdate();

            if (txtcodigo.getText().length() == (0) || txtempresa.getText().length() == (0) || txtdireccion.getText().length() == (0) || txttelefono.getText().length() == (0) || txtcorreo.getText().length() == (0)) {
                JOptionPane.showMessageDialog(null, "Los campos deben tener informacion, por favor verifique");
            } else if (res > 0) {
                JOptionPane.showMessageDialog(null, "Cliente Guardado Exitosamente");
                limpiarCajas();

            } else {
                JOptionPane.showMessageDialog(null, "Error Al Guardar Cliente");
                limpiarCajas();
            }
            con.close();
        } catch (Exception e) {
            System.err.println(e);
        }

    }

    private void modificar() {
        Conexion conn = new Conexion();
        Connection con = conn.getConnection();

        try {

            PreparedStatement ps;
            ResultSet rs;
            ps = con.prepareStatement("UPDATE clientes SET codigo=?, nombre_empresa=?, direccion=?, telefono=?, correo=? WHERE id=?");
            ps.setString(1, txtcodigo.getText());
            ps.setString(2, txtempresa.getText());
            ps.setString(3, txtdireccion.getText());
            ps.setString(4, txttelefono.getText());
            ps.setString(5, txtcorreo.getText());
            ps.setString(6, txtid.getText());

            int res = ps.executeUpdate();

            if (txtcodigo.getText().length() == (0) || txtempresa.getText().length() == (0) || txtdireccion.getText().length() == (0) || txttelefono.getText().length() == (0) || txtcorreo.getText().length() == (0)) {
                JOptionPane.showMessageDialog(null, "Los campos deben tener informacion, por favor verifique");
            } else if (res > 0) {
                JOptionPane.showMessageDialog(null, "Cliente Modificado Exitosamente");
                limpiarCajas();

            } else {
                JOptionPane.showMessageDialog(null, "Error Al Modificar Cliente");
                limpiarCajas();
            }
            con.close();
        } catch (Exception e) {
            System.err.println(e);
        }

    }

    private void limpiarCajas() {
        txtcodigo.setText(null);
        txtempresa.setText(null);
        txtdireccion.setText(null);
        txttelefono.setText(null);
        txtcorreo.setText(null);
        cbxBuscarCli.setSelectedIndex(0);
    }

    private void eliminar() {
        Conexion conn = new Conexion();
        Connection con = conn.getConnection();
        PreparedStatement ps;

        String id = txtid.getText();
        String sql = "delete from clientes WHERE id='" + id + "'";
        try {

            ps = con.prepareStatement(sql);
            ps.executeUpdate();
            JOptionPane.showMessageDialog(null, "El cliente ha sido eliminada correctamente!!!");
            limpiarCajas();

        } catch (Exception e) {
        }

    }

    private void llenarnombre(JComboBox nombre) {
        Conexion conn = new Conexion();
        Connection con = conn.getConnection();
        PreparedStatement ps;
        ResultSet rs;

        String sql = "SELECT nombre_empresa FROM clientes";
        try {
            ps = con.prepareStatement(sql);
            rs = ps.executeQuery();
            while (rs.next()) {
                nombre.addItem(rs.getString("nombre_empresa"));
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
        }
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnLimpiar;
    private javax.swing.JButton btnagregar;
    private javax.swing.JButton btnbuscar;
    private javax.swing.JButton btneliminar;
    private javax.swing.JButton btnmodificar;
    private javax.swing.JButton btnsalir;
    private javax.swing.JComboBox<String> cbxBuscarCli;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel lblcodigo;
    private javax.swing.JLabel lblcorreo;
    private javax.swing.JLabel lbldireccion;
    private javax.swing.JLabel lblempresa;
    private javax.swing.JLabel lblimagen;
    private javax.swing.JLabel lblnombre;
    private javax.swing.JLabel lbltelefono;
    private javax.swing.JTextField txtcodigo;
    private javax.swing.JTextField txtcorreo;
    private javax.swing.JTextField txtdireccion;
    private javax.swing.JTextField txtempresa;
    private javax.swing.JTextField txtid;
    private javax.swing.JTextField txttelefono;
    // End of variables declaration//GEN-END:variables

}
