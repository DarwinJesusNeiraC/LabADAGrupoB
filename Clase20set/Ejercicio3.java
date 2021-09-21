public class Ejercicio3{
  public static void main (String[]args){
    int [] arr = {2,5,1,6,3};
    System.out.println("Antes");
    for (int i : arr) {
      System.out.println(i);
    }
    insertion(arr);
    System.out.println("Despues");
    for (int i : arr) {
      System.out.println(i);
    }

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
}

