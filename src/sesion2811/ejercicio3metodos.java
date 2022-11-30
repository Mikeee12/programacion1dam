package sesion2811;

import java.util.Arrays;
import java.util.Scanner;

public class ejercicio3metodos {
    public static void main(String[] args) {
        String palabra=null;
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduzca la palabra con la que quieres trababjar");
        palabra= sc.next();

        System.out.println("Menu de funcionalidades");
        System.out.println("1.- Calcular la longitud de la palabra");
        System.out.println("2.- Mostrar la inicial de la palabra");
        System.out.println("3.- Mostrar la ultima letrade la palabra");
        System.out.println("4.- Quitar espacios si hubiere de la palabra");
        System.out.println("5.- Mostrar la palabra en mayúsculas ");
        System.out.println("6.- Mostrar la palabra en minúsculas ");
        System.out.println("7.- Remplazar una letra por otra ");
        System.out.println("8.- Indiciar si el string está vacio ");
        System.out.println("9.- Pasarlo a un array de char ");

        System.out.println("Por favor introduzca la acción  que desea realizar");
        int opcion = sc.nextInt();

        switch (opcion){
            case 1: System.out.println("la longitud de"+palabra+" es"+longitud_string(palabra));
                break;
            case 2:System.out.println("la inicial de"+palabra+" es"+inicial_string(palabra));

                break;
            case 3:System.out.println("la inicial de"+palabra+" es"+final_string(palabra));
                break;

            case 4:
                System.out.println("la palabra quitandole espacioes es"+quitar_espacios(palabra));
                break;
            case 5:System.out.println("la palabra en mayusculas es"+mayusculas(palabra));
                break;

            case 6:minisculas(palabra);
                break;
            case 7:
                System.out.println("Dime la legra a reemplazar");
                char letra_areemplazar= sc.next().charAt(0);
                System.out.println("Dime la legra nueva");
                char letra_nueva= sc.next().charAt(0);
                System.out.println("La palabra tras reemplazar"+letra_areemplazar+"por "+letra_nueva+"es "+ remplazo(palabra,letra_areemplazar,letra_nueva));
                break;
            case 8:
                if (esvacio(palabra)){System.out.println("la plabra esta vacia");}

                else {System.out.println("La palabra no esta vacia");
                }
                break;
            case 9:
                char[] array = pasaraarraychar(palabra);
                System.out.println(Arrays.toString(array));
                break;
            default: System.out.println("No has introduzcido una acción valida"); break;


        }



    }
    public static int longitud_string(String palabra){
        int resultado = 0;
        resultado=palabra.length();
        return resultado;

    }


    public static void longitud_string_2(String palabra){

        System.out.println("la longitud de "+palabra+" es de "+palabra.length());

    }

    public static char inicial_string(String palabra){
        char inicial;
        inicial=palabra.charAt(0);
        return inicial;

    }

    public static void inicial_string2(String palabra){

        System.out.println("la inicial de la palabra"+palabra+"es "+palabra.charAt(0));

    }

    public static char final_string(String palabra){
        char ultima;
        ultima=palabra.charAt(palabra.length()-1);
        return ultima;

    }
    public static String quitar_espacios(String palabra){
        String pal="";
        pal=palabra.trim();
        return pal;

    }
    public static void quitar_espacios2(String palabra){

        System.out.println("la palabra libre de espacios es"+palabra.trim());
    }

    public static String mayusculas(String palabra){
        String resultado;
        resultado=palabra.toUpperCase();
        return resultado;
    }

    public static void minisculas(String palabra){
        System.out.println("la plabra en minusculas es "+palabra.toLowerCase());
    }

    public static String remplazo(String palabra,char letra_aremplazar,char letra_nueva){
        String palabra_resultante = null;
        palabra_resultante = palabra.replace(letra_aremplazar,letra_nueva);
        return palabra_resultante;
    }

    public static boolean esvacio(String palabra){
        boolean resultado=false;
        resultado=palabra.isEmpty();
        return resultado;
    }

    public static char[] pasaraarraychar(String palabra){
        char[] array;
        array=palabra.toCharArray();
        return array;
    }




}