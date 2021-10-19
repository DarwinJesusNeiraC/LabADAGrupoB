/*Alumno: Darwin Jesus Neira Carrasco
 *Descripcion: Encontrar el elemento max de un arreglo, teniendo un tiempo de O(n)*/
public class greastestNumber{
  public static void main (String[]args){
    int [] arr = {2,34,5,62,5};
    System.out.println(greastestNumber(arr));
  }

  public static int greastestNumber(int [] array){
    int value = array[0];
    for (int i = 1; i < array.length; i++) {
      if(value < array[i]){
        value = array[i];
      }
    }
    return value;
  }
}

