package Practica_Mike_Noriega_Chaves;

import java.util.Scanner;

public class Ejercicio1 {


    public static void main(String[] args) {

            int opcion;
            int[] media_temperaturas = new int[12];

            System.out.println("0.- Salir");
            System.out.println("1.- Temperatura media de cada mes del año");
            System.out.println("2.- Mes con mayor temperatura");
            System.out.println("3.- Mes con menor temeperatura");
            System.out.println("4.- Temperatura del mes introducido");
            System.out.println("5.- Temperatura media de los meses de verano");
            System.out.println("6.- Temperatura media de los meses de invierno");
            System.out.println("7.- Comparar si la temperatura de dos meses son iguales");

            Scanner sc = new Scanner(System.in);
            for (int i = 0; i < media_temperaturas.length; i++) {
                Scanner sc1 = new Scanner(System.in);
                opcion = sc1.nextInt();


                if (opcion==0){
                    System.out.println("Gracias por usar este software");
                    break;}

                    if (opcion==1){

                        switch (i) {

                        case 1:
                            System.out.println("Introduzca la temperatura media de enero en Madrid");
                            media_temperaturas[i] = sc.nextInt();

                        case 2:
                            System.out.println("Introduzca la temperatura media de febrero en Madrid");
                            media_temperaturas[i] = sc.nextInt();

                        case 3:
                            System.out.println("Introduzca la temperatura media de marzo en Madrid");
                            media_temperaturas[i] = sc.nextInt();

                        case 4:
                            System.out.println("Introduzca la temperatura media de abril en Madrid");
                            media_temperaturas[i] = sc.nextInt();

                        case 5:
                            System.out.println("Introduzca la temperatura media de mayo en Madrid");
                            media_temperaturas[i] = sc.nextInt();

                        case 6:
                            System.out.println("Introduzca la temperatura media de junio en Madrid");
                            media_temperaturas[i] = sc.nextInt();

                        case 7:
                            System.out.println("Introduzca la temperatura media de julio en Madrid");
                            media_temperaturas[i] = sc.nextInt();

                        case 8:
                            System.out.println("Introduzca la temperatura media de agosto en Madrid");
                            media_temperaturas[i] = sc.nextInt();

                        case 9:
                            System.out.println("Introduzca la temperatura media de septiembre en Madrid");
                            media_temperaturas[i] = sc.nextInt();

                        case 10:
                            System.out.println("Introduzca la temperatura media de octubre en Madrid");
                            media_temperaturas[i] = sc.nextInt();

                        case 11:
                            System.out.println("Introduzca la temperatura media de noviembre en Madrid");
                            media_temperaturas[i] = sc.nextInt();

                        case 12:
                            System.out.println("Introduzca la temperatura media de diciembre en Madrid");
                            media_temperaturas[i] = sc.nextInt();
                            break;


                    }}
                    else if (opcion==2){
                        int tempMayor=0;
                        for ( i=0;i<media_temperaturas.length; i++){
                            System.out.println(media_temperaturas[i]);
                            if (tempMayor < media_temperaturas[i]) {
                                tempMayor = media_temperaturas[i];
                                System.out.println("la temperatura mas alta es" + tempMayor);

                        }



                    }
                }


    }
}}

