package Entidades;

import javax.persistence.*;



    @Entity
    @Table(name = "personas")
    @Inheritance(strategy = InheritanceType.JOINED)

    public  class Persona {

    @Id @GeneratedValue (strategy = GenerationType.IDENTITY)
    private int idPersona;
    private String nombre;
    private  String telefono;
    private String mail;

    public Persona(String nombre, String telefono, String mail) {
        this.nombre = nombre;
        this.telefono = telefono;
        this.mail = mail;
    }

    public Persona() {
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }



    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public String getMail() {
        return mail;
    }

    public void setMail(String mail) {
        this.mail = mail;
    }

    @Override
    public String toString() {
        return super.toString();
    }
}

