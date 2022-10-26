package PracticaI_Mike_NoriegaChaves;

import java.util.Scanner;

public class Ejercicio1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int cliente = 0;
        System.out.println("Introduzca 1 para la primera pregunta");
        cliente = sc.nextInt();


        boolean hipoteca = true;

        switch (cliente) {

            case 1:


                Scanner sc1 = new Scanner(System.in);
                System.out.println("¿Quiere solicitar una hipoteca?Introduzca true(si) o false(no)");
                hipoteca = sc1.nextBoolean();


                if (hipoteca) {

                    System.out.println("Perfecto, pero para que se la concedamos necesita cumplir con unos requisitos");
                } else {

                    System.out.println("Salgase de la pagina entonces:)");
                    break;
                }


        }
    }
}


