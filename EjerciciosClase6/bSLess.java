/*
 * @Autor: Darwin Jesus Neira Carrasco
 * @Correo: dneirac@unsa.edu.pe
 * @Descipcion: Uso de algorimo de busqueda binaria, encontrar el items más pequeño
*/

public class bSLess{
  public static void main (String[]args){
    // Casos de prueba
    //int [] arr = {6,7,9,15,19,2,3};
    //int [] arr = {9,15,19,1,3,6,7};
    //int [] arr = {7, 9, 11, 13, 2, 3, 5}; // error al poner el caso dado en hoja de calculo
    int [] arr = {7, 9, 11, 13, 1, 2, 3, 5}; // caso dado en hoja de calculo
    //int [] arr = {0,3,6,7,9,15,19};
    System.out.println("menor elemento: " + (binarySearch(arr)));
  }

  public static int binarySearch(int [] arr){
    int low = 0;
    int high = arr.length-1;
    int middle = 0;
    while(low <= high){
      System.out.println("entre a while");
      middle = ( low + high ) / 2;
      if(arr[low] < arr[high]){ // Dependiendo de los valores de los extremos estableceremos los valores de 
        high = middle;// low y high
      }
      else if(arr[low] > arr[high]){
        if(arr[low +1 ] < arr[middle]){ // Se agrego un seguro más para el caso de que low sea mayor
          low = low +1; // Si nuestro elemento de la derecha de middle, es menor que el mismo middle significa que ese debe ser nuestro nuevo valor low
        }
        else {
          low = middle;
        }
      }
      if(low == high){// cuando se encuentre una coincidencia enter low y high se devolvera el valor
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

