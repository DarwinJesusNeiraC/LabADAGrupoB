/*
 * @Autor: Darwin Jesus Neira Carrasco
 * @Email: dneirac@unsa.edu.pe
 * @Descripcion: 
 */

public class maxSegments{
  public static void main (String[]args){
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
    int index = -1;
    int cont = 0;
    for (int i = 0; i < A.length; i++) {
      if(A[i] > index){
        index = B[i];
        cont++;
      }
    }
    return cont;
  }
}

