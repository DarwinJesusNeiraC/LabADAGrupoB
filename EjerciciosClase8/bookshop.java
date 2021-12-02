/* Dar el menor cambio usando monedas de 5,,1,0.
   1. Se le pide diseñar e implementar los siguientes algoritmos para resolver el problema planteado:
   a. Un algoritmo basado en recursividad.
   b. Un algoritmo basado en programación dinámica.
   2. Compare la eficiencia de ambos algoritmos y describa las observaciones de dicha comparación. 
   */
import java.util.*;
public class bookshop {
  public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);
    /*System.out.print("Ingrese la cantidad a con la que va a pagar: ");
    double pago = scan.nextInt();
    System.out.print("Ingrese el precio del objetoa pagar: ");
    double precio = scan.nextDouble();*/
    //double v = pago - precio;
    int [] money = {0,3,4,5,8};    
    int [] pages = {0,1,5,8,12};    
    double [][] tabla_de_valores = new double [money.length][10+1];
    //double [][] tabla_de_valores = new double [money.length][8+1];
    llenado_casosbase(tabla_de_valores, money);
    imprimir(tabla_de_valores,money);
    llenado(tabla_de_valores, money,pages);
    int [] valor = new int [money.length];
    comparador(tabla_de_valores, valor, money);
    for (int i = 0; i < valor.length; i++) {
      System.out.println(valor[i]+" moneda de valor "+money[i]);
    }
  }
  public static void cambio(int i,int j, double [][] tabla, int [] money, int [] pages) {
    if(money[i]>j){ // se hace una comparación de si el valor de la moneda es mayor a la cantidad que se desea cambiar en ese momento
      tabla[i][j] = tabla[i-1][j]; // si es mayor se tomara el anterior debido a que es el caso en el que se usa la menor cantidad de monedas posible
    } 
    else{ // caso contrario
      //tabla[i][j] = Math.min(tabla[i-1][j], tabla[i][j-money[i]]+1); 
      tabla[i][j] = Math.max(tabla[i-1][j], tabla[i-1][j-money[i]]+pages[i]); 
      /*lo que se hara sera comparar si es que el valor anterior sin usar la moneda es menor 
        al caso donde si se usara(debido a que se usara la moneda se aumenta el +1)*/
    }
  }
  public static void llenado(double [][] tabla,int [] money,int [] pages) {
    for (int i = 1; i < tabla.length; i++) { // como en la fila y columna 0 estan los casos base no se toman cuenta
      for (int j = 1; j < tabla[i].length; j++) { // entonces ambos for empiezan en 1
        System.out.println("valor de a = "+i+"\tvalor de b = "+j); // para el seguimiento de la tabla
        cambio(i, j, tabla, money,pages);
        imprimir(tabla,money); // para el seguimiento del arreglo
        System.out.println("*--------------------------------------------------------------------------------------------*"); // para poder ver mejor la diferenia entre las tablas
      } 
    }
  }
  public static void llenado_casosbase(double [][] tabla,int []money) {
    for (int i = 0; i < tabla.length; i++) {
      for (int j = 0; j < tabla[i].length; j++) {
        if(i == 0 && j > 0) {
          tabla[i][j] = 0;
        }
        if(j == 0) {
          tabla[i][j] = 0;
        }
      }
    }
  }
  public static void imprimir(double [][] tabla,int [] money) {
    System.out.print("         ");
    for (int i = 0; i < tabla[0].length; i++) {
      System.out.print(i+" \t");			
    }
    for (int i = 0; i < money.length; i++) {
      System.out.print("\n"+(money[i])+"\t");
      for (int j = 0; j < tabla[i].length; j++) {
        if(tabla[i][j] == Double.POSITIVE_INFINITY) {
          System.out.print("inf\t");
        }
        else {
          System.out.print(tabla[i][j]+"\t");
        }
      }
      System.out.println();
    }
  } 
  public static void comparador(double [][] tabla,int [] valor, int [] money) {
    //En valor se guardan la cantidad de veces que se han usado 
    int i = tabla.length - 1;
    int j = tabla[0].length - 1;
    //System.out.println("\n"+i); 
    //System.out.println("\n"+j);
    while(i>0){ 
      if(tabla[i][j] == tabla[i-1][j]){ //comparacion si los valores actual es igual al de una fila atras pero en la misma columna se subiremos una poscion en las filas 
        i--;
      }
      else{ //si son diferentes
        valor[i]++;  //en la poscion que sea igual a la fila se aumentara en 1 si se utiliza
        j -= money[i];  // nos moveremso en las columnas  descontaremos el valor de la moneda que hemos usado
        i--;
      }
    }
  }
}
