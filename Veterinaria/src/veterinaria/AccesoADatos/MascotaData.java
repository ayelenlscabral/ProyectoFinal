package veterinaria.AccesoADatos;

import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;
import veterinaria.Entidades.Cliente;
import veterinaria.Entidades.Mascota;

public class MascotaData {

    private Connection con = null;

    public MascotaData() {

        con = Conexion.getConexion();

    }

    public void agregarMascota(Mascota mascota) {

        String sql = "INSERT  INTO mascota (idCliente, alias, sexo, especie,"
                + "raza, colorPelo, fechaNacimiento, pesoPromedio, pesoActual, estado) "
                + "VALUES (?, ? , ? , ? , ? , ? , ? , ? , ? , ?)";

        try {
            PreparedStatement ps = con.prepareStatement(sql);

            ps.setInt(1, mascota.getIdCliente().getIdCliente());
            ps.setString(2, mascota.getAlias());
            ps.setString(3, mascota.getSexo());
            ps.setString(4, mascota.getEspecie());
            ps.setString(5, mascota.getRaza());
            ps.setString(6, mascota.getColorPelo());
            ps.setDate(7, Date.valueOf(mascota.getFechaNac()));
            ps.setDouble(8, mascota.getPesoPromedio());
            ps.setDouble(9, mascota.getPesoActual());
            ps.setBoolean(10, mascota.isEstado());

            ps.executeUpdate();
            ps.close();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al acceder a la tabla Mascota: " + ex.getMessage());
        }

    }

    public void modificarMascota(Mascota mascota) {

        String sql = "UPDATE mascota SET idCliente=?,alias=?,sexo=?,especie=?,raza=?,colorPelo=?,fechaNacimiento=?,pesoPromedio=?,pesoActual=?,estado=? WHERE idMascota = ?";

        PreparedStatement ps = null;

        try {
            ps = con.prepareStatement(sql);

            ps.setInt(1, mascota.getIdCliente().getIdCliente());
            ps.setString(2, mascota.getAlias());
            ps.setString(3, mascota.getSexo());
            ps.setString(4, mascota.getEspecie());
            ps.setString(5, mascota.getRaza());
            ps.setString(6, mascota.getColorPelo());
            ps.setDate(7, Date.valueOf(mascota.getFechaNac()));
            ps.setDouble(8, mascota.getPesoPromedio());
            ps.setDouble(9, mascota.getPesoActual());
            ps.setBoolean(10, mascota.isEstado());
            ps.setInt(11, mascota.getIdMascota());

            int exito = ps.executeUpdate();

            if (exito >= 1) {
                JOptionPane.showMessageDialog(null, "Se ha modificado exitosamente.");

            } else {
                JOptionPane.showMessageDialog(null, "La mascota no existe");
            }

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al acceder a la tabla Mascota: " + ex.getMessage());
        }

    }

    public void eliminarMascota(int idMascota) {

        String sql = "UPDATE mascota SET estado = 0 WHERE idMascota=?";

        try {
            PreparedStatement ps = con.prepareStatement(sql);

            ps.setInt(1, idMascota);
            int fila = ps.executeUpdate();
            if (fila == 1) {
                JOptionPane.showMessageDialog(null, "Se elimino correctamente la mascota");

            }
            ps.close();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al acceder a la tabla mascota");
        }
    }

    public Mascota buscarMascota(int idMascota) {

        Mascota mascota = null;

        String sql = "SELECT * FROM mascota WHERE idMascota = ?";

        PreparedStatement ps;
        try {
            ps = con.prepareStatement(sql);

            ps.setInt(1, idMascota);

            ResultSet rs = ps.executeQuery();

            if (rs.next()) {

                mascota = new Mascota();
                mascota.setIdMascota(rs.getInt("idMascota"));
                mascota.setAlias(rs.getString("alias"));
                mascota.setSexo(rs.getString("sexo"));
                mascota.setEspecie(rs.getString("especie"));
                mascota.setRaza(rs.getString("raza"));
                mascota.setColorPelo(rs.getString("colorPelo"));
                mascota.setFechaNac(rs.getDate("fechaNacimiento").toLocalDate());
                mascota.setPesoPromedio(rs.getDouble("pesoPromedio"));
                mascota.setPesoActual(rs.getDouble("pesoActual"));
                mascota.setEstado(rs.getBoolean("estado"));

            } else {

                JOptionPane.showMessageDialog(null, "no existe la mascota");
            }

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al acceder a la tabla mascota" + ex.getMessage());
        }

        return mascota;
    }

