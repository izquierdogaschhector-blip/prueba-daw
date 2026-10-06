package Ejemplos;

import java.util.Scanner;

public class Ejemplo33 {
    public static void main(String[] args) {
        int num;
        int contador = 0;
        int resultado;
        System.out.println("Introduce un numero");
        Scanner inputValue = new Scanner(System.in);
        num = inputValue.nextInt();
        resultado = num;
        while (resultado != 1) {
            if (num % 2 == 0) {
                num = num / 2;
                resultado = num;
                contador++;
            } else if (num % 2 != 0) {
                num = num * 3 + 1;
                resultado = num;
                contador++;
            }
        }
        System.out.println("Ya se ha llegado a 1 y se necesitan "+contador+" para llegar a 1");
    }
}
