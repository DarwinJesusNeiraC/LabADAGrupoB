/*
 * @Autor: Darwin Jesus Neira Carrasco
 * @Email: dneirac@unsa.edu.pe
 * @Descripcion: 
 */
import java.util.*;
public class shortestRoutesII{
  static final double inf = 1e18;
  public static void main (String[]args){
    Scanner scan = new Scanner(System.in);
    int n = scan.nextInt();
    int m = scan.nextInt();
    int q = scan.nextInt();
    int [][] arr = new int [n+1][n+1];
    fillIn(arr);
    for (int i = 0; i < m; i++) {
      int a = scan.nextInt();
      int b = scan.nextInt();
      int c = scan.nextInt();
      arr[a][b] = Math.min(arr[a][b], c);
      arr[b][a] = Math.min(arr[b][a], c);
    }
    for (int i = 0; i < arr.length; i++) {
      arr[i][i] = 0;
    }
    //System.out.println();
    //print(arr);
    for (int k = 1; k <= n; k++) {
      for (int i = 1; i <= n; i++) {
        for (int j = 1; j <= n; j++) {
          arr[i][j] = Math.min(arr[i][j], (arr[i][k] + arr[k][j]));
        }        
      }
    }
    //System.out.println();
    //print(arr);

    for (int i = 0; i < q; i++) {
      int a = scan.nextInt();
      int b = scan.nextInt();
      if(arr[a][b] >= 0x3f){
        System.out.println("-1");
      }
      else{
        System.out.println(arr[a][b]);
      }
    }
  }

  public static void fillIn(int [][] arr){
    for (int i = 0; i < arr.length; i++) {
      for (int j = 0; j < arr.length; j++) {
        arr[i][j] = 0x3f;//(int) Double.POSITIVE_INFINITY;
      }      
    }
  }

  public static void print(int [][] arr){
    for(int i = 0; i < arr.length; i++){
      for (int j = 0; j < arr.length; j++) {
        System.out.print(arr[i][j] + "\t");
      }
      System.out.println();
    }

  }
}

