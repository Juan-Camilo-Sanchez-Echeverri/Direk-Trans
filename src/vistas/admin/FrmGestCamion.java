package vistas.admin;

import clases.Conexion;
import java.awt.event.KeyEvent;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import javax.swing.JComboBox;
import javax.swing.JOptionPane;

public class FrmGestCamion extends javax.swing.JInternalFrame {

    public static String gc;
    PreparedStatement ps;
    ResultSet rs;

    public FrmGestCamion() {
        initComponents();
        llenarplaca(cbxPlacaCamion);
        cbxPlacaCamion.removeItem("Seleccione");
//******************************************nos sirve para centrar el internalframe dentro del destokpane****************************
        int a = FrmAdmin.FondoAdmin.getWidth() - this.getWidth();
        int b = FrmAdmin.FondoAdmin.getHeight() - this.getHeight();
        setLocation(a / 2, b / 2);
//***********************************************************CAMILO*************************************************************************
        txtID.setVisible(false);
        gc = "gc";
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
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        txtPlaca = new javax.swing.JTextField();
        txtCodigo = new javax.swing.JTextField();
        txtCapacidad = new javax.swing.JTextField();
        txtMarca = new javax.swing.JTextField();
        cbxTipo = new javax.swing.JComboBox<>();
        txtNom_Propietario = new javax.swing.JTextField();
        txtTel_Propietario = new javax.swing.JTextField();
        cbxServicios = new javax.swing.JComboBox<>();
        cbxEstado = new javax.swing.JComboBox<>();
        txtID = new javax.swing.JTextField();
        btnBuscar = new javax.swing.JButton();
        btnAgregar = new javax.swing.JButton();
        btnModificar = new javax.swing.JButton();
        btnEliminar = new javax.swing.JButton();
        checktenico = new javax.swing.JComboBox<>();
        check_contra = new javax.swing.JComboBox<>();
        checksoat = new javax.swing.JComboBox<>();
        jLabel1 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        btnSalir = new javax.swing.JButton();
        jLabel11 = new javax.swing.JLabel();
        btnLimp = new javax.swing.JButton();
        cbxPlacaCamion = new javax.swing.JComboBox<>();
        jLabel14 = new javax.swing.JLabel();

        setIconifiable(true);
        setMaximizable(true);
        setTitle("GESTIONAR CAMIONES");
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
        jLabel2.setText("Codigo:");

        jLabel3.setFont(new java.awt.Font("Centaur", 1, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Placa:");

        jLabel4.setFont(new java.awt.Font("Centaur", 1, 18)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Capacidad:");

        jLabel5.setFont(new java.awt.Font("Centaur", 1, 18)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Marca:");

        jLabel6.setFont(new java.awt.Font("Centaur", 1, 18)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("Tipo:");

        jLabel7.setFont(new java.awt.Font("Centaur", 1, 18)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("Nombre Propietario:");

        jLabel8.setFont(new java.awt.Font("Centaur", 1, 18)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setText("Telefono Propietario:");

        jLabel10.setFont(new java.awt.Font("Centaur", 1, 18)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(255, 255, 255));
        jLabel10.setText("Tecnicomecanica");

        jLabel9.setFont(new java.awt.Font("Centaur", 1, 18)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(255, 255, 255));
        jLabel9.setText("Estado:");

        txtPlaca.setFont(new java.awt.Font("Centaur", 0, 18)); // NOI18N
        txtPlaca.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtPlacaActionPerformed(evt);
            }
        });

        txtCodigo.setFont(new java.awt.Font("Centaur", 0, 18)); // NOI18N
        txtCodigo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtCodigoActionPerformed(evt);
            }
        });

        txtCapacidad.setFont(new java.awt.Font("Centaur", 0, 18)); // NOI18N
        txtCapacidad.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtCapacidadActionPerformed(evt);
            }
        });

        txtMarca.setFont(new java.awt.Font("Centaur", 0, 18)); // NOI18N
        txtMarca.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtMarcaActionPerformed(evt);
            }
        });

        cbxTipo.setFont(new java.awt.Font("Centaur", 0, 18)); // NOI18N
        cbxTipo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Seleccione", "camion", "furgon", "tractomula" }));

        txtNom_Propietario.setFont(new java.awt.Font("Centaur", 0, 18)); // NOI18N
        txtNom_Propietario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNom_PropietarioActionPerformed(evt);
            }
        });

        txtTel_Propietario.setFont(new java.awt.Font("Centaur", 0, 18)); // NOI18N
        txtTel_Propietario.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtTel_PropietarioKeyTyped(evt);
            }
        });

        cbxServicios.setFont(new java.awt.Font("Centaur", 0, 18)); // NOI18N
        cbxServicios.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Seleccione", "local", "nacional", "internacional", " " }));

        cbxEstado.setFont(new java.awt.Font("Centaur", 0, 18)); // NOI18N
        cbxEstado.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Seleccione", "activo", "inactivo" }));
        cbxEstado.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                cbxEstadoKeyPressed(evt);
            }
        });

        txtID.setEditable(false);
        txtID.setFont(new java.awt.Font("Centaur", 0, 18)); // NOI18N
        txtID.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        btnBuscar.setBackground(new java.awt.Color(255, 255, 255));
        btnBuscar.setFont(new java.awt.Font("Centaur", 1, 14)); // NOI18N
        btnBuscar.setForeground(new java.awt.Color(24, 102, 240));
        btnBuscar.setText("BUSCAR");
        btnBuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBuscarActionPerformed(evt);
            }
        });

        btnAgregar.setBackground(new java.awt.Color(255, 255, 255));
        btnAgregar.setFont(new java.awt.Font("Centaur", 1, 14)); // NOI18N
        btnAgregar.setForeground(new java.awt.Color(24, 106, 240));
        btnAgregar.setText("AGREGAR");
        btnAgregar.setPreferredSize(new java.awt.Dimension(160, 30));
        btnAgregar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAgregarActionPerformed(evt);
            }
        });

        btnModificar.setBackground(new java.awt.Color(255, 255, 255));
        btnModificar.setFont(new java.awt.Font("Centaur", 1, 14)); // NOI18N
        btnModificar.setForeground(new java.awt.Color(24, 106, 240));
        btnModificar.setText("MODIFICAR");
        btnModificar.setPreferredSize(new java.awt.Dimension(160, 30));
        btnModificar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnModificarActionPerformed(evt);
            }
        });

        btnEliminar.setBackground(new java.awt.Color(255, 255, 255));
        btnEliminar.setFont(new java.awt.Font("Centaur", 1, 14)); // NOI18N
        btnEliminar.setForeground(new java.awt.Color(24, 106, 240));
        btnEliminar.setText("ELIMINAR");
        btnEliminar.setPreferredSize(new java.awt.Dimension(160, 30));
        btnEliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEliminarActionPerformed(evt);
            }
        });

        checktenico.setFont(new java.awt.Font("Centaur", 0, 18)); // NOI18N
        checktenico.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "seleccione", "si", "no" }));

        check_contra.setFont(new java.awt.Font("Centaur", 0, 18)); // NOI18N
        check_contra.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "seleccione", "si", "no" }));

        checksoat.setFont(new java.awt.Font("Centaur", 0, 18)); // NOI18N
        checksoat.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "seleccione", "si", "no" }));

        jLabel1.setFont(new java.awt.Font("Centaur", 1, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel1.setText("S.O.AT");

        jLabel13.setFont(new java.awt.Font("Centaur", 1, 18)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(255, 255, 255));
        jLabel13.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel13.setText("Contraterceros");

        btnSalir.setBackground(new java.awt.Color(255, 255, 255));
        btnSalir.setFont(new java.awt.Font("Centaur", 1, 14)); // NOI18N
        btnSalir.setForeground(new java.awt.Color(24, 106, 240));
        btnSalir.setText("SALIR");
        btnSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSalirActionPerformed(evt);
            }
        });

        jLabel11.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/logpq.jpg"))); // NOI18N

        btnLimp.setBackground(new java.awt.Color(255, 255, 255));
        btnLimp.setFont(new java.awt.Font("Centaur", 1, 14)); // NOI18N
        btnLimp.setForeground(new java.awt.Color(24, 106, 240));
        btnLimp.setText("LIMPIAR");
        btnLimp.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLimpActionPerformed(evt);
            }
        });

        cbxPlacaCamion.setFont(new java.awt.Font("Centaur", 0, 18)); // NOI18N
        cbxPlacaCamion.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Seleccione" }));
        cbxPlacaCamion.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                cbxPlacaCamionKeyPressed(evt);
            }
        });

        jLabel14.setFont(new java.awt.Font("Centaur", 1, 18)); // NOI18N
        jLabel14.setForeground(new java.awt.Color(255, 255, 255));
        jLabel14.setText("Servicios:");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(464, 464, 464)
                        .addComponent(txtID, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(163, 163, 163)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 162, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGroup(jPanel1Layout.createSequentialGroup()
                                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, 162, Short.MAX_VALUE)
                                        .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, 162, Short.MAX_VALUE)
                                        .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                    .addGap(39, 39, 39)
                                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                        .addComponent(txtCapacidad, javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(txtMarca, javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(txtPlaca, javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(txtCodigo, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 249, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGroup(jPanel1Layout.createSequentialGroup()
                                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                        .addComponent(jLabel7, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(jLabel8, javax.swing.GroupLayout.Alignment.LEADING))
                                    .addGap(39, 39, 39)
                                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(txtNom_Propietario)
                                        .addComponent(txtTel_Propietario, javax.swing.GroupLayout.PREFERRED_SIZE, 249, javax.swing.GroupLayout.PREFERRED_SIZE))))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(btnSalir, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(54, 54, 54)
                                .addComponent(btnAgregar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 40, Short.MAX_VALUE)
                                .addComponent(btnModificar, javax.swing.GroupLayout.PREFERRED_SIZE, 148, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(58, 58, 58)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel14, javax.swing.GroupLayout.PREFERRED_SIZE, 128, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(jLabel9, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jLabel13, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jLabel10, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 126, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(30, 30, 30)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(cbxTipo, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(cbxServicios, 0, 1, Short.MAX_VALUE)
                                .addComponent(check_contra, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(checktenico, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(cbxEstado, javax.swing.GroupLayout.PREFERRED_SIZE, 167, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(checksoat, javax.swing.GroupLayout.PREFERRED_SIZE, 167, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(45, 45, 45)
                        .addComponent(btnEliminar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnLimp, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(215, 215, 215))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 114, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(cbxPlacaCamion, javax.swing.GroupLayout.PREFERRED_SIZE, 249, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(96, 96, 96)
                .addComponent(btnBuscar)
                .addGap(484, 484, 484))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(82, 82, 82)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btnBuscar)
                            .addComponent(cbxPlacaCamion, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(25, 25, 25)
                        .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 78, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(46, 46, 46)
                        .addComponent(txtID, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel2)
                            .addComponent(txtCodigo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(cbxTipo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(30, 30, 30)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtPlaca)
                            .addComponent(jLabel14, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(cbxServicios, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(30, 30, 30)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel4)
                            .addComponent(txtCapacidad, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(cbxEstado, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(30, 30, 30)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel5)
                            .addComponent(txtMarca, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(checksoat, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(30, 30, 30)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel7)
                            .addComponent(txtNom_Propietario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel13)
                            .addComponent(check_contra, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(30, 30, 30)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel8)
                            .addComponent(txtTel_Propietario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel10)
                            .addComponent(checktenico, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(77, 77, 77)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnModificar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnAgregar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnSalir, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnEliminar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnLimp, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(78, 78, 78))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtPlacaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtPlacaActionPerformed
        txtCapacidad.requestFocus();
    }//GEN-LAST:event_txtPlacaActionPerformed

    private void txtCodigoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtCodigoActionPerformed
        txtPlaca.requestFocus();
    }//GEN-LAST:event_txtCodigoActionPerformed

    private void txtCapacidadActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtCapacidadActionPerformed
        txtMarca.requestFocus();
    }//GEN-LAST:event_txtCapacidadActionPerformed

    private void txtMarcaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtMarcaActionPerformed
        txtNom_Propietario.requestFocus();
    }//GEN-LAST:event_txtMarcaActionPerformed

    private void txtNom_PropietarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNom_PropietarioActionPerformed
        txtTel_Propietario.requestFocus();
    }//GEN-LAST:event_txtNom_PropietarioActionPerformed

    private void txtTel_PropietarioKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtTel_PropietarioKeyTyped
        char c = evt.getKeyChar();
        if (Character.isLetter(c)) {
            getToolkit().beep();
            evt.consume();
            JOptionPane.showMessageDialog(null, "Solo numeros");
        }
    }//GEN-LAST:event_txtTel_PropietarioKeyTyped

    private void btnBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBuscarActionPerformed
        btnAgregar.setEnabled(false);
        buscar();
    }//GEN-LAST:event_btnBuscarActionPerformed

    private void btnAgregarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAgregarActionPerformed
        agregar();
    }//GEN-LAST:event_btnAgregarActionPerformed

    private void btnModificarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnModificarActionPerformed
        modificar();
    }//GEN-LAST:event_btnModificarActionPerformed

    private void btnEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEliminarActionPerformed
        eliminar();
    }//GEN-LAST:event_btnEliminarActionPerformed

    private void btnSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSalirActionPerformed
         gc =null;
        dispose();
    }//GEN-LAST:event_btnSalirActionPerformed

    private void formInternalFrameClosing(javax.swing.event.InternalFrameEvent evt) {//GEN-FIRST:event_formInternalFrameClosing
        gc =null;
    }//GEN-LAST:event_formInternalFrameClosing

    private void btnLimpActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLimpActionPerformed
        limpiar();
    }//GEN-LAST:event_btnLimpActionPerformed

    private void cbxPlacaCamionKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_cbxPlacaCamionKeyPressed
     if (evt.getKeyCode() == KeyEvent.VK_ENTER) {
            if (cbxPlacaCamion.getSelectedItem().equals("Seleccione")) {
                JOptionPane.showMessageDialog(null, "El campo debe tener informacion, por favor verifique");
            } else {
                btnAgregar.setEnabled(false);
                buscar();
            }

        }
    }//GEN-LAST:event_cbxPlacaCamionKeyPressed

    private void cbxEstadoKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_cbxEstadoKeyPressed
      if (evt.getKeyCode() == KeyEvent.VK_ENTER) {
            if (cbxEstado.getSelectedItem().equals("Seleccione")) {
                JOptionPane.showMessageDialog(null, "El campo debe tener informacion, por favor verifique");
            } else {
                buscar();
            }

        }
    }//GEN-LAST:event_cbxEstadoKeyPressed

