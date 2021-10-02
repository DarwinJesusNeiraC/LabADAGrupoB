import java.util.Scanner;
public class BinarySearch{
  public static void main (String[]args){
    /*Autor: Darwin Jesus Neira Carrasco
     *Descipcion: Uso de algorimo de busqueda binaria, para ciertas cantidades de datos*/
    int [] arr = {100};
    Scanner scan = new Scanner(System.in);
    System.out.println("Ingrese el valor buscado, si el resultado es -1 no se encuentra");
    int value = scan.nextInt();
    long start = System.currentTimeMillis();
    System.out.println("position: " + (binarySearch(arr, value)));
    long end = System.currentTimeMillis();
    System.out.println("Tiempo de ejecucion " + (end-start)*1.0e-3 + " segundos");
  }

  public static int binarySearch(int [] arr , int value){
    int low = 0;
    int high = arr.length-1;
    while(low <= high){
      int middle = ( low + high ) / 2;
      if(arr[middle] == value){
        return middle;
      }
      else{
        if(value < arr[middle]){
          high = middle - 1;
        }
        else {
          low = middle + 1;
        }
      }

    }
    return -1;
  }

  // metodo de llenado del arreglo
  public static void fillIn (int [] arr) {
    int a = 0;
    for (int i = 0; i < arr.length; i++) {
      arr[i] = a;
      a+=2;
    }
  }
}

