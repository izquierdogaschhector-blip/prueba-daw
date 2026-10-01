package Ejemplos;

import java.util.Scanner;

public class Ejemplo28 {
    public static void main(String[] args) {
        int num;
        int resultado;
        System.out.println("Introduce un número: ");
        Scanner inputValue = new Scanner(System.in);
        num = inputValue.nextInt();

        for (int i = 1; i <= num; i++) {
            if (num % i == 0) {
                System.out.println(+i+" es divisible por "+num);
            } else {
                System.out.println(+i+" no es divisible por "+num);
            }
        }
    }
}
