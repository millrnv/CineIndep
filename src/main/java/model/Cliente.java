package model;

import java.util.ArrayList;
import java.util.List;

public class Cliente {

    private String nombre, rut, correo;
    private List<Entrada> entradas;

    //Constructor
    public Cliente(String nombre, String rut, String correo) {
        this.nombre = nombre;
        this.rut = rut;
        this.correo = correo;
        this.entradas = new ArrayList<>();
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getRut() {
        return rut;
    }

    public void setRut(String rut) {
        this.rut = rut;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public List<Entrada> getEntradas() {
        return entradas;
    }

    public void setEntradas(List<Entrada> entradas) {
        this.entradas = entradas;
    }

    public String toString(){
        return "Nombre: "+nombre+" Rut: "+rut+" Correo: "+correo;
    }

}
