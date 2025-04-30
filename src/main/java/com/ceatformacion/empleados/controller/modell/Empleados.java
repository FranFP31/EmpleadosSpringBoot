package com.ceatformacion.empleados.controller.modell;

import java.time.LocalDate;

public class Empleados {
    static int contador;
    private String nombre;
    private String apellido;
    private String dni;
    private LocalDate fechaNacimiento;
    private String ultimaT;
    private int numHijos;
    private int idEmpleado;
    private Puesto puestoEmpleado;

    public enum    Puesto{
        Directivo, Agente, Empleado
    }

    public Empleados() {
        this.nombre = nombre;
        this.apellido = apellido;
        this.dni = dni;
        this.fechaNacimiento = parse(fechaNacimiento);
        this.ultimaT = ultimaT;
        this.numHijos = numHijos;
        this.puestoEmpleado = puestoEmpleado;
        this.idEmpleado=++contador;
    }

    private LocalDate parse(LocalDate fechaNacimiento) {
        return null;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getDni() {
        return dni;
    }

    public void setDni(String dni) {
        this.dni = dni;
    }

    public LocalDate getFechaNacimiento() {
        return fechaNacimiento;
    }

    public void setFechaNacimiento(String fechaNacimiento) {
        this.fechaNacimiento = LocalDate.parse(fechaNacimiento);
    }

    public String getUltimaT() {
        return ultimaT;
    }

    public void setUltimaT(String ultimaT) {
        this.ultimaT = ultimaT;
    }

    public int getNumHijos() {
        return numHijos;
    }

    public void setNumHijos(int numHijos) {
        this.numHijos = numHijos;
    }

    public int getIdEmpleado() {
        return idEmpleado;
    }

    public Puesto getPuestoEmpleado() {
        return puestoEmpleado;
    }

    public void setPuestoEmpleado(Puesto puestoEmpleado) {
        this.puestoEmpleado = puestoEmpleado;
    }
}
