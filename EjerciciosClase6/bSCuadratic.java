/*
 * @Autor: Darwin Jesus Neira Carrasco
 * @Correo: dneira@unsa.edu.pe
 * @Descipcion: Uso del algoritmo de buscada binaria para la comprobacion del su un numero es cuadratico 
*/

import java.util.Scanner;
public class bSCuadratic{
  public static void main (String[]args){
    int [] arr = new int [10];
    Scanner scan = new Scanner(System.in);
    fillIn(arr);
    System.out.println("Ingrese el valor buscado, si el resultado es -1 no se encuentra");
    int value = scan.nextInt();
    int resul = binarySearch(arr, value);
    System.out.println("position: " + resul);
    if(resul == -1){
      System.out.println("No");
    }
    else{
      System.out.println("Si");
    }
  }

  public static int binarySearch(int [] arr , int value){
    int low = 0;
    int high = arr.length-1;
    while(low <= high){
      int middle = ( low + high ) / 2;
      if(arr[middle]*arr[middle] == value){
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
      a++;
    }
  }
}

