import java.util.Scanner;
public class Ejercicio19 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Ingresa el monto total del presupuesto: ");
        double total = sc.nextDouble();
        	double gine = total * 0.40;
        	double trauma = total * 0.30;
        	double pedia = total * 0.30;
        		System.out.println("Ginecología recibe: " + gine);
        		System.out.println("Traumatología recibe: " + trauma);
        		System.out.println("Pediatría recibe: " + pedia);
    }
}