package veterinaria.Entidades;

public class validadorUsuario {
    private Empleado empleado;
    private boolean comprobacion;

    public validadorUsuario() {
    }

    public validadorUsuario(Empleado empleado, boolean comprobacion) {
        this.empleado = empleado;
        this.comprobacion = comprobacion;
    }

    public Empleado getEmpleado() {
        return empleado;
    }

    public void setEmpleado(Empleado empleado) {
        this.empleado = empleado;
    }

    public boolean isComprobacion() {
        return comprobacion;
    }

    public void setComprobacion(boolean comprobacion) {
        this.comprobacion = comprobacion;
    }

    @Override
    public String toString() {
        return "Login{" + "empleado=" + empleado + ", comprobacion=" + comprobacion + '}';
    }
    
    
}
