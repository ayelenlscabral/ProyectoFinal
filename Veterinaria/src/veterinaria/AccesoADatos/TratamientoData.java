package veterinaria.AccesoADatos;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;
import veterinaria.Entidades.Tratamiento;

public class TratamientoData {

    private Connection con = null;

    public TratamientoData() {

        con = Conexion.getConexion();
    }

    public void modificarTratamiento(Tratamiento tr) {
        String sql = "UPDATE tratamiento SET tipoTratamiento=?,"
                + "descripcion=?,importe=?,estado=? WHERE " + tr.getIdTratamiento();
        try {
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setString(1, tr.getTipoTratamiento());
            ps.setString(2, tr.getDescripcion());
            ps.setDouble(3, tr.getImporte());
            ps.setBoolean(4, tr.isEstado());
            ps.executeUpdate();
            ps.close();
            JOptionPane.showMessageDialog(null, "Tratamiento modificado correctamente ");
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al acceder a la lista de tratamientos" + ex.getMessage());
        }
    }

    public void eliminarTratamiento(int codigo) {

        try {
            String sql = "UPDATE tratamiento SET estado = 0 WHERE idTratamiento=? ";
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setInt(1, codigo);
            ps.executeUpdate();
            JOptionPane.showMessageDialog(null, " Se inhabilito el tratamiento ");
            ps.close();
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, " Error al acceder a la tabla alumno");
        }
    }

    public void guardarNuevoTratamiento(Tratamiento tr) {
        String sql = "INSERT INTO tratamiento(tipoTratamiento,descripcion,"
                + " importe, estado) VALUES (?,?,?,?)";
        try {
            PreparedStatement ps = con.prepareStatement(sql);

            ps.setString(1, tr.getTipoTratamiento());
            ps.setString(2, tr.getDescripcion());
            ps.setDouble(3, tr.getImporte());
            ps.setBoolean(4, tr.isEstado());
            ps.executeUpdate();
            ps.close();
            JOptionPane.showMessageDialog(null, "Tratamiento guardado ");
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al acceder a la lista de tratamientos" + ex.getMessage());
        }
    }

    public List<Tratamiento> listarTratamientoActivos() {
        ArrayList<Tratamiento> tratamiento = new ArrayList();
        String sql = "SELECT * FROM `tratamiento` WHERE estado=1";
        try {
            PreparedStatement ps = con.prepareStatement(sql);
            ResultSet rs = ps.executeQuery();

            if (rs.next()) {
                Tratamiento tr = new Tratamiento();
                tr.setIdTratamiento(rs.getInt("idTratamiento"));
                tr.setTipoTratamiento(rs.getString("tipoTratamiento"));
                tr.setDescripcion(rs.getString("descripcion"));
                tr.setImporte(rs.getDouble("importe"));
                tr.setEstado(rs.getBoolean("estado"));
                tratamiento.add(tr);
            } else {
                ps.close();
            }
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al acceder a la lista Tratamiento");
        }
        return tratamiento;
    }
//      public List<Tratamiento> listarXTipoTratamiento(String tipo) {
//        ArrayList<Tratamiento> tratamiento = new ArrayList();
//        String sql = "SELECT * FROM tratamiento WHERE estado=" +tipo;
//        try {
//            PreparedStatement ps = con.prepareStatement(sql);
//            ResultSet rs = ps.executeQuery();
//
//            if (rs.next()) {
//                Tratamiento tr = new Tratamiento();
//                tr.setIdTratamiento(rs.getInt("idTratamiento"));
//                tr.setTipoTratamiento(rs.getString("tipoTratamiento"));
//                tr.setDescripcion(rs.getString("descripcion"));
//                tr.setImporte(rs.getDouble("importe"));
//                tr.setEstado(rs.getBoolean("estado"));
//                tratamiento.add(tr);
//            } else {
//                ps.close();
//            }
//        } catch (SQLException ex) {
//            JOptionPane.showMessageDialog(null, "Error al acceder a la lista Tratamiento");
//        }
//        return tratamiento;
//    }
//    public List<Tratamiento> listarXCliente(int idCliente) {
//        ArrayList<Tratamiento> tratamiento = new ArrayList();
//        String sql = "SELECT * FROM tratamiento WHERE estado=" +tipo;
//        try {
//            PreparedStatement ps = con.prepareStatement(sql);
//            ResultSet rs = ps.executeQuery();
//
//            if (rs.next()) {
//                Tratamiento tr = new Tratamiento();
//                tr.setIdTratamiento(rs.getInt("idTratamiento"));
//                tr.setTipoTratamiento(rs.getString("tipoTratamiento"));
//                tr.setDescripcion(rs.getString("descripcion"));
//                tr.setImporte(rs.getDouble("importe"));
//                tr.setEstado(rs.getBoolean("estado"));
//                tratamiento.add(tr);
//            } else {
//                ps.close();
//            }
//        } catch (SQLException ex) {
//            JOptionPane.showMessageDialog(null, "Error al acceder a la lista Tratamiento");
//        }
//        return tratamiento;
//    }
}
