import java.util.Scanner;

public class Ejemplo7 {
    public static void main(String[] args) {
        float precio;
        float pr;

        Scanner inputValue = new Scanner(System.in);
        System.out.println("Introduce el precio: ");
        precio = inputValue.nextFloat();
        System.out.println("Introduce el precio rebajado: ");
        pr = inputValue.nextFloat();
        inputValue.close();

        float descuento = (precio-pr)/precio * 100;
        System.out.println("El descuento es del: " +descuento+ " %");
    }
}
