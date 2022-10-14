package sesion1010;

import java.util.Scanner;

public class EstructuraIfElse {
    public static void main(String[] args) {

        //declaración y inicializacion de variables
        int a, b, mayor, menor = 0;
        Scanner sc = new Scanner(System.in);
        // introducir los dos valores por teclado
        System.out.println("introduzca el valor de a ");
        a = sc.nextInt();

        System.out.println("introduzca el valor de b");
        b = sc.nextInt();


        //determinar cual es el menor y el mayor


        if (a < b) {
            mayor = b;
            menor = a;


        } else {
            mayor = b;
            menor = a;


        }
        System.out.println("El mayor es " + mayor + " y el menor es " + menor);


        if (a==b) {

            System.out.println("los numeros son iguales");
        }


    }
}

