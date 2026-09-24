package EjerciciosDeRefuerzo1;

import java.util.Scanner;

public class Ej15 {
    public static void main(String[] args) {
        int t;
        int hora;
        int min;
        int seg;
        System.out.println("Dime el tiempo en segundos: ");
        Scanner inputValue = new Scanner(System.in);
        t = inputValue.nextInt();
        min = t / 60;
        hora = t / 3600;
        seg = t % 60;

        System.out.println(+t+ " segundos equivalen a "+hora+ " horas, "+min+" minutos y "+seg+ " segundos");


    }
}
