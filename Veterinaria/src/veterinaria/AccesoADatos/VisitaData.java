package veterinaria.AccesoADatos;

import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.time.LocalDate;
import java.time.ZoneId;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;
import veterinaria.Entidades.Mascota;
import veterinaria.Entidades.Tratamiento;
import veterinaria.Entidades.Visita;

// FEDE
public class VisitaData {

    private Connection con = null;

    public VisitaData() {

        con = Conexion.getConexion();

    }

    public void guardarVisita(Visita visita) throws SQLException {

        String sql = "INSERT INTO visita( idMascota, idTratamiento, fechaTratamiento, observaciones, pesoPromedio, pesoActual) "
                + "VALUES ( ?, ?, ?, ?, ?, ?, ? )";

        try {

            PreparedStatement ps = con.prepareStatement(sql);

            ps.setInt(1, visita.getMascota().getIdMascota());
            ps.setInt(2, visita.getTratamiento().getIdTratamiento());
            ps.setDate(3, Date.valueOf(visita.getFechaTratamiento()));
            ps.setString(4, visita.getObservaciones());
            ps.setDouble(5, visita.getPesoActual());

            ps.executeUpdate();

            ps.close();

            JOptionPane.showMessageDialog(null, " visita guardada ");

        } catch (SQLException ex) {

            JOptionPane.showMessageDialog(null, " error al acceder a la tabla visita ");
        }
    }

    public void medificarVisita(Visita visita) {

        String sql = " UPDATE visita SET idVisita = ?, idMascota = ?,idTratamiento = ?,fechaVisita = ?,observaciones = ?,pesoActual = ? WHERE idVisita = ? ";

        try {

            PreparedStatement ps = null;

            ps.setInt(1, visita.getMascota().getIdMascota());
            ps.setInt(2, visita.getTratamiento().getIdTratamiento());
            ps.setDate(3, Date.valueOf(visita.getFechaTratamiento()));
            ps.setString(4, visita.getObservaciones());
            ps.setDouble(5, visita.getPesoActual());

            int bienAhi = ps.executeUpdate();

            if (bienAhi == 1) {

                JOptionPane.showMessageDialog(null, " modificado exitosamente ");
            } else {

                JOptionPane.showMessageDialog(null, " la cagaste pa' ");
            }

        } catch (SQLException ex) {

            JOptionPane.showMessageDialog(null, " error al acceder a la tabla visita ");
        }

    }

    public void eliminarVisita(Visita visita) {

        String sql = " DELETE FROM `visita` WHERE idVisita = ? ";

        try {

            PreparedStatement ps = con.prepareStatement(sql);

            ps.setInt(1, visita.getIdVisita());

            int borrado = ps.executeUpdate();

            if (borrado == 1) {

                JOptionPane.showMessageDialog(null, " visita borrada ");
            }

            ps.close();

        } catch (SQLException ex) {

            JOptionPane.showMessageDialog(null, " error al acceder a la tabla visita ");
        }
    }

    public List<Visita> listarVisitaXMascota(int id) {
        ArrayList<Visita> visita = new ArrayList();
        String sql = "SELECT * FROM visita WHERE idMascota=" + id;
        try {
            PreparedStatement ps = con.prepareStatement(sql);
            ResultSet rs = ps.executeQuery();

            if (rs.next()) {
                Visita tr = new Visita();
                Mascota mascota = new Mascota();
                Tratamiento tratamiento = new Tratamiento();
                mascota.setIdMascota(rs.getInt("idMascota"));
                tratamiento.setIdTratamiento(rs.getInt("idTratamiento"));
                
                tr.setIdVisita(rs.getInt("idVisita"));
                tr.setMascota(mascota);
                tr.setTratamiento(tratamiento);
                
                Date fecha = rs.getDate("fechaTratamiento");
                tr.setFechaTratamiento(fecha.toInstant().atZone(ZoneId.systemDefault()).toLocalDate());
                tr.setObservaciones(rs.getString("observacion"));
                tr.setPesoActual(rs.getDouble("pesoActual"));
                visita.add(tr);
            } else {
                ps.close();
            }
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al acceder a la lista Visita");
        }
        return visita;
    }
}
