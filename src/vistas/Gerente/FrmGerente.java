package vistas.Gerente;

import java.awt.Graphics;
import java.awt.Image;
import java.awt.Toolkit;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import vistas.admin.FrmAdmin;
import static vistas.admin.FrmAdmin.adm;

public class FrmGerente extends javax.swing.JFrame {

    public FrmGerente() {
        initComponents();
        setIconImage(getIconImage());
        setExtendedState(MAXIMIZED_BOTH);//Vuelve Responsivo el frame
        if (adm == "si") {
            OpRegresar.setEnabled(true);
        } else {
            OpRegresar.setEnabled(false);
        }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        ImageIcon icon = new ImageIcon(getClass().getResource("/img/fongde.jpg"));
        Image image =icon.getImage();
        FondoGerente = new javax.swing.JDesktopPane(){
            public void paintComponent(Graphics g){ g.drawImage(image,0,0,getWidth(),getHeight(),this);
            }
        };
        menuBar = new javax.swing.JMenuBar();
        MenuCamionesGer = new javax.swing.JMenu();
        OpGestCamGer = new javax.swing.JMenuItem();
        OpListCamGer = new javax.swing.JMenuItem();
        MenuClientesGer = new javax.swing.JMenu();
        OpContactClientes = new javax.swing.JMenuItem();
        OpListClientes = new javax.swing.JMenuItem();
        MenuRutasGer = new javax.swing.JMenu();
        OpCrearRuta = new javax.swing.JMenuItem();
        OpListRutas = new javax.swing.JMenuItem();
        MenuRutasGer1 = new javax.swing.JMenu();
        OpCrearRuta1 = new javax.swing.JMenuItem();
        OpRegresar = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("GERENTE");
        setIconImage(getIconImage());
        setName("FrmGerente"); // NOI18N

        javax.swing.GroupLayout FondoGerenteLayout = new javax.swing.GroupLayout(FondoGerente);
        FondoGerente.setLayout(FondoGerenteLayout);
        FondoGerenteLayout.setHorizontalGroup(
            FondoGerenteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1350, Short.MAX_VALUE)
        );
        FondoGerenteLayout.setVerticalGroup(
            FondoGerenteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 700, Short.MAX_VALUE)
        );

        MenuCamionesGer.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/16px/furgoneta-de-reparto.png"))); // NOI18N
        MenuCamionesGer.setMnemonic('f');
        MenuCamionesGer.setText("Camiones");
        MenuCamionesGer.setFont(new java.awt.Font("Centaur", 1, 18)); // NOI18N
        MenuCamionesGer.setMargin(new java.awt.Insets(0, 0, 0, 20));

        OpGestCamGer.setFont(new java.awt.Font("Centaur", 1, 14)); // NOI18N
        OpGestCamGer.setMnemonic('o');
        OpGestCamGer.setText("Gestionar Camiones");
        OpGestCamGer.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                OpGestCamGerActionPerformed(evt);
            }
        });
        MenuCamionesGer.add(OpGestCamGer);

        OpListCamGer.setFont(new java.awt.Font("Centaur", 1, 14)); // NOI18N
        OpListCamGer.setMnemonic('s');
        OpListCamGer.setText("Listar Camiones");
        OpListCamGer.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                OpListCamGerActionPerformed(evt);
            }
        });
        MenuCamionesGer.add(OpListCamGer);

        menuBar.add(MenuCamionesGer);

        MenuClientesGer.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/16px/apreton-de-manos.png"))); // NOI18N
        MenuClientesGer.setMnemonic('e');
        MenuClientesGer.setText("Clientes");
        MenuClientesGer.setFont(new java.awt.Font("Centaur", 1, 18)); // NOI18N
        MenuClientesGer.setMargin(new java.awt.Insets(0, 0, 0, 20));

        OpContactClientes.setFont(new java.awt.Font("Centaur", 1, 14)); // NOI18N
        OpContactClientes.setMnemonic('y');
        OpContactClientes.setText("Contactar Cliente");
        OpContactClientes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                OpContactClientesActionPerformed(evt);
            }
        });
        MenuClientesGer.add(OpContactClientes);

        OpListClientes.setFont(new java.awt.Font("Centaur", 1, 14)); // NOI18N
        OpListClientes.setMnemonic('t');
        OpListClientes.setText("Listar Clientes");
        OpListClientes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                OpListClientesActionPerformed(evt);
            }
        });
        MenuClientesGer.add(OpListClientes);

        menuBar.add(MenuClientesGer);

        MenuRutasGer.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/16px/ruta.png"))); // NOI18N
        MenuRutasGer.setMnemonic('h');
        MenuRutasGer.setText("Rutas");
        MenuRutasGer.setFont(new java.awt.Font("Centaur", 1, 18)); // NOI18N
        MenuRutasGer.setMargin(new java.awt.Insets(0, 0, 0, 20));

        OpCrearRuta.setFont(new java.awt.Font("Centaur", 1, 14)); // NOI18N
        OpCrearRuta.setMnemonic('c');
        OpCrearRuta.setText("Gestionar Ruta");
        OpCrearRuta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                OpCrearRutaActionPerformed(evt);
            }
        });
        MenuRutasGer.add(OpCrearRuta);

        OpListRutas.setFont(new java.awt.Font("Centaur", 1, 14)); // NOI18N
        OpListRutas.setMnemonic('a');
        OpListRutas.setText("Listar Rutas");
        OpListRutas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                OpListRutasActionPerformed(evt);
            }
        });
        MenuRutasGer.add(OpListRutas);

        menuBar.add(MenuRutasGer);

        MenuRutasGer1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/16px/salir.png"))); // NOI18N
        MenuRutasGer1.setMnemonic('h');
        MenuRutasGer1.setText("Salir");
        MenuRutasGer1.setFont(new java.awt.Font("Centaur", 1, 18)); // NOI18N

        OpCrearRuta1.setFont(new java.awt.Font("Centaur", 1, 14)); // NOI18N
        OpCrearRuta1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/16px/remove.png"))); // NOI18N
        OpCrearRuta1.setMnemonic('c');
        OpCrearRuta1.setText("Cerrar Sesion");
        OpCrearRuta1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                OpCrearRuta1ActionPerformed(evt);
            }
        });
        MenuRutasGer1.add(OpCrearRuta1);

        OpRegresar.setFont(new java.awt.Font("Centaur", 1, 14)); // NOI18N
        OpRegresar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/16px/atras16.png"))); // NOI18N
        OpRegresar.setMnemonic('c');
        OpRegresar.setText("Regresar");
        OpRegresar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                OpRegresarActionPerformed(evt);
            }
        });
        MenuRutasGer1.add(OpRegresar);

        menuBar.add(MenuRutasGer1);

        setJMenuBar(menuBar);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(FondoGerente)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(FondoGerente)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void OpListCamGerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_OpListCamGerActionPerformed
        String c = FrmInListCamionGerent.c;
        try {
            if (c == null) {
                FrmInListCamionGerent vercamger = new FrmInListCamionGerent();
                FondoGerente.add(vercamger);
                vercamger.toFront();
                vercamger.show();
            } else {
                JOptionPane.showMessageDialog(null, "La ventana LISTA DE CAMIONES ya esta abierta, por favor verifique!!!");
            }
        } catch (Exception e) {
        }
    }//GEN-LAST:event_OpListCamGerActionPerformed

    private void OpListClientesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_OpListClientesActionPerformed
        String cl = FrmInListClientesGer.cl;
        try {
            if (cl == null) {
                FrmInListClientesGer verclien = new FrmInListClientesGer();
                FondoGerente.add(verclien);
                verclien.toFront();
                verclien.show();
            } else {
                JOptionPane.showMessageDialog(null, "La ventana LISTA DE CLIENTES ya esta abierta, por favor verifique!!!");
            }
        } catch (Exception e) {
        }
    }//GEN-LAST:event_OpListClientesActionPerformed

    private void OpListRutasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_OpListRutasActionPerformed
        String lr = FrmInLisRut.lr;
        try {
            if (lr == null) {
                FrmInLisRut verut = new FrmInLisRut();
                FondoGerente.add(verut);
                verut.toFront();
                verut.show();
            } else {
                JOptionPane.showMessageDialog(null, "La ventana LISTA DE RUTAS ya esta abierta, por favor verifique!!!");
            }
        } catch (Exception e) {
        }
    }//GEN-LAST:event_OpListRutasActionPerformed

    private void OpGestCamGerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_OpGestCamGerActionPerformed
        String gcg = FrmGestCamionGerentes.gcg;
        try {
            if (gcg == null) {
                FrmGestCamionGerentes camger = new FrmGestCamionGerentes();
                FondoGerente.add(camger);
                camger.toFront();
                camger.show();
            } else {
                JOptionPane.showMessageDialog(null, "La ventana GESTIONAR CAMIONES ya esta abierta, por favor verifique!!!");
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
        }
    }//GEN-LAST:event_OpGestCamGerActionPerformed

    private void OpCrearRutaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_OpCrearRutaActionPerformed
        String gr = FrmGestRutas.gr;
        try {
            if (gr == null) {
                FrmGestRutas gesrut = new FrmGestRutas();
                FondoGerente.add(gesrut);
                gesrut.toFront();
                gesrut.show();
            } else {
                JOptionPane.showMessageDialog(null, "La ventana GESTIONAR RUTAS ya esta abierta, por favor verifique!!!");
            }
        } catch (Exception e) {
        }
    }//GEN-LAST:event_OpCrearRutaActionPerformed

    private void OpContactClientesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_OpContactClientesActionPerformed
        String cc = FrmContactClientes.cc;
        try {
            if (cc == null) {
                FrmContactClientes contcli = new FrmContactClientes();
                FondoGerente.add(contcli);
                contcli.toFront();
                contcli.show();
            } else {
                JOptionPane.showMessageDialog(null, "La ventana CONTACTAR CLIENTES ya esta abierta, por favor verifique!!!");
            }
        } catch (Exception e) {
        }
    }//GEN-LAST:event_OpContactClientesActionPerformed

    private void OpCrearRuta1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_OpCrearRuta1ActionPerformed
        System.exit(0);
    }//GEN-LAST:event_OpCrearRuta1ActionPerformed

    private void OpRegresarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_OpRegresarActionPerformed
         FrmAdmin frmad = new FrmAdmin();
        frmad.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_OpRegresarActionPerformed

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
            java.util.logging.Logger.getLogger(FrmGerente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FrmGerente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FrmGerente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FrmGerente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FrmGerente().setVisible(true);
            }
        });
    }

//************Cambia el logo de java por tu logo*********************************************************
    @Override
    public Image getIconImage() {

        Image retValue = Toolkit.getDefaultToolkit().getImage(ClassLoader.getSystemResource("img/icon.jpeg"));

        return retValue;
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    public static javax.swing.JDesktopPane FondoGerente;
    private javax.swing.JMenu MenuCamionesGer;
    private javax.swing.JMenu MenuClientesGer;
    private javax.swing.JMenu MenuRutasGer;
    private javax.swing.JMenu MenuRutasGer1;
    private javax.swing.JMenuItem OpContactClientes;
    private javax.swing.JMenuItem OpCrearRuta;
    private javax.swing.JMenuItem OpCrearRuta1;
    private javax.swing.JMenuItem OpGestCamGer;
    private javax.swing.JMenuItem OpListCamGer;
    private javax.swing.JMenuItem OpListClientes;
    private javax.swing.JMenuItem OpListRutas;
    private javax.swing.JMenuItem OpRegresar;
    private javax.swing.JMenuBar menuBar;
    // End of variables declaration//GEN-END:variables

}
