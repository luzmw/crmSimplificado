package ada.practicas;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Oportunidad {
    Estado estado;
   private List<Item> productoOfrecido;
   private Empresa cliente;
   private LocalDate contactoInicial;
   Scanner sc = new Scanner(System.in);


    public Oportunidad(List<Item> productoOfrecido, Empresa cliente, LocalDate contactoInicial) {
        this.productoOfrecido = productoOfrecido;
        this.cliente = cliente;
        this.contactoInicial = contactoInicial;
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


    public void mostrarDetalle() {
        List<Oportunidad> oportunidades= new ArrayList<>();
        for(Oportunidad o: oportunidades){
            System.out.println("Detalle:"+o.getProductoOfrecido());
            System.out.println("Detalle:"+o.getCliente());
            System.out.println("Detalle:"+o.getContactoInicial());

        }

    }

    public void añadirDetalles() {

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
}






