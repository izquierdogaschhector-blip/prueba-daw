package Ejemplos;

import java.util.Scanner;

public class Ejemplo23 {
    public static void main(String[] args) {
        Scanner inputValue = new Scanner(System.in);
        int num; int positives = 0;
        System.out.println("Introduce los números (0 es para finalizar)");
        do {
            num = inputValue.nextInt();
            if (num > 0) {
                positives++;
            }
        } while (num !=0);
        System.out.println("Hay "+positives+" numeros positivos");
    }
}
