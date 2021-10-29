/*Alumno: Darwin Jesus Neira Carrasco
 * Correo: dneirac@unsa.edu.pe
 *Descripcion: Realizar un programa que identifique los indices pares y sume los valores del arreglo
 indentificado con dicho indice con el resto de elemetos, El programa tiene una complejidad de O(n^2)*/

public class everyOther{
  public static void main (String[]args){
    int [] array = {1, 2, 3, 6, 7};
    for (int i : array) {
      System.out.print(i + ",");
    }    
    System.out.println("\n");
    everyOther(array);

  }

  public static void everyOther(int [] array) {
    // max(n²,1) = O(n²)
    for(int i = 0; i < array.length; i++){ //max(2,n) = n, n * n = n² 
      if(i % 2 == 0 ){ // max(2,n) = O(n)
        for (int j = 0; j < array.length; j++) { // max(4n,1) = O(n) //
          System.out.println(array[i] + array[j]);                   //
        }
        System.out.println("\n");
      }
    }
  }
}

