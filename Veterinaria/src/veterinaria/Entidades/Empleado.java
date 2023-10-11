
package veterinaria.Entidades;

public class Empleado {
    private int idEmpleado;
    private String usuario;
    private String contrasenia;
    private int acceso;

    public Empleado() {
    }

    public Empleado(String usuario, String contrasenia, int acceso) {
        this.usuario = usuario;
        this.contrasenia = contrasenia;
        this.acceso = acceso;
    }

    public Empleado(int idEmpleado, String usuario, String contrasenia, int acceso) {
        this.idEmpleado = idEmpleado;
        this.usuario = usuario;
        this.contrasenia = contrasenia;
        this.acceso = acceso;
    }

    public int getIdEmpleado() {
        return idEmpleado;
    }

    public void setIdEmpleado(int idEmpleado) {
        this.idEmpleado = idEmpleado;
    }

    public String getUsuario() {
        return usuario;
    }

    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }

    public String getContrasenia() {
        return contrasenia;
    }

    public void setContrasenia(String contrasenia) {
        this.contrasenia = contrasenia;
    }

    public int getAcceso() {
        return acceso;
    }

    public void setAcceso(int acceso) {
        this.acceso = acceso;
    }

    @Override
    public String toString() {
        return "Empleado{" + "idEmpleado=" + idEmpleado + ", usuario=" + usuario + ", contrasenia=" + contrasenia + ", acceso=" + acceso + '}';
    }
    
    
}
