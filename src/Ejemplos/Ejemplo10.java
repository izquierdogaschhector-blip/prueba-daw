import java.util.Scanner;

public class Ejemplo10 {
    public static void main(String[] args) {
        float num;
        Scanner inputValue = new Scanner(System.in);
        System.out.println("Introduce un número: ");
        num = inputValue.nextFloat();
        inputValue.close();

        if (num >= 0) {
            System.out.println("¡Este número es positivo!");
        }else{
            System.out.println("¡Este número es negativo!");
        }
    }
}
