package sesion1310;

import java.util.Scanner;

public class ForIncrementalDecremental {

    public static void main(String[] args) {

        //solicitar al usuario que me introduzca el nuemro
        int numero=0;
        System.out.println("Por favor introduca el numero que desea que imprima");
        Scanner sc = new Scanner(System.in);
        numero = sc.nextInt();


        for (int i = 1; i <=numero; i++)
        {
            System.out.println(i);
        }


    //bucle decremental

    for(int j = numero; j>0;j--)

    {
        System.out.println(j);
    }


  }
}

