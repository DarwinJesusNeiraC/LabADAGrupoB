import java.util.Scanner;
public class ejercicio5 {
	public static void main(String[] args) {
		Scanner scan  = new Scanner(System.in);
		String word = scan.next();
		String [][] frame = new String [3][3];
		for (int i = 0; i < frame.length; i++) {
			for (int j = 0; j < frame[i].length; j++) {
				if(i == 1 &&  j == 1) {
					frame[i][j] = word;
				}
				else {
					frame[i][j] = "*";
				}
			}
		}
		imprimir(frame);
	}
	
	private static void imprimir(String [][] array) {
		for (int i = 0; i < array.length; i++) {
			System.out.print("\n");
			for (int j = 0; j < array.length; j++) {
				System.out.print(array[i][j]);
			}
		}
	}
}