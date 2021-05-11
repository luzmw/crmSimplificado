package Entidades;

import java.util.List;

public class EmpresaProveedora {

    private List<Vendedor> vendedores;
    private String nombre;
    private List<Oportunidad> oportunidadesDeLaEmpresa;//lazy
    private List<Cliente> clientes;

    public EmpresaProveedora() {
    }


    public List<Vendedor> getVendedores() {
        return vendedores;
    }

    public void setVendedores(List<Vendedor> vendedores) {
        this.vendedores = vendedores;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public List<Oportunidad> getOportunidadesDeLaEmpresa() {
        return oportunidadesDeLaEmpresa;
    }

    public void setOportunidadesDeLaEmpresa(List<Oportunidad> oportunidadesDeLaEmpresa) {
        this.oportunidadesDeLaEmpresa = oportunidadesDeLaEmpresa;
    }

    public List<Cliente> getClientes() {
        return clientes;
    }

    public void setClientes(List<Cliente> clientes) {
        this.clientes = clientes;
    }

    @Override
    public String toString() {
        return "EmpresaProveedora{" +
                "vendedores=" + vendedores +
                ", nombre='" + nombre + '\'' +
                ", oportunidadesDeLaEmpresa=" + oportunidadesDeLaEmpresa +
                ", clientes=" + clientes +
                '}';
    }
}
