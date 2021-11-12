public class Edge<E> {

  // Atributos
  protected Vertex<E> referencia;
  protected int peso; // Ponderado, usado para dijkstra

  protected int label;  // 0 = no explorado, 1 = descubierta, 2 = back | cross

  // Constructor
  public Edge(Vertex<E> referencia){ // En caso no sea ponderado
    this(referencia, -1);

  }
  public Edge(Vertex<E> referencia, int peso) { // ponderado
    this.referencia = referencia;
    this.peso = peso;
  }



  @Override
  public boolean equals(Object obj) {
    // TODO Auto-generated method stub
    if(obj instanceof Edge<?>){
      Edge<E> edge = (Edge<E>) obj; // Casteo
      return this.referencia.equals(edge.referencia);
    }
    return false;
  }

  @Override
  public String toString() {
    // TODO Auto-generated method stub
    if(this.peso > -1){
      return referencia.data + " [" +this.peso+ "], " ;
    }
    return referencia.data + ", "; // imprimimos el contenido que guarde esa referencia
  }



}

