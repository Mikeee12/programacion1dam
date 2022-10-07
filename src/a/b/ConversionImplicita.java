package a.b;

import c.PruebaString;

import java.util.Scanner;

public class ConversionImplicita {

    public static void main(PruebaString[]args) {
        float nota;

         System.out.println("Introduzca un número");
        Scanner sc = new Scanner(System.in);
        nota = sc.nextFloat();
         System.out.println("el usuario ha introducido este valor"+nota);

    }
}
