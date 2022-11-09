package seion211;

import java.util.Scanner;

public class Caracteres {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        final String SALUDO = "hola";
        String nombre="";
        System.out.println("¿Como te llamas?");
        nombre =sc.next();
        System.out.println(SALUDO+","+nombre);
        System.out.println("Tu nombre tiene "+nombre.length()+" caracteres");
    }
}
