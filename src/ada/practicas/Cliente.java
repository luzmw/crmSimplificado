package ada.practicas;


import javax.persistence.*;

@Entity
@Table(name = "clientes")
public class Cliente extends Persona {

       @Id
       @GeneratedValue(strategy = GenerationType.IDENTITY)
        private  int idCliente;
        private  String telefono;
        private String empresa;
        private String mail;

        public Cliente() {
        }

        public Cliente(String nombre, String cargo, String telefono, String empresa, String mail) {
            super(nombre, cargo);
            this.telefono = telefono;
            this.empresa = empresa;
            this.mail = mail;
        }

        public String getTelefono() {
            return telefono;
        }

        public void setTelefono(String telefono) {
            this.telefono = telefono;
        }

        public int getIdCliente() {
            return idCliente;
        }

        public void setIdCliente(int idCliente) {
            this.idCliente = idCliente;
        }

        public String getEmpresa() {
            return empresa;
        }

        public void setEmpresa(String empresa) {
            this.empresa = empresa;
        }

        public String getMail() {
            return mail;
        }

        public void setMail(String mail) {
            this.mail = mail;
        }

    @Override
    public String toString() {
        return "Cliente{" +
                "idCliente=" + idCliente +
                ", telefono='" + telefono + '\'' +
                ", empresa='" + empresa + '\'' +
                ", mail='" + mail + '\'' +
                '}';
    }
}




