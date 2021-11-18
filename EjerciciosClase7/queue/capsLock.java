import java.util.Queue;


import java.util.LinkedList;
public class capsLock{
  static String comeBack = "";
  static boolean mayuscula = false;
  public static void main (String[]args){
    String cadena = "abc$d@ef$@g$";
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
    if(mayuscula){
      myQueue.offer(s.toUpperCase());
    }
    else{
      myQueue.offer(s);
    }

    if(s.equals("$")){
      System.out.println("antes de quitar");
      print(myQueue);
      //System.out.println("despues de quitar");
      //myQueue.poll();
      //print(myQueue);
      int size = myQueue.size();
      for (int i = 0; i < size-1; i++) {
        comeBack += myQueue.poll();
      }
      System.out.println("despues de quitar");
      print(myQueue);
      myQueue.poll();
      System.out.println("Resultado de comeBack: " + comeBack);
    }
    if(s.equals("@")){
      if(mayuscula){ 
        mayuscula = false;
      }
      else{
        mayuscula = true;
      }

      System.out.println("Imprimir en  @");
      print(myQueue);
      if(myQueue.peek().equals("@")){
        myQueue.poll();
        System.out.println("Imprimir en mayuscula cuando esta primero @");
        print(myQueue);
      }
      else{
        // el anterior lo quitmaos y los ponemos en mayuscula
        String y = myQueue.poll();
        myQueue.poll();
        myQueue.add(y.toUpperCase());
        System.out.println("Imprimir en mayuscula");
        print(myQueue);
      }
    }
  }
}

