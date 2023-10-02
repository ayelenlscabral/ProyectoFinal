package veterinaria.AccesoADatos;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import javax.swing.JOptionPane;

public class Conexion {

    private static final String URL = "jdbc:mariadb://localhost/";
    private static final String DB = "veterinaria";
    private static final String USUARIO = "root";
    private static final String PASSWORD = "";

    private static Connection connection;

    private Conexion() {
    }

    public static Connection getConexion() {
        if (connection == null) {
            try {
                Class.forName("org.mariadb.jdbc.Driver");
                connection = DriverManager.getConnection(URL+DB + 
                        "?useLegacyDatetimeCode=false&serverTimezone=UTC"+"&user="+USUARIO+"&password="+PASSWORD);

            } catch (ClassNotFoundException ex) {
                JOptionPane.showMessageDialog(null, " Error al conectarme a la Base de datos " + ex.getMessage());
            } catch (SQLException ex) {
                JOptionPane.showMessageDialog(null, " Error al cargar drivers " + ex.getMessage());
            }
        }
        return connection;
    }
}