import java.util.Scanner;
public class ejercicio2 {
	public static void main(String[] args) {
		Scanner scan  = new Scanner(System.in);
		System.out.print("Ingresa la cantidad de numeros: ");
		int cant = scan.nextInt();
		int [] numbers = new int[cant];
		for (int i = 0; i < numbers.length; i++) {
			System.out.print("Ingresa el numero: ");
			numbers[i] = scan.nextInt();
		}
		for (int i = numbers.length - 1 ; i >= 0 ; i--) {
			System.out.print(numbers[i] + ", ");
		}
	}
}