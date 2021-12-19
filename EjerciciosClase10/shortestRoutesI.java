/*
 * @Autor: Darwin Jesus Neira Carrasco
 * @Email: dneirac@unsa.edu.pe
 * @Descripcion: 
 */

import java.util.*;

public class shortestRoutesI{
  public static class Arista {
    protected int conection;
    protected int w;
    //protected LinkedList<Arista> arr;

    public Arista(){
      this(0,0);
    }
    public Arista(int conection, int w){
      this.conection = conection;
      this.w = w;
      //arr = new LinkedList<>();
    }
  }
  public static class Node implements Comparable{
    protected int distance;
    protected int indice;
    public Node (int indice, int distance){
      this.indice = indice;
      this.distance = distance;
    }
    @Override
    public int compareTo(Object o) {
        Node x = (Node) o;
        if(this.distance > x.distance)
          return 0;
        else{
          return -1;
        }
    }
  }

  public static void main (String[]args){
    Scanner scan = new Scanner(System.in);
    int n = scan.nextInt();
    int m = scan.nextInt();
    //Arista [] conectando = new Arista[n+1];
    LinkedList<Arista> [] conectando = new LinkedList[n+1];
    int [] distancias = new int [n+1];
    for (int i = 0; i < distancias.length; i++) {
      distancias[i] = 0x3f;
      conectando[i] = new LinkedList<Arista>();
    }

    distancias[1] = 0;
    PriorityQueue<Node>  data = new PriorityQueue<Node>(); 
    for (int i = 0; i < m; i++) {
      int x = scan.nextInt();
      int y = scan.nextInt();
      int length = scan.nextInt();
      conectando[x].add(new Arista(y, length));
    }

    data.add(new Node(1, 0));
    while(!data.isEmpty()){
      int d = data.peek().distance;
      int u = data.peek().indice;
      data.poll();
      if(d > distancias[u]){
        continue;
      }

      for(Arista a : conectando[u]){
        int x = (d + a.w);
        if(distancias[a.conection] > x){
          distancias[a.conection] = x;
          data.add(new Node(a.conection, x));
        }
      }
    }

    for (int i = 1; i <= n; i++) {
      System.out.print(distancias[i] + " ");
    } 
  }
}

