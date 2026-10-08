package Ejemplos;

import java.util.Scanner;

public class Ejemplo30 {
    public static void main(String[] args) {
        int num1;
        int num2;
        int res = 0;

        System.out.println("Introduce numero: ");
        Scanner inputValue = new Scanner(System.in);

        num1 = inputValue.nextInt();
        num2 = inputValue.nextInt();


        for (int i = 0; i < num2; i++){
            res += num1;
            System.out.println(res);
        }

    }
}