public class Graph<E>{

  // Atributos
  protected LinkedList<Vertex<E>> listVertice; // lista de vertices del grafo

  // Constructor
  public Graph() {
    this.listVertice = new LinkedList<>(); // incializacion de la lista 
  }

  // metodo de inserticion de vertices
  public void insertVertex(E data){
    Vertex<E> aux = new Vertex<E>(data); // variable aux de tipo Vertex
    if(this.listVertice.search(aux) != null){ // verificamos que el valor no se entre en la lista
      System.out.println("Elemento ya ingresado con anterioridad");
      return; // este return es neseario para finalizar el metodo
    }
    this.listVertice.insert(aux); // en caso se no este se inserta
  }

  // Como puede ser ponderado o no
  public void insertEdge(E origin, E destini){
    insertEdge(origin, destini, -1);
  }

  // en este caso relacionaremos 2 vertices
  public void insertEdge(E origin, E destini, int peso){ // por lo tanto nesesitaremos 2 datos
    // hacemos la busqueda de los valores en le arreglo de vertices
    Vertex<E> auxOrigin = this.listVertice.search(new Vertex<E>(origin)); 
    Vertex<E> auxDestini = this.listVertice.search(new Vertex<E>(destini));
    
    // en el caso que no exita alguna de los datos
    if(auxOrigin == null || auxDestini == null){
      System.out.println("Ingreso de datos invalido");
      return; // este return es neseario para finalizar el metodo
    }
    // en caso ya esten unidos
    if(auxOrigin.listAdyacente.search(new Edge<E>(auxDestini)) != null){
      System.out.println("Elemento ya ingresado con anterioridad");
      return; // este return es neseario para finalizar el metodo
    }
    // En caso no se cumpla ninguna de lo anteriro se ingresa con normalidad
    // SE inserta a ambos lados
    auxOrigin.listAdyacente.insert(new Edge<E>(auxDestini, peso)); // Se agrega el peso
    auxDestini.listAdyacente.insert(new Edge<E>(auxOrigin, peso));
  }

  @Override
  public String toString() {
    // TODO Auto-generated method stub
    return this.listVertice.toString();
  }

  /**
   * Implementacion de DFS
   * */
  private void initLabel(){ // Este metodo se usara para inicialiar los label de vertices y aristas
    Node<Vertex<E>> aux = this.listVertice.root; // variable aux que sera igual al primer elemento de los vertices del grafo
    while(aux != null) { // recoremos la lista de vertices
      aux.data.label = 0; // incializacion de los label en 0
      Node<Edge<E>> auxEdge = aux.data.listAdyacente.root; // variable aux para los elemento de las listAdyacente de cada vertice
      while(auxEdge != null){ // recoremos
        auxEdge.data.label = 0;
        auxEdge =  auxEdge.next; // avanzamos 
      } 
      aux = aux.next; // avanzamos
    }
  }

  public void DFS(E data){
    Vertex<E> v = this.listVertice.search(new Vertex<E>(data));
    if(v == null){ // Comprobamos la existencia
      System.out.println("No existe");
      return;
    }
    initLabel(); // incializacion los labels
    DFS(v);
  }

  private void DFS(Vertex<E> v){
    v.label = 1; // cambiamos el label como visititado
    Node<Edge<E>> e = v.listAdyacente.root;
    System.out.print(v.data+", ");
    while(e != null){
      if(e.data.label == 0){ // verificamos si el label del vertice es 0
        Vertex<E> w = e.data.referencia;
        if(w.label == 0){
          e.data.label = 1; // establecemos como visititado
          DFS(w); // hacemos el mismo proceso para w
        }
        else {
          e.data.label = 2; // Si es back significa que esa posicon ya fue visitada con anterioridad
        }
      }
      e = e.next; // avanzamos
    }
  }

  public static void main(String[] args) {
    Graph<String> g = new Graph<String>();
    // Declaracion de vertices
    g.insertVertex("peru");
    g.insertVertex("ecuador");
    g.insertVertex("brazil");
    g.insertVertex("colombia");
    g.insertVertex("aqp"); 
    g.insertVertex("chile"); 

    // Declaracion de las relaciones entre los nodos
    g.insertEdge("peru", "aqp", 8);
    g.insertEdge("peru", "colombia", 4);
    g.insertEdge("peru", "ecuador", 3);
    g.insertEdge("aqp", "colombia", 9);
    g.insertEdge("aqp", "chile", 1);
    g.insertEdge("colombia", "ecuador", 5);
    g.insertEdge("colombia", "chile", 2);
    g.insertEdge("colombia", "brazil", 7);
    g.insertEdge("ecuador", "brazil", 6);
    g.insertEdge("ecuador", "aqp", 9); //

    System.out.println("impresion del grafo g\n");
    System.out.println(g);
    System.out.println();
    g.DFS("peru");
    System.out.println();
  }
}

