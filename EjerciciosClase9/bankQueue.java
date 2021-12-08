/*
 * @Autor: Darwin Jesus Neira Carrasco
 * @Email: dneirac@unsa.edu.pe
 * @Descripcion: 
 */

import java.util.Scanner;
public class bankQueue{
  public static class client{
    protected int money;
    protected int time;

    public client(int money, int time){
      this.money = money;
      this.time = time;
    }

    @Override
    public String toString() {
        // TODO Auto-generated method stub
        return money +  " : " + time;
    }
  }
  public static void main (String[]args){
    Scanner scan = new Scanner(System.in);

    int N = scan.nextInt(); // perosnas en la cola
    int T = scan.nextInt(); // timpo que estan dispuestos a esperar
    client [] arr = new client[N];
    int [][] intarr = new int [T][N];

    for (int i = 0; i < arr.length; i++) {
      int money = scan.nextInt();
      int time = scan.nextInt();
      arr[i] = new client(money, time);
    }

    /*for (client client : arr) {
      System.out.println(client);
    }*/

    for (int i = 0; i < arr.length; i++) {
      //System.out.println("valor de arr[i] : " + arr[i].time);
      intarr[arr[i].time][i] = arr[i].money;
    }  
    //print(intarr);
    int x = 0;
    for (int i = 0; i < intarr.length; i++) {
      int max = intarr[i][0];
      for (int j = 1; j < intarr[0].length; j++) {
        max = Math.max(max, intarr[i][j]);
      }      
      x += max;
    }
    System.out.println(x);
  }
  public static void print(int [][] intarr){
    for (int i = 0; i < intarr.length; i++) {
      for (int j = 0; j < intarr[0].length; j++) {
        System.out.print(intarr[i][j] + "\t");
      }
      System.out.println();
    }
  }
}

