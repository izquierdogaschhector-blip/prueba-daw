package Ejemplos;

import java.util.Scanner;

public class Ejemplo26 {
    public static void main(String[] args) {
        int num;
        long tabla = 1;
        Scanner inputValue = new Scanner(System.in);
        num = inputValue.nextInt();

        for (int i = 1; i<=10; i++) {
            tabla = num * i;

            System.out.println(+num+ " x "+i+" = "+ tabla);
        }
    }
}
