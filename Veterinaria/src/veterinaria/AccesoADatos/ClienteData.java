package veterinaria.AccesoADatos;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import org.mariadb.jdbc.Statement;
import veterinaria.Entidades.Cliente;

public class ClienteData {
    private Connection con = null;

    public ClienteData() {
        con= Conexion.getConexion();
    }
    
    public void guardarCliente(Cliente cliente){
        try {
            String sql = "INSERT INTO cliente (dni,apellido,nombre,direccion,telefono,personaAlternativa,estado) VALUES (?,?,?,?,?,?,?)";
            
            PreparedStatement ps = con.prepareStatement(sql,Statement.RETURN_GENERATED_KEYS);
            ps.setInt(1, cliente.getDni());
            ps.setString(2, cliente.getApellido());
            ps.setString(3, cliente.getNombre());
            ps.setString(4, cliente.getDireccion());
            ps.setLong(5, cliente.getTelefono());
            ps.setString(6, cliente.getPersonaAlternativa());
            ps.setBoolean(7, cliente.isEstado());
            ps.executeUpdate();
            ResultSet rs = ps.getGeneratedKeys();
            if (rs.next()) {
               
                cliente.setIdCliente(rs.getInt(1));
                JOptionPane.showMessageDialog(null, "Cliente agregado con exito");
            }
            ps.close();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al agregar el cliente");
        }
    
    }
    
    public void modificarCliente(Cliente cliente){
        try {
            String sql = "UPDATE cliente SET dni = ? , apellido = ?, nombre = ?, direccion = ?, telefono = ?, personaAlternativa = ?, estado = ? WHERE idCliente = ?";
            
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setInt(1, cliente.getDni());
            ps.setString(2, cliente.getApellido() );
            ps.setString(3, cliente.getNombre() );
            ps.setString(4, cliente.getDireccion());
            ps.setLong(5, cliente.getTelefono() );
            ps.setString(6, cliente.getPersonaAlternativa());
            ps.setBoolean(7, cliente.isEstado());
            ps.setInt(8, cliente.getIdCliente() );
            int resultado = ps.executeUpdate();
            if (resultado >0) {
                JOptionPane.showMessageDialog(null, "Modificacion exitosa");
            }
            ps.close();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al actualizar los datos");
        }
    }
    public void borrarCliente(int dni){
        try {
            String sql = "UPDATE cliente SET estado = 0 WHERE dni = ? ";
            
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setInt(1, dni);
            int resultado = ps.executeUpdate();
            if (resultado == 1) {
                JOptionPane.showMessageDialog(null, "Se elimino el cliente");
            }
            ps.close();
            } catch (SQLException e) {
                JOptionPane.showMessageDialog(null, " Error al borrar cliente");
        }
    }
    
    public ArrayList<Cliente> listarClientes(){
    ArrayList <Cliente> lista = new ArrayList();
    
            try {
            String sql = "SELECT * FROM cliente WHERE estado = 1";
            PreparedStatement ps = con.prepareStatement(sql);
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                Cliente cliente = new Cliente();
                cliente.setIdCliente(rs.getInt("idCliente"));
                cliente.setDni(rs.getInt("dni"));
                cliente.setApellido(rs.getString("apellido"));
                cliente.setNombre(rs.getString("nombre"));
                cliente.setDireccion(rs.getString("direccion"));
                cliente.setTelefono(rs.getLong("telefono"));
                cliente.setPersonaAlternativa(rs.getString("personaAlternativa"));
                cliente.setEstado(rs.getBoolean("estado"));
                lista.add(cliente);
            }
            ps.close();
         } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al acceder a la tabla Cliente" + ex.getMessage());
         }
    return lista;
    }
    public Cliente buscarCliente(int dni) {
        Cliente cliente = new Cliente();
        try {
            String sql = "SELECT idCliente, dni, apellido, nombre, direccion, telefono, personaAlternativa, estado FROM cliente WHERE dni = ?";   
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setInt(1, dni);
            ResultSet rs = ps.executeQuery();
            if (rs.next()) {
                cliente.setIdCliente(rs.getInt("idCliente"));
                cliente.setDni(rs.getInt("dni"));
                cliente.setApellido(rs.getString("apellido"));
                cliente.setNombre(rs.getString("nombre"));
                cliente.setDireccion(rs.getString("direccion"));
                cliente.setTelefono(rs.getLong("telefono"));
                cliente.setPersonaAlternativa(rs.getString("personaAlternativa"));
                cliente.setEstado(rs.getBoolean("estado"));
            } 
               ps.close();
         } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al acceder a la tabla cliente" + ex.getMessage());
        }
    return cliente;
    }
    
       public ArrayList<Cliente> listarClientes2(){
    ArrayList <Cliente> lista = new ArrayList();
    
            try {
            String sql = "SELECT * FROM cliente";
            PreparedStatement ps = con.prepareStatement(sql);
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                Cliente cliente = new Cliente();
                cliente.setIdCliente(rs.getInt("idCliente"));
                cliente.setDni(rs.getInt("dni"));
                cliente.setApellido(rs.getString("apellido"));
                cliente.setNombre(rs.getString("nombre"));
                cliente.setDireccion(rs.getString("direccion"));
                cliente.setTelefono(rs.getLong("telefono"));
                cliente.setPersonaAlternativa(rs.getString("personaAlternativa"));
                cliente.setEstado(rs.getBoolean("estado"));
                lista.add(cliente);
            }
            ps.close();
         } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al acceder a la tabla Cliente" + ex.getMessage());
         }
    return lista;
    }
    
    
}
