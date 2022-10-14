package boletin3_5;

import java.util.Scanner;

public class Boletin3_5 {

    public static void main(String[] args) {
        double sueldofijo, totalventas, km, diasdesplaz, sueldobruto, sueldoliquido;
        Scanner salario = new Scanner(System.in);
        System.out.println("Indique sueldo fijo");
        sueldofijo = salario.nextDouble();
        System.out.println("Indique total ventas");
        totalventas = salario.nextDouble();
        System.out.println("Indique Km");
        km = salario.nextDouble();
        System.out.println("Indique días de desplazamiento");
        diasdesplaz = salario.nextDouble();
        sueldobruto = sueldofijo + totalventas + km + diasdesplaz;
        sueldoliquido = sueldobruto - (sueldobruto*0.18) - 36;
        System.out.println("El sueldo bruto es " + sueldobruto + "y el sueldo líquido es " + sueldoliquido);
    }

}
