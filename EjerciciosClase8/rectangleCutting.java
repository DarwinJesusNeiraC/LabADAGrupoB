/*
 * @Autor: Darwin Jesus Neira Carrasco
 * @Email: dneirac@unsa.edu.pe
 * @Descripcion: 
 */

import java.util.*;
public class rectangleCutting{
  public static void main (String[]args){
    Scanner scan = new Scanner(System.in);
    int a = scan.nextInt();
    int b = scan.nextInt();

    int [][] table = new int [a][b];
    fillIn(table);
    for (int i = 0; i < table.length; i++) {
      for (int j = 0; j < table[i].length; j++) {
        if(i == j){
          table[i][j] = 0;
        }
        else {
          for (int x = 0; x < i; x++) {
            table[i][j] = Math.min(table[i][j], 1 + table[i - x - 1][j] + table[x][j]);
          }
          for (int y = 0; y < j; y++) {
            table[i][j] = Math.min(table[i][j], 1 + table[i][j - y - 1] + table[i][y]);
          }
        }
      }
    }
    System.out.println(table[a-1][b-1]);
  }

  // 
  private static void fillIn(int [][] table){
    for (int i = 0; i < table.length; i++) {
      for (int j = 0; j < table[i].length; j++) {
        table[i][j] = (int) Double.POSITIVE_INFINITY;
      }
    }
  }
}

