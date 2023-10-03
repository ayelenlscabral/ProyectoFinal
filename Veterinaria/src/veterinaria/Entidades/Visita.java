package veterinaria.Entidades;

import java.time.LocalDate;

public class Visita {
    private int idVisita;
    private Mascota mascota;
    private Tratamiento tratamiento;
    private LocalDate fechaTratamiento;
    private String observaciones;
    private double pesoActual;

    public Visita() {
    }

    public Visita(Mascota mascota, Tratamiento tratamiento, LocalDate fechaTratamiento, String observaciones, double pesoActual) {
        this.mascota = mascota;
        this.tratamiento = tratamiento;
        this.fechaTratamiento = fechaTratamiento;
        this.observaciones = observaciones;
        this.pesoActual = pesoActual;
    }

    public Visita(int idVisita, Mascota mascota, Tratamiento tratamiento, LocalDate fechaTratamiento, String observaciones, double pesoActual) {
        this.idVisita = idVisita;
        this.mascota = mascota;
        this.tratamiento = tratamiento;
        this.fechaTratamiento = fechaTratamiento;
        this.observaciones = observaciones;
        this.pesoActual = pesoActual;
    }

    public int getIdVisita() {
        return idVisita;
    }

    public void setIdVisita(int idVisita) {
        this.idVisita = idVisita;
    }

    public Mascota getMascota() {
        return mascota;
    }

    public void setMascota(Mascota mascota) {
        this.mascota = mascota;
    }

    public Tratamiento getTratamiento() {
        return tratamiento;
    }

    public void setTratamiento(Tratamiento tratamiento) {
        this.tratamiento = tratamiento;
    }

    public LocalDate getFechaTratamiento() {
        return fechaTratamiento;
    }

    public void setFechaTratamiento(LocalDate fechaTratamiento) {
        this.fechaTratamiento = fechaTratamiento;
    }

    public String getObservaciones() {
        return observaciones;
    }

    public void setObservaciones(String observaciones) {
        this.observaciones = observaciones;
    }

    public double getPesoActual() {
        return pesoActual;
    }

    public void setPesoActual(double pesoActual) {
        this.pesoActual = pesoActual;
    }

    @Override
    public String toString() {
        return "Visita{" + "idVisita=" + idVisita + ", mascota=" + mascota + ", tratamiento=" + tratamiento + ", fechaTratamiento=" + fechaTratamiento + ", observaciones=" + observaciones + ", pesoActual=" + pesoActual + '}';
    }  
}
