package seion211;

import java.util.Scanner;

public class FactorialRecursivo {
    public static long factorialRecursivo(long numero) {
        if (numero <= 1){
            return 1;
    }
        return numero*factorialRecursivo(numero -1);

}


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduzca el número del cual viene calcular su factorial");
        long numero = 0;
        numero= sc.nextLong();
        System.out.println("EL factorial de 2 es "+factorialRecursivo(2));
    }

    }

