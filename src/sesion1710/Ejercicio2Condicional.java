package sesion1710;

import java.util.Scanner;

public class Ejercicio2Condicional {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int dia;

        System.out.println("Escriba un numero del 1 al 5");
        dia = scanner.nextInt();

        switch (dia) {
            case 1:
                System.out.println("Es lunes y tiene BBDD a primera hora");
                break;
            case 2:
                System.out.println("Es martes y tiene LMS a primera hora");
                break;
            case 3:
                System.out.println("Es miercoles y tiene Programación a primera hora");
                break;
            case 4:
                System.out.println("Es jueves y tiene BBDD a primera hora");
                break;
            case 5:
                System.out.println("Es viernes y tiene FOL a primera hora");
                break;
            default:
                System.out.println("ERROR: número incorrecto.");
        }
    }
}


