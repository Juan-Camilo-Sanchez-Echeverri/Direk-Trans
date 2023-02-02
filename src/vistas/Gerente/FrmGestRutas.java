package vistas.Gerente;

import clases.Conexion;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import javax.swing.JComboBox;
import javax.swing.JOptionPane;
import javax.swing.Timer;
import javax.swing.table.DefaultTableModel;

public class FrmGestRutas extends javax.swing.JInternalFrame {

    clases.horayfecha time = new clases.horayfecha();
    public static String gr;
    PreparedStatement ps;
    ResultSet rs;

    public FrmGestRutas() {
        initComponents();
        txtFecha.setEditable(false);
        txtHora.setEditable(false);
        clases.horayfecha time = new clases.horayfecha();
        gr = "gr";
//****************************************** sirve para centrar el internalframe dentro del destokpane****************************
        int a = FrmGerente.FondoGerente.getWidth() - this.getWidth();
        int b = FrmGerente.FondoGerente.getHeight() - this.getHeight();
        setLocation(a / 2, b / 2);
//****************************************************************CAMILO********************************************************************
        llenarNombreEmp(cbxEmpresas);
        llenarNombreSuc(cbxSucursales);
        llenarCodCarro(cbxCodigoCarro);
        btnGuardar.setVisible(false);

        //FECHA DEL SISTEMA
        Date sistFecha = new Date();
        SimpleDateFormat formato = new SimpleDateFormat("YYYY-MM-dd");
        txtFecha.setText(formato.format(sistFecha));

        //HORA DEL SISTEMA
        Timer tiempo = new Timer(100, new FrmGestRutas.horas());
        tiempo.start();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        txtHora = new javax.swing.JTextField();
        txtFecha = new javax.swing.JTextField();
        cbxAccion = new javax.swing.JComboBox<>();
        cbxEmpresas = new javax.swing.JComboBox<>();
        btnSalir = new javax.swing.JButton();
        lblimagen = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        cbxSucursales = new javax.swing.JComboBox<>();
        btnlimpiar = new javax.swing.JButton();
        cbxCodigoCarro = new javax.swing.JComboBox<>();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblRutas = new javax.swing.JTable();
        txtResID = new javax.swing.JTextField();
        btnValidacion = new javax.swing.JButton();
        btnGuardar = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();

        setIconifiable(true);
        setMaximizable(true);
        setTitle("GESTIONAR RUTAS");
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

        jLabel2.setFont(new java.awt.Font("Centaur", 1, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Codigo Carro:");

        jLabel3.setFont(new java.awt.Font("Centaur", 1, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Accion:");

        jLabel4.setFont(new java.awt.Font("Centaur", 1, 18)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Hora:");

        jLabel5.setFont(new java.awt.Font("Centaur", 1, 18)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Fecha:");

        jLabel6.setFont(new java.awt.Font("Centaur", 1, 18)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("Desde-Hacia:");

        txtHora.setFont(new java.awt.Font("Centaur", 0, 18)); // NOI18N
        txtHora.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtHoraActionPerformed(evt);
            }
        });

        txtFecha.setFont(new java.awt.Font("Centaur", 0, 18)); // NOI18N

        cbxAccion.setFont(new java.awt.Font("Centaur", 0, 18)); // NOI18N
        cbxAccion.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Seleccione", "Entra", "Sale" }));

        cbxEmpresas.setFont(new java.awt.Font("Centaur", 0, 18)); // NOI18N
        cbxEmpresas.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Seleccione" }));

        btnSalir.setBackground(new java.awt.Color(255, 255, 255));
        btnSalir.setFont(new java.awt.Font("Centaur", 1, 14)); // NOI18N
        btnSalir.setForeground(new java.awt.Color(24, 106, 240));
        btnSalir.setText("SALIR");
        btnSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSalirActionPerformed(evt);
            }
        });

        lblimagen.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/logpq.jpg"))); // NOI18N

        jLabel8.setFont(new java.awt.Font("Centaur", 1, 18)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setText(" Sucursal:");

        cbxSucursales.setFont(new java.awt.Font("Centaur", 0, 18)); // NOI18N
        cbxSucursales.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Seleccione" }));

        btnlimpiar.setBackground(new java.awt.Color(255, 255, 255));
        btnlimpiar.setFont(new java.awt.Font("Centaur", 1, 14)); // NOI18N
        btnlimpiar.setForeground(new java.awt.Color(24, 106, 240));
        btnlimpiar.setText("LIMPIAR");
        btnlimpiar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnlimpiarActionPerformed(evt);
            }
        });

