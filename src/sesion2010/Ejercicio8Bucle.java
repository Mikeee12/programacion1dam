package sesion2010;

import java.util.Scanner;

public class Ejercicio8Bucle {
    public static void main(String[] args) {
        int numero = 0;
        int contador = 0;
        Scanner sc= new Scanner(System.in);
        numero = sc.nextInt();
        do{
            System.out.println(+numero+"*"+ contador++ +"="+numero*(contador-1)+"");

        }while (contador <=10);
    }
}
