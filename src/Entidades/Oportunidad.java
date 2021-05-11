package Entidades;

import javax.persistence.*;
import java.time.LocalDate;
import java.util.Scanner;
 @Entity
 @Table(name = "oportunidades")
public class Oportunidad implements Item {
   @Id
   @GeneratedValue (strategy = GenerationType.IDENTITY)

    private int idOportunidad;

   @OneToOne
    private Estado estado;
    private Cliente cliente;
    private LocalDate contactoInicial;
    private LocalDate proxximaFechaContacto;
    private Double precioItemOfrecido;
    private boolean aceptallamada;
    //private Map <Item,Double> preciosPactados;
    //List<Item>itemsofrecidos;
    Scanner sc = new Scanner(System.in);


    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public int getIdOportunidad() {
        return idOportunidad;
    }

    public void setIdOportunidad(int idOportunidad) {
        this.idOportunidad = idOportunidad;
    }

    public Estado getEstado() {
        return estado;
    }

    public void setEstado(Estado estado) {
        this.estado = estado;
    }

    public LocalDate getProxximaFechaContacto() {
        return proxximaFechaContacto;
    }

    public void setProxximaFechaContacto(LocalDate proxximaFechaContacto) {
        this.proxximaFechaContacto = proxximaFechaContacto;
    }

    public Double getPrecioItemOfrecido() {
        return precioItemOfrecido;
    }

    public void setPrecioItemOfrecido(Double precioItemOfrecido) {
        this.precioItemOfrecido = precioItemOfrecido;
    }

    public boolean isAceptallamada() {
        return aceptallamada;
    }

    public void setAceptallamada(boolean aceptallamada) {
        this.aceptallamada = aceptallamada;
    }

    public Scanner getSc() {
        return sc;
    }

    public void setSc(Scanner sc) {
        this.sc = sc;
    }

    public Oportunidad() {
        }




        public LocalDate getContactoInicial () {
            return contactoInicial;
        }

        public void setContactoInicial (LocalDate contactoInicial){
            this.contactoInicial = contactoInicial;
        }

    @Override
    public String toString() {
        return "Oportunidad{" +
                "idOportunidad=" + idOportunidad +
                ", estado=" + estado +
                ", cliente=" + cliente +
                ", contactoInicial=" + contactoInicial +
                ", proxximaFechaContacto=" + proxximaFechaContacto +
                ", precioItemOfrecido=" + precioItemOfrecido +
                ", aceptallamada=" + aceptallamada +
                ", sc=" + sc +
                '}';
    }

    //TODO borrar código arreglar "ortografía"
        /*public void mostrarDetalle () {
            List<Oportunidad> oportunidades = new ArrayList<>();
            for (Oportunidad o : oportunidades) {
                System.out.println("Detalle:" + o.getProductoOfrecido());
                System.out.println("Detalle:" + o.getCliente());
                System.out.println("Detalle:" + o.getContactoInicial());

            }

         */

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

        /*public void aniadirDetalles () {
            List<Oportunidad> oportunidads = new ArrayList<>();
            Oportunidad o = new Oportunidad();
            int opcion = 0;
            do {
                System.out.println("Ingrese el nombre de la empresa ");
                Empresa e = new Empresa();
                String nombreuno = sc.nextLine();
                sc.nextLine();
                e.setNombreEmpresa(nombreuno);
                e.setNombreEmpresa("Lalaland");
                e.setAceptaSeguiiento(true);

                o.setCliente(e);

                // System.out.println("Ingrese el item ofrecido");// atributos de prodcuto
                Producto prod = new Producto();
                prod.setNombre("caño reforzado");
                prod.setCantidad(5);
                prod.setDescripcion("reforzado");
                prod.setPrecioUnitario(32.20);

                Producto produno = new Producto();
                prod.setNombre("alabre reforzado");
                prod.setCantidad(2);
                prod.setDescripcion("reforzado");
                prod.setPrecioUnitario(65.50);

                List<Item> itemOfrecido = new ArrayList<>();

                itemOfrecido.add(prod);
                itemOfrecido.add(produno);

                o.setProductoOfrecido(itemOfrecido);

                System.out.println("día de contaacto inicial");
                // LocalDate contactoInicial =
                // o.setContactoInicial();
                System.out.println("desea registrar otra oportunidad? si =1 no= 0");
                opcion = sc.nextInt();

            } while (opcion != 0);

        }

         */










