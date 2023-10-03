package veterinaria.Entidades;

import java.time.LocalDate;

public class Mascota {

    public int idMascota;
    public Cliente idCliente;
    public String alias;
    public String sexo;
    public String especie;
    public String raza;
    public String colorPelo;
    public LocalDate fechaNac;
    public double pesoPromedio;
    public double pesoActual;
    public boolean estado;

    public Mascota() {
    }

    public Mascota(Cliente idCliente, String alias, String sexo, String especie, String raza, String colorPelo, LocalDate fechaNac, double pesoPromedio, double pesoActual, boolean estado) {
        this.idCliente = idCliente;
        this.alias = alias;
        this.sexo = sexo;
        this.especie = especie;
        this.raza = raza;
        this.colorPelo = colorPelo;
        this.fechaNac = fechaNac;
        this.pesoPromedio = pesoPromedio;
        this.pesoActual = pesoActual;
        this.estado = estado;
    }

    public Mascota(int idMascota, Cliente idCliente, String alias, String sexo, String especie, String raza, String colorPelo, LocalDate fechaNac, double pesoPromedio, double pesoActual, boolean estado) {
        this.idMascota = idMascota;
        this.idCliente = idCliente;
        this.alias = alias;
        this.sexo = sexo;
        this.especie = especie;
        this.raza = raza;
        this.colorPelo = colorPelo;
        this.fechaNac = fechaNac;
        this.pesoPromedio = pesoPromedio;
        this.pesoActual = pesoActual;
        this.estado = estado;
    }

    public int getIdMascota() {
        return idMascota;
    }

    public void setIdMascota(int idMascota) {
        this.idMascota = idMascota;
    }

    public Cliente getIdCliente() {
        return idCliente;
    }

    public void setIdCliente(Cliente idCliente) {
        this.idCliente = idCliente;
    }

    public String getAlias() {
        return alias;
    }

    public void setAlias(String alias) {
        this.alias = alias;
    }

    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    public String getEspecie() {
        return especie;
    }

    public void setEspecie(String especie) {
        this.especie = especie;
    }

    public String getRaza() {
        return raza;
    }

    public void setRaza(String raza) {
        this.raza = raza;
    }

    public String getColorPelo() {
        return colorPelo;
    }

    public void setColorPelo(String colorPelo) {
        this.colorPelo = colorPelo;
    }

    public LocalDate getFechaNac() {
        return fechaNac;
    }

    public void setFechaNac(LocalDate fechaNac) {
        this.fechaNac = fechaNac;
    }

    public double getPesoPromedio() {
        return pesoPromedio;
    }

    public void setPesoPromedio(double pesoPromedio) {
        this.pesoPromedio = pesoPromedio;
    }

    public double getPesoActual() {
        return pesoActual;
    }

    public void setPesoActual(double pesoActual) {
        this.pesoActual = pesoActual;
    }

    public boolean isEstado() {
        return estado;
    }

    public void setEstado(boolean estado) {
        this.estado = estado;
    }

    @Override
    public String toString() {
        return "Mascota{" + "idMascota=" + idMascota + ", alias=" + alias + ", sexo=" + sexo + ", especie=" + especie + ", raza=" + raza + ", estado=" + estado + '}';
    }

}
