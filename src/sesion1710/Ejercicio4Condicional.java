package sesion1710;

import java.util.Scanner;

public class Ejercicio4Condicional {
    public static void main(String[] args) {
        float hora=0;
        float salario=0;

        Scanner sc = new Scanner(System.in);
        System.out.println("Introduzca sus horas trabajadas a la semana");
        hora= sc.nextFloat();
        if (hora<=40 && hora>=0 )
        {
            salario = hora * 12;
            System.out.println("Su salario es de "+salario);
        }
        else if (hora>=41)
        {
           salario = hora * 16 - 4 * 40;
            System.out.println("Su salario es de "+salario);
        }
        else
        {
            System.out.println("error");
        }

    }
}


