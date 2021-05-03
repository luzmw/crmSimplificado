package ada.practicas;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

public  class Persona {

    private String nombre;
    private String cargo;

    public Persona(String nombre, String cargo) {
        this.nombre = nombre;
        this.cargo = cargo;
    }

    public Persona() {
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getCargo() {
        return cargo;
    }

    public void setCargo(String cargo) {
        this.cargo = cargo;
    }

    @Override
    public String toString() {
        return "Persona{" +
                "nombre='" + nombre + '\'' +
                ", cargo='" + cargo + '\'' +
                '}';
    }
}

