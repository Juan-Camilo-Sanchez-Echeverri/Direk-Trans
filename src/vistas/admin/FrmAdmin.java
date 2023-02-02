package vistas.admin;

import java.awt.Toolkit;
import javax.swing.Icon;
import java.awt.Graphics;
import java.awt.HeadlessException;
import java.awt.Image;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import vistas.Gerente.FrmGerente;
import vistas.visitante.FrmPpalVisitantes;

public class FrmAdmin extends javax.swing.JFrame {

    public Icon icono;
    public ImageIcon imagen;
    public static String adm;

    public FrmAdmin() {
        initComponents();
//        setExtendedState(MAXIMIZED_BOTH);//Vuelve Responsivo el frame

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        ImageIcon icon = new ImageIcon(getClass().getResource("/img/fondoblanco.png"));
        Image image =icon.getImage();
        FondoAdmin = new javax.swing.JDesktopPane(){

            public void paintComponent(Graphics g){ g.drawImage(image,0,0,getWidth(),getHeight(),this);
            }
        };
        menuBar = new javax.swing.JMenuBar();
        MenuGerenSucur = new javax.swing.JMenu();
        OpGestUsuarios = new javax.swing.JMenuItem();
        OpListarUsuarios = new javax.swing.JMenuItem();
        MenuSucursales = new javax.swing.JMenu();
        OpGestSuc = new javax.swing.JMenuItem();
        OpListSuc = new javax.swing.JMenuItem();
        MenuCamiones = new javax.swing.JMenu();
        OpGestCamiones = new javax.swing.JMenuItem();
        OpListCamion = new javax.swing.JMenuItem();
        MenuClientes = new javax.swing.JMenu();
        OpGestionClientes = new javax.swing.JMenuItem();
        OpListClientes = new javax.swing.JMenuItem();
        MenuMensajes = new javax.swing.JMenu();
        OpVerMensajes = new javax.swing.JMenuItem();
        MenuMensajes1 = new javax.swing.JMenu();
        OpFormGerent = new javax.swing.JMenuItem();
        OpFormVisit = new javax.swing.JMenuItem();
        MenuRutasGer1 = new javax.swing.JMenu();
        OpCrearRuta1 = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("ADMINISTRADOR");
        setIconImage(getIconImage());
        setName("FrmAdmin"); // NOI18N
        setResizable(false);

        javax.swing.GroupLayout FondoAdminLayout = new javax.swing.GroupLayout(FondoAdmin);
        FondoAdmin.setLayout(FondoAdminLayout);
        FondoAdminLayout.setHorizontalGroup(
            FondoAdminLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1366, Short.MAX_VALUE)
        );
        FondoAdminLayout.setVerticalGroup(
            FondoAdminLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 695, Short.MAX_VALUE)
        );

        menuBar.setPreferredSize(new java.awt.Dimension(499, 25));

        MenuGerenSucur.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/16px/user3.png"))); // NOI18N
        MenuGerenSucur.setMnemonic('e');
        MenuGerenSucur.setText("Usuarios");
        MenuGerenSucur.setFont(new java.awt.Font("Centaur", 1, 18)); // NOI18N
        MenuGerenSucur.setPreferredSize(new java.awt.Dimension(130, 20));

        OpGestUsuarios.setFont(new java.awt.Font("Centaur", 1, 14)); // NOI18N
        OpGestUsuarios.setMnemonic('t');
        OpGestUsuarios.setText("Gestionar Usuarios");
        OpGestUsuarios.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                OpGestUsuariosActionPerformed(evt);
            }
        });
        MenuGerenSucur.add(OpGestUsuarios);

        OpListarUsuarios.setFont(new java.awt.Font("Centaur", 1, 14)); // NOI18N
        OpListarUsuarios.setMnemonic('y');
        OpListarUsuarios.setText("Listar Usuarios");
        OpListarUsuarios.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                OpListarUsuariosActionPerformed(evt);
            }
        });
        MenuGerenSucur.add(OpListarUsuarios);

        menuBar.add(MenuGerenSucur);

        MenuSucursales.setBackground(new java.awt.Color(255, 255, 255));
        MenuSucursales.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/16px/empresa.png"))); // NOI18N
        MenuSucursales.setText("Sucursales ");
        MenuSucursales.setFont(new java.awt.Font("Centaur", 1, 18)); // NOI18N
        MenuSucursales.setHideActionText(true);
        MenuSucursales.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        MenuSucursales.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);
        MenuSucursales.setMargin(new java.awt.Insets(0, 0, 0, 20));
        MenuSucursales.setPreferredSize(new java.awt.Dimension(130, 22));

        OpGestSuc.setFont(new java.awt.Font("Centaur", 1, 14)); // NOI18N
        OpGestSuc.setMnemonic('o');
        OpGestSuc.setText("Gestionar Sucursales");
        OpGestSuc.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                OpGestSucActionPerformed(evt);
            }
        });
        MenuSucursales.add(OpGestSuc);

        OpListSuc.setFont(new java.awt.Font("Centaur", 1, 14)); // NOI18N
        OpListSuc.setMnemonic('s');
        OpListSuc.setText("Listar Sucursales");
        OpListSuc.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                OpListSucActionPerformed(evt);
            }
        });
        MenuSucursales.add(OpListSuc);

        menuBar.add(MenuSucursales);

        MenuCamiones.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/16px/furgoneta-de-reparto.png"))); // NOI18N
        MenuCamiones.setMnemonic('h');
        MenuCamiones.setText("Camiones ");
        MenuCamiones.setFont(new java.awt.Font("Centaur", 1, 18)); // NOI18N
        MenuCamiones.setPreferredSize(new java.awt.Dimension(130, 20));

        OpGestCamiones.setFont(new java.awt.Font("Centaur", 1, 14)); // NOI18N
        OpGestCamiones.setMnemonic('c');
        OpGestCamiones.setText("Gestionar Camiones");
        OpGestCamiones.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                OpGestCamionesActionPerformed(evt);
            }
        });
        MenuCamiones.add(OpGestCamiones);

        OpListCamion.setFont(new java.awt.Font("Centaur", 1, 14)); // NOI18N
        OpListCamion.setMnemonic('a');
        OpListCamion.setText("Listar Camiones");
        OpListCamion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                OpListCamionActionPerformed(evt);
            }
        });
        MenuCamiones.add(OpListCamion);

        menuBar.add(MenuCamiones);

        MenuClientes.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/16px/equipo.png"))); // NOI18N
        MenuClientes.setText("Clientes ");
        MenuClientes.setFont(new java.awt.Font("Centaur", 1, 18)); // NOI18N
        MenuClientes.setPreferredSize(new java.awt.Dimension(130, 20));

        OpGestionClientes.setFont(new java.awt.Font("Centaur", 1, 14)); // NOI18N
        OpGestionClientes.setText("Gestionar Cliente");
        OpGestionClientes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                OpGestionClientesActionPerformed(evt);
            }
        });
        MenuClientes.add(OpGestionClientes);

        OpListClientes.setFont(new java.awt.Font("Centaur", 1, 14)); // NOI18N
        OpListClientes.setText("Listar Clientes");
        OpListClientes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                OpListClientesActionPerformed(evt);
            }
        });
        MenuClientes.add(OpListClientes);

        menuBar.add(MenuClientes);

        MenuMensajes.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/16px/correo-electronico.png"))); // NOI18N
        MenuMensajes.setText(" Mensajes ");
        MenuMensajes.setFont(new java.awt.Font("Centaur", 1, 18)); // NOI18N
        MenuMensajes.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        MenuMensajes.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);
        MenuMensajes.setPreferredSize(new java.awt.Dimension(130, 20));

        OpVerMensajes.setFont(new java.awt.Font("Centaur", 1, 14)); // NOI18N
        OpVerMensajes.setText("Ver Mensajes");
        OpVerMensajes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                OpVerMensajesActionPerformed(evt);
            }
        });
        MenuMensajes.add(OpVerMensajes);

        menuBar.add(MenuMensajes);

        MenuMensajes1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/16px/equipo.png"))); // NOI18N
        MenuMensajes1.setText("Formularios");
        MenuMensajes1.setFont(new java.awt.Font("Centaur", 1, 18)); // NOI18N
        MenuMensajes1.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        MenuMensajes1.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);
        MenuMensajes1.setPreferredSize(new java.awt.Dimension(130, 20));

        OpFormGerent.setFont(new java.awt.Font("Centaur", 1, 14)); // NOI18N
        OpFormGerent.setText("Form.Gerentes");
        OpFormGerent.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                OpFormGerentActionPerformed(evt);
            }
        });
        MenuMensajes1.add(OpFormGerent);

        OpFormVisit.setFont(new java.awt.Font("Centaur", 1, 14)); // NOI18N
        OpFormVisit.setText("Form.Visitantes");
        OpFormVisit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                OpFormVisitActionPerformed(evt);
            }
        });
        MenuMensajes1.add(OpFormVisit);

        menuBar.add(MenuMensajes1);

        MenuRutasGer1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/16px/salir.png"))); // NOI18N
        MenuRutasGer1.setMnemonic('h');
        MenuRutasGer1.setText("Salir");
        MenuRutasGer1.setFont(new java.awt.Font("Centaur", 1, 18)); // NOI18N

        OpCrearRuta1.setFont(new java.awt.Font("Centaur", 1, 14)); // NOI18N
        OpCrearRuta1.setMnemonic('c');
        OpCrearRuta1.setText("Cerrar Sesion");
        OpCrearRuta1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                OpCrearRuta1ActionPerformed(evt);
            }
        });
        MenuRutasGer1.add(OpCrearRuta1);

        menuBar.add(MenuRutasGer1);

        setJMenuBar(menuBar);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(FondoAdmin)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(FondoAdmin)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void OpListSucActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_OpListSucActionPerformed
        String x = FrmInListSucur.x;
        try {
            if (x == null) {
                FrmInListSucur versuc = new FrmInListSucur();
                FondoAdmin.add(versuc);
                versuc.toFront();
                versuc.show();
            } else {
                JOptionPane.showMessageDialog(null, "La ventana LISTA DE SUCURSALES ya esta abierta, por favor verifique!!!");
            }
        } catch (HeadlessException e) {
            JOptionPane.showMessageDialog(null, e);
        }


    }//GEN-LAST:event_OpListSucActionPerformed

    private void OpListarUsuariosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_OpListarUsuariosActionPerformed
        String w = FrmInListUsuarios.w;
        try {
            if (w == null) {
                FrmInListUsuarios verger = new FrmInListUsuarios();
                FondoAdmin.add(verger);
                verger.toFront();
                verger.show();
            } else {
                JOptionPane.showMessageDialog(null, "La ventana LISTA DE USUARIOS ya esta abierta, por favor verifique!!!");
            }
        } catch (HeadlessException e) {
            JOptionPane.showMessageDialog(null, e);
        }


    }//GEN-LAST:event_OpListarUsuariosActionPerformed

    private void OpListCamionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_OpListCamionActionPerformed
        String z = FrmInListCamion.z;
        try {
            if (z == null) {
                FrmInListCamion liscam = new FrmInListCamion();
                FondoAdmin.add(liscam);
                liscam.toFront();
                liscam.show();
            } else {
                JOptionPane.showMessageDialog(null, "La ventana LISTA DE CAMIONES ya esta abierta, por favor verifique!!!");
            }
        } catch (HeadlessException e) {
            JOptionPane.showMessageDialog(null, e);
        }
    }//GEN-LAST:event_OpListCamionActionPerformed

    private void OpListClientesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_OpListClientesActionPerformed
        String c = FrmInListClientes.c;
        try {
            if (c == null) {
                FrmInListClientes lisclien = new FrmInListClientes();
                FondoAdmin.add(lisclien);
                lisclien.toFront();
                lisclien.show();
            } else {
                JOptionPane.showMessageDialog(null, "La ventana LISTA DE CLIENTES ya esta abierta, por favor verifique!!!");
            }
        } catch (HeadlessException e) {
            JOptionPane.showMessageDialog(null, e);
        }
    }//GEN-LAST:event_OpListClientesActionPerformed

    private void OpVerMensajesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_OpVerMensajesActionPerformed
        String m = FrmInMensajes.m;
        try {
            if (m == null) {
                FrmInMensajes lismen = new FrmInMensajes();
                FondoAdmin.add(lismen);
                lismen.toFront();
                lismen.show();
            } else {
                JOptionPane.showMessageDialog(null, "La ventana LISTA DE MENSAJES ya esta abierta, por favor verifique!!!");
            }
        } catch (HeadlessException e) {
            JOptionPane.showMessageDialog(null, e);
        }
    }//GEN-LAST:event_OpVerMensajesActionPerformed

    private void OpGestCamionesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_OpGestCamionesActionPerformed
        String gc = FrmGestCamion.gc;
        try {
            if (gc == null) {
                FrmGestCamion gescam = new FrmGestCamion();
                FondoAdmin.add(gescam);
                gescam.show();
            } else {
                JOptionPane.showMessageDialog(null, "La ventana GESTIONAR CAMIONES ya esta abierta, por favor verifique!!!");
            }
        } catch (HeadlessException e) {
            JOptionPane.showMessageDialog(null, e);
        }

    }//GEN-LAST:event_OpGestCamionesActionPerformed

    private void OpGestUsuariosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_OpGestUsuariosActionPerformed
        String gu = FrmGestUsuarios.gu;
        try {
            if (gu == null) {
                FrmGestUsuarios gesus = new FrmGestUsuarios();
                FondoAdmin.add(gesus);
                gesus.toFront();
                gesus.show();

            } else {
                JOptionPane.showMessageDialog(null, "La ventana GESTIONAR USUARIOS ya esta abierta, por favor verifique!!!");
            }
        } catch (HeadlessException e) {
            JOptionPane.showMessageDialog(null, e);
        }
    }//GEN-LAST:event_OpGestUsuariosActionPerformed

    private void OpGestionClientesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_OpGestionClientesActionPerformed
        String gcl = FrmGestionClientes.gcl;
        try {
            if (gcl == null) {
                FrmGestionClientes mancli = new FrmGestionClientes();
                FondoAdmin.add(mancli);
                mancli.toFront();
                mancli.show();
            } else {
                JOptionPane.showMessageDialog(null, "La ventana GESTIONAR CLIENTES ya esta abierta, por favor verifique!!!");
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
        }
    }//GEN-LAST:event_OpGestionClientesActionPerformed

    private void OpGestSucActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_OpGestSucActionPerformed
        String gsu = FrmGestSucursales.gsu;
        try {
            if (gsu == null) {
                FrmGestSucursales suc = new FrmGestSucursales();
                FondoAdmin.add(suc);
                suc.toFront();
                suc.show();
            } else {
                JOptionPane.showMessageDialog(null, "La ventana GESTIONAR SUCURSALES ya esta abierta, por favor verifique!!!");
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
        }
    }//GEN-LAST:event_OpGestSucActionPerformed

    private void OpFormGerentActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_OpFormGerentActionPerformed

        if (this.isActive()) {
            adm = "si";
            FrmGerente frmger = new FrmGerente();
            frmger.setVisible(true);
            this.setVisible(false);
        }

    }//GEN-LAST:event_OpFormGerentActionPerformed

    private void OpFormVisitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_OpFormVisitActionPerformed
        if (this.isActive()) {
            adm = "si";
            FrmPpalVisitantes frmvis = new FrmPpalVisitantes();
            frmvis.setVisible(true);
            this.setVisible(false);
        }
    }//GEN-LAST:event_OpFormVisitActionPerformed

    private void OpCrearRuta1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_OpCrearRuta1ActionPerformed
        System.exit(0);
    }//GEN-LAST:event_OpCrearRuta1ActionPerformed

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
            java.util.logging.Logger.getLogger(FrmAdmin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FrmAdmin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FrmAdmin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FrmAdmin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FrmAdmin().setVisible(true);
            }
        });
    }