//****************************************************************************************************************
//****************************************************************************************************************    
    void limpiar() {
        txtID.setText("");
        txtCodigo.setText("");
        txtPlaca.setText("");
        txtCapacidad.setText("");
        txtMarca.setText("");
        cbxTipo.setSelectedItem(null);
        txtNom_Propietario.setText("");
        txtTel_Propietario.setText("");
        cbxServicios.setSelectedItem(null);
        check_contra.setSelectedItem(null);
        checksoat.setSelectedItem(null);
        checktenico.setSelectedItem(null);
        cbxEstado.setSelectedItem(null);
        cbxPlacaCamion.setSelectedIndex(0);

        txtCodigo.requestFocus();
        actualizar();

    }
    
      void actualizar() {
        cbxPlacaCamion.removeAllItems();
        llenarplaca(cbxPlacaCamion);

    }
//****************************************************************************************************************

    public void buscar() {
        Conexion conn = new Conexion();
        Connection con = conn.getConnection();

        try {
            ps = con.prepareStatement("SELECT * FROM  camiones WHERE placa = ?");
            ps.setString(1, cbxPlacaCamion.getSelectedItem().toString());

            rs = ps.executeQuery();

            if (rs.next()) {
                txtID.setText(rs.getString("id"));
                txtCodigo.setText(rs.getString("codigo"));
                txtPlaca.setText(rs.getString("placa"));
                txtCapacidad.setText(rs.getString("capacidad"));
                txtMarca.setText(rs.getString("marca"));
                cbxTipo.setSelectedItem(rs.getString("tipo"));
                txtNom_Propietario.setText(rs.getString("nom_pro"));
                txtTel_Propietario.setText(rs.getString("tel_pro"));
                cbxServicios.setSelectedItem(rs.getString("servicios"));
                checksoat.setSelectedItem(rs.getString("soat"));
                check_contra.setSelectedItem(rs.getString("cont_ter"));
                checktenico.setSelectedItem(rs.getString("tecnom"));
                cbxEstado.setSelectedItem(rs.getString("estado"));
                
            } else {
                JOptionPane.showMessageDialog(null, "No Se Encuentra Ningun Camion Registrado Con Esa Placa");
            }
        } catch (Exception e) {
            System.err.println(e);

        }

    }
