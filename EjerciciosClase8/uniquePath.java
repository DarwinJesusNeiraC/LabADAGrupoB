public class uniquePath{
  public static void main (String[]args){
    int [][] obstacleGrid = new int [3][2];
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
        if(i >= 1 && j >= 1){ // esta condicion sera quitada ya que no es nesearia
          System.out.println("ya no estoy en la primera fila");
          if(obstacleGrid[i][j] == -2){
            if(obstacleGrid[i-1][j] == -2){
              continue;
            }
            continue;
          }
          if(obstacleGrid[i-1][j] == -2){
            System.out.println("mi anterior es un -2");
            all[i][j] = 0;
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

    System.out.println("posicion i: " + (x-1) + " j: " + (y-1));
    System.out.println(all[x-1][y-1]);

    return all[x-1][y-1];

  }

  public static void table(int [][] all){
    // definimos la piedra con un valor de -2
    //all[0][1] = -2; 
    all[1][1] = 1;//-2; 
    all[1][0] = 1;//-2; 
    //all[1][2] = 1;//-2; 
  }
  public static void  convert(int [][] obstacleGrid){
    for (int i = 0; i < obstacleGrid.length; i++) {
      for (int j = 0; j < obstacleGrid[i].length; j++) {
        if(obstacleGrid[i][j] == 1){
          obstacleGrid[i][j] = -2;
        }

      }

    }
  }

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
