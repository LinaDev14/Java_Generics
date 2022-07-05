package generics;

import model.Cliente;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class EjemplosGenericos {
    public static void main(String[] args) {

        List<Cliente> clientes = new ArrayList<>();
        clientes.add(new Cliente("Mateo", "Vlad", "25"));

        Cliente jefe = clientes.iterator().next();

        Cliente[] clientesArreglo = {
                new Cliente("JMateo", "Vlad", "25"),
                new Cliente("Camila", "Tovar", "22"),
                new Cliente("Lina", "Guerrero", "23"),
                new Cliente("Valentina", "Cabal", "24"),
                new Cliente("Pablo", "Pava", "25"),
        };

        Integer[] enteros = {1,2,3,4,5,6,7,8,9};

        List<Cliente> clientesLista = fromArrayToList(clientesArreglo);
        List<Integer> enterosLista = fromArrayToList(enteros);

        clientesLista.forEach(System.out::println);
        enterosLista.forEach(System.out::println);

        List<String> nombres = fromArrayToList(new String[]{
                "Lina", "Mateo", "Pablo", "Jacobo"
        }, enteros);
        nombres.forEach(System.out::println);



    }

    // T para trabajar con listas

    public static <T> List<T> fromArrayToList(T[] c){
        return Arrays.asList(c);
    }

    public static <T, G> List<T> fromArrayToList(T[] c, G[] g){
        for(G elemento: g){
            System.out.println(elemento);
        }
        return Arrays.asList(c);
    }
}
