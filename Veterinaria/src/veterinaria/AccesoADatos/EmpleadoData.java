package veterinaria.AccesoADatos;

import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;
import veterinaria.Entidades.Empleado;
import veterinaria.Entidades.Mascota;
import veterinaria.Entidades.validadorUsuario;

public class EmpleadoData {
    private Connection con = null;

    public EmpleadoData() {
        con = Conexion.getConexion();
    }
    
    public validadorUsuario buscarEmpleado(String usuario , String contrasenia){
    Empleado empleado = new Empleado();
    boolean comprobado = false;
        try{
        String sql = "SELECT idEmpleado, usuario,contrasenia,sexo,acceso FROM empleado WHERE usuario = ? AND contrasenia = ? ";

        PreparedStatement ps = con.prepareStatement(sql);
        ps.setString(1,usuario);
        ps.setString(2, contrasenia);
        ResultSet rs = ps.executeQuery();
        if (rs.next()) {
                empleado.setIdEmpleado(rs.getInt("idEmpleado"));
                empleado.setUsuario(rs.getString("usuario"));
                empleado.setContrasenia(rs.getString("contrasenia"));
                empleado.setSexo(rs.getString("sexo"));
                empleado.setAcceso(rs.getInt("acceso"));
            } else{
            comprobado = false;
        }
               ps.close();
         } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al acceder a la tabla empleado" + ex.getMessage());
        }

        if (empleado.getUsuario().equalsIgnoreCase(usuario) && empleado.getContrasenia().equals(contrasenia)) {
            comprobado = true;
            }
         validadorUsuario nuevo = new validadorUsuario(empleado,comprobado);
        return nuevo;

        }
    public void agregarEmpleado(Empleado empleado) {

        String sql = "INSERT  INTO empleado (idEmpleado, usuario , contrasenia, sexo,acceso "
                + "VALUES (?, ? , ? , ? , ?)";

        try {
            PreparedStatement ps = con.prepareStatement(sql);

            ps.setInt(1, empleado.getIdEmpleado());
            ps.setString(2, empleado.getUsuario());
            ps.setString(3, empleado.getContrasenia());
            ps.setString(4, empleado.getSexo());
            ps.setInt(5, empleado.getAcceso());
            ps.executeUpdate();
            ps.close();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al acceder a la tabla Mascota: " + ex.getMessage());
        }

    }
    }

