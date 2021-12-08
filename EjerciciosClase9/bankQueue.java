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

    int N = scan.nextInt();
    int T = scan.nextInt();
    client [] arr = new client[N];

    for (int i = 0; i < arr.length; i++) {
      int money = scan.nextInt();
      int time = scan.nextInt();
      arr[i] = new client(money, time);
    }

    for (client client : arr) {
      System.out.println(client);
    }

    for (int i = 0; i < arr.length; i++) {
      if(arr[i].time == i){
        int max = arr[i].money;
      }
    }  
  }
}

