import java.util.Scanner;

public class Ejemplo11 {
    public static void main(String[] args) {
        float num1;
        float num2;
        Scanner inputValue = new Scanner(System.in);
        System.out.println("Pon el primer número: ");
        num1 = inputValue.nextFloat();
        System.out.println("Pon el segundo número: ");
        num2 = inputValue.nextFloat();

        if (num1 >= num2) {
            System.out.println(num2+ " > " +num1);
        }else{
            System.out.println(num1+ " > " +num2);
        }

    }
}