//****************************************************************************************************************

    public void agregar() {

        Conexion conn = new Conexion();
        Connection con = conn.getConnection();

        try {

            ps = con.prepareStatement("INSERT INTO camiones (codigo,placa,capacidad,marca,tipo,nombre_propietario,telefono_propietario,servicios,soat,cont_ter,tecnom,estado )VALUES(?,?,?,?,?,?,?,?,?,?,?,?)");

            ps.setString(1, txtCodigo.getText());
            ps.setString(2, txtPlaca.getText());
            ps.setString(3, txtCapacidad.getText());
            ps.setString(4, txtMarca.getText());
            ps.setString(5, cbxTipo.getSelectedItem().toString());
            ps.setString(6, txtNom_Propietario.getText());
            ps.setString(7, txtTel_Propietario.getText());
            ps.setString(8, cbxServicios.getSelectedItem().toString());
            ps.setString(9, checksoat.getSelectedItem().toString());
            ps.setString(10, check_contra.getSelectedItem().toString());
            ps.setString(11, checktenico.getSelectedItem().toString());
            ps.setString(12, cbxEstado.getSelectedItem().toString());

            int res = ps.executeUpdate();

            if (res > 0) {
                JOptionPane.showMessageDialog(null, "Camion Guardado");
                limpiar();
            } else {
                JOptionPane.showMessageDialog(null, "Error al guardar Camion");

            }
        } catch (Exception e) {
            System.err.println(e);
        }

    }
