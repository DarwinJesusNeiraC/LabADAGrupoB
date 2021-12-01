import java.util.*;
public class longestSubsequence{
  public static void main (String[]args){
    int [] nums = {10,9,2,5,3,7,101,18};
    //int [] nums = {7,7,7,7,7,7,7};
    //int [] nums = {0,1,0,3,2,3};
    System.out.println("la cadena más larga es de : " + lengthOfLIS(nums));

  }

  public static int lengthOfLIS(int[] nums){
    int n = nums.length;
    int [][] all = new int [n][n];
    int [] cant = new int [n];

    for (int i = 0; i < all.length; i++) {
      all[i][0] = nums[i];
      cant[i] += 1;
    }
    for (int i = 0; i < all.length-1; i++) {
      for (int j = i+1; j < all[i].length; j++) {
        if(nums[i] < nums[j]){
          System.out.println("mayor " + nums[j]);
          all[i][j] = nums[j];
          cant[i] += 1;
        }
        for (int k : cant) {
          System.out.println(k);
        }
        if(j > 1 && j < all[i].length-1){
          if(all[i][j-1] == nums[j]){
            continue;
          }
          if(all[0][0] == nums[j]){
            continue;
          }
          if(all[i][j-1] > nums[j]){
            System.out.println("anterior");
            all[i][j-1] = nums[j];
            all[i][j] = 0;
            cant[i] -= 1;
          }
        }
        else {
          if(j > 1 &&  all[i][j-1] > nums[j]){
            all[i][j] = 0;
            cant[i] -= 1;
          }
        }      
      }
    }
    print(all);
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

