package sesion0710;

public class SalidaFormateada {
    public static void main(String[] args) {
        System.out.printf("El numero %d no tiene decimales. \n" , 21);
        System.out.printf("El numero %f sale con decimales. \n" , 21.0);
        System.out.printf("El %.3f sale exactamente con 3 decimales. \n" , 21.0);

        System.out.printf("%s\n","esto es una cadena");
        System.out.printf("%-10s\n","hola");
        System.out.printf("%10s\n","pepe");

        System.out.print("\033[33m mandarina\n");
        System.out.print("\033[32m hierba\n");
        System.out.print("\033[31m tomate\n");
        System.out.print("\033[37m sábanas\n");
        System.out.print("\033[36m cielo\n");
        System.out.print("\033[35m nazareno\n");
        System.out.print("\033[34m mar\n");

    }
}
