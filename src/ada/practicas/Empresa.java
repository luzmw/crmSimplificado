package ada.practicas;

public class Empresa {
    String nombreEmpresa;
    Persona contacto;
    boolean aceptaSeguiiento;

    public Empresa(String nombreEmpresa, Persona contacto) {
        this.nombreEmpresa = nombreEmpresa;
        this.contacto = contacto;
    }

    public Empresa() {
    }

    public String getNombreEmpresa() {
        return nombreEmpresa;
    }

    public void setNombreEmpresa(String nombreEmpresa) {
        this.nombreEmpresa = nombreEmpresa;
    }

    public Persona getContacto() {
        return contacto;
    }

    public void setContacto(Persona contacto) {
        this.contacto = contacto;
    }

    public boolean isAceptaSeguiiento() {
        return aceptaSeguiiento;
    }

    public void setAceptaSeguiiento(boolean aceptaSeguiiento) {
        this.aceptaSeguiiento = aceptaSeguiiento;
    }
}
