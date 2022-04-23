package controlador;

import java.util.ArrayList;
import java.util.List;
import modelo.Cliente;

public class RegistroCliente {

    private static List<Cliente> listaClientes;
    
    public RegistroCliente() {
        listaClientes = new ArrayList<>();
    }
    
    //Agregar cliente
    public boolean agregar(Cliente c) {
        if(listaClientes.isEmpty()==false){
            for(Cliente cl: listaClientes){
                //Si ya existe el rut y tiene una cuenta de ahorro o corriente asociada
                if((cl.getRut().equals(c.getRut())) && (cl.getCuenta().getTipoCuenta()==c.getCuenta().getTipoCuenta())){
                    System.out.println("El rut ya tiene una cuenta asociada");
                    return false;
                }
            }
        }
        return listaClientes.add(c);
    }
    
    //Buscar un cliente
    public static boolean buscar(String rut, char tipoCuenta) {
        for (Cliente cliente : listaClientes) {
            if((cliente.getRut().equals(rut))&&(cliente.getCuenta().getTipoCuenta()==tipoCuenta)){
                return true;
            }
        }
        return false;
    }
    //Encontrar Cliente
    public static Cliente encontrar(String rut, char tipoCuenta) {
        Cliente x = null;
        for (Cliente cliente : listaClientes) {
            if((cliente.getRut().equals(rut))&&(cliente.getCuenta().getTipoCuenta()==tipoCuenta)){
                x = cliente;
                break;
            }
        }
        return x;
    }
    
    //Agregar y sacar dinero
    public static void agregarSaldo(Cliente c, int s){
        int saldo = c.getCuenta().getSaldo();
        saldo += s;
        c.getCuenta().setSaldo(saldo);
    }
    public static void eliminarSaldo(Cliente c, int s){
        int saldo = c.getCuenta().getSaldo();
        saldo -= s;
        c.getCuenta().setSaldo(saldo);
    }
  
    //Metodos para listar
    //Mostrar Lista completa
    public static List<Cliente> getLista() {
        return listaClientes;
    }
    //Mostrar lista por rut
    public static List<Cliente> getLista(String rut) {
        List<Cliente> listaRut = new ArrayList<>();
        for (Cliente c : listaClientes) {
            if (c.getRut().equals(rut)) {
                listaRut.add(c);
            }
        }
        return listaRut;
    }
    //Mostrar por tipo de cuenta
    public static List<Cliente> getLista(char tipo) {
        List<Cliente> listaTipo = new ArrayList<>();
        for (Cliente c : listaClientes) {
            if (c.getCuenta().getTipoCuenta() == tipo) {
                listaTipo.add(c);
            }
        }
        return listaTipo;
    }
    //Mostrar por rut y tipo de cuenta
    public static List<Cliente> getLista(String rut, char tipo) {
        List<Cliente> listaRutTipo = new ArrayList<>();
        for (Cliente c : listaClientes) {
            if (c.getRut().equals(rut)&&(c.getCuenta().getTipoCuenta() == tipo)) {
                listaRutTipo.add(c);
            }
        }
        return listaRutTipo;
    }

    
}