package ada.practicas;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Vendedor extends Persona{
    private List<Oportunidad> oportunidades;
    private List<Empresa> empresasCliente;
    //private Vendedor gerente;
    Scanner scanner= new Scanner(System.in);

    public Vendedor(String nombre, String cargo) {
        super(nombre, cargo);

    }

    public Vendedor() {
        super();
    }

    public List<Oportunidad> getOportunidades() {
        for (Oportunidad o:oportunidades){
            System.out.println(o.getCliente());
        }
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
        Oportunidad oportunidad = new Oportunidad();
        oportunidad.añadirDetalles();
        return oportunidad;

    }


}
