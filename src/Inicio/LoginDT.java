package Inicio;

import java.sql.SQLException;
import java.sql.ResultSet;
import java.sql.PreparedStatement;
import java.awt.Image;
import java.awt.Toolkit;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import clases.Conexion;
import java.awt.event.KeyEvent;
import java.sql.Connection;
import javax.swing.JLabel;
import vistas.Gerente.FrmGerente;
import vistas.admin.FrmAdmin;
import vistas.visitante.FrmPpalVisitantes;

public class LoginDT extends javax.swing.JFrame {

    public ImageIcon imagen;
    public Icon icono;

    public static String user = "";
    public static String pass = "";

    public LoginDT() {
        initComponents();
        setIconImage(getIconImage());
        setLocationRelativeTo(null);
        JOptionPane.showMessageDialog(null, "Si eres un visitante escribe 'vis' en los campos usuario y contraseña, sino ingresa con tus datos");
        this.PintarImagenLBL(this.jLabel_logo, "src/img/Logok.jpeg");

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        txtPassword = new javax.swing.JPasswordField();
        jLabel_logo = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        txtUsuario = new javax.swing.JTextField();
        btnIngresar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setIconImage(getIconImage());

        jPanel1.setBackground(new java.awt.Color(24, 106, 240));
        jPanel1.setLayout(null);

        txtPassword.setBackground(new java.awt.Color(24, 106, 250));
        txtPassword.setFont(new java.awt.Font("Centaur", 0, 18)); // NOI18N
        txtPassword.setForeground(new java.awt.Color(255, 255, 255));
        txtPassword.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtPassword.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        txtPassword.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtPasswordKeyPressed(evt);
            }
        });
        jPanel1.add(txtPassword);
        txtPassword.setBounds(90, 380, 220, 28);
        jPanel1.add(jLabel_logo);
        jLabel_logo.setBounds(60, 10, 270, 270);

        jLabel1.setFont(new java.awt.Font("Centaur", 1, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Usuario");
        jPanel1.add(jLabel1);
        jLabel1.setBounds(100, 280, 210, 22);

        jLabel2.setFont(new java.awt.Font("Centaur", 1, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("Password");
        jPanel1.add(jLabel2);
        jLabel2.setBounds(100, 350, 210, 22);

        txtUsuario.setBackground(new java.awt.Color(24, 106, 240));
        txtUsuario.setFont(new java.awt.Font("Centaur", 0, 18)); // NOI18N
        txtUsuario.setForeground(new java.awt.Color(255, 255, 255));
        txtUsuario.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtUsuario.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        txtUsuario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtUsuarioActionPerformed(evt);
            }
        });
        jPanel1.add(txtUsuario);
        txtUsuario.setBounds(90, 310, 220, 28);

        btnIngresar.setBackground(new java.awt.Color(255, 255, 255));
        btnIngresar.setFont(new java.awt.Font("Centaur", 1, 14)); // NOI18N
        btnIngresar.setForeground(new java.awt.Color(24, 106, 240));
        btnIngresar.setText("INGRESAR");
        btnIngresar.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btnIngresar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnIngresarActionPerformed(evt);
            }
        });
        jPanel1.add(btnIngresar);
        btnIngresar.setBounds(95, 460, 210, 35);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 400, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 550, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnIngresarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnIngresarActionPerformed
        ingresar();
    }//GEN-LAST:event_btnIngresarActionPerformed

    private void txtUsuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtUsuarioActionPerformed
        txtPassword.requestFocus();
    }//GEN-LAST:event_txtUsuarioActionPerformed

    private void txtPasswordKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtPasswordKeyPressed

        if (evt.getKeyCode() == KeyEvent.VK_ENTER) {
            if (txtUsuario.getText().length() == 0 || txtPassword.getText().length() == 0) {
                JOptionPane.showMessageDialog(null, "Ingrese los datos requeridos!!!");
                txtUsuario.requestFocus();
            } else {
                ingresar();
            }
        }
    }//GEN-LAST:event_txtPasswordKeyPressed

    public static void main(String args[]) {

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new LoginDT().setVisible(true);
            }
        });
    }

    /*  **********************************************METODOS***************************************************************
    ******************************************************************************************************************** */
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
//****************************************************************************************************************    

    @Override
    public Image getIconImage() {

        Image retValue = Toolkit.getDefaultToolkit().getImage(ClassLoader.getSystemResource("img/icon.jpeg"));

        return retValue;
    }

//****************************************************************************************************************
    void limpiar() {
        txtUsuario.setText("");
        txtPassword.setText("");
    }
//****************************************************************************************************************

    public void ingresar() {

        if (txtUsuario.getText().length() == 0 && txtPassword.getText().length() == 0) {
            JOptionPane.showMessageDialog(null, "Ingrese los datos requeridos!!!");
            txtUsuario.requestFocus();

        } else {

            user = txtUsuario.getText().trim();
            pass = txtPassword.getText().trim();
            if (!user.equals("") || !pass.equals("")) {

                try {
                    Conexion conn = new Conexion();
                    Connection con = conn.getConnection();
                    String sql = "SELECT rol FROM usuarios WHERE usuario = '" + user
                            + "' AND password = '" + pass + "'";
                    PreparedStatement ps = con.prepareStatement(sql);
                    ResultSet rs = ps.executeQuery();

                    rs = ps.executeQuery();
                    if (rs.next()) {

                        String tipo_nivel = rs.getString("rol");

                        if (tipo_nivel.equalsIgnoreCase("admin")) {

                            new FrmAdmin().setVisible(true);
                            dispose();

                        } else if (tipo_nivel.equalsIgnoreCase("gerente")) {
                            new FrmGerente().setVisible(true);
                            dispose();
                        } else if (tipo_nivel.equalsIgnoreCase("visitante")) {
                            new FrmPpalVisitantes().setVisible(true);
                            dispose();
                        }

                    } else {
                        JOptionPane.showMessageDialog(null, "Datos de acceso incorrectos.");
                        limpiar();
                    }

                } catch (SQLException e) {

                    JOptionPane.showMessageDialog(null, "¡¡ERROR al iniciar!!, contacte al administrador.");
                }
            }
        }
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnIngresar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel_logo;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPasswordField txtPassword;
    private javax.swing.JTextField txtUsuario;
    // End of variables declaration//GEN-END:variables
}
