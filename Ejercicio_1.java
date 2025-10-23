import java.util.Scanner;
public class Ejercicio1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Ingresa los metros: ");
        	double metros = sc.nextDouble();
        	double pies = metros * 3.28084;
        	double pulgadas = metros * 39.3701;
        	System.out.println("Equivale a " + pies + " pies y " + pulgadas + " pulgadas");
    }
}