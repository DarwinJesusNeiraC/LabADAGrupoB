/*
 * @Autor: Darwin Jesus Neira Carrasco
 * @Email: dneirac@unsa.edu.pe
 * @Descripcion: 
 */

import java.util.Collections;
import java.util.PriorityQueue;
import java.util.Scanner;

public class bankQueue{
  public static class client {
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
    // Collections.reverseOrder() nos permite ordenar la lista de prioridad de mayor a menor

    client [] arr = new client[N];
    //int [][] intarr = new int [T][N];
    int [] maximos = new int [T];

    // entrada de datos para cada cliente
    for (int i = 0; i < N ; i++) {
      int money = scan.nextInt();
      int time = scan.nextInt();
      arr[i] = new client(money, time);
    }

    /*for (client client : arr) {
      System.out.println(client);
    }*/

    sort(arr);
    /*System.out.println("despues del sort");

    for (client client : arr) {
      System.out.println(client);
    }*/

    for(int i = 0; i < arr.length; i++){
      int y = arr[i].time;
      //System.out.println("valor de y: " + y);
      while(y >= 0){
        if(maximos[y] == 0){
          maximos[y] = arr[i].money;
          break;
        }
        y--;
      }
    }
    /*for (int i : maximos) {
      System.out.print(i + ", ");
    }
    System.out.println();*/
    int sum = 0;
    for (int i = 0; i < maximos.length; i++) {
      sum += maximos[i];
    } 
    System.out.println(sum);
  }

  public static void sort(client [] num){
    for (int i = 0; i < num.length - 1; i++) {
      for (int j = 0; j < num.length - 1 ; j++) {
        if(num[j].money < num[j + 1].money){
          int actual = num[j].money;
          int actualT = num[j].time;
          num[j].money = num[j + 1].money;
          num[j].time = num[j + 1].time;
          num[j + 1].money = actual;							
          num[j + 1].time = actualT;							
        }				
      }
    }
  }
}

