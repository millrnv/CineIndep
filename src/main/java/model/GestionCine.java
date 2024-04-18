package model;

import java.util.ArrayList;
import java.util.List;

public class GestionCine {

    private List<Cliente> clientes;
    private List<SalaCine> salas;

    //Constructor
    public GestionCine(){

        this.clientes = new ArrayList<>();
        this.salas = new ArrayList<>();
    }

    public List<Cliente> getClientes() {
        return clientes;
    }

    public void setClientes(List<Cliente> clientes) {
        this.clientes = clientes;
    }

    public List<SalaCine> getSalas() {
        return salas;
    }

    public void setSalas(List<SalaCine> salas) {
        this.salas = salas;
    }

    //Metodo para verificar si el cliente existe
    public boolean clienteExiste(Cliente cliente){
        for(Cliente c: clientes){
            if(c.getRut().equals(cliente.getRut())){
                return true;
            }
        }
        return false;
    }

    //Metodo para agregar cliente
    public boolean agregarCliente(Cliente cliente){
        if(!clienteExiste(cliente)){
            clientes.add(cliente);
            return true;
        }
        return false;
    }

    public boolean entradaExiste(Entrada entrada){
        for(Cliente c: clientes){
            for(Entrada e: c.getEntradas()){
                if(e.getId().equals(entrada.getId())){
                    return true;
                }
            }
        }
        return false;
    }



    //Metodo para verificar si el cliente tiene entrada
    public boolean clienteTieneEntrada(Cliente cliente, Entrada entrada){
        if(clienteExiste(cliente) && entradaExiste(entrada) ){

            List<Entrada> entradasCliente = cliente.getEntradas();

            if(entradasCliente != null){
                for(Entrada e : entradasCliente){
                    if(e.getId().equals(entrada.getId())){
                        return true;
                    }
                }
            }
        }
        return false;
    }

    //Metodo para vender una entrada a un cliente
    public boolean venderEntradaACliente(){
        return false;

        }


    //Metodo para reversar venta de una entrada




    //Metodo para ver el n de asientos de una sala y la cantidad vendida
    public void verAsientosVendidos(SalaCine sala){


    }

    //Metodo para ver el numero de entradas que tiene un cliente
    public void verEntradasCliente(Cliente cliente){
        System.out.println("El cliente "+cliente.getNombre()+" tiene "+cliente.getEntradas().size()+" entradas");

    }






    //Metodo para permitir el ingreso de un cliente a una sala si tiene entrada











}
