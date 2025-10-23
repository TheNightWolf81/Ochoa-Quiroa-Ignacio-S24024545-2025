import java.util.Scanner;
public class Ejercicio7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        	System.out.print("Total de la compra: ");
        	double total = sc.nextDouble();
        	double pagar = total - (total * 0.15);
        	System.out.println("Total a pagar con descuento: " + pagar);
    }
}