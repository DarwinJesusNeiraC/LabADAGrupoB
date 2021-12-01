/*
 * @Autor: Darwin Jesus Neira Carrasco
 * @Email: dneirac@unsa.edu.pe
 * @Descripcion: En este programa se pide calcular la cantidad de caminos disponibles para llegar a cierto punto 
 * en un arreglo bidimencional, se estacle como piedra = -2 y como camino donde se puede caminar como 1, este valor
 * puede aumentar si es que hay más de un camino con rutas similares
 */

public class uniquePath{
  public static void main (String[]args){
    int [][] obstacleGrid = new int [3][3];
    table(obstacleGrid);
    print(obstacleGrid);
    convert(obstacleGrid);
    print(obstacleGrid);
    System.out.println("caminos: " + uniquePathsWithObstacles(obstacleGrid));
          
  }
  public static int uniquePathsWithObstacles(int[][] obstacleGrid) {
    int x = obstacleGrid.length;
    int y = obstacleGrid[0].length;
    int [][] all = new int [x][y];
    
    // en caso la posicion de destino este con una piedra
    if(obstacleGrid[x-1][y-1] == -2){
      return 0;
    }   

    //  llenado fila
    for (int i = 0; i < y; i++) {
      if(obstacleGrid[0][i] == -2){
        break; // mediante esto se evita seguir ,cuando se tiene una pidra en el camino
      }
      else{
        all[0][i] = 1;
      }
    }
    // llenado colummna
    for (int i = 0; i < x; i++) {
       if(obstacleGrid[i][0] == -2){
        break;// mediante esto se evita seguir ,cuando se tiene una pidra en el camino
      }
      else{
        all[i][0] = 1;
      }     
    }

    // esto sera el llenaod par las posiciones de i >=1 & j >=1
    for (int i = 1; i < x; i++) {
      for (int j = 1; j < y; j++) {
        if(obstacleGrid[i][j] == -2){
          System.out.println("uno de los antiguos es -2");
          continue;
        }

        if(all[i-1][j] != -1 && all[i][j-1] != -1){
          System.out.println("ninguno de mis anteriores es una piedra");
          all[i][j] = all[i-1][j] + all[i][j-1];
        }
        if(all[i-1][j] == -2){
          System.out.println("en mi fila anterior hay una piedra");
          all[i][j] = all[i][j-1];
        }
        if(all[i][j-1] == -2){
          System.out.println("en mi columna anterior hay una piedra");
          all[i][j] = all[i-1][j];
        }
        print(all);
      }
    }

    System.out.println("posicion i: " + (x-1) + " j: " + (y-1));
    System.out.println(all[x-1][y-1]);

    return all[x-1][y-1];

  }

  // seccion para poner las piedras durante el desarrollo
  public static void table(int [][] all){
    // definimos la piedra con un valor de -2
    //all[0][1] = -2; 
    all[1][1] = 1;//-2; 
    //all[1][0] = 1;//-2; 
    //all[1][2] = 1;//-2; 
  }

  // se establecioeron parametros personales para el desarrollo del problema, y se modifica la entrada dada por la pagina
  public static void  convert(int [][] obstacleGrid){
    for (int i = 0; i < obstacleGrid.length; i++) {
      for (int j = 0; j < obstacleGrid[i].length; j++) {
        if(obstacleGrid[i][j] == 1){
          obstacleGrid[i][j] = -2;
        }
      }
    }
  }

  // usado para el seguimiento del llenado y verificacion de datos
  public static void print(int [][] all){
    for (int i = 0; i < all.length; i++) {
      System.out.println();
      for (int j = 0; j < all[i].length; j++) {
        System.out.print(all[i][j] + "\t");
      }
    }
    System.out.println();
  }
}

