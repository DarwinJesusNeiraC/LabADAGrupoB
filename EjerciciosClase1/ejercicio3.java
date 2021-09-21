import java.util.Scanner;
public class ejercicio3 {
	public static void main(String[] args) {
		Scanner scan  = new Scanner(System.in);
		System.out.print("Ingresa la cantidad de numeros: ");
		int cant = scan.nextInt();
		int [] numbers = new int[cant];
		for (int i = 0; i < numbers.length; i++) {
			System.out.print("Ingresa el numero: ");
			numbers[i] = scan.nextInt();
		}
		String par = "par: ";
		String impar = "impar: ";
		for (int i = 0; i < numbers.length; i++) {
			if(numbers[i] % 2 == 0) {
				par += numbers[i] + ", ";
			}
			else {
				impar += numbers[i] + ", ";
			}
		}
		System.out.println(par);
		System.out.println(impar);
	}
}