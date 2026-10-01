package Ejemplos;

import java.util.Scanner;

public class Ejemplo27 {
    public static void main(String[] args) {
        int num;
        String resultado = "";
        System.out.println("!Introduce un numero");
        Scanner inputValue = new Scanner(System.in);
        num = inputValue.nextInt();

        for (int i = 1;
            i <= num;
            i++) {
            resultado = resultado + " " + i;
            System.out.println(resultado);

        }
    }
}
