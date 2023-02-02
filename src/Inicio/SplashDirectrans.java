package Inicio;

import com.sun.awt.AWTUtilities;
import java.awt.Image;
import java.awt.Toolkit;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JLabel;

public class SplashDirectrans extends javax.swing.JFrame implements Runnable {

    public ImageIcon imagen;
    public Icon icono;
    private Thread tiempo = null;

    public SplashDirectrans() {
        initComponents();
        this.PintarImagenLBL(this.lblLogo, "src/GIFS/tractomula.gif");
        this.PintarImagenLBL(this.lblcargando, "src/img/logok.jpeg");
        this.PintarImagenLBL(this.lblDT, "src/img/icon.jpeg");
        this.setLocationRelativeTo(null);
        AWTUtilities.setWindowOpaque(this, false);
        tiempo = new Thread(this);
        tiempo.start();
    }
//********************************************IMAGEN DE ICONO**********************************************************

    @Override
    public Image getIconImage() {

        Image retValue = Toolkit.getDefaultToolkit().getImage(ClassLoader.getSystemResource("img/icon.jpeg"));

        return retValue;
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        lblcargando = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        lblLogo = new javax.swing.JLabel();
        lblDT = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(255, 255, 255));
        setIconImage(getIconImage());
        setUndecorated(true);

        jPanel1.setBackground(new java.awt.Color(24, 106, 240));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lblcargando.setBackground(new java.awt.Color(24, 106, 240));
        jPanel1.add(lblcargando, new org.netbeans.lib.awtextra.AbsoluteConstraints(159, 24, 400, 310));

        jLabel1.setFont(new java.awt.Font("Centaur", 1, 40)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("C A R G A N D O  . . . .");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(252, 416, 488, 72));

        jTextField1.setFont(new java.awt.Font("Centaur", 2, 24)); // NOI18N
        jTextField1.setForeground(new java.awt.Color(24, 106, 240));
        jTextField1.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextField1.setText("SOLU-SOFTWARE     ©.");
        jTextField1.setBorder(null);
        jPanel1.add(jTextField1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 520, 750, 30));
        jPanel1.add(lblLogo, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 390, 202, 140));
        jPanel1.add(lblDT, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 30, 60, 50));

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
            java.util.logging.Logger.getLogger(SplashDirectrans.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(SplashDirectrans.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(SplashDirectrans.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(SplashDirectrans.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new SplashDirectrans().setVisible(true);
            }
        });
    }

    public void PintarImagenLBL(JLabel lbl, String ruta) {
        this.imagen = new ImageIcon(ruta);
        this.icono = new ImageIcon(this.imagen.getImage().getScaledInstance(
                lbl.getWidth(),
                lbl.getHeight(),
                Image.SCALE_DEFAULT)
        );
        lbl.setIcon(this.icono);
        this.repaint();
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JLabel lblDT;
    private javax.swing.JLabel lblLogo;
    private javax.swing.JLabel lblcargando;
    // End of variables declaration//GEN-END:variables

    @Override
    public void run() {
        while (tiempo != null) {
            try {
                Thread.sleep(8000);
                tiempo = null;
                this.dispose();
                new Inicio.LoginDT().setVisible(true);
            } catch (InterruptedException ex) {
                Logger.getLogger(SplashDirectrans.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }
}
