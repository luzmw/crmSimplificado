package Entidades;


import Entidades.Persona;

import javax.persistence.*;

@Entity
@Table(name="clientes")
@PrimaryKeyJoinColumn(name="idPersona")
public class Cliente extends Persona {

       @Id
       @GeneratedValue(strategy = GenerationType.IDENTITY)
       private  int idCliente;
       private String  cargo;
        private String empresa;
        private  boolean aceptaSeguimiento;

        public Cliente() {
        }

    public Cliente(String nombre, String telefono, String mail, String cargo, String empresa, boolean aceptaSeguimiento) {
        super(nombre, telefono, mail);
        this.cargo = cargo;
        this.empresa = empresa;
        this.aceptaSeguimiento = aceptaSeguimiento;
    }

    public int getIdCliente() {
        return idCliente;
    }

    public void setIdCliente(int idCliente) {
        this.idCliente = idCliente;
    }

    public String getCargo() {
        return cargo;
    }

    public void setCargo(String cargo) {
        this.cargo = cargo;
    }

    public String getEmpresa() {
        return empresa;
    }

    public void setEmpresa(String empresa) {
        this.empresa = empresa;
    }

    public boolean isAceptaSeguimiento() {
        return aceptaSeguimiento;
    }

    public void setAceptaSeguimiento(boolean aceptaSeguimiento) {
        this.aceptaSeguimiento = aceptaSeguimiento;
    }

    @Override
    public String toString() {
        return "Cliente{" +
                "idCliente=" + idCliente +
                ", cargo='" + cargo + '\'' +
                ", empresa='" + empresa + '\'' +
                ", aceptaSeguimiento=" + aceptaSeguimiento +
                '}';
    }
}




