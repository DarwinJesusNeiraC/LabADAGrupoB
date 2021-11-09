/*
 @Autor: Darwin Jesus Neira Carrasco
 @Correo: dneirac@unsa.edu.pe
 @Descipcion: Busquda dde datos haciendo uso del algortimo de busqueda binaria
*/

import java.util.Scanner;
public class binarySearch{
  public static void main (String[]args){
    int [] arr = new int [10];
    Scanner scan = new Scanner(System.in);
    System.out.println("Ingrese el valor buscado, si el resultado es -1 no se encuentra");
    int value = scan.nextInt();
    System.out.println("position: " + (binarySearch(arr, value)));
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

