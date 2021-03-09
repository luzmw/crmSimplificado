package ada.practicas;

public  class Persona {
    protected String nombre;
    protected String cargo;

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
}