//****************************************************************************************************************

    public void modificar() {

        Conexion conn = new Conexion();
        Connection con = conn.getConnection();

        try {

            ps = con.prepareStatement("UPDATE camiones SET codigo=?,placa=?,capacidad=?, marca=?,tipo=?,nom_pro=?,tel_pro=?,servicios=?,soat=?,cont_ter=?,tecnom=?,estado=? WHERE id=? ");

            ps.setString(1, txtCodigo.getText());
            ps.setString(2, txtPlaca.getText());
            ps.setString(3, txtCapacidad.getText());
            ps.setString(4, txtMarca.getText());
            ps.setString(5, cbxTipo.getSelectedItem().toString());
            ps.setString(6, txtNom_Propietario.getText());
            ps.setString(7, txtTel_Propietario.getText());
            ps.setString(8, cbxServicios.getSelectedItem().toString());
            ps.setString(9, checksoat.getSelectedItem().toString());
            ps.setString(10, check_contra.getSelectedItem().toString());
            ps.setString(11, checktenico.getSelectedItem().toString());
            ps.setString(12, cbxEstado.getSelectedItem().toString());
            ps.setString(13, txtID.getText());
          

            

            int res = ps.executeUpdate();

            if (res > 0) {
                JOptionPane.showMessageDialog(null, "Camion Modificado");
                limpiar();
                 cbxPlacaCamion.setSelectedIndex(0);
            } else {
                JOptionPane.showMessageDialog(null, "Error al modificar");
                ;
            }
        } catch (Exception e) {
            System.err.println(e);
        }

    }
