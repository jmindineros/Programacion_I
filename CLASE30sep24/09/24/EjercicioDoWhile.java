public class EjercicioDoWhile {
    public static void main(String[] args) {
        // while
        int j = 0;
        String cad = "programacion 1";
        do {

            System.out.println(cad);
            j++;
        } while (j > 5);
        System.out.println("*******************************");
        int k = 1;
        while (k < 5) {
            System.out.println(cad);
            k++;
        }
        // for

        System.out.println("*******************************");

        for (int i = 1; i < 5; i++) {
            System.out.println(cad);
        }
    }
}