        cbxCodigoCarro.setFont(new java.awt.Font("Centaur", 0, 18)); // NOI18N
        cbxCodigoCarro.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Seleccione" }));
        cbxCodigoCarro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbxCodigoCarroActionPerformed(evt);
            }
        });

        tblRutas.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "FECHA", "HORA", "ACCION", "SUCURSAL ORIGEN", "DESDE-HACIA"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tblRutas.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblRutasMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tblRutas);
        if (tblRutas.getColumnModel().getColumnCount() > 0) {
            tblRutas.getColumnModel().getColumn(0).setResizable(false);
            tblRutas.getColumnModel().getColumn(1).setResizable(false);
            tblRutas.getColumnModel().getColumn(2).setResizable(false);
            tblRutas.getColumnModel().getColumn(3).setResizable(false);
            tblRutas.getColumnModel().getColumn(4).setResizable(false);
        }

        txtResID.setEditable(false);

        btnValidacion.setFont(new java.awt.Font("Centaur", 1, 14)); // NOI18N
        btnValidacion.setForeground(new java.awt.Color(24, 106, 240));
        btnValidacion.setText("VALIDAR");
        btnValidacion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnValidacionActionPerformed(evt);
            }
        });

        btnGuardar.setBackground(new java.awt.Color(255, 255, 255));
        btnGuardar.setFont(new java.awt.Font("Centaur", 1, 14)); // NOI18N
        btnGuardar.setForeground(new java.awt.Color(24, 106, 240));
        btnGuardar.setText("GUARDAR");
        btnGuardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGuardarActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Centaur", 1, 14)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("ID RUTA:");

        jLabel7.setFont(new java.awt.Font("Centaur", 1, 16)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel7.setText("TABLA RUTAS");

        jLabel9.setFont(new java.awt.Font("Centaur", 1, 14)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(255, 255, 255));
        jLabel9.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel9.setText("Despues de seleccionar el CODIGO CARRO, debe seleccionar el ultimo registro de la tabla 'RUTAS' y continuar con la creacion de  la la misma.");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(29, 29, 29)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 610, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(233, 233, 233)
                                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(26, 26, 26)
                                .addComponent(txtResID, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jLabel6, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 137, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 147, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(47, 47, 47)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(cbxSucursales, javax.swing.GroupLayout.PREFERRED_SIZE, 313, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(cbxEmpresas, javax.swing.GroupLayout.PREFERRED_SIZE, 313, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                        .addComponent(cbxAccion, javax.swing.GroupLayout.PREFERRED_SIZE, 313, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(101, 101, 101))))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jLabel5, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 82, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel4, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 121, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(75, 75, 75)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(txtFecha)
                                    .addComponent(txtHora)
                                    .addComponent(cbxCodigoCarro, javax.swing.GroupLayout.PREFERRED_SIZE, 313, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(99, 99, 99))))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(btnGuardar, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btnValidacion)
                        .addGap(126, 126, 126)
                        .addComponent(btnlimpiar, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(162, 162, 162)
                        .addComponent(btnSalir, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(320, 320, 320))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(lblimagen, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(60, 60, 60)
                        .addComponent(jLabel9, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(99, 99, 99))))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(157, 157, 157)
                .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 355, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblimagen, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel9))
                .addGap(5, 5, 5)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtResID, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel1))
                        .addGap(18, 18, 18)
                        .addComponent(jLabel7)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 284, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(145, 145, 145))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(55, 55, 55)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel2)
                            .addComponent(cbxCodigoCarro, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(43, 43, 43)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel4)
                            .addComponent(txtHora, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(43, 43, 43)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel5)
                            .addComponent(txtFecha, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(43, 43, 43)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(cbxAccion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(43, 43, 43)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel8)
                            .addComponent(cbxSucursales, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(43, 43, 43)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(cbxEmpresas, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel6))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnSalir)
                    .addComponent(btnlimpiar)
                    .addComponent(btnValidacion)
                    .addComponent(btnGuardar))
                .addGap(42, 42, 42))
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

    private void txtHoraActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtHoraActionPerformed

        txtFecha.requestFocus();
    }//GEN-LAST:event_txtHoraActionPerformed

    private void btnSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSalirActionPerformed
        gr = null;
        dispose();
    }//GEN-LAST:event_btnSalirActionPerformed

    private void formInternalFrameClosing(javax.swing.event.InternalFrameEvent evt) {//GEN-FIRST:event_formInternalFrameClosing
        gr = null;
    }//GEN-LAST:event_formInternalFrameClosing

    private void btnlimpiarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnlimpiarActionPerformed
        limpiar();
    }//GEN-LAST:event_btnlimpiarActionPerformed

    private void cbxCodigoCarroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbxCodigoCarroActionPerformed
        txtResID.setText("");
        String cod = cbxCodigoCarro.getSelectedItem().toString();
        listarSeleccionado(cod);

    }//GEN-LAST:event_cbxCodigoCarroActionPerformed

    private void tblRutasMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblRutasMouseClicked
        int fila = tblRutas.getSelectedRow();
        if (fila == -1) {
            JOptionPane.showMessageDialog(null, "Ruta no seleccionada...!!!!");
        } else {
            int id = Integer.parseInt((String) tblRutas.getValueAt(fila, 0).toString());

            txtResID.setText("" + id);

        }
    }//GEN-LAST:event_tblRutasMouseClicked

    private void btnValidacionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnValidacionActionPerformed
        if (txtResID.getText().toString().length() == 0) {
            JOptionPane.showMessageDialog(null, "Debe seleccionar el ultimo registro de la tabla 'RUTAS'!!!!");

        }
        validacion();
    }//GEN-LAST:event_btnValidacionActionPerformed

    private void btnGuardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGuardarActionPerformed
        guardar();
    }//GEN-LAST:event_btnGuardarActionPerformed
