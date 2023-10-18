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
                + "descripcion=?,importe=?,estado=? WHERE idTratamiento= " + tr.getIdTratamiento();
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
            JOptionPane.showMessageDialog(null, " Error al acceder a la tabla tratamiento");
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

            while (rs.next()) {
                Tratamiento tr = new Tratamiento();
                tr.setIdTratamiento(rs.getInt("idTratamiento"));
                tr.setTipoTratamiento(rs.getString("tipoTratamiento"));
                tr.setDescripcion(rs.getString("descripcion"));
                tr.setImporte(rs.getDouble("importe"));
                tr.setEstado(rs.getBoolean("estado"));
                tratamiento.add(tr);
            }
            ps.close();

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al acceder a la lista Tratamiento");
        }
        return tratamiento;
    }
    
    public Tratamiento buscarTratamiento(int id) {

        Tratamiento tr = null;

        String sql = "SELECT * FROM tratamiento WHERE idTratamiento = ?";

        PreparedStatement ps;
        try {
            ps = con.prepareStatement(sql);

            ps.setInt(1, id);

            ResultSet rs = ps.executeQuery();

            if (rs.next()) {

                tr= new Tratamiento();
                 tr.setIdTratamiento(rs.getInt("idTratamiento"));
                tr.setTipoTratamiento(rs.getString("tipoTratamiento"));
                tr.setDescripcion(rs.getString("descripcion"));
                tr.setImporte(rs.getDouble("importe"));
                tr.setEstado(rs.getBoolean("estado"));
               
            } else {

                JOptionPane.showMessageDialog(null, "no existe el tratamiento");
            }

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al acceder a la tabla tratamiento" + ex.getMessage());
        }

        return tr;
    }

    public void borrarTratamiento(int id) {
        String sql = "DELETE FROM `tratamiento` WHERE idTratamiento = ?";
        PreparedStatement ps;
        try {
            ps = con.prepareStatement(sql);
            ps.setInt(1, id);
            ps.executeUpdate();
            ps.close();
            JOptionPane.showMessageDialog(null, "Tratamiento eliminado con exito");
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al tratar de eliminar el tratamiento");
        }
    }

    public List<String> listarTipoCategoria() {
        ArrayList<String> categorias = new ArrayList();
        String sql = "SELECT tipoCategoria FROM categoria";
        try {
            PreparedStatement ps = con.prepareStatement(sql);
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                String cate = rs.getString("tipoCategoria");
                categorias.add(cate);
            }
            ps.close();

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al acceder a la lista Categorias");
        }
        return categorias;
    }

    public void guardarTipoCategoria(String categoria) {
        String sql = "INSERT INTO categoria(tipoCategoria) VALUES (?)";
        try {
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setString(1, categoria);
            ps.executeUpdate();
            ps.close();
            JOptionPane.showMessageDialog(null, "Categoria guardada ");
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al acceder a la lista de Categorias" + ex.getMessage());
        }
    }
public List<Tratamiento> listarTratamientos() {
        ArrayList<Tratamiento> tratamiento = new ArrayList();
        String sql = "SELECT * FROM `tratamiento`";
        try {
            PreparedStatement ps = con.prepareStatement(sql);
            ResultSet rs = ps.executeQuery();

            while (rs.next()) {
                Tratamiento tr = new Tratamiento();
                tr.setIdTratamiento(rs.getInt("idTratamiento"));
                tr.setTipoTratamiento(rs.getString("tipoTratamiento"));
                tr.setDescripcion(rs.getString("descripcion"));
                tr.setImporte(rs.getDouble("importe"));
                tr.setEstado(rs.getBoolean("estado"));
                tratamiento.add(tr);
            }
            ps.close();

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al acceder a la lista Tratamiento");
        }
        return tratamiento;
    }
public void eliminarCategoria(String categoria) {

        try {
            String sql = "DELETE FROM `categoria` WHERE tipoCategoria = ? ";
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setString(1, categoria);
            ps.executeUpdate();
            JOptionPane.showMessageDialog(null, " Se elimino la categoria ");
            ps.close();
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, " Error al acceder a la tabla categoria");
        }
    }
}
