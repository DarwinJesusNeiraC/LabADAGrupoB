/*
 * @Autor: Darwin Jesus Neira Carrasco
 * @Correo: dneira@unsa.edu.pe
 * @Descipcion: Uso del algoritmo de buscada binaria para la comprobacion del su un numero es cuadratico 
*/

import java.util.Scanner;
public class bSCuadratic{
  public static void main (String[]args){
    Scanner scan = new Scanner(System.in);
    System.out.print("Se verificara si el numero ingresado es un cuadratico de 0 a 100\nIngrese el valor buscado, el resultado puede ser Si o No: ");
    int value = scan.nextInt();
    int resul = binarySearch(value);
    if(resul == -1){
      System.out.println("No");
    }
    else{
      System.out.println("Si");
    }
  }

  public static int binarySearch(int value){
    int low = 0;
    int high = 10;
    while(low <= high){
      int middle = ( low + high ) / 2;
      if(middle*middle == value){
        return middle;
      }
      else{
        if(value > middle * middle){
          low = middle + 1;
        }
        else {
          high = middle - 1;
        }
      }

    }
    return -1;
  }
}

