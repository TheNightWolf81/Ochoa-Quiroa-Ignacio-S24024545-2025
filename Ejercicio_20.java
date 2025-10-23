import java.util.Scanner;
public class Ejercicio20 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Total de la compra: ");
        double total = sc.nextDouble();
        System.out.print("Número escogido al azar: ");
        int num = sc.nextInt();
        	double descuento;
        	if (num < 74) {
            		descuento = total * 0.15;
        	} else {
            		descuento = total * 0.20;
        	}
        		double totalFinal = total - descuento;
        			System.out.println("Descuento aplicado: $" + descuento);
        			System.out.println("Total a pagar: $" + totalFinal);
    }
}