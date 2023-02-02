
package clases;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import javax.swing.JOptionPane;


public class Conexion {
   //*******************************************CONEXION LOCAL**************************************************************************
      Connection con;

    public Conexion() {

        try {
            final String Control = "com.mysql.cj.jdbc.Driver";
            Class.forName(Control);
            final String URL = "jdbc:mysql://localhost:3306/direktrans";
            final String USERNAME = "root";
            final String PASSWORD = "";
            con = DriverManager.getConnection(URL, USERNAME, PASSWORD);
            System.out.println("Conexion exitosa");

        } catch (ClassNotFoundException | SQLException ex) {
            JOptionPane.showMessageDialog(null, ex.getMessage());
        }
    }

    public Connection getConnection() {
        return con;
    }
}

