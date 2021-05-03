package ada.practicas;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

public class Oportunidad implements Item{
   private int idOportunidad;
   private Estado estado;
   private List<Item> productoOfrecido;
   private Empresa cliente;//TODO CAMBIAR A CLIENTE CLIENTE?
   private LocalDate contactoInicial;
   private LocalDate proxximaFechaContacto;
  private  boolean aceptallamada;
  private Map <Item,Double> preciosPactados;
   Scanner sc = new Scanner(System.in);


    public Oportunidad(List<Item> productoOfrecido, Empresa cliente, LocalDate contactoInicial, Estado estado) {
        this.productoOfrecido = new ArrayList<>();
        this.cliente = cliente;
        this.contactoInicial = contactoInicial;
       // this.estado= estado
    }

    public Oportunidad() {
    }




    public List<Item> getProductoOfrecido() {
        return productoOfrecido;
    }

    public void setProductoOfrecido(List<Item> productoOfrecido) {
        this.productoOfrecido = productoOfrecido;
    }

    public Empresa getCliente() {
        return cliente;
    }

    public void setCliente(Empresa cliente) {
        this.cliente = cliente;
    }

    public LocalDate getContactoInicial() {
        return contactoInicial;
    }

    public void setContactoInicial(LocalDate contactoInicial) {
        this.contactoInicial = contactoInicial;
    }

    //TODO borrar código arreglar "ortografía"
    public void mostrarDetalle() {
        List<Oportunidad>oportunidades=new ArrayList<>();
        for(Oportunidad o: oportunidades){
            System.out.println("Detalle:"+o.getProductoOfrecido());
            System.out.println("Detalle:"+o.getCliente());
            System.out.println("Detalle:"+o.getContactoInicial());

        }

    }

    public void añadirDetalles() {
        List<Oportunidad> oportunidads= new ArrayList<>();
        Oportunidad o = new Oportunidad();
        int opcion=0;
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
           opcion =sc.nextInt();

       }while (opcion!=0);

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
        return "Oportunidad{" +
                "estado=" + estado +
                ", productoOfrecido=" + productoOfrecido +
                ", cliente=" + cliente +
                ", contactoInicial=" + contactoInicial +
                ", sc=" + sc +
                '}';
    }
}






