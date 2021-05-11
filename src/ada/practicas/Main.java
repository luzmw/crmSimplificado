package ada.practicas;

import DAO.ClienteDAO;
import Entidades.Cliente;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import java.util.List;

public class Main {

    public static void main(String[] args) {
        //CRM
        /*
       CRM para la gestión de ventas en una empresa

Se requiere un sistema que permita registrar una oportunidad de negocio.
En cada oportunidad se debe anotar el nombre de la empresa cliente, el nombre del contacto (cliente), su cargo, el producto o servicio ofrecido y si acepta una llamada de seguimiento. Además, registrar fecha de contacto inicial y si se le brindó un precio de referencia y en ese caso, indicar monto.

El sistema va a tener muchos vendedores.
Cada vendedor debería tener muchas oportunidades de negocio. Las oportunidades pertenecen al vendedor.

Si un vendedor deja la empresa, las oportunidades se asignan a otro vendedor.

Un vendedor tiene muchos clientes y muchas oportunidades.
Pueden existir más de una oportunidad en el mismo cliente.
Por ej., al gte. de sistemas de EmpresaX le interesó un producto y al gte. de seguridad de la misma empresa le interesó un producto o servicio distinto.

Pueden reutilizar el sistema de presupuestos para las listas de productos y servicios.

Sales funnel / embudo de ventas: https://getvoip.com/uploads/sales-funnel.jpg
         */
        SessionFactory sf = new Configuration().configure().buildSessionFactory();
        try (Session session = sf.openSession()) {

            List<Cliente> clientes = (List<Cliente>) session.createQuery("FROM Cliente").list();

            System.out.println("Ahora muestro nombres de clientes");
            for (Cliente c : clientes)
                System.out.println(c);

            Cliente unCliente= new Cliente("luis","2523652","jdjdj@df.com", "gerente", "demos",true );
            session.beginTransaction();
            session.save(unCliente);
            session.getTransaction().commit();
            session.close();
        }


    //código Pablo
        for(Cliente cliente: ClienteDAO.getClientes())
            System.out.println(cliente);

        Cliente nuevoCliente = new Cliente("sabri","22352365","dd@eeeee.com","asistente","company", false);

        ClienteDAO.guardarCliente(nuevoCliente);


    }






       /* List<Vendedor> vendedores= new ArrayList<>();
        vendedores.add(new Vendedor("juan0", "jr"));
        vendedores.add(new Vendedor("Pedro", "Jr"));
        vendedores.add(new Vendedor("Laura","gerente"));
        Vendedor v = new Vendedor();

        */

        Cliente cliente= new Cliente();
       /* int opcion =0;
        Scanner sc = new Scanner(System.in);
       do {
           System.out.println("Ingrese su nombre ");
           String nombre = sc.nextLine();

           v.setNombre(nombre);
           System.out.println(v.getNombre() + " desea registrar nueva oportunidad (1)/ver sus oportunidades (2)");
            opcion=Integer.parseInt(sc.nextLine());
           if (opcion==1) {
               v.registrarOportunidad();
           }else {
               v.getOportunidades();
           }
       }while (opcion!=0);

        */

    }


