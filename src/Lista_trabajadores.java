import java.util.ArrayList;
import java.util.List;

public class Lista_trabajadores {

    List<Trabajador> listaTrabajadores;

    public  Lista_trabajadores(){
        listaTrabajadores = new ArrayList<Trabajador>();
    }
    public void agregar(Trabajador dato){
        listaTrabajadores.add(dato);
    }

    public boolean actualizar (Persona dato){

        for(Trabajador j:listaTrabajadores ){
            if(j.getId()==dato.getId()){
                j.setNombre(dato.getNombre());
                return true;
            }
        }
        return false;
    }

    public List<Trabajador  > getTrabajador() {
        return listaTrabajadores;
    }
}
