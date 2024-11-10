import java.util.LinkedList;
import java.util.Queue;

public class Pedido {
    private String orden;
    private int id;
    private int nOrden;
    private int encargado;

    public Pedido(String orden, int id, int nOrden,int encargado) {
        this.orden = orden;
        this.id = id;
        this.nOrden = nOrden;
        this.encargado = encargado;
    }

    public String getOrden() {
        return orden;
    }

    public void setOrden(String orden) {
        this.orden = orden;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getnOrden() {
        return nOrden;
    }

    public void setnOrden(int nOrden) {
        this.nOrden = nOrden;
    }

    public int getEncargado() {
        return encargado;
    }

    public void setEncargado(int encargado) {
        this.encargado = encargado;
    }
}