//********************************************************************************************************************************************

    public void validacion() {
        String sucur, accion;
        sucur = cbxSucursales.getSelectedItem().toString();
        accion = cbxAccion.getSelectedItem().toString();

        try {

            PreparedStatement ps;
            ResultSet rs;
            Conexion conn = new Conexion();
            Connection con = conn.getConnection();

            ps = con.prepareStatement("SELECT accion,destino_s FROM  rutas WHERE id=?");
            ps.setString(1, txtResID.getText());

            rs = ps.executeQuery();

            while (rs.next()) {
                String suc, acc;
                suc = rs.getString("destino_s");
                acc = rs.getString("accion");

                if (sucur.equalsIgnoreCase(suc)) {

                    JOptionPane.showMessageDialog(null, "Presione 'Aceptar' para continuar con la validacion");

                    if (!accion.equalsIgnoreCase(acc)) {
                        btnValidacion.setVisible(false);

                        JOptionPane.showMessageDialog(null, "Puede continuar creando la ruta");

                        btnGuardar.setVisible(true);
                    } else {

                        JOptionPane.showMessageDialog(null, "El vehiculo no puede ejecutar esta accion, por favor verifique");
                    }
                } else {

                    JOptionPane.showMessageDialog(null, "El vehiculo no se encuntra en esta sucursal, por favor verifique");
                }
            }

        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Error " + (e));

        }
    }
//********************************************************************************************************************************************    

    public void listarSeleccionado(String c) {
        try {
            DefaultTableModel modelo = new DefaultTableModel();
            tblRutas.setModel(modelo);
            PreparedStatement ps = null;
            ResultSet rs;
            Conexion conn = new Conexion();
            Connection con = conn.getConnection();

            String sql = "SELECT id,fecha,hora,accion,destino_s,desde_hacia FROM  rutas WHERE codigo_carro='" + c + "'";

            ps = con.prepareStatement(sql);
            rs = ps.executeQuery();

            ResultSetMetaData rsMD = rs.getMetaData();
            int cantidadColumnas = rsMD.getColumnCount();

            modelo.addColumn("ID");
            modelo.addColumn("FECHA");
            modelo.addColumn("HORA");
            modelo.addColumn("ACCION");
            modelo.addColumn("SUCURSAL ORIGEN");
            modelo.addColumn("DESDE-HACIA");

            while (rs.next()) {
                Object[] filas = new Object[cantidadColumnas];

                for (int i = 0; i < cantidadColumnas; i++) {
                    filas[i] = rs.getObject(i + 1);

                }
                modelo.addRow(filas);
            }
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, ex.toString());
        }

    }

