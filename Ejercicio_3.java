import java.util.Scanner;
public class Ejercicio3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Ingresa tu edad: ");
        	int edad = sc.nextInt();
        	double pulsaciones = (220 - edad) / 10.0;
       		System.out.println("Número de pulsaciones: " + pulsaciones);
    }
}