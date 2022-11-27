package sesion2511;

import java.util.Scanner;


public class ejercicioarrayclase {
    public static void main(String[] args) {
        int[][] notas = new int[2][3];
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < notas.length; i++) {
            for (int j = 0; j < notas[i].length; j++) {
                if (i==0)
                    switch (j){
                        case 0:
                            System.out.println("Intoduce la nota de la práctica 1 de programación: ");
                            notas[i][j] = sc.nextInt();
                            break;
                        case 1:
                            System.out.println("Introduce la nota de la práctica 2 de programación: ");
                            notas[i][j] = sc.nextInt();
                            break;
                        case 2:
                            System.out.println("Introduce la nota del exámen de programación: ");
                            notas[i][j] = sc.nextInt();
                            break;

                    }
                if (i==1)
                    switch (j){
                        case 0:
                            System.out.println("Introduce la nota de la práctica 1 de bbdd: ");
                            notas[i][j] = sc.nextInt();
                            break;
                        case 1:
                            System.out.println("Introduce la nota de la práctica 2 de bbdd: ");
                            notas[i][j] = sc.nextInt();
                            break;
                        case 2:
                            System.out.println("Introduce la nota del exámen de bbdd: ");
                            notas[i][j] = sc.nextInt();
                            break;

                    }


            }

        }

        //imprimir los arrays que hemos creado
        System.out.println("Las notas de la primera fila son de programación y de la segunda fila de bbdd:");
        for (int i = 0;i<notas.length;i++){
            System.out.println(" ");
            for (int j = 0;j<notas[i].length;j++){
                System.out.print("\t"+notas[i][j]+"\t|");
            }
        }
        int opcion_1=0;
        System.out.println("\nElige une opción: ");
        System.out.println("(1)La media de una sola asinatura:");
        System.out.println("(2)La media de ambas asignaturas:");
        Scanner dc = new Scanner(System.in);
        opcion_1= dc.nextInt();
        if (opcion_1==1){
            int opcion=0;
            float media=0;
            float media_total=0;
            float media_total1=0;

            System.out.println("\nDe qué asignatura quieres saber la media:");
            System.out.println("(1)Programación");
            System.out.println("(2)BBDD");
            Scanner df = new Scanner(System.in);
            opcion=df.nextInt();

            if (opcion==1){
                media=(notas[0][0]+notas[0][1])/2;
                media_total=((media+notas[0][2])/2);
                System.out.println("La nota media de programación es "+media_total);
                if (media_total<5){
                    calificacion estado=calificacion.INSUFICIENTE;
                    System.out.println(calificacion.INSUFICIENTE);
                }
                else if (media_total>=5 && media_total<6){
                    calificacion estado=calificacion.SUFICIENTE;
                    System.out.println(calificacion.SUFICIENTE);
                }
                else if (media_total>=6 && media_total<7){
                    calificacion estado=calificacion.BIEN;
                    System.out.println(calificacion.BIEN);
                }
                else if (media_total>=7 && media_total<9){
                    calificacion estado=calificacion.NOTABLE;
                    System.out.println(calificacion.NOTABLE);
                }
                else if (media_total>=9 && media_total<=10){
                    calificacion estado=calificacion.SOBRESALIENTE;
                    System.out.println(calificacion.SOBRESALIENTE);
                }
                else
                    System.out.println("Esa media no es válida.");

            }
            else if (opcion==2){
                media=(notas[1][0]+notas[1][1])/2;
                media_total1=((media+notas[1][2])/2);
                System.out.println("La nota media de bbdd es "+media_total1);
                if (media_total1<5){
                    calificacion estado=calificacion.INSUFICIENTE;
                    System.out.println(calificacion.INSUFICIENTE);
                }
                else if (media_total1>=5 && media_total<6){
                    calificacion estado=calificacion.SUFICIENTE;
                    System.out.println(calificacion.SUFICIENTE);
                }
                else if (media_total1>=6 && media_total<7){
                    calificacion estado=calificacion.BIEN;
                    System.out.println(calificacion.BIEN);
                }
                else if (media_total1>=7 && media_total<9){
                    calificacion estado=calificacion.NOTABLE;
                    System.out.println(calificacion.NOTABLE);
                }
                else if (media_total1>=9 && media_total<=10){
                    calificacion estado=calificacion.SOBRESALIENTE;
                    System.out.println(calificacion.SOBRESALIENTE);
                }
                else
                    System.out.println("Esa media no es válida.");
            }

        }
        else if (opcion_1==2){
            int media_final=0;
            media_final=(((notas[0][0]+notas[0][1])/2)+((notas[0][2])/2))+(((notas[1][0]+notas[1][1])/2)+((notas[1][2])/2));
            System.out.println("La nota media de ambas asignaturas es "+media_final);
            if (media_final<5){
                calificacion estado=calificacion.INSUFICIENTE;
                System.out.println(calificacion.INSUFICIENTE);
            }
            else if (media_final>=5 && media_final<6){
                calificacion estado=calificacion.SUFICIENTE;
                System.out.println(calificacion.SUFICIENTE);
            }
            else if (media_final>=6 && media_final<7){
                calificacion estado=calificacion.BIEN;
                System.out.println(calificacion.BIEN);
            }
            else if (media_final>=7 && media_final<9){
                calificacion estado=calificacion.NOTABLE;
                System.out.println(calificacion.NOTABLE);
            }
            else if (media_final>=9 && media_final<=10){
                calificacion estado=calificacion.SOBRESALIENTE;
                System.out.println(calificacion.SOBRESALIENTE);
            }
            else
                System.out.println("Esa media no es válida.");
        }




    }

}





