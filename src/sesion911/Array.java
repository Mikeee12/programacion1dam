package sesion911;

import java.util.Scanner;

public class Array {
    public static void main(String[] args) {

        //declaración L ARRAY
        /*este array almacenara las notas de las aasignaturas del primer trimestre de DAM
        BD,ED,PROG,LM,SI,FOL
         */
        int[] notas_1ertrimestre = new int[5];

        notas_1ertrimestre[0] = 7;
        notas_1ertrimestre[1] = 8;
        notas_1ertrimestre[2] = 6;
        notas_1ertrimestre[3] = 5;
        notas_1ertrimestre[4] = 5;

        int[] notas_2dotrimestre = {7, 8, 9, 7, 4};

        int [] notas_3ertrimestre = new int[5];
        Scanner sc = new Scanner(System.in);
        for (int i =0;i<notas_3ertrimestre.length;i++)
        {
            System.out.println("Introduzcame su nota por favor");
            notas_3ertrimestre[i]= sc.nextInt();
        }

    }
}
