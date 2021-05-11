package Entidades;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

@Entity
@Table (name = "vendedores")
@PrimaryKeyJoinColumn(name = "idPersona")
public class Vendedor extends Persona{
     @Id
     @GeneratedValue (strategy = GenerationType.IDENTITY)
    private int idVendedor;
    private List<Oportunidad> oportunidades;
    private List<Empresa> empresasCliente;//Cliente class
    private Double salario;
    private String cargo;
    private Scanner scanner= new Scanner(System.in);



    public Vendedor() {
        super();
    }

    public Vendedor(String nombre, String telefono, String mail, int idVendedor, List<Oportunidad> oportunidades, List<Empresa> empresasCliente, Double salario, String cargo, Scanner scanner) {
        super(nombre, telefono, mail);
        this.idVendedor = idVendedor;
        this.oportunidades = oportunidades;
        this.empresasCliente = empresasCliente;
        this.salario = salario;
        this.cargo = cargo;
        this.scanner = scanner;
    }

    public List<Oportunidad> getOportunidades() {

        return oportunidades;
    }

    public void setOportunidades(List<Oportunidad> oportunidades) {
        this.oportunidades = oportunidades;
    }

    public List<Empresa> getEmpresasCliente() {
        return empresasCliente;
    }

    public void setEmpresasCliente(List<Empresa> empresasCliente) {
        this.empresasCliente = empresasCliente;
    }

    public Oportunidad registrarOportunidad(){
        List<Oportunidad>Oportunidades =new ArrayList<>();

        Oportunidad oportunidad = new Oportunidad();
        //oportunidad.aniadirDetalles();
        return oportunidad;

    }
    /* public String

List<Oportunidad>oportunidads= new ArrayList<>();
        for (Oportunidad o:oportunidades){
            System.out.println(o.getCliente());
        }
        
     */

    @Override
    public String toString() {
        return "Vendedor{" +
                "idVendedor=" + idVendedor +
                ", oportunidades=" + oportunidades +
                ", empresasCliente=" + empresasCliente +
                ", salario=" + salario +
                ", cargo='" + cargo + '\'' +
                ", scanner=" + scanner +
                '}';
    }
}
