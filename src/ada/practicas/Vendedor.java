package ada.practicas;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Vendedor extends Persona{
    private int idVendedor;
    private List<Oportunidad> oportunidades;
    private List<Empresa> empresasCliente;//Cliente class
    private Double salario;
    private Scanner scanner= new Scanner(System.in);

    public Vendedor(String nombre, String cargo) {
        super(nombre, cargo);
        this.oportunidades= new ArrayList<>();

    }

    public Vendedor() {
        super();
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
        oportunidad.añadirDetalles();
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
                "oportunidades=" + oportunidades +
                ", empresasCliente=" + empresasCliente +
                ", scanner=" + scanner +
                '}';
    }
}
