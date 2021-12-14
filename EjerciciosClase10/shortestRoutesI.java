/*
 * @Autor: Darwin Jesus Neira Carrasco
 * @Email: dneirac@unsa.edu.pe
 * @Descripcion: 
 */

import java.util.*;

public class shortestRoutesI{
  public static void main (String[]args){
    Scanner scan = new Scanner(System.in);
    int n = scan.nextInt();
    int m = scan.nextInt();
    int [][] arr = new int [n][n];
    for (int i = 0; i < m; i++) {
      int x = scan.nextInt();
      int y = scan.nextInt();
      int length = scan.nextInt();
      arr[x-1][y-1] = length;
      arr[y-1][x-1] = length;
    }
    print(arr);
  }

  public static int mincost(int [][] arr){
    int n = 0; // suma
    for (int i = 0; i < arr.length; i++) {
      for (int j = 0; j < arr.length; j++) {
        n = ;
        
      }
    }    
    return 0;
  }

  min

  public static void print(int [][] arr){
    for (int i = 0; i < arr.length; i++) {
      for (int j = 0; j < arr.length; j++) {
        System.out.print(arr[i][j] + "\t");
      }      
      System.out.println();
    }

  }
}

