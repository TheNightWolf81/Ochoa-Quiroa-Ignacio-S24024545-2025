import java.util.Scanner;
public class Ejercicio11 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double a, b, c;
        	System.out.print("Ingresa el primer número: ");
        	a = sc.nextDouble();
        	System.out.print("Ingresa el segundo número: ");
        	b = sc.nextDouble();
        	System.out.print("Ingresa el tercer número: ");
        	c = sc.nextDouble();
       		double mayor, menor;
        	double promedio = (a + b + c) / 3;
        		if (a == b && b == c) {
            			System.out.println("Los tres números son iguales.");
        		} else {
            		mayor = a;
            		if (b > mayor) mayor = b;
            		if (c > mayor) mayor = c;
            		menor = a;
            		if (b < menor) menor = b;
            		if (c < menor) menor = c;
            			System.out.println("Mayor: " + mayor);
            			System.out.println("Menor: " + menor);
            			System.out.println("Promedio: " + promedio);
        }
    }
}