//*************************************************************************************************************************************************
//**********************************************ETODO CAMBIAR LOGO************************************************************
    @Override
    public Image getIconImage() {

        Image retValue = Toolkit.getDefaultToolkit().getImage(ClassLoader.getSystemResource("img/icon.jpeg"));

        return retValue;
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    public static javax.swing.JDesktopPane FondoAdmin;
    private javax.swing.JMenu MenuCamiones;
    private javax.swing.JMenu MenuClientes;
    private javax.swing.JMenu MenuGerenSucur;
    private javax.swing.JMenu MenuMensajes;
    private javax.swing.JMenu MenuMensajes1;
    private javax.swing.JMenu MenuRutasGer1;
    private javax.swing.JMenu MenuSucursales;
    private javax.swing.JMenuItem OpCrearRuta1;
    private javax.swing.JMenuItem OpFormGerent;
    private javax.swing.JMenuItem OpFormVisit;
    private javax.swing.JMenuItem OpGestCamiones;
    private javax.swing.JMenuItem OpGestSuc;
    private javax.swing.JMenuItem OpGestUsuarios;
    private javax.swing.JMenuItem OpGestionClientes;
    private javax.swing.JMenuItem OpListCamion;
    private javax.swing.JMenuItem OpListClientes;
    private javax.swing.JMenuItem OpListSuc;
    private javax.swing.JMenuItem OpListarUsuarios;
    private javax.swing.JMenuItem OpVerMensajes;
    private javax.swing.JMenuBar menuBar;
    // End of variables declaration//GEN-END:variables

}
