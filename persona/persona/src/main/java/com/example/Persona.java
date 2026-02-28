package com.example;


public class Persona {

    private String nombre;
    private String apellido;
    private String numeroDocumentoIdentidad;
    private int anoNacimiento;

    public Persona(String nombre, String apellido, String numeroDocumentoIdentidad, int anoNacimiento) {



    this.nombre = nombre;

    this.apellido = apellido;

    this.numeroDocumentoIdentidad = numeroDocumentoIdentidad;

    this.anoNacimiento = anoNacimiento;
    }


    public String getNombre() {

    return nombre;
    }

public String getApellido() {

    return apellido;
    }

public String getNumeroDocumentoIdentidad() {
    return numeroDocumentoIdentidad;
    }


public int getAnoNacimiento() {
    return anoNacimiento;
    }


public void setNombre(String nombre) {
    this.nombre = nombre;

    }

    public void setApellido(String apellido) {
    this.apellido = apellido;

    }

public void setNumeroDocumentoIdentidad(String numeroDocumentoIdentidad) {
        this.numeroDocumentoIdentidad = numeroDocumentoIdentidad;
    }

public void setAnoNacimiento(int anoNacimiento) {
        this.anoNacimiento = anoNacimiento;
    }

    // Método para imprimir
    public void imprimir() {
        System.out.println("Nombre: " + nombre);

        System.out.println("Apellido: " + apellido);

        System.out.println("Documento: " + numeroDocumentoIdentidad);

        System.out.println("Año Nacimiento: " + anoNacimiento);
        
        System.out.println("-");
    }
}