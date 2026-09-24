import java.util.Scanner;

public class Ejemplo6 {
    public static void main(String[] args) {
        double radius;

        Scanner inputValue = new Scanner(System.in);
        System.out.println("Introduce el radio: ");
        radius = inputValue.nextDouble();
        inputValue.close();

        double PI = Math.PI;

        double per = 2 * PI * radius;
        double area = PI * radius * radius;

        System.out.println("El perímetro es: "+per);
        System.out.println("El area es: "+area);
    }
}
