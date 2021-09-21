import java.util.Scanner;
public class ejercicio4 {
	public static void main(String[] args) {
		Scanner scan  = new Scanner(System.in);
		int [] numbers = new int[3];
		for (int i = 0; i < numbers.length; i++) {
			System.out.print("Ingresa el numero: ");
			numbers[i] = scan.nextInt();
		}
		Burbuja(numbers);
		for (int i : numbers) {
			System.out.print(i + ", ");
		}
	}
	public static void Burbuja(int [] numeros){
		for (int i = 0; i < numeros.length - 1; i++) {
			for (int j = 0; j < numeros.length - 1 ; j++) {
				if(numeros[j] > numeros[j + 1]){
					int actual = numeros[j];
					numeros[j] = numeros[j + 1];
					numeros[j + 1] = actual;							
				}				
			}
		}
	}
}
