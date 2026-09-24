import java.util.Scanner;

public class Ejemplo5 {
    public static void main(String[] args) {
        int number;
        int number2;
        Scanner inputValue = new Scanner(System.in);
        System.out.println("Ponga el primer número: ");
        number = inputValue.nextInt();
        System.out.println("Ponga el segundo número: ");
        number2 = inputValue.nextInt();

        int sum = number + number2;
        int rest = number - number2;
        int mult = number * number2;
        int div = number / number2;

        System.out.println("La suma es: "+sum);
        System.out.println("La resta es: "+rest);
        System.out.println("La multiplicación es: "+mult);
        System.out.println("La división es: "+div);

    }
}
