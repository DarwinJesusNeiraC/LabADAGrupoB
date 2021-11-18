/*
 * @Autor: Darwin Jesus Neira Carrasco
 * @Email: dneirac@unsa.edu.pe
 * @Descripcion: Medinate el siguiente promaga se calcula el timpo que demoras en ser evaluado, siendo '-1' tu representacion
 * en los datos, se iran escoginedo los menores de los extremos
 */

import java.util.Deque;
import java.util.LinkedList;
public class intervieWait{
  public static void main (String[]args){
    Deque<Integer> myDeque = new LinkedList<Integer>();
    fill(myDeque);
    System.out.println("Cantidad de tiempo: " + select(myDeque));
    System.out.println("Resultado: " + print(myDeque));
  }

  private static int select(Deque<Integer> myDeque){
    int cont = 0;
    while(true){
      System.out.println("Primero  : " + myDeque.peek());
      System.out.println("Final  : " + myDeque.peekLast());
      if(myDeque.peek() == -1 || myDeque.peekLast() == -1){
        break;
      }
      if(myDeque.peek() < myDeque.peekLast()){
        cont += myDeque.pollFirst();
      }
      else {
        cont += myDeque.pollLast();
      }
    }
    return cont;
  }
  // Este metodo servira para probar más facilmetne el programa
  private static void fill(Deque<Integer> myDeque){
    int [] arr = {4,-1,5,2,3};
    for(int i = 0; i < arr.length; i++){
      myDeque.addLast(arr[i]);
    }
  }

  private static String print(Deque<Integer> myDeque){
    String retorno = "";
    for (int i : myDeque) {
      retorno += i + ", ";
    }
    return retorno;
  }
}

