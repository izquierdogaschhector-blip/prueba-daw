package EjerciciosDeRefuerzo1;

import java.util.Scanner;

public class Ej19 {
    public static void main(String[] args) {
        int vel_max;
        int dis_cam;
        int sec;
        int vel_coche;
        double vel_media = 0;
        Scanner inputValue = new Scanner(System.in);
        System.out.println("Qué máximo de velocidad tiene la carretera?");
        vel_max = inputValue.nextInt();
        System.out.println("A qué distancia en metros de separación están las dos cámaras alejadas?");
        dis_cam = inputValue.nextInt();
        System.out.println("Cuántos segundos se tarda de una cámara a otra?");
        sec = inputValue.nextInt();

        vel_media = (double)dis_cam / sec;
        vel_media = vel_media * 3.6;

        if (vel_media <= vel_max * 1.2 && vel_media >= vel_max ) {
            System.out.println("MULTA porque la velocidad media era de: "+vel_media);
        } else if (vel_media >= vel_max * 1.2 ) {
            System.out.println("PUNTOS, porque la velocidad media era de: "+vel_media);
        } else {
            System.out.println("OK, porque al velocidad media era de: "+vel_media);
        }

    }
}
