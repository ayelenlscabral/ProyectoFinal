package veterinaria.Entidades;

public class Tratamiento {
      private int idTratamiento;
    private String tipoTratamiento;
    private String descripcion;
    private double importe;
    private boolean estado;

    public Tratamiento() {
    }

    public Tratamiento(int idTratamiento, String tipoTratamiento, String descripcion, double importe, boolean estado) {
        this.idTratamiento = idTratamiento;
        this.tipoTratamiento = tipoTratamiento;
        this.descripcion = descripcion;
        this.importe = importe;
        this.estado = estado;
    }

    public Tratamiento(String tipoTratamiento, String descripcion, double importe, boolean estado) {
        this.tipoTratamiento = tipoTratamiento;
        this.descripcion = descripcion;
        this.importe = importe;
        this.estado = estado;
    }

    public int getIdTratamiento() {
        return idTratamiento;
    }

    public void setIdTratamiento(int idTratamiento) {
        this.idTratamiento = idTratamiento;
    }

    public String getTipoTratamiento() {
        return tipoTratamiento;
    }

    public void setTipoTratamiento(String tipoTratamiento) {
        this.tipoTratamiento = tipoTratamiento;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public double getImporte() {
        return importe;
    }

    public void setImporte(double importe) {
        this.importe = importe;
    }

    public boolean isEstado() {
        return estado;
    }

    public void setEstado(boolean estado) {
        this.estado = estado;
    }

    @Override
    public String toString() {
        return "Tratamiento: " + tipoTratamiento + "- $" + importe;
    }  
}
