package veterinaria.AccesoADatos;

import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.sql.Time;
import java.time.LocalTime;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;
import veterinaria.Entidades.Cliente;
import veterinaria.Entidades.Tratamiento;
import veterinaria.Entidades.Turno;

public class TurnoData {

    private Connection con = null;

    public TurnoData() {
        con = Conexion.getConexion();
    }

    public void guardarTurno(Turno turno) {
        try {
            String sql = "INSERT INTO turno (idCliente,idTratamiento,fecha,hora) VALUES (?,?,?,?)";

            PreparedStatement ps = con.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS);
            ps.setInt(1, turno.getIdCliente().getIdCliente());
            ps.setInt(2, turno.getIdTratamiento().getIdTratamiento());
            ps.setDate(3, Date.valueOf(turno.getFecha()));
            ps.setTime(4, Time.valueOf(turno.getHorario().toString()));
            ps.executeUpdate();
            ResultSet rs = ps.getGeneratedKeys();
            if (rs.next()) {
                turno.setIdTurno(rs.getInt(1));
                JOptionPane.showMessageDialog(null, "Turno agendado con exito");
            }
            ps.close();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al agendar un turno");
        }

    }

    public void eliminarTurno(Turno turno) {
        String sql = " DELETE FROM `turno` WHERE idTurno = ? ";
        try {
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setInt(1, turno.getIdTurno());
            int borrado = ps.executeUpdate();
            if (borrado == 1) {
                JOptionPane.showMessageDialog(null, " Turno eliminado ");
            }
            ps.close();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, " Error al acceder a la tabla de turnos");
        }
    }

    public void modificarTurno(Turno turno) {
        String sql = " UPDATE turno SET idCliente = ?,idTratamiento = ?,fecha = ?,hora = ? WHERE idTurno = ? ";
        try {
            PreparedStatement ps = null;
            ps.setInt(1, turno.getIdCliente().getIdCliente());
            ps.setInt(2, turno.getIdTratamiento().getIdTratamiento());
            ps.setDate(3, Date.valueOf(turno.getFecha()));
            ps.setDate(4, Date.valueOf(turno.getHorario().toString()));
            ps.setInt(5, turno.getIdTurno());
            int bienAhi = ps.executeUpdate();
            if (bienAhi == 1) {
                JOptionPane.showMessageDialog(null, " Turno modificado con exito");
            } else {
                JOptionPane.showMessageDialog(null, " Cagaste el turno");
            }
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, " Error al acceder a la tabla de turnos ");
        }
    }

    public List<Turno> listarTurno() {
        List<Turno> turnos = new ArrayList();
        String sql = "SELECT * FROM `turno`";
        try {
            PreparedStatement ps = con.prepareStatement(sql);
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                Turno turno = new Turno();
                Cliente cliente = new Cliente();
                Tratamiento tratamiento = new Tratamiento();
                turno.setIdTurno(rs.getInt("idTurno"));
                cliente.setIdCliente(rs.getInt("idCliente"));
                tratamiento.setIdTratamiento(rs.getInt("idTratamiento"));
                turno.setIdCliente(cliente);
                turno.setIdTratamiento(tratamiento);
                turno.setFecha(rs.getDate("fecha").toLocalDate());
                turno.setHorario(rs.getTime("hora"));
                turnos.add(turno);
            }
            ps.close();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al querer listar los turnos" + ex.getMessage());
        }
        return turnos;
    }
}
    
