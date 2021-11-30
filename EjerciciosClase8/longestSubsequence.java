import java.util.*;
public class longestSubsequence{
  public static void main (String[]args){
    int [] arr = {10,9,2,5,3,7,101,18};
    int n = arr.length;
    int [][] all = new int [n][n];

    for (int i = 0; i < all.length; i++) {
      all[i][0] = arr[i];
    }

    for (int i = 0; i < all.length-1; i++) {
      for (int j = i+1; j < all[i].length; j++) {
        if(arr[i] < arr[j]){
          all[i][j] = arr[j];
        }

        if(all[i][j] > arr[j]){
          all[i][j] = arr[j];
        }

      }      
    }
    print(all);
  }

  public static void print(int [][] all){
    for (int i = 0; i < all.length; i++) {
      System.out.println();
      for (int j = 0; j < all.length; j++) {
        System.out.print(all[i][j] + "  ");
      }
    }
    System.out.println();
  }

}

