/*
 * @Autor: Darwin Jesus Neira Carrasco
 * @Correo: dneirac@unsa.edu.pe
 * @Descripcion: Encontrar 2 numeros que sumen 10 y sean distintos
 * la complijidad del elemento es de O(n²)
*/

public class twoSum{
  public static void main (String[]args){
    int [] arr = {3,7,2,6};
    int [] arr2 = {5,5,2,6};
    int [] arr3 = {5,8,1,6};
    System.out.println("arr : " + twoSum(arr));
    System.out.println("arr2 : " + twoSum(arr2));
    System.out.println("arr3 : " + twoSum(arr3));

  }
  public static boolean twoSum(int [] arr){
    for (int i = 0; i < arr.length; i++) { // max(n,2) = O(n * n) = O(n²)
      for (int j = 0; j < arr.length; j++) { // max(5n,1) = O(n)
        if((i != j) && ( arr[i] + arr[j] == 10 )){ // O(3)
          return true;
        }
      }
    }
    return false;
  }
}

