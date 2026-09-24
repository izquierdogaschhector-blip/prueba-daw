import java.util.Scanner;

public class Ejemplo19 {
    public static void main(String[] args) {
        float precio_h;
        float num_h;
        Scanner inputValue = new Scanner(System.in);
        System.out.println("Introduce el precio por hora: ");
        precio_h = inputValue.nextFloat();
        System.out.println("Introduce el número de horas: ");
        num_h = inputValue.nextFloat();
        double pago_bruto;
        double salario_neto;
        double impuestos;

        if (num_h <= 35) {
            pago_bruto = precio_h * num_h;
        } else {
            pago_bruto = (precio_h * 35) + (num_h - 35) * precio_h * 1.5;
        }
        if (pago_bruto <= 500) {
            impuestos = 0;
        } else if (pago_bruto <= 900) {
            impuestos = (pago_bruto - 500) * 0.25;
        }else{
             impuestos = (pago_bruto - 500) * 0.25 - pago_bruto * 0.45;

        }
        salario_neto = pago_bruto + impuestos;
        System.out.println("El salario neto es de: "+salario_neto );
    }
}


