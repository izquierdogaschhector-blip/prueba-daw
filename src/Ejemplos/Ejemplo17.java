import java.util.Scanner;

public class Ejemplo17 {
    public static void main(String[] args) {
        int mes;
        Scanner inputValue = new Scanner(System.in);
        System.out.println("Inroduce el mes en número. ");
        mes = inputValue.nextInt();

        switch (mes) {
            case 1:
            case 3:
            case 5:
            case 7:
            case 8:
            case 10:
            case 12:
                System.out.println("Este mes tiene 31 días");
                break;
            case 4:
            case 6:
            case 9:
            case 11:
                System.out.println("Este mes tiene 30 días");
                break;
            case 2:
                System.out.println("Este mes tiene 28 días o 29 en su año bisiesto");
                break;

        }
    }
}
