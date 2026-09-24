import java.util.Scanner;

public class Ejemplo20 {
    public static void main(String[] args) {
        float precio;
        Scanner inputValue = new Scanner(System.in);
        System.out.println("Introduce el precio del producto: ");
        precio = inputValue.nextFloat();
        float prefin;

        if (precio < 6) {
            prefin = precio;
        } else if (precio >= 6 && precio < 60) {
            prefin = precio - ((precio * 5) / 100);
        } else {
            prefin = precio - ((precio * 10) / 100);
        }
        System.out.println("El precio del producto es: " +prefin);


    }

}