
package veterinaria.Entidades;

public class Empleado {
    private int idEmpleado;
    private String usuario;
    private String contrasenia;
    private String sexo;
    private int acceso;

    public Empleado() {
    }

    public Empleado(String usuario, String contrasenia, String sexo, int acceso) {
        this.usuario = usuario;
        this.contrasenia = contrasenia;
        this.sexo = sexo;
        this.acceso = acceso;
    }

    public Empleado(int idEmpleado, String usuario, String contrasenia, String sexo, int acceso) {
        this.idEmpleado = idEmpleado;
        this.usuario = usuario;
        this.contrasenia = contrasenia;
        this.sexo = sexo;
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

    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    public int getAcceso() {
        return acceso;
    }

    public void setAcceso(int acceso) {
        this.acceso = acceso;
    }

    @Override
    public String toString() {
        return "Empleado{" + "idEmpleado=" + idEmpleado + ", usuario=" + usuario + ", contrasenia=" + contrasenia + ", sexo=" + sexo + ", acceso=" + acceso + '}';
    }

}