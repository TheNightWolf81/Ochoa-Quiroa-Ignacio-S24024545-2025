import java.util.Scanner;
public class Ejercicio10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double m1, m2, m3;
        	System.out.print("Materia 1: ");
        	m1 = sc.nextDouble();
        	System.out.print("Materia 2: ");
        	m2 = sc.nextDouble();
        	System.out.print("Materia 3: ");
        	m3 = sc.nextDouble();
        	double promedio = (m1 + m2 + m3) / 3;
        	System.out.println("Promedio general: " + promedio);
    }
}