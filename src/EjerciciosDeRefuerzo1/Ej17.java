package EjerciciosDeRefuerzo1;

import java.util.Scanner;

public class Ej17 {
    public static void main(String[] args) {
        int num1;
        int num2;
        System.out.println("Introduce 2 valores: ");
        Scanner inputValue = new Scanner(System.in);
        num1 = inputValue.nextInt();
        num2 = inputValue.nextInt();

        if (num1 >= num2) {
            System.out.println(+num1+" Es mayor a "+num2);
        } if (num2 >= num1) {
            System.out.println(+num2+" Es mayor a "+num1);
        } else {
            System.out.println("Los dos numeros son iguales");
        }
    }
}
