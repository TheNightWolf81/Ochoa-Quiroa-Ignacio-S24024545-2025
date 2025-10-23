import java.util.Scanner;
public class Ejercicio8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        	System.out.print("Capital a invertir: ");
        	double capital = sc.nextDouble();
        	double ganancia = capital * 0.02;
        	double total = capital + ganancia;
        	System.out.println("Ganancia después de un mes: " + ganancia);
        	System.out.println("Total después de un mes: " + total);
    }
}