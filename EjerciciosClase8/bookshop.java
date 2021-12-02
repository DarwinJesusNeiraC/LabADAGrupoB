/*
 * @Autor: Darwin Jesus Neira Carrasco
 * @Email: dneirac@unsa.edu.pe
 * @Descripcion: Uso de programacion dinamica, para la compra de libros, dara como resultado la cantidad
 * de paginas que tendremos como tal.
 */

import java.util.*;
public class bookshop {
  public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);

    int n = scan.nextInt();
    int x = scan.nextInt();

    int [] price = new int [n + 1];    
    int [] pages = new int [n + 1];
    price[0] = 0;
    pages[0] = 0;
    for(int i = 1; i < price.length; i++) {
      price[i] = scan.nextInt();
    }
    for(int i = 1; i < pages.length; i++) {
      pages[i] = scan.nextInt();
    }
    int [][] tabla = new int [price.length][x+1];
    //imprimir(tabla_de_valores,money);
    llenado(tabla, price,pages);
    System.out.println(tabla[price.length-1][x]);
  }
  public static void llenado(int [][] tabla,int [] price,int [] pages) {
    for (int i = 1; i < tabla.length; i++) { // como en la fila y columna 0 estan los casos base no se toman cuenta
      for (int j = 1; j < tabla[i].length; j++) { // entonces ambos for empiezan en 1
        //System.out.println("valor de a = "+i+"\tvalor de b = "+j); // para el seguimiento de la tabla
        if(price[i]>j){ // se hace una comparación de si el valor del libro es mayor a la cantidad que se desea cambiar en ese momento
          tabla[i][j] = tabla[i-1][j]; // si es mayor se tomara el anterior debido a que es el caso en el que se usa la mayor cantidad
        } 
        else{ // caso contrario
          tabla[i][j] = Math.max(tabla[i-1][j], tabla[i-1][j-price[i]] + pages[i]); 
        }
        //imprimir(tabla,money); // para el seguimiento del arreglo
        //System.out.println("*--------------------------------------------------------------------------------------------*"); // para poder ver mejor la diferenia entre las tablas
      } 
    }
  }

  public static void imprimir(int [][] tabla,int [] money) {
    System.out.print("         ");
    for (int i = 0; i < tabla[0].length; i++) {
      System.out.print(i+" \t");			
    }
    for (int i = 0; i < money.length; i++) {
      System.out.print("\n"+(money[i])+"\t");
      for (int j = 0; j < tabla[i].length; j++) {
        if(tabla[i][j] == Double.POSITIVE_INFINITY) {
          System.out.print("inf\t");
        }
        else {
          System.out.print(tabla[i][j]+"\t");
        }
      }
      System.out.println();
    }
  } 
}
