public class table{
  public static void main (String[]args){
    String [][] arr = new String [6][6];
    inicializar(arr);
    print(arr);
    DFS(arr, 2, 2); // punto de inicio
  }

  // Metodo para inicializacion de los valores de la tabla
  public static void inicializar(String [][] arr){
    for (int i = 0; i < arr.length; i++) {
      for (int j = 0; j < arr.length; j++) {
        if(i == 0){
          arr[i][j] = "#";
        }
        else if(j == 0) {
          arr[i][j] = "#";
        }
        else {
          arr[i][j] = "0";
        }
      }
    }
    arr[5][1] = "#";
    arr[5][2] = "#";
    arr[5][3] = "#";
    arr[1][5] = "#";
    arr[2][5] = "#";
    arr[3][5] = "#";
    arr[4][4] = "#";
  }

  // Imprimiendo la tabla
  public static void print(String [][] arr){
    for (int i = 0; i < arr.length; i++) {
      System.out.println();
      for (int j = 0; j < arr.length; j++) {
        System.out.print(arr[i][j]);
      }
    }
    System.out.println();
  }

  public static void DFS(String [][] arr , int x, int y){
    System.out.println("valor x: " + x + ", valor y: " + y); // seguimiento
    // En caso sea pared
    if(arr[x][y].equals("#")){
      System.out.println("pared");
      return;
    }
    // en caso ya este visitado
    if(arr[x][y].equals("1")){
      System.out.println("Ya revisado");
      return;
    }
    arr[x][y] = "1"; // en caso el valor 0, se actuliza a 1
    print(arr); // impresion del tablero para seguimiento
    // Arria y abajo
    if(arr[x-1][y].equals("0")){
      DFS(arr, x-1, y);
    }
    if(arr[x+1][y].equals("0")){
      DFS(arr, x+1, y);
    }
    // Derecha e Izquierda
    if(arr[x][y-1].equals("0")){
       DFS(arr, x, y-1);
    }
    if(arr[x][y+1].equals("0")){
      DFS(arr, x, y+1);
    }
  }
}

