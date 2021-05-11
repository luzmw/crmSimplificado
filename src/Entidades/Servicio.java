package Entidades;

public class Servicio extends Elemento implements Item {
    private Double valorHora;
    private Persona profesional;

    public Servicio(String nombre, Integer cantidad, String descripcion, Double valorHora, Persona profesional) {
        super(nombre, cantidad, descripcion);
        this.valorHora= valorHora;
        this.profesional= profesional;
    }

    public Servicio() {
    }

    public Double getValorHora() {
        return valorHora;
    }

    public void setValorHora(Double valorHora) {
        this.valorHora = valorHora;
    }

    public Persona getProfesional() {
        return profesional;
    }

    public void setProfesional(Persona profesional) {
        this.profesional = profesional;
    }

    @Override
    public void calcularCosto() {

    }

    @Override
    public void mostrarDetalles() {

    }

    @Override
    public void agrgarElemento() {

    }

    @Override
    public void eliminarElemento() {

    }

    @Override
    public void modificarItem() {

    }
}
