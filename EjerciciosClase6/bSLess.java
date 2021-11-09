/*
 * @Autor: Darwin Jesus Neira Carrasco
 * @Correo: dneirac@unsa.edu.pe
 * @Descipcion: Uso de algorimo de busqueda binaria, encontrar el items más pequeño
*/

public class bSLess{
  public static void main (String[]args){
    //int [] arr = {6,7,9,15,19,2,3};
    int [] arr = {2,3,6,7,9,15,19};
    System.out.println("Ingrese el valor buscado, si el resultado es -1 no se encuentra");
    System.out.println("menor elemento: " + (binarySearch(arr)));
  }

  public static int binarySearch(int [] arr){
    int low = 0;
    int high = arr.length-1;
    int middle = 0;
    while(low <= high){
      System.out.println("entre a while");
      middle = ( low + high ) / 2;
      if(arr[low] < arr[middle]){
        low = middle + 1;
      }
      else{
        high = middle - 1;
      }
      if(low == high){
        return arr[middle];
      }
    }
    return arr[middle];
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

