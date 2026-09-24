import java.util.Scanner;

public class Ejemplo4 {
    public static void main(String[] args) {
        float lado;
        Scanner inputValue = new Scanner(System.in);

        System.out.println("Introduce el lado: ");
        lado = inputValue.nextFloat();

        float squareArea = lado * lado;
        System.out.println(squareArea);
        inputValue.close();
    }
}
