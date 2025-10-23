import java.util.Scanner;
public class Ejercicio9 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        	System.out.print("Salario anterior: ");
        	double salario = sc.nextDouble();
        	double nuevo = salario * 1.25;
        	System.out.println("Salario nuevo: " + nuevo);
    }
}