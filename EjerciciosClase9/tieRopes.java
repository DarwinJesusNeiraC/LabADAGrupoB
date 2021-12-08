/*
 * @Autor: Darwin Jesus Neira Carrasco
 * @Email: dneirac@unsa.edu.pe
 * @Descripcion: 
 */

public class tieRopes{
  public static void main (String[]args){
    int [] A = {1,2,3,4,1,1,3};
    int K = 4;
    solution(K, A);

  }

  public static int solution(int K, int [] A){
    int n = 0;// numeros de cuerdas mayores o iguales a K

    for(int i = 0 ; i < A.length ; i++){
      print(A);
      if(A[i] >= K){
        n++;
        continue;
      }
      else{
        A[i+1] += A[i];
      }
      print(A);
    }
    System.out.println("salida : " + n);

    return 0;
  }
  public static void print(int [] A){
    for (int i : A) {
      System.out.print(i + ", ");
    }
    System.out.print("\n");
  }
}

