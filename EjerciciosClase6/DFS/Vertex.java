public class Vertex<E>{
  // En esta clase estaran los vertices del grafo

  // Atributos
  protected E data; // informacion del vertice
  protected LinkedList<Edge<E>> listAdyacente;  // lista de los elementos con los que esta conectado
  protected int shortdistance; // distacia minima usado para Dijktra

  protected int label;  // 0 = no explorado, 1 = visitado
  

  // Constructor
  public Vertex(E data){
    this.data = data; 
    this.listAdyacente = new LinkedList<>();
  }

  // Este metodo nos servira para la comparacion
  @Override
  public boolean equals(Object obj) {
    // TODO Auto-generated method stub
    if(obj instanceof Vertex<?>) { // Si no se pone de esta manera dara error por el tipo de gerecidad 
      Vertex<E> vertice = (Vertex<E>) obj;
      return this.data.equals(vertice.data);
    }
    return false;
  }

  @Override
  public String toString() {
    return this.data + " -> " + this.listAdyacente.toString()+"\n" ;
  }
}

