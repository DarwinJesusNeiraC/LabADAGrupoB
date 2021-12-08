/*
 * @Autor: Darwin Jesus Neira Carrasco
 * @Email: dneirac@unsa.edu.pe
 * @Descripcion: En unir las cuerdas dados por el array A de tal manera que sean mayores o iguales que K,
 * devolver el maximo de cuerdas posibles
 */

public class tieRopes{
  public static void main (String[]args){
    /*int [] A = {1,2,3,4,1,1,3};
    //int K = 4;
    int [] A = {1};
    int K = 2;*/
    int [] A = {1,1};
    int K = 3;
    solution(K, A);

  }

  public static int solution(int K, int [] A){
    int n = 0;// numeros de cuerdas mayores o iguales a K
    for(int i = 0 ; i < A.length ; i++){
      print(A);//seguimiento
      if(A[i] >= K){
        n++;// aumentamos el valor de n
        continue; // lo saltamos
      }
      else{
        if(i + 1 != A.length){ // verificamos que no nos pasaemos de los limites
          A[i+1] += A[i]; // establecemos el valor de la nueva cuerda
        }
      }
      print(A); // seguimiento
    }
    System.out.println("salida : " + n);

    return n;// retornamso el valor
  }
  // metood de seguimiento
  public static void print(int [] A){
    for (int i : A) {
      System.out.print(i + ", ");
    }
    System.out.print("\n");
  }
}

