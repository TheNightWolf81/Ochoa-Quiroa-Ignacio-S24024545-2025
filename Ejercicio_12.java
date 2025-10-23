import java.util.Scanner;
public class Ejercicio12 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int categoria, horas;
        double pagoHora = 0;
        System.out.print("Horas trabajadas: ");
        horas = sc.nextInt();
        System.out.print("Categoría (1 a 4): ");
        categoria = sc.nextInt();
        	if (categoria == 1) pagoHora = 20000;
        	else if (categoria == 2) pagoHora = 15000;
        	else if (categoria == 3) pagoHora = 10000;
        	else if (categoria == 4) pagoHora = 7500;
        	else System.out.println("Categoría inválida");
        	double salario = horas * pagoHora;
        	double descuento = salario * 0.072;
        	double total = salario - descuento;
        	if (salario < 1000000) {
            	double subsidio = salario * 0.15;
            	total += subsidio;
        }
        	System.out.println("Salario base: " + salario);
        	System.out.println("Total a pagar: " + total);
    }
}