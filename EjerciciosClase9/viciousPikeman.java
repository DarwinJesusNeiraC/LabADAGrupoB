/*
 * @Autor: Darwin Jesus Neira Carrasco
 * @Email: dneirac@unsa.edu.pe
 * @Descripcion: 
 */

import java.util.Scanner;
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

    int tp = 0; // tiempo de penalizacion
    int exercise = 0; // cantidad de ejercicios hechos
    for (int i = 0; i < N; i++) {
      if( (tp  + t[i])  <=  T) {
        tp = (tp + t[i]);
        tp = tp % 1000000007;
        exercise++;;
      }
      else{
        break;
      }
    }

    System.out.println(exercise + " " + tp);

  }
}