//****************************************************************************************************************

    public void eliminar() {

        Conexion conn = new Conexion();
        Connection con = conn.getConnection();
        try {

            ps = con.prepareStatement("DELETE FROM camiones WHERE id=?");
            ps.setInt(1, Integer.parseInt(txtID.getText()));

            int res = ps.executeUpdate();

            if (res > 0) {
                JOptionPane.showMessageDialog(null, "Camion Eliminado");
                limpiar();
                 cbxPlacaCamion.setSelectedIndex(0);
            } else {
                JOptionPane.showMessageDialog(null, "Error al eliminar Camion");

            }

            con.close();

        } catch (Exception e) {
            System.err.println(e);
        }

    }
//****************************************************************************************************************
    private void llenarplaca(JComboBox codcarro) {
        Conexion conn = new Conexion();
        Connection con = conn.getConnection();
        
        String sql = "SELECT placa FROM camiones";
        try {
            ps = con.prepareStatement(sql);
            rs = ps.executeQuery();
            codcarro.addItem("Seleccione");
            while(rs.next()){
             codcarro.addItem(rs.getString("placa"));

            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
        }
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAgregar;
    private javax.swing.JButton btnBuscar;
    private javax.swing.JButton btnEliminar;
    private javax.swing.JButton btnLimp;
    private javax.swing.JButton btnModificar;
    private javax.swing.JButton btnSalir;
    private javax.swing.JComboBox<String> cbxEstado;
    private javax.swing.JComboBox<String> cbxPlacaCamion;
    private javax.swing.JComboBox<String> cbxServicios;
    private javax.swing.JComboBox<String> cbxTipo;
    private javax.swing.JComboBox<String> check_contra;
    private javax.swing.JComboBox<String> checksoat;
    private javax.swing.JComboBox<String> checktenico;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTextField txtCapacidad;
    private javax.swing.JTextField txtCodigo;
    private javax.swing.JTextField txtID;
    private javax.swing.JTextField txtMarca;
    private javax.swing.JTextField txtNom_Propietario;
    private javax.swing.JTextField txtPlaca;
    private javax.swing.JTextField txtTel_Propietario;
    // End of variables declaration//GEN-END:variables
}
