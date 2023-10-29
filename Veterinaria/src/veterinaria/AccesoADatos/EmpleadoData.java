package veterinaria.AccesoADatos;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import veterinaria.Entidades.Empleado;
import veterinaria.Entidades.validadorUsuario;

public class EmpleadoData {

    private Connection con = null;

    public EmpleadoData() {
        con = Conexion.getConexion();
    }

    public validadorUsuario buscarEmpleado(String usuario, String contrasenia) {
        Empleado empleado = new Empleado();
        boolean comprobado = false;
        try {
            String sql = "SELECT idEmpleado, usuario,contrasenia,sexo,acceso FROM empleado WHERE usuario = ? AND contrasenia = ? ";

            PreparedStatement ps = con.prepareStatement(sql);
            ps.setString(1, usuario);
            ps.setString(2, contrasenia);
            ResultSet rs = ps.executeQuery();
            if (rs.next()) {
                empleado.setIdEmpleado(rs.getInt("idEmpleado"));
                empleado.setUsuario(rs.getString("usuario"));
                empleado.setContrasenia(rs.getString("contrasenia"));
                empleado.setSexo(rs.getString("sexo"));
                empleado.setAcceso(rs.getInt("acceso"));
            } else {
                comprobado = false;
            }
            ps.close();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al acceder a la tabla empleado" + ex.getMessage());
        }

        if (empleado.getUsuario().equalsIgnoreCase(usuario) && empleado.getContrasenia().equals(contrasenia)) {
            comprobado = true;
        }
        validadorUsuario nuevo = new validadorUsuario(empleado, comprobado);
        return nuevo;

    }

    public void agregarEmpleado(Empleado empleado) {

        String sql = "INSERT  INTO empleado (usuario , contrasenia, sexo,acceso) "
                + "VALUES (?, ? , ? , ?)";
        try {
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setString(1, empleado.getUsuario());
            ps.setString(2, empleado.getContrasenia());
            ps.setString(3, empleado.getSexo());
            ps.setInt(4, empleado.getAcceso());
            ps.executeUpdate();
            ps.close();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al acceder a la tabla Mascota: " + ex.getMessage());
        }

    }
        public ArrayList<Empleado> listarEmpleados(){
    ArrayList <Empleado> lista = new ArrayList();
    
            try {
            String sql = "SELECT * FROM empleado";
            PreparedStatement ps = con.prepareStatement(sql);
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                Empleado empleado = new Empleado();
                empleado.setIdEmpleado(rs.getInt("idEmpleado"));
                empleado.setUsuario(rs.getString("usuario"));
                empleado.setContrasenia(rs.getString("contrasenia"));
                empleado.setSexo(rs.getString("sexo"));
                empleado.setAcceso(rs.getInt("acceso"));
                lista.add(empleado);
            }
            ps.close();
         } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al acceder a la tabla Empleado" + ex.getMessage());
         }
    return lista;
    }
        public void eliminarEmpleado(String usuario) {

        try {
            String sql = "DELETE FROM `empleado` WHERE usuario = ? ";
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setString(1, usuario);
            ps.executeUpdate();
            JOptionPane.showMessageDialog(null, " Se elimino el empleado ");
            ps.close();
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, " Error al acceder a la tabla empleado");
        }
    }
        
        public void modificarEmpleado(Empleado empleado){
        try {
            String sql = "UPDATE empleado SET contrasenia = ? , sexo = ?, acceso = ? WHERE usuario = ?";
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setString(1, empleado.getContrasenia());
            ps.setString(2, empleado.getSexo());
            ps.setInt(3, empleado.getAcceso());
            ps.setString(4, empleado.getUsuario());
            int resultado = ps.executeUpdate();
            if (resultado >0) {
                JOptionPane.showMessageDialog(null, "Modificacion exitosa");
            }
            ps.close();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al actualizar los datos");
        }
    }
}
