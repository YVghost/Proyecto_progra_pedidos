import java.util.ArrayList;
import java.util.List;

public class Lista_clientes {
    List<Persona> listaClientes;

    public  Lista_clientes(){
        listaClientes = new ArrayList<Persona>();
    }
    public void agregar(Persona dato){
        listaClientes.add(dato);
    }

    public boolean actualizar (Persona dato){

        for(Persona j:listaClientes){
            if(j.getId()==dato.getId()){
                j.setNombre(dato.getNombre());
                return true;
            }
        }
        return false;
    }

    public List<Persona> getCliente() {
        return listaClientes;
    }
}
