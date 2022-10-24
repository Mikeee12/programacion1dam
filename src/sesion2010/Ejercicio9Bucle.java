package sesion2010;

import java.util.Scanner;

public class Ejercicio9Bucle {
    public static void main(String[] args) {
        int a;
        int b=0;
        Scanner sc= new Scanner(System.in);
        System.out.println("introduce un numero");
        a = sc.nextInt();
        do {
            while (a>0 || a<0) {
                a = a / 10;
                b++;

            } System.out.println("tiene "+b+" digitos"); break;

        } while (b>0);
    }
}
