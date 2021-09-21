import java.util.*;
public class Ejercicio2{
  public static void main (String[]args){
    int[] arr = new int [100];
    fillIn(arr);
    long start = System.currentTimeMillis();
    Scanner scan = new Scanner(System.in);
    System.out.print("ingresa un dato: ");
    int t = scan.nextInt();
    System.out.println(search(arr, t));
    long end = System.currentTimeMillis();
    System.out.println("Tiempo de ejecucion " + (end-start)*1.0e-3 + " segundos");
  }

  public static boolean search(int [] arr, int t){
    for (int i = 0; i < arr.length; i++) {
      if (arr[i] == t) {
        return true;
      }
    }
    return false;
  }

  public static void fillIn(int [] arr) {
    for (int i = 0; i < arr.length; i++) {
      arr[i] = i; 
    }
  }
}

