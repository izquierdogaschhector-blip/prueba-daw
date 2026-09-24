package EstructurasDeDecision;

import java.util.Scanner;

public class Ejercicio5 {
    public static void main(String[] args) {
        double nota;
        System.out.println("Introduce la nota: ");
        Scanner inputValue = new Scanner(System.in);
        nota = inputValue.nextDouble();
        System.out.println("¿Has entregado todas las prácticas? (si/no)");
        String actividades = inputValue.next();

        if (actividades.equals("si") && nota < 5 || actividades.equals("no") && nota < 5) {
            System.out.println("SUSPENSO");
        } else if (actividades.equals("no") && nota >= 5) {
            System.out.println("SUSPENSO POR PRÁCTICAS PENDIENTES");
        } else if (actividades.equals("si") && nota < 7) {
            System.out.println("APROBADO");
        } else if (actividades.equals("si") && nota < 9) {
            System.out.println("NOTABLE");
        } else {
            System.out.println("SOBRESALIENTE");
        }


    }
}
