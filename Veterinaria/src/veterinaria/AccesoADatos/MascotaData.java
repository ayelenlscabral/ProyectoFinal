package veterinaria.AccesoADatos;

import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import javax.swing.JOptionPane;
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

        String sql = "UPDATE mascota SET idCliente=?,alias=?,sexo=?,especie=?,raza=?,colorPelo=?,fechaNac=?,pesoPromedio=?,pesoActual=?,estado=? WHERE idMascota = ?";

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

            }else{
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

}
