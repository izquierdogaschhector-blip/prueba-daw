package EjerciciosDeRefuerzo1;

import java.util.Scanner;

public class Ej16 {
    public static void main(String[] args) {
        int num1;
        int num2;
        int num3;
        System.out.println("POnga 3 números: ");
        Scanner inputValue = new Scanner(System.in);
        num1 = inputValue.nextInt();
        num2 = inputValue.nextInt();
        num3 = inputValue.nextInt();

        if (num1 >= num2 && num2 >= num3) {
            System.out.println("El mayor de los 3 es: "+num1);
        } else if (num2 >= num1 && num1 >= num3) {
            System.out.println("El mayor de los 3 es: "+num2);
        } else {
            System.out.println("El mayor de los 3 es: "+num3);
        }
    }
}
