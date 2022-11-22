package com.Principal;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Persona estudiante = new Persona();
        Scanner est = new Scanner(System.in);
        String nombre, apellidos, id, correo, pais;
        int edad;

        System.out.print("Ingrese su nombre: ");
        nombre = est.next();
        estudiante.setNombre(nombre);

        System.out.print("Ingrese uno de sus apellidos: ");
        apellidos = est.next();
        estudiante.setApellidos(apellidos);

        System.out.print("Ingrese su identificación: ");
        id = est.next();
        estudiante.setId(id);

        System.out.print("Ingrese su correo electrónico: ");
        correo = est.next();
        estudiante.setCorreoElectronico(correo);

        System.out.print("Ingrese su país de residencia: ");
        pais = est.next();
        estudiante.setPais(pais);

        System.out.print("Ingrese su edad: ");
        edad = est.nextInt();
        estudiante.setEdad(edad);

        System.out.println("\n---------DATOS DEL ESTUDIANTE--------"+
                "\n Nombre: "+estudiante.getNombre()
                +"\n Apellidos: "+estudiante.getApellidos()
                +"\n ID: "+estudiante.getId()
                +"\n Correo electrónico: "+estudiante.getCorreoElectronico()
                +"\n País: "+estudiante.getPais()
                +"\n Edad: "+estudiante.getEdad());

        Persona estu = new Persona("Pablo", "Alfaro", "234567891", "palfaro@hotmail.com", "Costa Rica", 23);

        System.out.println("\n---------DATOS DEL ESTUDIANTE--------"+
                "\n Nombre: "+estu.getNombre()
                +"\n Apellidos: "+estu.getApellidos()
                +"\n ID: "+estu.getId()
                +"\n Correo electrónico: "+estu.getCorreoElectronico()
                +"\n País: "+estu.getPais()
                +"\n Edad: "+estu.getEdad());
    }
}
