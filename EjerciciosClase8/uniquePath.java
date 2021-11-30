public class uniquePath{
  public static void main (String[]args){
    int [][] obstacleGrid = new int [1][2];
    table(obstacleGrid);
    print(obstacleGrid);
    System.out.println("caminos: " + uniquePathsWithObstacles(obstacleGrid));
          
  }
  public static int uniquePathsWithObstacles(int[][] obstacleGrid) {
    int x = obstacleGrid.length;
    int y = obstacleGrid[0].length;
    int [][] all = new int [x][y];
    for (int i = 0; i < obstacleGrid.length; i++) {
      for (int j = 0; j < obstacleGrid[i].length; j++) {
        System.out.println("posicion i: " + i + " j: " + j );
        if(i == 0 && obstacleGrid[i][j] == -2){
          System.out.println("roto, valor j : " + j);
          break;
        }
        if(i == 0){
          all[i][j] = 1;
        }
        if(j == 0){
          all[i][j] = 1;
        }

        if(i >= 1 && j >= 1){
          System.out.println("ya no estoy en la primera fila");
          if(obstacleGrid[i][j] == -2){
            if(obstacleGrid[i-1][j] == -2){
              continue;
            }
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
        }

        print(all);
      }
    }
    //print(all);
    return all[x-1][y-1];

  }

  public static void table(int [][] all){
    // definimos la piedra con un valor de -2
    all[0][1] = -2; 
    //all[0][1] = -2; 
    //all[1][2] = -2; 
  }

  public static void print(int [][] all){
    for (int i = 0; i < all.length; i++) {
      System.out.println();
      for (int j = 0; j < all.length; j++) {
        System.out.print(all[i][j] + "\t");
      }
    }
    System.out.println();
  }
}

