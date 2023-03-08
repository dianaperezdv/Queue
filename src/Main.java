import java.sql.SQLOutput;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner =new Scanner(System.in);
        Tienda tienda = new Tienda();
        boolean OpenTienda = true;

        while (OpenTienda){
            System.out.println("1. Agregar cliente a la cola");
            System.out.println("2. Atender cliente");
            System.out.println("3. Salir de la tienda");
            System.out.println("Ingrese una opcion: ");
            int opcionEscogida = scanner.nextInt();

            switch (opcionEscogida){
                case 1:
                    System.out.println("Ingrese el numero del cliente: ");
                    int numeroTicket = scanner.nextInt();
                    Cliente cliente =new Cliente(numeroTicket);
                    tienda.agregarCliente(cliente);
                    break;

                case 2:
                    if (tienda.hayClientesEnCola()){
                        Cliente clienteAtendido1 = tienda.atenderCliente();
                        System.out.println("Cliente atendido. Numero de ticket: " + clienteAtendido1.numeroTicket );
                    }else{
                        System.out.println("No hay clientes por atender");
                    }
                    break;

                case 3:
                    OpenTienda = false;
                    System.out.println("Saliendo del programa..");
                    break;
                default:
                    System.out.println("La opcion seleccionada no existe. Por favor elige otra");
                    break;

            }
        }



    }
}