    public List<Mascota> listarMascotas() {

        List<Mascota> mascota = new ArrayList<>();

        String sql = "SELECT * FROM mascota";

        PreparedStatement ps;
        try {
            ps = con.prepareStatement(sql);
            ResultSet rs = ps.executeQuery();

            while (rs.next()) {

                Mascota mas = new Mascota();

                mas.setIdMascota(rs.getInt("idMascota"));
                mas.setAlias(rs.getString("alias"));
                mas.setSexo(rs.getString("sexo"));
                mas.setEspecie(rs.getString("especie"));
                mas.setRaza(rs.getString("raza"));
                mas.setColorPelo(rs.getString("colorPelo"));
                mas.setFechaNac(rs.getDate("fechaNacimiento").toLocalDate());
                mas.setPesoPromedio(rs.getDouble("pesoPromedio"));
                mas.setPesoActual(rs.getDouble("pesoActual"));
                mas.setEstado(rs.getBoolean("estado"));
                mascota.add(mas);
            }

            ps.close();

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al acceder a la tabla mascota");
        }

        return mascota;
    }
public List<Mascota> listarMascotasXCliente(int id) {

<<<<<<< Updated upstream
   public List<Mascota> MascotasporClienteDNI(int dniCliente) {
    List<Mascota> mascotas = new ArrayList<>();
    PreparedStatement ps = null;
    ResultSet resultSet = null;

    try {
        String sql = "SELECT * FROM mascota WHERE id_cliente IN (SELECT id_cliente FROM cliente WHERE dni = ?)";
        ps = con.prepareStatement(sql);

        ps.setInt(1, dniCliente);
        resultSet = ps.executeQuery();

        while (resultSet.next()) {
            int idMascota = resultSet.getInt("idMascota");
            String alias = resultSet.getString("alias");
            String sexo = resultSet.getString("sexo");
            String especie = resultSet.getString("especie");
            String raza = resultSet.getString("raza");
            String colorPelo = resultSet.getString("colorPelo");
            LocalDate fechaNac = resultSet.getDate("fechaNacimiento").toLocalDate();
            double pesoPromedio = resultSet.getDouble("pesoPromedio");
            double pesoActual = resultSet.getDouble("pesoActual");
            boolean estado = resultSet.getBoolean("estado");

            Cliente cliente = new Cliente();
            cliente.setIdCliente(resultSet.getInt("id_cliente"));

            Mascota mascota = new Mascota(idMascota, cliente, alias, sexo, especie, raza, colorPelo, fechaNac, pesoPromedio, pesoActual, estado);
            mascotas.add(mascota);
        }
    } catch (SQLException e) {
        System.err.println("Error al buscar mascotas por DNI de cliente: " + e.getMessage());
    } finally {
        // Cierra recursos
        if (resultSet != null) {
            try {
                resultSet.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
        if (ps != null) {
            try {
                ps.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
    }

    return mascotas;
}
=======
        List<Mascota> mascota = new ArrayList<>();

        String sql = "SELECT * FROM mascota WHERE idCliente="+id;

        PreparedStatement ps;
        try {
            ps = con.prepareStatement(sql);
            ResultSet rs = ps.executeQuery();

            while (rs.next()) {

                Mascota mas = new Mascota();

                mas.setIdMascota(rs.getInt("idMascota"));
                mas.setAlias(rs.getString("alias"));
                mas.setSexo(rs.getString("sexo"));
                mas.setEspecie(rs.getString("especie"));
                mas.setRaza(rs.getString("raza"));
                mas.setColorPelo(rs.getString("colorPelo"));
                mas.setFechaNac(rs.getDate("fechaNac").toLocalDate());
                mas.setPesoPromedio(rs.getDouble("pesoPromedio"));
                mas.setPesoActual(rs.getDouble("pesoActual"));
                mas.setEstado(rs.getBoolean("estado"));
                mascota.add(mas);
            }

            ps.close();

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al acceder a la tabla mascota");
        }

        return mascota;
    }
>>>>>>> Stashed changes
}
