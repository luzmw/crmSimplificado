package ada.practicas;

public class Empresa {// empresa proveedora?
   private String nombreEmpresa;
   private Cliente cliente;
   private boolean aceptaSeguiiento;

    public Empresa(String nombreEmpresa, Cliente cliente) {
        this.nombreEmpresa = nombreEmpresa;
        this.cliente = cliente;
    }

    public Empresa() {
    }

    public String getNombreEmpresa() {
        return nombreEmpresa;
    }

    public void setNombreEmpresa(String nombreEmpresa) {
        this.nombreEmpresa = nombreEmpresa;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public boolean isAceptaSeguiiento() {
        return aceptaSeguiiento;
    }

    public void setAceptaSeguiiento(boolean aceptaSeguiiento) {
        this.aceptaSeguiiento = aceptaSeguiiento;
    }

    @Override
    public String toString() {
        return "Empresa{" +
                "nombreEmpresa='" + nombreEmpresa + '\'' +
                ", cliente=" + cliente +
                ", aceptaSeguiiento=" + aceptaSeguiiento +
                '}';
    }
}
