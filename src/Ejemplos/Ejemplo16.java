import java.util.Scanner;

public class Ejemplo16 {
    public static void main(String[] args) {
        int num1;
        int num2;
        String operacion;
        Scanner inputValue = new Scanner(System.in);
        System.out.println("Introduce el primer número: ");
        num1 = inputValue.nextInt();
        System.out.println("Introduce el segundo número: ");
        num2 = inputValue.nextInt();
        System.out.println("Introduce la operación a realizar (+, -, *, /): ");
        operacion = inputValue.next();
        switch (operacion) {
            case "+":
                System.out.println("La suma de "+num1+" y "+num2+" es de: " +(+num1 + +num2));
                break;
            case "-":
                System.out.println("La resta de "+num1+" y "+num2+" es de: " +(+num1 - +num2));
                break;
            case "*":
                System.out.println("La multiplicación de "+num1+" y "+num2+" es de: " +(+num1 * +num2));
                break;
            case "/":
                System.out.println("La divisón de "+num1+" y "+num2+" es de: " +(+num1 / +num2));
                break;
        }
    }
}
