import java.util.Scanner;
public class Ejercicio13 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double a, b, c;
        System.out.print("A: ");
        a = sc.nextDouble();
        System.out.print("B: ");
        b = sc.nextDouble();
        System.out.print("C: ");
        c = sc.nextDouble();
        	if (a == 0) {
           		System.out.println("No es una ecuación cuadrática.");
        	} else {
            		double d = b * b - 4 * a * c;
            	if (d < 0) {
                	System.out.println("Las raíces son imaginarias.");
            	} else {
                	double x1 = (-b + Math.sqrt(d)) / (2 * a);
                	double x2 = (-b - Math.sqrt(d)) / (2 * a);
                	System.out.println("Raíz 1: " + x1);
                	System.out.println("Raíz 2: " + x2);
            }
        }
    }
}