import java.util.LinkedList;
import java.util.Queue;

public class Cliente {
    // Cliente relacionado con Ticket, le pasamos como parametro numero de ticket.
    protected int numeroTicket;

    public Cliente(int numeroTicket) {
        this.numeroTicket = numeroTicket;
    }

    // obtener el numero del ticket del cliente

    public int getNumeroTicket() {
        return numeroTicket;
    }
}

class Tienda {
    protected Queue<Cliente> colaDeClientes = new LinkedList<>();

    public void agregarCliente(Cliente cliente){
        colaDeClientes.add(cliente);
    }
    public Cliente atenderCliente(){
        return colaDeClientes.remove();
    }

    public boolean hayClientesEnCola(){
        return !colaDeClientes.isEmpty();
    }

}

