import java.util.Scanner;

public class Ejemplo18 {
    public static void main(String[] args) {
        int h;
        int m;
        int s;

        Scanner inputValue = new Scanner(System.in);
        System.out.println("Introduce la hora: ");
        h = inputValue.nextInt();
        System.out.println("Introduce los minutos: ");
        m = inputValue.nextInt();
        System.out.println("Introduce los segundos: ");
        s = inputValue.nextInt();

        s++; // s = s + 1

        if (s == 60) {
            s = 0;
            m++;
            if (m == 60) {
                m = 0;
                h++;
            }
        }
        System.out.println(+h+ " " +m+ " " +s);
    }
}
