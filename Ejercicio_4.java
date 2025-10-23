import java.util.Scanner;
public class Ejercicio4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Año actual: ");
        	int actual = sc.nextInt();
        	System.out.print("Año de nacimiento: ");
        	int nacimiento = sc.nextInt();
        	int edad = actual - nacimiento;
        	System.out.println("Tu edad es: " + edad);
    }
}