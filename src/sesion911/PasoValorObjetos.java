package sesion911;

import seion211.Persona;

public class PasoValorObjetos {
    public static void main(String[] args) {
        Persona p1 = new Persona();
        p1.nombre="Mike";
        System.out.println(p1.nombre);
        transformarNombre(p1);
        System.out.println("despues de pasarle el metodo transformarNombre...");
        System.out.println("el nombre es "+p1.nombre);
    }
    static void transformarNombre (Persona p) {
        p.nombre = "pepe";
    }
}
