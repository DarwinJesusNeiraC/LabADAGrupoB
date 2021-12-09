/*
 * @Autor: Darwin Jesus Neira Carrasco
 * @Email: dneirac@unsa.edu.pe
 * @Descripcion: Para una cola de banco se quiere atender a los cliente que generen mayor ganancia la banco
 * pero estos tienen un tiempo de tolentacia en la fila, despues de este se iran.Mediante el siguiente programa
 * se dara a conocer el valor maximo que ganara el banco
 */

import java.util.Scanner;

public class bankQueue{
  // se creo esta clase dado que en el problema se nos dice que se nos dara informacion ci y time
  // N veces, y es más facil poner en un clase
  public static class client {
    // se cuenta con los atributos money y time los cuales representan a ci y ti
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

    // mediante el arreglo de arr se guardara los clientes
    client [] arr = new client[N];
    // en maximos se guardaran los valor maximo de cada cliente segun su time 
    int [] maximos = new int [T];

    // entrada de datos para cada cliente
    for (int i = 0; i < N ; i++) {
      int money = scan.nextInt();
      int time = scan.nextInt();
      arr[i] = new client(money, time);
    }

    // seguimiento
    /*for (client client : arr) {
      System.out.println(client);
    }*/

    sort(arr);
    // seguimiento
    /*System.out.println("despues del sort");

    // seguimiento
    for (client client : arr) {
      System.out.println(client);
    }*/

    for(int i = 0; i < arr.length; i++){
      int y = arr[i].time;
    // seguimiento
      //System.out.println("valor de y: " + y);
      //buscamos si en maximos ya esta ocupado el lugar en caso no, lo ocupamos
      while(y >= 0){
        if(maximos[y] == 0){
          maximos[y] = arr[i].money;
          break;
        }
        y--;
      }
    }
    // seguimiento
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

  // el propocito de este metodo es poder ordenar el arreglo segun el dinero de la gente
  // esto porque el banco quiere ganar lo más posible
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

