package EstructurasDeDecision;

import java.awt.im.spi.InputMethodContext;
import java.util.Scanner;

public class Ejercicio1 {
    public static void main(String[] args) {
        double peso;
        double altura;
        double imc;
        System.out.println("Introduce tu peso y tu altura: ");
        Scanner inputValue = new Scanner(System.in);
        peso = inputValue.nextDouble();
        altura = inputValue.nextDouble();

        imc = peso / (altura * altura);

        if (imc < 18.5) {
            System.out.println("Bajo peso");
        } else if (imc < 25) {
            System.out.println("Normal");
        } else if (imc < 30) {
            System.out.println("Sobrepeso");
         } else {
            System.out.println("Obesidad");
        }

    }
}
