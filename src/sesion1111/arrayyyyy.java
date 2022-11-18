package sesion1111;

public class arrayyyyy {
    public static void main(String[] args) {

        System.out.println("IMPRESION ARRAY 1");

        int[] array = {1,2,3,4};
        for (int i = 0; i < array.length; i++) {
            System.out.println(array[i]+",");
        }
        System.out.println("impresion array2");

        int[][] array2 = {{2,6},{3,5}};
        for (int i = 0; i < array2.length; i++) {
            for (int j = 0; j < array2.length; j++) {

                System.out.println(array2[i][j]);

            }
            System.out.println();


        }

    }
}



