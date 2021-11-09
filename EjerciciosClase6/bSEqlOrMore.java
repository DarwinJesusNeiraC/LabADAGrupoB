/*
 * @Autor: Darwin Jesus Neira Carrasco
 * @Correo: dneirac@unsa.edu.pe
 * @Descipcion: Uso de algorimo de busqueda binaria, para la busqueda de un numero mayor o igual al buscado
*/

import java.util.Scanner;
public class bSEqlOrMore{
  public static void main (String[]args){
    int [] arr = new int [10];
    Scanner scan = new Scanner(System.in);
    fillIn(arr);
    for (int i : arr) {
      System.out.print(i + ",");
    }
    System.out.println("\nIngrese el valor buscado, si el resultado es -1 no se encuentra");
    int value = scan.nextInt();
    System.out.println("position: " + (binarySearch(arr, value)));
  }

  public static int binarySearch(int [] arr , int value){
    int low = 0;
    int high = arr.length-1;
    int middle = 0;
    while(low <= high){
      middle = ( low + high ) / 2;
      if(arr[middle] == value){
        return arr[middle + 1];
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

