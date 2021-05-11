package Entidades;

import Entidades.Elemento;
import Entidades.Item;

public class Producto extends Elemento implements Item {
    private Double precioUnitario;


    public Producto(String nombre, Integer cantidad, String descripcion, Double precioUnitario) {
        super(nombre, cantidad, descripcion);
        this.precioUnitario= precioUnitario;
    }

    public Producto(String nombre, Integer cantidad, String descripcion) {
        super(nombre, cantidad, descripcion);
    }

    public Producto() {
    }

    public Double getPrecioUnitario() {
        return precioUnitario;
    }

    public void setPrecioUnitario(Double precioUnitario) {
        this.precioUnitario = precioUnitario;
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

    @Override
    public String toString() {
        return "Producto{" +
                "nombre='" + nombre + '\'' +
                ", cantidad=" + cantidad +
                ", descripcion='" + descripcion + '\'' +
                ", precioUnitario=" + precioUnitario +
                '}';
    }
}
