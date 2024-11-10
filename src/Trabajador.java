import com.sun.nio.sctp.PeerAddressChangeNotification;

public class Trabajador{

    private int contrasena ;

    private int id;
    private String nombre;
    private String email;

    public Trabajador(int contrasena, int id, String nombre, String email) {
        this.contrasena = contrasena;
        this.id = id;
        this.nombre = nombre;
        this.email = email;
    }

    public int getContrasena() {
        return contrasena;
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

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    @Override
    public String toString() {
        return "Trabajador{" +
                ", id=" + id +
                ", nombre='" + nombre + '\'' +
                ", email='" + email + '\'' +
                '}';
    }


    /*
    metodos  para  la  veentanda

    private Lista equipo=new Lista();


    acctualiza

    Jugador jugador=new Jugador(id,nombre,posicion,rendimiento,edad);
                if(equipo.actualizar(jugador)) {
                    JOptionPane.showMessageDialog(null,
                            "Elemento actualizado");
                    llenarJlist();
                }



     */
}
