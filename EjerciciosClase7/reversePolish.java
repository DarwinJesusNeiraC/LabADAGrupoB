/*
 * @Autor: Darwin Jesus Neira Carrasco
 * @Email: dneirac@unsa.edu.pe
 * @Descripcion: Mediante el siguiente metodo se resive un string con datos y signos de las operaicones
 * basicas de la matematica, para ejecutar el programa es nesesario un espacio entre los datos ingresados */

import java.util.Stack;
import java.util.Scanner;
public class reversePolish{
  public static void main (String[]args){
    Scanner scan = new Scanner(System.in);
    System.out.print("Ingrese la cadena deseada: ");
    String string = scan.nextLine();
    System.out.println(string);
    Stack<String> myStack = new Stack<String>();
    verification(string,myStack);
    for (String s : string.split(" ")) { // el metodo split nos permite separar un string
      System.out.println("valor split de : " + s);
      operation(s, myStack);
    }
    System.out.println(myStack.peek());

  }

  public static void print(Stack<String> myStack) { // imprimir la pila 
    for (int i = myStack.size() - 1; i >= 0; i--) {
      System.out.println(myStack.get(i));
    }  
  }
  private static String verification (String s,Stack<String> myStack){
    if(!s.equals("")){
      operation(s, myStack);
    }

    return "No se aceptan cadenas vacias";
  }

  private static void  operation (String s , Stack<String> myStack) {
    System.out.println("valor de s: " + s);
    myStack.add(s);

    int first = 0;
    int second = 0;
    if(myStack.peek().equals("+")){
      myStack.pop();
      first = Integer.parseInt(myStack.peek());
      myStack.pop();
      second = Integer.parseInt(myStack.peek());
      myStack.pop();
      print(myStack);
      myStack.add(String.valueOf(first + second));
    }
    if(myStack.peek().equals("-")){
      myStack.pop();
      first = Integer.parseInt(myStack.peek());
      myStack.pop();
      second = Integer.parseInt(myStack.peek());
      myStack.pop();
      print(myStack);
      myStack.add(String.valueOf(first - second));
    }
    if(myStack.peek().equals("*")){
      myStack.pop();
      first = Integer.parseInt(myStack.peek());
      myStack.pop();
      second = Integer.parseInt(myStack.peek());
      myStack.pop();
      print(myStack);
      myStack.add(String.valueOf(first * second));
    }
    if(myStack.peek().equals("/")){
      myStack.pop();
      first = Integer.parseInt(myStack.peek());
      myStack.pop();
      second = Integer.parseInt(myStack.peek());
      myStack.pop();
      print(myStack);
      myStack.add(String.valueOf(second / first));
    }

    System.out.println("valor de first: " + first + ", vlaor de second: " + second);
    System.out.println("Metood operation: " + myStack.peek());
  }
}

