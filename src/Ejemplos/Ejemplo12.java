import java.util.Scanner;

public class Ejemplo12 {
    public static void main(String[] args) {
        float num1;
        float num2;
        Scanner inputValue = new Scanner(System.in);
        System.out.println("Ponga el primer número: ");
        num1 = inputValue.nextFloat();
        System.out.println("Ponga el segundo número. ");
        num2 = inputValue.nextFloat();
        inputValue.close();

        if (num1 > num2) {
            System.out.println("El número más grande es: " + num1);
        }else{
            System.out.println("El número más grande es: "+num2);
        }
    }
}
