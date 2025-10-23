import java.util.Scanner;
public class Ejercicio14 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double total = 0;
        for (int i = 1; i <= 4; i++) {
            System.out.print("Venta " + i + ": ");
            double venta = sc.nextDouble();
            double comision = 0;
            	if (venta <= 10000000) comision = venta * 0.02;
            	else if (venta < 15000000) comision = venta * 0.04;
            	else comision = venta * 0.10;
            	total += comision;
        	}
        	System.out.println("Comisión total del mes: " + total);
    }
}