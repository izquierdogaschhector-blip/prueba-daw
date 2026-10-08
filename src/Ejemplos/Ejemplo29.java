package Ejemplos;

import java.util.Scanner;

public class Ejemplo29 {
    public static void main(String[] args) {
        int dividiendo;
        int divisor;

        System.out.println("Introduce un número: ");
        Scanner inputValue = new Scanner(System.in);

        dividiendo = inputValue.nextInt();
        divisor = inputValue.nextInt();


        if (divisor == 0) {
            System.out.println("No se puede dividir entre 0");
        } else {
            int i = 0;
            int resto = dividiendo;

            for (; resto >= divisor; i++) {
                resto -= divisor;
                System.out.println(resto);
            }
        }
    }
}