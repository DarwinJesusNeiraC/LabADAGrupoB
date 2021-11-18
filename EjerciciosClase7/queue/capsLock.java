/*
 * @Autor: Darwin Jesus Neira Carrasco
 * @Email: dneirac@unsa.edu.pe
 * @Descripcion: se ingresa una cadena con los elementos especioles '$' y '@' los cuales modifican la cadena
 * siendo '$' para serparla y agregarla a la salida, y '@' para transformalo en mayuscula
*/

import java.util.Queue;
import java.util.LinkedList;
public class capsLock{
  static String comeBack = "";
  static boolean mayuscula = false;
  public static void main (String[]args){
    // casos de prueba 
    //String cadena = "abc$d@ef$@g$";
    String cadena = "@abc$@def$g@$";
    Queue<String> myQueue = new LinkedList<String>();
    System.out.println("Datos de cadena");
    for (int i = 0; i < cadena.length(); i++) {
      System.out.println(cadena.substring(i, i +1));
      filter(cadena.substring(i, i +1), myQueue);
    }

    System.out.println("Resultado: " + comeBack);
  }

  public static void print(Queue<String> myQueue){
    for (String string : myQueue) {
      System.out.println(string);
    }      
  }

  private static void filter(String s, Queue<String> myQueue) {
    // dependiendo del valor de mayuscula sera el tipo de ingreso
    if(mayuscula){
      myQueue.offer(s.toUpperCase());
    }
    else{
      myQueue.offer(s);
    }

    if(s.equals("$")){
      System.out.println("antes de quitar");
      print(myQueue);
      int size = myQueue.size(); // guardamos el valor del tamaño ya que este ira variando segun quitemos elementos
      for (int i = 0; i < size-1; i++) {
        comeBack += myQueue.poll();
      }
      System.out.println("despues de quitar");
      print(myQueue);
      myQueue.poll();
      System.out.println("Resultado de comeBack: " + comeBack);
    }
    if(s.equals("@")){
      mayuscula = mayuscula ? false : true; // definimos el valor de mayuscula mediante el operador termario
      System.out.println("Imprimir en  @"); // seguimiento
      print(myQueue);
      if(myQueue.peek().equals("@")){ // En caso inicie con @
        myQueue.poll(); // la quitamos 
        System.out.println("Imprimir en mayuscula cuando esta primero @");
        print(myQueue);
      }
      else{
        // el anterior lo quitmaos y los ponemos en mayuscula
        String y = myQueue.poll(); // en caso se encuentre un valor anterior a @ y guardamos su valor
        myQueue.poll(); // quitamos @
        myQueue.add(y.toUpperCase()); // La convertimos en mayuscula y la agregamos
        System.out.println("Imprimir en mayuscula");
        print(myQueue);
      }
    }
  }
}

