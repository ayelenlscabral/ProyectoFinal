package veterinaria.AccesoADatos;

import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
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

        String sql = "UPDATE mascota SET idCliente=?,alias=?,sexo=?,especie=?,"
                + "raza=?,colorPelo=?,fechaNacimiento=?,pesoActual=?,estado=? WHERE idMascota = ?";

        try {
            PreparedStatement ps = con.prepareStatement(sql);

            ps.setInt(1, mascota.getIdCliente().getIdCliente());
            ps.setString(2, mascota.getAlias());
            ps.setString(3, mascota.getSexo());
            ps.setString(4, mascota.getEspecie());
            ps.setString(5, mascota.getRaza());
            ps.setString(6, mascota.getColorPelo());
            ps.setDate(7, Date.valueOf(mascota.getFechaNac()));
            ps.setDouble(8, mascota.getPesoActual());
            ps.setBoolean(9, mascota.isEstado());
            ps.setInt(10, mascota.getIdMascota());

            ps.executeUpdate();
            ps.close();

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al acceder a la tabla Mascota: ", "ERROR", JOptionPane.ERROR_MESSAGE);

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
                Cliente cliente = new Cliente();
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
                cliente.setIdCliente(rs.getInt("idCliente"));
                mascota.setIdCliente(cliente);

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

    public List<Mascota> MascotasporClienteDNI(int dniCliente) {
        List<Mascota> mascotas = new ArrayList<>();

        String sql = "SELECT * FROM mascota WHERE idCliente IN (SELECT idCliente FROM cliente WHERE dni = ?)";

        try {
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setInt(1, dniCliente);

            try (ResultSet rs = ps.executeQuery()) {
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

                    mascotas.add(mas);
                }
            }
        } catch (SQLException e) {

            JOptionPane.showMessageDialog(null, "Error al buscar cliente");
        }

        return mascotas;
    }

    public List<Mascota> listarMascotasXCliente(int id) {

        List<Mascota> mascota = new ArrayList<>();

        String sql = "SELECT * FROM mascota WHERE idCliente=?";

        PreparedStatement ps;
        try {
            ps = con.prepareStatement(sql);
            ps.setInt(1, id);
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

    public void modificarPromedio(Mascota mascota) {

        String sql = "UPDATE mascota SET pesoPromedio=? WHERE idMascota = ?";
        try {
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setDouble(1, mascota.getPesoPromedio());
            ps.setInt(2, mascota.getIdMascota());
            ps.executeUpdate();
            ps.close();

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al acceder a la tabla Mascota: ", "ERROR", JOptionPane.ERROR_MESSAGE);
        }

    }

    public List<Mascota> listarMascotasParaHistorial() {

        List<Mascota> mascotaHistorial = new ArrayList<>();

        String sql = "SELECT idMascota, alias, raza, pesoActual, pesoPromedio FROM mascota";

        PreparedStatement ps;
        try { ps = con.prepareStatement(sql);
            ResultSet rs = ps.executeQuery();

            while (rs.next()) {

                Mascota mas = new Mascota();
                mas.setIdMascota(rs.getInt("idMascota"));
                mas.setAlias(rs.getString("alias"));
                mas.setRaza(rs.getString("raza"));
                mas.setPesoActual(rs.getDouble("pesoActual"));
                mas.setPesoPromedio(rs.getDouble("pesoPromedio"));
                mascotaHistorial.add(mas);
            }

            ps.close();

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al acceder a la tabla mascota");
        }

        return mascotaHistorial;
    }
}
