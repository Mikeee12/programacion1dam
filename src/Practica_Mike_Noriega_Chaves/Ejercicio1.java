package Practica_Mike_Noriega_Chaves;

import java.util.Scanner;

public class Ejercicio1 {


    public static void main(String[] args) {

        int opcion;
        float[] temperatura = new float[12];

        do {


            System.out.println("0.- Salir");
            System.out.println("1.- Temperatura media de cada mes del año");
            System.out.println("2.- Mes con mayor temperatura");
            System.out.println("3.- Mes con menor temeperatura");
            System.out.println("4.- Temperatura del mes introducido");
            System.out.println("5.- Temperatura media de los meses de verano");
            System.out.println("6.- Temperatura media de los meses de invierno");
            System.out.println("7.- Comparar si la temperatura de dos meses son iguales");


            Scanner sc1 = new Scanner(System.in);
            opcion = sc1.nextInt();





            switch (opcion){
                case 0: System.out.println("Gracias por usar este software");
                    break;

                case 1:
                    inicializar_array(temperatura);
                    break;


                case 2:
                    mes mayor_temperatura = mayor_temperatura(temperatura);
                    break;

                case 3: mes menor_temperatura = menor_temperatura(temperatura);

                case 4:
                    int mes = 0;
                    sacar_temperatura(mes,temperatura);


            }
        }while (opcion>0);

    }



// caso 1 que introduce las temperaturas
    public static float[] inicializar_array (float [] temperatura){

        mes[] meses = mes.values();
        Scanner sc = new Scanner(System.in);

        for (int i = 0; i<temperatura.length; i++) {
            System.out.println("Introduzca la temperatura de "+meses[i]+ " en Madrid");
            temperatura[i] = sc.nextFloat();

        }
        return temperatura;
    }

// caso 2 mes con mayor temperatura
    public static mes mayor_temperatura(float [] temperatura){
        float mayor_temperatura = Integer.MIN_VALUE;
        int i;
        int mes = -1;
        mes mayor_temp;
        for (i=0; i< temperatura.length ;i++){
            //System.out.println(temperatura[i]);
            if (mayor_temperatura < temperatura[i]) {
                mayor_temperatura = temperatura[i];
                mes = i;
            }
        }

        System.out.println("La mayor temperatura es: "+ mayor_temperatura+"\nY el mes correspondiente es: "+metodoAuxiliar2(mes));
        return metodoAuxiliar2(mes);
    }

    // caso 3 mes con menor temperatura
    public static mes menor_temperatura(float [] temperatura){
        float menor_temperatura = Integer.MAX_VALUE;
        int i;
        int mes = -1;
        mes menor_temp;
        for (i=0; i< temperatura.length ;i++){
            //System.out.println(temperatura[i]);
            if (menor_temperatura > temperatura[i]) {
                menor_temperatura = temperatura[i];
                mes = i;
                System.out.println("La menor temperatura es: "+ menor_temperatura+"\nY el mes correspondiente es: "+metodoAuxiliar2(mes));
            }
        }


        return metodoAuxiliar2(mes);
    }

    private static float sacar_temperatura(int mes, float[] temperatura) {

        float sacar_temperatura;
        Scanner sc = new Scanner(System.in);
        sacar_temperatura = sc.nextFloat();
        System.out.println("Introduzca el mes"+metodoAuxiliar2(mes));
        return sacar_temperatura;
    }

    private static mes metodoAuxiliar2 (int mes){
        mes resul = null;
        switch (mes){
            case 0: return resul.ENERO;
            case 1: return resul.FEBRERO;
            case 2: return resul.MARZO;
            case 3: return resul.ABRIL;
            case 4: return resul.MAYO;
            case 5: return resul.JUNIO;
            case 6: return resul.JULIO;
            case 7: return resul.AGOSTO;
            case 8: return resul.SEPTIEMBRE;
            case 9: return resul.OCTUBRE;
            case 10: return resul.NOVIEMBRE;
            case 11: return resul.DICIEMBRE;

            default: {System.out.println("Valor para mes incorrecto");
                return null;
            }
        }
    }


}
