package vistas.visitante;

import java.awt.Graphics;
import java.awt.Image;
import java.awt.Toolkit;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import static vistas.admin.FrmAdmin.adm;
import vistas.admin.FrmAdmin;

public class FrmPpalVisitantes extends javax.swing.JFrame {

    public FrmPpalVisitantes() {
        initComponents();
        setExtendedState(MAXIMIZED_BOTH);//Vuelve Responsivo el frame
        setLocationRelativeTo(null);
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
        FondoVisit = new javax.swing.JDesktopPane(){
            public void paintComponent(Graphics g){ g.drawImage(image,0,0,getWidth(),getHeight(),this);
            }
        };
        menuBar = new javax.swing.JMenuBar();
        MenuCamionVisit = new javax.swing.JMenu();
        OpListCamion = new javax.swing.JMenuItem();
        MenuServicios = new javax.swing.JMenu();
        OpServiciosVisit = new javax.swing.JMenuItem();
        OpContacAdmin = new javax.swing.JMenuItem();
        MenuRutasGer1 = new javax.swing.JMenu();
        OpCrearRuta1 = new javax.swing.JMenuItem();
        OpRegresar = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("VISITANTES");
        setIconImage(getIconImage());
        setName("FrmVisitantes"); // NOI18N

        MenuCamionVisit.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/16px/furgoneta-de-reparto.png"))); // NOI18N
        MenuCamionVisit.setText("Camiones");
        MenuCamionVisit.setFont(new java.awt.Font("Centaur", 1, 18)); // NOI18N
        MenuCamionVisit.setMargin(new java.awt.Insets(0, 0, 0, 20));

        OpListCamion.setFont(new java.awt.Font("Centaur", 1, 14)); // NOI18N
        OpListCamion.setText("Listar Camiones");
        OpListCamion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                OpListCamionActionPerformed(evt);
            }
        });
        MenuCamionVisit.add(OpListCamion);

        menuBar.add(MenuCamionVisit);

        MenuServicios.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/16px/las-compras-en-linea.png"))); // NOI18N
        MenuServicios.setText("Servicios");
        MenuServicios.setFont(new java.awt.Font("Centaur", 1, 18)); // NOI18N
        MenuServicios.setMargin(new java.awt.Insets(0, 0, 0, 20));

        OpServiciosVisit.setFont(new java.awt.Font("Centaur", 1, 14)); // NOI18N
        OpServiciosVisit.setText("Servicios");
        OpServiciosVisit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                OpServiciosVisitActionPerformed(evt);
            }
        });
        MenuServicios.add(OpServiciosVisit);

        OpContacAdmin.setFont(new java.awt.Font("Centaur", 1, 14)); // NOI18N
        OpContacAdmin.setText("Contactar  Admin");
        OpContacAdmin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                OpContacAdminActionPerformed(evt);
            }
        });
        MenuServicios.add(OpContacAdmin);

        menuBar.add(MenuServicios);

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
            .addComponent(FondoVisit, javax.swing.GroupLayout.DEFAULT_SIZE, 1350, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(FondoVisit, javax.swing.GroupLayout.DEFAULT_SIZE, 676, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void OpServiciosVisitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_OpServiciosVisitActionPerformed
        String s = FrmInServicios.s;
        try {
            if (s == null) {
                FrmInServicios verserv = new FrmInServicios();
                FondoVisit.add(verserv);
                verserv.toFront();
                verserv.show();
            } else {
                JOptionPane.showMessageDialog(null, "La ventana LISTA DE SERVICIOS ya esta abierta, por favor verifique!!!");
            }
        } catch (Exception e) {
        }
    }//GEN-LAST:event_OpServiciosVisitActionPerformed

    private void OpListCamionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_OpListCamionActionPerformed
        String v = FrmInListCamionVis.v;
        try {
            if (v == null) {
                FrmInListCamionVis vercam = new FrmInListCamionVis();
                FondoVisit.add(vercam);
                vercam.toFront();
                vercam.show();
            } else {
                JOptionPane.showMessageDialog(null, "La ventana LISTA DE CAMIONES ya esta abierta, por favor verifique!!!");
            }
        } catch (Exception e) {
        }
    }//GEN-LAST:event_OpListCamionActionPerformed

    private void OpContacAdminActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_OpContacAdminActionPerformed
        String ca = FrmContactAdmin.ca;
        try {
            if (ca == null) {
                FrmContactAdmin contadm = new FrmContactAdmin();
                FondoVisit.add(contadm);
                contadm.toFront();
                contadm.show();
            } else {
                JOptionPane.showMessageDialog(null, "La ventana CONTACTAR ADMINISTRADOR ya esta abierta, por favor verifique!!!");
            }
        } catch (Exception e) {
        }
    }//GEN-LAST:event_OpContacAdminActionPerformed

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
            java.util.logging.Logger.getLogger(FrmPpalVisitantes.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FrmPpalVisitantes.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FrmPpalVisitantes.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FrmPpalVisitantes.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FrmPpalVisitantes().setVisible(true);
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
    public static javax.swing.JDesktopPane FondoVisit;
    private javax.swing.JMenu MenuCamionVisit;
    private javax.swing.JMenu MenuRutasGer1;
    private javax.swing.JMenu MenuServicios;
    private javax.swing.JMenuItem OpContacAdmin;
    private javax.swing.JMenuItem OpCrearRuta1;
    private javax.swing.JMenuItem OpListCamion;
    private javax.swing.JMenuItem OpRegresar;
    private javax.swing.JMenuItem OpServiciosVisit;
    private javax.swing.JMenuBar menuBar;
    // End of variables declaration//GEN-END:variables

}
