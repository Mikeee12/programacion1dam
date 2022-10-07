package sesion0510;

public class OperadorInstance {
    public static void main(String[] args) {
        Integer i=5;
        String nombre="Mike";
        System.out.print("la variable i es intancia de clase envoltorio(Wrapper) Integer");
        System.out.println(i instanceof Integer);
        //System.out.println(i.getClass());
        System.out.print("la variable nombre es intancia de clase String");
        System.out.println(nombre instanceof String);
        // nombre.getClass();

    }
}
