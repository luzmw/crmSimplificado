package ada.practicas;

import java.util.List;

public class EmpresaProveedora {

    private List<Vendedor> vendedores;
    private String nombre;
    private List<Oportunidad> oportunidadesDeLaEmpresa;//lazy
    private List<Cliente> clientes;
}
