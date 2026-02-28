package com.example;

public class Main {

    public static void main(String[] args) {

    Persona p1 = new Persona("Pedro", "Perez", "1053121010", 1998);

    Persona p2 = new Persona("Luis", "Leon", "1053223344", 2001);


    p1.setNombre("Daniel Bonilla");

    p1.imprimir();


    System.out.println("Edad de " + p1.getNombre() + ": " + p1.calcularEdad());
    System.out.println("Edad de " + p2.getNombre() + ": " + p2.calcularEdad());


    p2.imprimir();

    System.out.println("Accediendo getters:");
    System.out.println(p1.getNombre());
     System.out.println(p2.getNombre());




    }
}