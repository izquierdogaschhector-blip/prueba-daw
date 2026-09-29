package Ejemplos;

import java.util.Scanner;

public class Ejemplo24 {
    public static void main(String[] args) {
        System.out.println("Introduce las notas");
        Scanner inputValue = new Scanner(System.in);
        double nota = 0;
        double sumanotas = 0;
        int contador = 0;
        double media = 0;
        int diez = 0;
        do {
            nota = inputValue.nextDouble();
            if (nota != -1) {
                sumanotas = sumanotas + nota;
                contador = contador +1;
                if (nota == 10){
                    diez++;
                }

            }
        } while (nota != -1);
        media = sumanotas / contador;
        System.out.println("La media es "+media+" y hay "+diez+" 10");
    }
}
