package sesion2311;
enum dia_meses
{lunes,martes,miercoles}

public class UsoMetodoString {

    public static void main(String[] args) {
        String pais="Francia";
        String pais2="Ecuador";
        String pais3="Marruecos";
        String pais4="España";
        String pais22="ecuador";
        String pais8="";

        //declaacion de varuable enumeral

        dia_meses x1 = dia_meses.lunes;
        dia_meses x2 = dia_meses.martes;


        // char

        System.out.println("la inicial de este pais "+pais.charAt(0));
        System.out.println("la letra del pais "+pais.charAt(pais.length()-1));
        System.out.println("número de letras "+pais.length());
        System.out.println("el pais en mayusculas es "+pais.toUpperCase());
        System.out.println("el pais en minisculas "+pais.toUpperCase());
        System.out.println("¿es igual "+pais2.toLowerCase()+" y "+pais22+"?= "+pais2.toLowerCase().equals(pais22.toLowerCase()));
        //System.out.println("¿es igual "+pais2+" y "+pais22+pais2.compareTo(pais22));

        if (pais2.toLowerCase().compareTo(pais22.toLowerCase())==0) {
            System.out.println("son iguales");

            }
        else {
            System.out.println("no son iguales");
        }

            if (pais2.compareToIgnoreCase(pais22)==0){
                System.out.println("son iguales");

        }
            else {
                System.out.println("no son iguales");
            }
        System.out.println("es subcadena "+pais3.contains("rru"));
        System.out.println("el sufijo de "+pais4+"es"+pais4.endsWith("eña"));
        System.out.println("esta vacio el pais"+pais4+" "+pais4.isEmpty());
        System.out.println("esta vacio el pais"+pais8+" "+pais8.isEmpty());
        System.out.println(pais4.indexOf("a"));
        System.out.println(pais4.lastIndexOf("a"));
        String animal ="perro";
        System.out.println(animal.replace('o','a'));
        System.out.println(animal.substring(0,2));
        System.out.println(animal.startsWith("pe"));
        String pais20= " Qatar ";
        System.out.println(pais20.length());
        System.out.println(pais20);
        System.out.println(pais20.trim());


    }
}
