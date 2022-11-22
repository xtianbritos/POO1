package com.Principal;

public class Persona {
    String nombre, apellidos, id, correoElectronico, pais;
    int edad;

    public Persona() {}

    public Persona(String nombre, String apellidos, String id, String correoElectronico, String pais, int edad) {
        this.nombre = nombre;
        this.apellidos = apellidos;
        this.id = id;
        this.correoElectronico = correoElectronico;
        this.pais = pais;
        this.edad = edad;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellidos() {
        return apellidos;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getCorreoElectronico() {
        return correoElectronico;
    }

    public void setCorreoElectronico(String correoElectronico) {
        this.correoElectronico = correoElectronico;
    }

    public String getPais() {
        return pais;
    }

    public void setPais(String pais) {
        this.pais = pais;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }
}
