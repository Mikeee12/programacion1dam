package sesion1411;

import java.util.Arrays;

public class ArrayEjercicio5 {
    public static void main(String[] args) {
        int[] numero1 ={1,2,3,4};
        int[] numero2={1,2};
        if (Arrays.equals(numero1,numero2)){
            System.out.println("son iguales");
        }
        else {
            System.out.println("no son iguales");
        }
    }
}
