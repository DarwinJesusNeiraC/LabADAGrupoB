import java.util.*;

public class Ejercicio1{
  public static void main (String[]args){
    Scanner scan = new Scanner(System.in);
    int n  = scan.nextInt(), k = scan.nextInt(), rpta = 0;
    for (int i = 0; i < n; i++) {
      System.out.println("ingrese numero");
      int ingreso = scan.nextInt();
      if(ingreso % k == 0)
        rpta++;
    }
    System.out.println("respuesta: "+ rpta);
  }
}

