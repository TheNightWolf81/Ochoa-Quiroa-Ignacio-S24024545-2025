import java.util.Scanner;
public class Ejercicio17 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Ingresa un número: ");
        int n = sc.nextInt();
        boolean primo = true;
        	if (n <= 1) primo = false;
        	else {
            		for (int i = 2; i <= n / 2; i++) {
                	if (n % i == 0) {
                    		primo = false;
                    		break;
                	}
            	}
        }
        	if (primo)
            		System.out.println("El número " + n + " es Primo");
        	else
            		System.out.println("El número " + n + " no es Primo");
    }
}