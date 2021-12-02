/*
 * @Autor: Darwin Jesus Neira Carrasco
 * @Email: dneirac@unsa.edu.pe
 * @Descripcion: Calcula la longitud de la cadena más larga que se puede sacar de un arreglo dado
 */

public class longestSubsequence{
  public static void main (String[]args){
    //int [] nums = {10,9,2,5,3,7,101,18};
    //int [] nums = {7,7,7,7,7,7,7};
    // Casos de prueba donde se tuvvo problemas durante el desarrollo
    //int [] nums = {0,1,0,3,2,3};
    //int [] nums = {4,10,4,3,8,9};
    int [] nums = {1,3,6,7,9,4,10,5,6};
    System.out.println("la cadena más larga es de : " + lengthOfLIS(nums));
  }

  public static int lengthOfLIS(int[] nums){
    int n = nums.length; // tamano del arreglo
    int [] cant = new int [n]; // creacion del arreglo donde se guardara la cadena más larga para cadad item
    // llenado de casos base, dado que todos empizan con 1
    for (int i = 0; i < cant.length; i++) {
      cant[i] = 1;
    }

    for (int i = 0; i < n-1; i++) {
      for (int j = i+1; j < n; j++) {
        if(nums[i] < nums[j]){ // si el anterior es menor
          cant[j] = Math.max(cant[j], cant[i] + 1); // en caso el valor de cant[j], sea menor al que tendria con cant[i] + 1, se reemplazara  
        }
        else{
          continue;
        }
      }      
    }
    // seguimiento
    for (int i : cant) {
      System.out.println(i);
    }

    // calculando el mayor de cant
    int max = cant[0];
    for (int i = 1; i < cant.length; i++) {
      max = Math.max(max, cant[i]);
    }
    return max;
  }
}

