import java.util.Random;

public class Ejercicio3{
  public static void main (String[]args){
    /*Implementar el ordenamietno por insertion */
    int [] arr = new int [10000];// declaracion de arreglo
    fillIn(arr);
    long start = System.currentTimeMillis();
    insertion(arr);
    long end = System.currentTimeMillis();
    System.out.println("Tiempo de ejecucion " + (end-start)*1.0e-3 + " segundos");
  }

  public static void insertion(int [] arr){
    for( int j = 1; j < arr.length; j++) {
      int key = arr[j];
      int i = j - 1;
      while (i >= 0 && arr[i] > key ) {
        arr[i + 1] = arr[i];
        i -= 1;
      }
      arr[i + 1] = key;
    }
  }

  public static void fillIn(int [] arr) {
    Random ram = new Random();
    for (int i = 0; i < arr.length; i++) {
      arr[i] = ram.nextInt(arr.length); 
    }
  }
}

