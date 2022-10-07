package a.b;

public class ConversionPrimitivoWrapper {

    public static void main(String[] args) {

        //declaración de variables
        Integer a = 6;
        int b = 7;
        int c = 8;
        Integer d = 9;

        System.out.println("el valor de la variable Wrapper a es: "+a);
        System.out.println("el valor de la variable integer b es: "+b);
        System.out.println("el valor de la variable integer c es: "+c);

        //Vamos a Autoboxing
        System.out.println("Autoboxing");
        a=b;
        System.out.println("la variable warpper a vale ahora:"+b);

        //vamos a unboxing
        System.out.println("Unboxing");
        c=a;
        System.out.println("la variable tipo primitivo int c vale ahora=> "+c);

        // beneficios de usar clases envoltorio a warappers
        System.out.println("este metodo permite pasar la variable de tipo integer a string"+a.toString());
        System.out.println("¿es "+a+" igual a=> "  +b +a.equals (b));
        System.out.println("¿es igual a b "+a.equals(d));
        System.out.println("convertir la variable b en float=> "+d.floatValue());


    }


}
