import java.util.*;
public class longestSubsequence{
  public static void main (String[]args){
    //int [] nums = {10,9,2,5,3,7,101,18};
    //int [] nums = {7,7,7,7,7,7,7};
    //int [] nums = {0,1,0,3,2,3};
    //int [] nums = {4,10,4,3,8,9};
    int [] nums = {1,3,6,7,9,4,10,5,6};
    System.out.println("la cadena más larga es de : " + lengthOfLIS(nums));

  }

  public static int lengthOfLIS(int[] nums){
    int n = nums.length;
    int [] cant = new int [n];
    for (int i = 0; i < cant.length; i++) {
      cant[i] = 1;
    }

    for (int i = 0; i < n-1; i++) {
      for (int j = i+1; j < n; j++) {
        if(nums[i] < nums[j]){
          cant[j] = Math.max(cant[j], cant[i] + 1);
        }
        else{
          continue;
        }
      }      
    }
    for (int i : cant) {
      System.out.println(i);
    }
    int u = cant[0];
    for (int i = 1; i < cant.length; i++) {
      u = Math.max(u, cant[i]);
    }
    return u;

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

