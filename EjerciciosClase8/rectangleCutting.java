/*
 * @Autor: Darwin Jesus Neira Carrasco
 * @Email: dneirac@unsa.edu.pe
 * @Descripcion: Dando la cantidad min de cortes, para que un rectangulo este dividido en cuadrados
 */

import java.util.*;
public class rectangleCutting{
  public static void main (String[]args){
    Scanner scan = new Scanner(System.in);
    // introduccion de los datos
    int a = scan.nextInt();
    int b = scan.nextInt();

    int [][] table = new int [a][b];
    fillIn(table);

    for (int i = 0; i < table.length; i++) {
      for (int j = 0; j < table[i].length; j++) {
        if(i == j){// si el valor i es igual a j, se establecerea como 0 dado que ya es un cuadrado
          table[i][j] = 0;
        }
        // en caso sea distinto
        else {
          // recorremos cada uno de los posibles cortes que se puedan hacer en horizontal y vertical
          // horizontal
          for (int x = 0; x < i; x++) { 
            // calculando el min entre el valor actual de table
            // con el valor de 1 + table[i - x - 1][j] + table[x][j]
            table[i][j] = Math.min(table[i][j], 1 + table[i - x - 1][j] + table[x][j]);
          }
          // vertical
          for (int y = 0; y < j; y++) {
            table[i][j] = Math.min(table[i][j], 1 + table[i][j - y - 1] + table[i][y]);
          }
        }
      }
    }
    System.out.println(table[a-1][b-1]);
  }

  // llenado de la tabla
  private static void fillIn(int [][] table){
    for (int i = 0; i < table.length; i++) {
      for (int j = 0; j < table[i].length; j++) {
        table[i][j] = (int) Double.POSITIVE_INFINITY;
      }
    }
  }
}

