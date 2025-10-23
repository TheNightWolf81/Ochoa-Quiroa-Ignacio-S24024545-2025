import java.util.Scanner;
public class Ejercicio5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        	System.out.print("Ingresa la temperatura en °C: ");
        	double c = sc.nextDouble();
        	double f = (c * 9/5) + 32;
        	double k = c + 273.15;
        	System.out.println("En Fahrenheit: " + f);
        	System.out.println("En Kelvin: " + k);
    }
}