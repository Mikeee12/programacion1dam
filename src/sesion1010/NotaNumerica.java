package sesion1010;

import java.util.Scanner;

public class NotaNumerica {
    public static void main(String[] args) {

        float nota=0;

        Scanner sc = new Scanner(System.in);
        System.out.println("Introduzca su edad actual");
        nota= sc.nextFloat();
        if (nota>=0 && nota<=5)
        {
            System.out.println("Suspenso");
        }
        else if (nota>=5 && nota<=5.99)
        {
            System.out.println("Suficiente");
        }
        else if (nota>=6 && nota<=6.99)
        {
            System.out.println("Bien");
        }
        else if (nota>=7 && nota<=8.99)
        {
            System.out.println("Notable");
        }
        else if (nota>=9 && nota<=10)
        {
            System.out.println("Sobresaliente");
        }
        else {
            System.out.println("Universidad y FP");
        }
    }
}


