package principal;
import model.*;

public class Main {
    public static void main(String[] args) {

        inicializar();


    }

    public static void inicializar(){

        //Creacion GestionCine
        GestionCine gestionCine = new GestionCine();

        //Creacion de clientes
        Cliente cliente1 = new Cliente("Juan", "12345678-9", "@");
        Cliente cliente2 = new Cliente("Pedro", "98765432-1", "@@");
        Cliente cliente3 = new Cliente("Maria", "11111111-1", "@@@");

        //Verificar si el cliente existe
        gestionCine.clienteExiste(cliente1);
        gestionCine.clienteExiste(cliente2);
        gestionCine.clienteExiste(cliente3);

        //Agregar clientes a la lista
        gestionCine.agregarCliente(cliente1);
        gestionCine.agregarCliente(cliente2);
        gestionCine.agregarCliente(cliente3);

        //Creacion de salas
        SalaCine sala1 = new SalaCine(40);
        SalaCine sala2 = new SalaCine(50);
        SalaCine sala3 = new SalaCine(45);

        //Creacion de entradas
        Entrada entrada1 = new Entrada("1", TipoEntrada.NORMAL, sala1);
        Entrada entrada2 = new Entrada("2", TipoEntrada.NORMAL, sala2);
        Entrada entrada3 = new Entrada("3", TipoEntrada.NORMAL, sala3);
        Entrada entrada4 = new Entrada("4", TipoEntrada.VIP, sala1);
        Entrada entrada5 = new Entrada("5", TipoEntrada.VIP, sala2);
        Entrada entrada6 = new Entrada("6", TipoEntrada.VIP, sala3);
        Entrada entrada7 = new Entrada("7", TipoEntrada.IMAX, sala1);
        Entrada entrada8 = new Entrada("8", TipoEntrada.IMAX, sala2);
        Entrada entrada9 = new Entrada("9", TipoEntrada.IMAX, sala3);

        //Mostrar lista de clientes
        System.out.println(gestionCine.getClientes());
    }

}