/*
 * @Autor: Darwin Jesus Neira Carrasco
 * @Email: dneirac@unsa.edu.pe
 * @Descripcion: hallar la mayor cantidad de segmentos que se pueden dar, segun los arreglos de A y B 
 */

public class maxSegments{
  public static void main (String[]args){
    // casos de preuba
    //int [] A = {1,3,7,9,9};
    //int [] B = {5,6,8,9,10};
    //int [] A = {7,9,9,11,23,45};
    //int [] B = {8,9,10,12,36,60};
    //int [] A = {};
    //int [] B = {};
    int [] A = {1,2};
    int [] B = {2,5};
    System.out.println(solution(A, B));

  }
  public static int solution(int[] A, int[] B){
    int index = -1; // como uno de los valores que aceptan A y B es 0 inciaremos en -1
    int cont = 0;// aqui se acumlara la cantidad de segmentos
    for (int i = 0; i < A.length; i++) { 
      if(A[i] > index){ // si el valor del A[i] es mayor entonces  
        index = B[i]; // el valor de index sera igual al de B[i] esto para que si no agarremos valores menores a donde termino el segmento
        cont++; // incrementamos el valor de cont
      }
    }
    return cont;
  }
}

