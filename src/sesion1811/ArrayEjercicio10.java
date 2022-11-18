package sesion1811;

import java.util.Arrays;

public class ArrayEjercicio10 {
    public static void main(String[] args) {
        int [] arrayorigen = {1,2,3,4,5};
        int longitud = calcular_longitud(arrayorigen);
        ImprimirArray(arrayorigen,longitud);
    }

    private static void ImprimirArray(int[] arrayorigen, int longitud) {
        System.out.println("el array"+ Arrays.toString(arrayorigen)+" tiene una longitud de " +longitud);
    }

    private static int calcular_longitud(int[] arrayorigen) {

        int resultado=-1;
        resultado = arrayorigen.length;
        return resultado;

    }
}
