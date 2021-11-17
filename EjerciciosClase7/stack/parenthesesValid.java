/*
 * @Autor: Darwin Jesus Neira Carrasco
 * @Email: dneirac@unsa.edu.pe
 * @Descripcion: Verificar que los parentesis este cerrados y mostrar la cantidad de aquellos que no lo estan
*/

import java.util.Stack;
public class parenthesesValid{
  public static void main (String[]args){
    //String cadena = "())";
    //String cadena = "(()))(";
    //String cadena = "(((";
    String cadena = "()))((";

    Stack<String> myStack = new Stack<String>();
    for (int i = 0; i < cadena.length(); i++) {
      //System.out.println(cadena.substring(i, i +1));
      match(cadena.substring(i, i +1),myStack);
    }
    System.out.println("Hay un total de " + myStack.size() + " que no han sido cerrados");

  }

  public static void match(String str, Stack<String> myStack){
    myStack.add(str);
    if(myStack.size() >= 2){ // tenemos que asegurarnos que min haya 2, en la pila
      System.out.println("resultado de la union: " + myStack.get(myStack.size()-2) + myStack.get(myStack.size()-1)); // seguimiento
      String s = myStack.get(myStack.size()-2) + myStack.get(myStack.size()-1);
      if( s.equals("()") ){ //si coincide con la cedena 
        System.out.println("coincidencia");
        myStack.pop(); // retiramos los elementos
        myStack.pop();
      }
      //seguimiento
      System.out.println("imprimiendo pila");
      print(myStack);
    }
    //seguimiento
    System.out.println("imprimiendo pila");
    print(myStack);
  }

  public static void print(Stack<String> myStack) { // imprimir la pila 
    for (int i = myStack.size() - 1; i >= 0; i--) {
      System.out.println(myStack.get(i));
    }  
  }
}

