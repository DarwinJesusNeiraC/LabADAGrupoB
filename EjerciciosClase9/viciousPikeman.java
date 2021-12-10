/*
 * @Autor: Darwin Jesus Neira Carrasco
 * @Email: dneirac@unsa.edu.pe
 * @Descripcion: 
 */

import java.util.Scanner;
import java.util.Arrays;
public class viciousPikeman{
  public static void main (String[]args){
    Scanner scan = new Scanner(System.in);
    int N = scan.nextInt();
    int T = scan.nextInt();
    int [] t = new int [N];
    int A = scan.nextInt();
    int B = scan.nextInt();
    int C = scan.nextInt();
    t[0] = scan.nextInt();

    for (int i = 1; i < t.length; i++) {
      t[i] = ( ( (A * t[i-1]) + B) % C ) + 1;
    }

    // seguimiento
    /*for (int i : t) {
      System.out.println(i);
    }*/

    Arrays.sort(t); // como pikeman escoge el problema que más les convenga, pondremos la cantidad de los tiempos
    // en orden de menor a mayor 
    
    // seguimiento
    /*for (int i : t) {
      System.out.println(i);
    }*/

    int tp = 0; // tiempo de penalizacion por ejercicio
    int exercise = 0; // cantidad de ejercicios hechos
    int p = 0; // tiempo donde almancerameos el tiempo total de penalizacion

    for (int i = 0; i < N; i++) {
      if((tp + t[i]) <=  T) {
        tp += t[i];
        p += tp% 1000000007;
        exercise++;
      }
      else{
        break;
      }
    }

    System.out.println(exercise + " " + p);
  }


}

