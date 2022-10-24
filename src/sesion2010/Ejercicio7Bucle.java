package sesion2010;

import java.util.Scanner;

public class Ejercicio7Bucle {
    public static void main(String[] args) {
        int contraseña = 3456;
        int intentos = 4;

        do {
            System.out.println("Introduzca la contraseña, tienes "+intentos--+ " intentos");
            Scanner sc = new Scanner(System.in);
            contraseña = sc.nextInt();
            if (contraseña == 3456) {
                System.out.println("La caja fuerte se ha abierto satisfactoriamente"); break;
            } else {
                System.out.println("Lo siento, esa no es la combinación");
            }


        } while (intentos > 0);
    }
}