package a.b;

import c.PruebaString;

public class ConversionExplicita {

    public static void main(PruebaString[]args){
        byte b;
        int i =257;
        double d = 323.142;

        System.out.println("Convertir un integer a byte de manera explícita");
        b = (byte) i;
        System.out.println("i= "+i+" b="+b);

        System.out.println("Convertir un double a byte de manera explícita");
        b = (byte) d;
        System.out.println("d= "+d+" b="+b);
    }
}
