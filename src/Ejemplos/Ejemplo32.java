package Ejemplos;

import java.util.Scanner;

public class Ejemplo32 {
    public static void main(String[] args) {
       String password = "hector";
        int intentos = 3;
        String contra;
        Scanner inputValue = new Scanner(System.in);
       while (intentos != 0) {
           System.out.println("Introduce la contraseña, te quedan: "+intentos);
           contra = inputValue.next();
           if (contra.equals(password)) {
               System.out.println("Acceso concedido");
               break;
           } else {
               System.out.println("Contraseña incorrecta, intentelo de nuevo");
               intentos = intentos - 1;
               if (intentos == 0) {
                   System.out.println("Acceso denegado");
               }
           }
       }


    }
}
