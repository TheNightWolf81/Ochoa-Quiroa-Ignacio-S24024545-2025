import java.util.Scanner;
public class Ejercicio6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        	System.out.print("Número de hombres: ");
        	int hombres = sc.nextInt();
        	System.out.print("Número de mujeres: ");
        	int mujeres = sc.nextInt();
        	int total = hombres + mujeres;
        	double ph = (hombres * 100.0) / total;
        	double pm = (mujeres * 100.0) / total;
        	System.out.println("Porcentaje hombres: " + ph + "%");
        	System.out.println("Porcentaje mujeres: " + pm + "%");
    }
}