public class Node<T> { // Clase generica 

  // Atributos 
  protected T data;  // informacion del node
  protected Node<T> next; // referencia a un siguiente

  // Constructor de la clase 
  public Node(T data) {
    this.data = data;
    this.next = null;
  }

}

