package sesion2811;

import java.util.Scanner;

public class ejercicio2metodos {
    public static void main(String[] args) {
        //declarar variables
        int base,exponente=0;

        //solicitar los datos y asignarselos a las variables
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduzca la base");
        base = sc.nextInt();
        System.out.println("Introduzca la exponente");
        exponente = sc.nextInt();
        double resultado= calcularPotencia(base,exponente);
        imprimir(resultado);
    }

    private static void imprimir(double resultado) {
        System.out.println("el resultado es "+resultado);
    }

    private static double calcularPotencia(int base, int exponente) {

        double resultado=0;

        resultado = Math.pow(base,exponente);



        return resultado;
    }
}
