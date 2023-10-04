package veterinaria.AccesoADatos;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import veterinaria.Entidades.Visita;

public class VisitaData {
    
    private Connection con = null;


    public VisitaData() {

        con = Conexion.getConexion();

    }
    
    
    public void guardarVisita(Visita visita) throws SQLException{
        
        String sql = "INSERT INTO visita(idVisita, idMascota, idTratamiento, fechaTratamiento, observaciones, pesoPromedio, pesoActual) "
                + "VALUES ( ?, ?, ?, ?, ?, ?, ? )";
        
        
        PreparedStatement ps = con.prepareStatement(sql);
        
        ps.setInt(1, visita.getIdVisita() );
        
          //  ps.setInt(1, alumno.getDni());
          //  ps.setString(2, alumno.getApellido());
          //  ps.setString(3, alumno.getNombre());
           // ps.setDate(4, Date.valueOf(alumno.getFechaNac()));
           // ps.setBoolean(5, alumno.isEstado());
        
    }
    
}
