package sesion1710;

import java.util.Scanner;

public class Ejericicio5Condicional {
    public static void main(String[] args) {
        int variable1, resultado =0;
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduzca primer termino");
        variable1= sc.nextInt();

        int variable2 =0;
        Scanner sc1 = new Scanner(System.in);
        System.out.println("Introduzca el segundo termino");
        variable2= sc1.nextInt();

        int variable3 = 0;
        Scanner sc2 = new Scanner(System.in);
        System.out.println("Introduzca el tercer termino");
        variable3= sc2.nextInt();
        resultado= (variable3-variable2)/variable1;
        System.out.println("Resultado es "+resultado);



    }
}
