package generics;

import model.Cliente;

import java.util.ArrayList;
import java.util.List;

public class EjemplosGenericos {
    public static void main(String[] args) {

        List<Cliente> clientes = new ArrayList<>();
        clientes.add(new Cliente("Mateo", "Vlad", "25"));

        Cliente jefe = clientes.iterator().next();

    }
}
