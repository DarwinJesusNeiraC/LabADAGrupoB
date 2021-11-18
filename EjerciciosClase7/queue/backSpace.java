/*
 * @Autor: Darwin Jesus Neira Carrasco
 * @Email: dneirac@unsa.edu.pe
 * @Descripcion: se ingresa una cadena con '#' este indica que el valor anterior debe ser eliminado
*/


import java.util.Deque;
import java.util.LinkedList;
public class backSpace{
  public static void main (String[]args){
    Deque<String> myDeque = new LinkedList<String>();
    String cadena = "abc#de##f#ghi#jklmn#op#";
    //String cadena = "";
    if(cadena.equals("")){
      System.out.println("La cadena no tiene que estar vacia");
    }
    else{
      System.out.println("Datos de cadena");
      for (int i = 0; i < cadena.length(); i++) {
        System.out.println(cadena.substring(i, i +1));
        filter(cadena.substring(i, i +1), myDeque);
      }
      System.out.println("Resultado: " + print(myDeque));
    }
  }

  private static String print(Deque<String> myDeque){
    String retorno = "";
    for (String string : myDeque) {
      retorno += string;
    }
    return retorno;
  }
  private static void filter(String s, Deque<String> myDeque){
    myDeque.addLast(s);
    if(s.equals("#")){
      // Extraemos el filtro '#' y el anterior a este
      String x = myDeque.removeLast();
      System.out.println("primer valor extraido: " + x);
      String y = myDeque.removeLast();
      System.out.println("segungo valor extraido: " + y);
    }
  }
}

