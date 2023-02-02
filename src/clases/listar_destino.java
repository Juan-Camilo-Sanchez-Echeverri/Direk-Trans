package clases;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

public class listar_destino {

    public static ArrayList<Clientes_Sucursales> lis_destino() {
        Conexion conn = new Conexion();
        Connection con = conn.getConnection();
        Statement stmt;
        ResultSet rs;
        ArrayList<Clientes_Sucursales> lista_destino = new ArrayList<>();

        try {
            stmt = con.createStatement();
            rs = stmt.executeQuery("SELECT * FROM clientes");

            while (rs.next()) {

                Clientes_Sucursales clientes = new Clientes_Sucursales();
                clientes.setId(rs.getInt("id"));
                clientes.setNombre(rs.getString("nombre"));
                clientes.setCorreo(rs.getString("correo"));
                clientes.setTelefono(rs.getString("telefono"));

                lista_destino.add(clientes);
            }

        } catch (SQLException ex) {
            Logger.getLogger(listar_destino.class.getName()).log(Level.SEVERE, null, ex);
        }
        return lista_destino;
    }

}
