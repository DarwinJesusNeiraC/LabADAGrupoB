import java.util.Queue;


import java.util.LinkedList;
public class capsLock{
  public static void main (String[]args){
    String cadena = "abc$d@ef$@g$";
    Queue<String> myQueue = new LinkedList<String>();
    myQueue.offer("hola");
    myQueue.offer("ha");
    myQueue.offer("oa");
    myQueue.offer("ola");
    System.out.println(myQueue.peek());
    for (String string : myQueue) {
      System.out.println(string);
    }
    myQueue.poll();
    System.out.println("Eliminando");
    for (String string : myQueue) {
      System.out.println(string);
    }
    System.out.println(myQueue.size());
    System.out.println("Eliminando 2");
    int tm = myQueue.size();
    for (int i = 0; i <= myQueue.size(); i++) {
      System.out.println(myQueue.poll() +  " , " + i);
    }
    System.out.println("primer elemento: " + myQueue.peek());
    /*System.out.println("Datos de cadena");
    for (int i = 0; i < cadena.length(); i++) {
      System.out.println(cadena.substring(i, i +1));
      //filter(cadena.substring(i, i +1), myQueue);
    }*/

  }

  private static void filter(String s, Queue<String> myQueue) {
    String comeBack = "";
    myQueue.offer(s);
    if(s.equals("$")){
      myQueue.poll();
    }

  }
}

