import java.util.*;
public class Ejercicio2{
  public static void main (String[]args){
    Scanner scan = new Scanner(System.in);
    System.out.print("ingresa un dato: ");
    int t = scan.nextInt();
    int[] arr = {1,4,8,9,11,15,7,12,13,6};
    System.out.println(search(arr, t));
    
  }

  public static boolean search(int [] arr, int t){
    for (int i = 0; i < arr.length; i++) {
      if (arr[i] == t) {
        return true;
      }
    }
    return false;
  }
}

