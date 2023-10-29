
package veterinaria.Entidades;

import veterinaria.Entidades.*;


public class Historial1 {
    
    private Mascota mascota;
    private Cliente cliente;
    private Tratamiento tratamiento;
    private Visita visita;

    public Historial1() {
    }

    public Historial1(Mascota mascota, Cliente cliente, Tratamiento tratamiento, Visita visita) {
        this.mascota = mascota;
        this.cliente = cliente;
        this.tratamiento = tratamiento;
        this.visita = visita;
    }

    public Mascota getMascota() {
        return mascota;
    }

    public void setMascota(Mascota mascota) {
        this.mascota = mascota;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public Tratamiento getTratamiento() {
        return tratamiento;
    }

    public void setTratamiento(Tratamiento tratamiento) {
        this.tratamiento = tratamiento;
    }

    public Visita getVisita() {
        return visita;
    }

    public void setVisita(Visita visita) {
        this.visita = visita;
    }
    
}

    