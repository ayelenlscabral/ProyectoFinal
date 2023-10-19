package veterinaria.Entidades;

import java.sql.Time;
import java.time.LocalDate;
import java.time.LocalDateTime;

public class Turno {
    private int idTurno;
    private Cliente idCliente;
    private Tratamiento idTratamiento;
    private LocalDate fecha;
    private Time horario;
    public Turno() {
    }

    public Turno(Cliente idCliente, Tratamiento idTratamiento, LocalDate fecha, Time horario) {
        this.idCliente = idCliente;
        this.idTratamiento = idTratamiento;
        this.fecha = fecha;
        this.horario = horario;
    }

    public Turno(int idTurno, Cliente idCliente, Tratamiento idTratamiento, LocalDate fecha, Time horario) {
        this.idTurno = idTurno;
        this.idCliente = idCliente;
        this.idTratamiento = idTratamiento;
        this.fecha = fecha;
        this.horario = horario;
    }

    public int getIdTurno() {
        return idTurno;
    }

    public void setIdTurno(int idTurno) {
        this.idTurno = idTurno;
    }

    public Cliente getIdCliente() {
        return idCliente;
    }

    public void setIdCliente(Cliente idCliente) {
        this.idCliente = idCliente;
    }

    public Tratamiento getIdTratamiento() {
        return idTratamiento;
    }

    public void setIdTratamiento(Tratamiento idTratamiento) {
        this.idTratamiento = idTratamiento;
    }

    public LocalDate getFecha() {
        return fecha;
    }

    public void setFecha(LocalDate fecha) {
        this.fecha = fecha;
    }

    public Time getHorario() {
        return horario;
    }

    public void setHorario(Time horario) {
        this.horario = horario;
    }

    @Override
    public String toString() {
        return "Turno{" + "idTurno=" + idTurno + ", idCliente=" + idCliente.getIdCliente() + ", idTratamiento=" + idTratamiento.getIdTratamiento() + ", fecha=" + fecha + ", horario=" + horario + '}';
    }
    
    
}
