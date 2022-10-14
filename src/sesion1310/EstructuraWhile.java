package sesion1310;

import java.util.Scanner;

public class EstructuraWhile {

    public static void main(String[] args) {
        int numero = 0;
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduzca el numero desde el cual queremos contar hasta el 100");
        numero = sc.nextInt();


        if (numero > 100) {
            System.out.println("Introdujo un numero superior a 100");
        }

        while (numero <= 100) {
            System.out.println(numero);
            numero++;

        }
    }
    }