//********************************************************************************************************************************************
    public void limpiar() {
        cbxCodigoCarro.setSelectedIndex(0);
        txtResID.setText("");
        cbxAccion.setSelectedIndex(0);
        cbxEmpresas.setSelectedIndex(0);
        cbxEmpresas.setEnabled(true);
        cbxSucursales.setSelectedIndex(0);
        cbxSucursales.setEnabled(true);
        btnGuardar.setVisible(false);
        btnValidacion.setVisible(true);
    }
//********************************************************************************************************************************************

    public void guardar() {

        Conexion conn = new Conexion();
        Connection con = conn.getConnection();

        try {

            ps = con.prepareStatement("INSERT INTO rutas (codigo_carro,accion,hora,fecha,destino_s,desde_hacia)VALUES(?,?,?,?,?,?)");

            ps.setString(1, cbxCodigoCarro.getSelectedItem().toString());
            ps.setString(2, cbxAccion.getSelectedItem().toString());
            ps.setString(3, txtHora.getText());
            ps.setString(4, txtFecha.getText());
            ps.setString(5, cbxSucursales.getSelectedItem().toString());
            ps.setString(6, cbxEmpresas.getSelectedItem().toString());

            int res = ps.executeUpdate();

            if (res > 0) {
                JOptionPane.showMessageDialog(null, "Ruta Creada");

                limpiar();

            } else {
                JOptionPane.showMessageDialog(null, "Error al Crear Ruta");

            }
        } catch (Exception e) {
            System.err.println(e);
        }

    }

//********************************************************************************************************************************************
    class horas implements ActionListener {

        public void actionPerformed(ActionEvent e) {
            Date sistHora = new Date();
            String pmAm = "hh:mm:ss ";
            SimpleDateFormat format = new SimpleDateFormat(pmAm);
            Calendar hoy = Calendar.getInstance();
            txtHora.setText(String.format(format.format(sistHora), hoy));

        }

    }
//********************************************************************************************************************************************

    private void llenarNombreSuc(JComboBox nomsuc) {
        Conexion conn = new Conexion();
        Connection con = conn.getConnection();

        String sql = "SELECT codigo  FROM sucursales";
        try {
            ps = con.prepareStatement(sql);
            rs = ps.executeQuery();
            while (rs.next()) {
                nomsuc.addItem(rs.getString("codigo"));
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
        }
    }

    //********************************************************************************************************************************************
    private void llenarNombreEmp(JComboBox nomemp) {
        Conexion conn = new Conexion();
        Connection con = conn.getConnection();

        String sql = "SELECT nombre_empresa FROM clientes";
        try {
            ps = con.prepareStatement(sql);
            rs = ps.executeQuery();
            while (rs.next()) {
                nomemp.addItem(rs.getString("nombre_empresa"));

            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
        }
    }

    //********************************************************************************************************************************************
    private void llenarCodCarro(JComboBox codcarro) {
        Conexion conn = new Conexion();
        Connection con = conn.getConnection();

        String sql = "SELECT codigo FROM camiones";
        try {
            ps = con.prepareStatement(sql);
            rs = ps.executeQuery();
            while (rs.next()) {
                codcarro.addItem(rs.getString("codigo"));

            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
        }
    }

    //***********************************************************************************************************************************
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnGuardar;
    private javax.swing.JButton btnSalir;
    private javax.swing.JButton btnValidacion;
    private javax.swing.JButton btnlimpiar;
    private javax.swing.JComboBox<String> cbxAccion;
    private javax.swing.JComboBox<String> cbxCodigoCarro;
    private javax.swing.JComboBox<String> cbxEmpresas;
    private javax.swing.JComboBox<String> cbxSucursales;
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
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblimagen;
    private javax.swing.JTable tblRutas;
    private javax.swing.JTextField txtFecha;
    private javax.swing.JTextField txtHora;
    private javax.swing.JTextField txtResID;
    // End of variables declaration//GEN-END:variables
}
