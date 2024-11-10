import java.util.stream.Stream;

public class Persona {
    private int id;
    private String nombre;
    private int numeroCliente;
    private String email;

    public Persona(int id, String nombre, int numeroCliente, String email) {
        this.id = id;
        this.nombre = nombre;
        this.numeroCliente = numeroCliente;
        this.email = email;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getNumeroCliente() {
        return numeroCliente;
    }

    public void setNumeroCliente(int numeroCliente) {
        this.numeroCliente = numeroCliente;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    @Override
    public String
    toString() {
        return "Persona{" +
                "id=" + id +
                ", nombre='" + nombre + '\'' +
                ", numeroCliente=" + numeroCliente +
                ", email='" + email + '\'' +
                '}';
    }
}
