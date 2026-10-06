package Ejemplos;

import java.util.Scanner;

public class Ejemplo31 {
    public static void main(String[] args) {
        double saldo;
        int num;
        double importe;
        double retirada;

        System.out.println("Introduce el dinero: ");

        Scanner inputValue = new Scanner(System.in);
        saldo = inputValue.nextDouble();

        do {
            System.out.println("Introduce 1 para ingresar, 2 para retirar o 0 para salir");
                num = inputValue.nextInt();
                if (num == 1) {
                    System.out.println("Introduce el dinero a ingresar: ");
                    importe = inputValue.nextDouble();
                    saldo = saldo + importe;
                    System.out.println("El saldo total es de: "+saldo);
                } else if (num == 2) {
                    System.out.println("Introduce el saldo a retirar: ");
                    retirada = inputValue.nextDouble();
                    saldo = saldo - retirada;
                    System.out.println("El saldo total es: " + saldo);
                }
    }while (num != 0);
        inputValue.close();
        }

}
