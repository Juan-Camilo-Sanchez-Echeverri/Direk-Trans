 
package vistas.visitante;


public class FrmInServicios extends javax.swing.JInternalFrame {

    public static String s;

    public FrmInServicios() {
        initComponents();
        s = "s";
//******************************************nos sirve para centrar el internalframe dentro del destokpane****************************
        int a = FrmPpalVisitantes.FondoVisit.getWidth() - this.getWidth();
        int b= FrmPpalVisitantes.FondoVisit.getHeight() - this.getHeight();
        setLocation(a / 2, b / 2);
//************************************************************************************************************************************    
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        PnlSucursale = new javax.swing.JPanel();
        lblTitulo = new javax.swing.JLabel();
        btnSalir = new javax.swing.JButton();
        lblMiniLogo = new javax.swing.JLabel();
        btnCamion = new javax.swing.JButton();
        btnFurgon = new javax.swing.JButton();
        btnMula = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();

        setIconifiable(true);
        setMaximizable(true);
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

        PnlSucursale.setBackground(new java.awt.Color(24, 106, 240));
        PnlSucursale.setPreferredSize(new java.awt.Dimension(1335, 649));

        lblTitulo.setFont(new java.awt.Font("Centaur", 1, 30)); // NOI18N
        lblTitulo.setForeground(new java.awt.Color(255, 255, 255));
        lblTitulo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblTitulo.setText("DIREK TRANS");
        lblTitulo.setPreferredSize(new java.awt.Dimension(1299, 29));

        btnSalir.setBackground(new java.awt.Color(255, 255, 255));
        btnSalir.setFont(new java.awt.Font("Centaur", 1, 14)); // NOI18N
        btnSalir.setForeground(new java.awt.Color(24, 106, 240));
        btnSalir.setText("SALIR");
        btnSalir.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnSalir.setPreferredSize(new java.awt.Dimension(120, 30));
        btnSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSalirActionPerformed(evt);
            }
        });

        lblMiniLogo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/logpq.jpg"))); // NOI18N
        lblMiniLogo.setPreferredSize(new java.awt.Dimension(105, 70));

        btnCamion.setBackground(new java.awt.Color(51, 153, 255));
        btnCamion.setFont(new java.awt.Font("Centaur", 1, 18)); // NOI18N
        btnCamion.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/cam.png"))); // NOI18N
        btnCamion.setToolTipText("Dale click para conocer mas de Camiones");
        btnCamion.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btnCamion.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnCamion.setPreferredSize(new java.awt.Dimension(300, 300));
        btnCamion.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btnCamion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCamionActionPerformed(evt);
            }
        });

        btnFurgon.setBackground(new java.awt.Color(51, 153, 255));
        btnFurgon.setFont(new java.awt.Font("Centaur", 1, 18)); // NOI18N
        btnFurgon.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/furg.png"))); // NOI18N
        btnFurgon.setToolTipText("Dale click para conocer mas de Furgones");
        btnFurgon.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btnFurgon.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnFurgon.setPreferredSize(new java.awt.Dimension(300, 300));
        btnFurgon.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btnFurgon.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnFurgonActionPerformed(evt);
            }
        });

        btnMula.setBackground(new java.awt.Color(51, 153, 255));
        btnMula.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/mula.png"))); // NOI18N
        btnMula.setToolTipText("Dale click para conocer mas de Tractomulas");
        btnMula.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btnMula.setPreferredSize(new java.awt.Dimension(300, 300));
        btnMula.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnMulaActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Centaur", 1, 20)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("FURGONES CON Y SIN TERMO");

        jLabel2.setFont(new java.awt.Font("Centaur", 1, 36)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("** NUESTROS    SERVICIOS **");

        jLabel3.setFont(new java.awt.Font("Centaur", 1, 20)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText("CAMIONES CON Y SIN TERMO");

        jLabel4.setFont(new java.awt.Font("Centaur", 1, 20)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel4.setText("MULAS CON Y SIN TERMO");

        javax.swing.GroupLayout PnlSucursaleLayout = new javax.swing.GroupLayout(PnlSucursale);
        PnlSucursale.setLayout(PnlSucursaleLayout);
        PnlSucursaleLayout.setHorizontalGroup(
            PnlSucursaleLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PnlSucursaleLayout.createSequentialGroup()
                .addGroup(PnlSucursaleLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(PnlSucursaleLayout.createSequentialGroup()
                        .addGap(607, 607, 607)
                        .addComponent(btnSalir, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(PnlSucursaleLayout.createSequentialGroup()
                        .addGap(19, 19, 19)
                        .addComponent(lblMiniLogo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(20, 20, 20)
                        .addComponent(lblTitulo, javax.swing.GroupLayout.PREFERRED_SIZE, 1025, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(PnlSucursaleLayout.createSequentialGroup()
                        .addGap(117, 117, 117)
                        .addGroup(PnlSucursaleLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 1094, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(PnlSucursaleLayout.createSequentialGroup()
                                .addGroup(PnlSucursaleLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, 309, Short.MAX_VALUE)
                                    .addComponent(btnFurgon, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addGap(94, 94, 94)
                                .addGroup(PnlSucursaleLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(btnCamion, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, 303, Short.MAX_VALUE))
                                .addGap(91, 91, 91)
                                .addGroup(PnlSucursaleLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(btnMula, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))))
                .addContainerGap(105, Short.MAX_VALUE))
        );
        PnlSucursaleLayout.setVerticalGroup(
            PnlSucursaleLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PnlSucursaleLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(PnlSucursaleLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblMiniLogo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(PnlSucursaleLayout.createSequentialGroup()
                        .addGap(23, 23, 23)
                        .addComponent(lblTitulo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(43, 43, 43)
                .addComponent(jLabel2)
                .addGroup(PnlSucursaleLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(PnlSucursaleLayout.createSequentialGroup()
                        .addGap(39, 39, 39)
                        .addComponent(btnMula, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(PnlSucursaleLayout.createSequentialGroup()
                        .addGap(46, 46, 46)
                        .addGroup(PnlSucursaleLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btnCamion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnFurgon, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(18, 18, 18)
                .addGroup(PnlSucursaleLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1)
                    .addComponent(jLabel3)
                    .addComponent(jLabel4))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 72, Short.MAX_VALUE)
                .addComponent(btnSalir, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(28, 28, 28))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(PnlSucursale, javax.swing.GroupLayout.DEFAULT_SIZE, 1319, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(PnlSucursale, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSalirActionPerformed
        s = null;
        dispose();
    }//GEN-LAST:event_btnSalirActionPerformed

    private void formInternalFrameClosing(javax.swing.event.InternalFrameEvent evt) {//GEN-FIRST:event_formInternalFrameClosing
     s = null;
    }//GEN-LAST:event_formInternalFrameClosing

    private void btnFurgonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnFurgonActionPerformed
        FrmFurgon furg = new FrmFurgon();
        furg.setVisible(true);
    }//GEN-LAST:event_btnFurgonActionPerformed

    private void btnCamionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCamionActionPerformed
         FrmCamion cam = new FrmCamion();
        cam.setVisible(true);
    }//GEN-LAST:event_btnCamionActionPerformed

    private void btnMulaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMulaActionPerformed
        FrmMula mul = new FrmMula();
        mul.setVisible(true);
    }//GEN-LAST:event_btnMulaActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel PnlSucursale;
    private javax.swing.JButton btnCamion;
    private javax.swing.JButton btnFurgon;
    private javax.swing.JButton btnMula;
    private javax.swing.JButton btnSalir;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel lblMiniLogo;
    private javax.swing.JLabel lblTitulo;
    // End of variables declaration//GEN-END:variables
}
