package sesion1411;

public class BusquedaArray {
    public static void main(String[] args) {
        String[] alumnos ={"Mike","Adrian","Pepe","Julio"};


        int posicion =java.util.Arrays.binarySearch(alumnos, "Adrian");
        if (posicion<0){
            System.out.println("no esta en la lista");

        }
        else{
            System.out.println("el alumno "+alumnos[posicion]+" esta en la posicion "+posicion);
        }
    }
}
