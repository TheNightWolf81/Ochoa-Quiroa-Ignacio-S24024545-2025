import java.util.Scanner;
public class Ejercicio16 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Ingresa un número: ");
        int n = sc.nextInt();
        	if (n % 2 == 0)
            		System.out.println("El número " + n + " es Par");
        	else
            		System.out.println("El número " + n + " es Non");
    }
}
