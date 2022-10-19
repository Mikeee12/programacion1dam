package sesion1710;

import java.util.Scanner;

public class Ejericicio3Condicional {
    public static void main(String[] args) {
        float hora=0;

        Scanner sc = new Scanner(System.in);
        System.out.println("Introduzca su hora actual");
        hora= sc.nextFloat();
        if (hora>=6 && hora<=12)
        {
            System.out.println("Buenos días");
        }
        else if (hora>=13 && hora<=20)
        {
            System.out.println("Buenas tardes");
        }
        else
        {
            System.out.println("Buenas noches");
        }

    }
    }

