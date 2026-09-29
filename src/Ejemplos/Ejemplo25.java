package Ejemplos;

import java.util.Scanner;

public class Ejemplo25 {
    public static void main(String[] args) {
        System.out.println("Introduce un número: ");
        int num = 0;
        long factorial = 1;
        Scanner inputValue = new Scanner(System.in);
        num = inputValue.nextInt();

        for (int i = 1; i <= num; i++) {
            factorial = factorial * i;

            System.out.println(factorial);
        }
    }
}
