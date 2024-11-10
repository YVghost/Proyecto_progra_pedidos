import java.util.LinkedList;
import java.util.Queue;

public class Cola_pedido {
    private Queue<Pedido> Lpedido;

    private Cola_pedido (Queue<Pedido>  pedido){
        pedido=  new LinkedList<>();
    }

    public Queue<Pedido> getListaPedido() {
        return Lpedido;
    }
    public void encolar(String orden, int id, int  nOrden, int encargado)
    {
        Lpedido.add(new Pedido(orden, id, nOrden, encargado));
    }

    public Pedido desencolar() throws Exception
    {
        if(Lpedido.isEmpty())
        {
            throw new Exception("No hay pedidos");
        }
        return Lpedido.poll();
    }

    public String listarPedido()
    {
        String acum="";
        for (Pedido x: Lpedido)
        {
            acum+=x.toString();
        }
        return acum;
    }

    /*

    public String listarMarca(String marca)
    {
        String texto="";
        for (Auto x: listaAutos)
        {
            if(x.getMarca().compareTo(marca)==0)
            {
                texto+=x.toString();
            }
        }
        return texto;
    }public Queue<Auto> getListaAutos() {
        return listaAutos;
    }

    */
}
