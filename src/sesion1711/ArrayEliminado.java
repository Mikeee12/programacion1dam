package sesion1711;

import java.util.Arrays;
import java.util.Scanner;

public class ArrayEliminado {
    public static void main(String[] args) {
        int [] array_inicial = {1,2,3,4};
        int [] array_final = new int[3];
        System.out.println(Arrays.toString(array_inicial));
        System.out.println("Indique el numero que quiere borrar ");
        Scanner sc = new Scanner(System.in);
        int Iten= sc.nextInt();
        int posicion = Arrays.binarySearch(array_inicial,Iten);

        if (posicion<0){
            System.out.println("El elemento no esta en el array. No se puede eliminar nada");

        }
        else {
            int remainingElements = array_inicial.length - (posicion+ 1);
            System.arraycopy(array_inicial,0,array_final,0,posicion);
            System.arraycopy(array_inicial,posicion + 1,array_final, posicion, remainingElements);

            System.out.println("Elemento borrado");
            System.out.println("el array actualizadoes "+Arrays.toString(array_final));

        }



    }
}