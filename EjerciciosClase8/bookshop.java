import java.util.*;
public class bookshop {
  public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);

    int n = scan.nextInt();
    int x = scan.nextInt();

    int [] money = new int [n + 1];    
    int [] pages = new int [n + 1];
    money[0] = 0;
    pages[0] = 0;
    for(int i = 1; i < money.length; i++) {
      money[i] = scan.nextInt();
    }
    for(int i = 1; i < pages.length; i++) {
      pages[i] = scan.nextInt();
    }
    //int [] money = {0,3,4,5,8};    
    //int [] pages = {0,1,5,8,12};    
    int [][] tabla_de_valores = new int [money.length][x+1];
    //double [][] tabla_de_valores = new double [money.length][8+1];
    //imprimir(tabla_de_valores,money);
    llenado(tabla_de_valores, money,pages);
    //int [] valor = new int [money.length];
    //comparador(tabla_de_valores, valor, money);
    /*for (int i = 0; i < valor.length; i++) {
      System.out.println(valor[i]+" moneda de valor "+money[i]);
    }*/
    /*int result = 0;
    for (int i = 0; i < valor.length; i++) {
      if(valor[i] == 0){
        continue;
      }
      else {
        result += valor[i] * pages[i];
      }
    }*/
    System.out.println(tabla_de_valores[money.length-1][x]);
  }
  public static void llenado(int [][] tabla,int [] money,int [] pages) {
    for (int i = 1; i < tabla.length; i++) { // como en la fila y columna 0 estan los casos base no se toman cuenta
      for (int j = 1; j < tabla[i].length; j++) { // entonces ambos for empiezan en 1
        //System.out.println("valor de a = "+i+"\tvalor de b = "+j); // para el seguimiento de la tabla
        //cambio(i, j, tabla, money,pages);
        if(money[i]>j){ // se hace una comparación de si el valor de la moneda es mayor a la cantidad que se desea cambiar en ese momento
          tabla[i][j] = tabla[i-1][j]; // si es mayor se tomara el anterior debido a que es el caso en el que se usa la menor cantidad de monedas posible
        } 
        else{ // caso contrario
          tabla[i][j] = Math.max(tabla[i-1][j], tabla[i-1][j-money[i]] + pages[i]); 
          /*lo que se hara sera comparar si es que el valor anterior sin usar la moneda es menor 
            al caso donde si se usara(debido a que se usara la moneda se aumenta el +1)*/
        }
        //imprimir(tabla,money); // para el seguimiento del arreglo
        //System.out.println("*--------------------------------------------------------------------------------------------*"); // para poder ver mejor la diferenia entre las tablas
      } 
    }
  }

  public static void imprimir(int [][] tabla,int [] money) {
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
}
