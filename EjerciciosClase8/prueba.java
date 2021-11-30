public class prueba{
  public static void main (String[]args){
    for(int i = 0; i < 4; i++){
      System.out.println("i: "+ i);
      for(int j = 0; j < 4; j++){
        if(j == 2 && i == 1){
          break;
        }
        System.out.println(" j: " + j);
      }
    }
  }
}
