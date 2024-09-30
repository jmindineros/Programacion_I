import java.util.Scanner;

public class Ejercicio56 {
    public static void main(String[] args) {
        // notas de los estudiantes
        Scanner sc = new Scanner(System.in);
        double nota = 0;
        int aprobado = 0;
        int reprobado = 0;
        System.out.print("digite la cantidad de estudiantes: ");
        int estudiante = sc.nextInt();
        for (int i = 1; i <= estudiante; i++) {
            System.out.print("nota del estudiante " + i + ": ");
            nota = sc.nextDouble();
            if (nota >= 5.0) {
                aprobado++;
            } else {
                reprobado++;
            }

        }
        System.out.println("los aprobados son: " + aprobado);
        System.out.println("los no aprobados son: " + reprobado);
        
    }
}