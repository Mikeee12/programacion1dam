package sesion1611;

import java.util.Arrays;
import java.util.Scanner;

public class MetodosBinarysearch {
    public static void main(String[] args) {

        String [] lista={"Mike","Elias","Mark"};
        int posicion=-1;
        String busca;
        Scanner sc = new Scanner(System.in);
        System.out.println("que nombre quieres buscar");
        busca = sc.next();
        posicion= buscar(lista,busca);
        imprimir(posicion,busca,lista);
    }

    private static void imprimir(int posicion, String nombre, String[] lista) {
        System.out.println("el array introducido es"+ Arrays.toString(lista));
        if (posicion == -1) {
            System.out.println("el elemento que buscas" + nombre + " esta");
        }
             else {
                System.out.println("el elemento " + nombre + " que buscabas esta en la posicion " + posicion);
            }
     }


    {


        }

    private static int buscar(String[] lista, String busca) {
        int posicion = -1;
        for (int j = 0; j < lista.length; j++) {
            if (busca.equals(lista[j])) {
                posicion = j;
            }


        }
        return posicion;


    }

}
