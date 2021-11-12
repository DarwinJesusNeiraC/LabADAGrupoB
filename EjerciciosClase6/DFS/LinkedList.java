
public class LinkedList<E>{ // clase generica

  // Atributos
  protected Node<E> root; // Primer node
  protected Node<E> last; // Ultimo node

  // Constructor
  public LinkedList() {
    this.root = null;
    this.last = null;
  }

  // metodo isEmpty
  public boolean isEmpty() {
    return this.root == null;
  }

  public void getLast() {
    if(this.last != null) {
      System.out.println(this.last.data);
    }
    System.out.println("null");
  }
  public void getRoot() {
    if(this.root != null){
      System.out.println(this.root.data);
    }
    System.out.println("null");
  }
  // metodo insert 
  public void insert(E data) {
    if(this.isEmpty()){ // si la lista esta vacia
      this.root = this.last = new Node<E>(data); // estableceremos el nuevo root
    }
    else { // en caso no lo pondremos al final
      this.last.next = new Node<E>(data);
      this.last = this.last.next;
    }
  }

  // metodo search
  public E search(E data) {
    Node<E> aux = this.root;
    while(aux != null){ // recorremos la lista
      if(aux.data.equals(data)){ // si coinciden 
        return aux.data; // retornamos su data
      }
      else { // en caso no avanzamos
        aux = aux.next;
      }
    }
    return null; // si recorremos todo y no lo encontramos retornamos null
  }

  public E remove(E data) throws IllegalStateException{
    E delvolver  = null;
    if(this.isEmpty()) { // en caso se quiera ejecutar si no hay nada 
      throw new IllegalStateException();
    }
    else {
      if(this.root.data.equals(data)) { // En caso sea igual al primer elemento
        delvolver = this.root.data;
        this.root = this.root.next; // establecemos la nueva raiz
      }
      else{ // si queremos eleminar al final o al medio
        Node<E> aux = this.root;
        while(aux.next != null) { // recorremos el LinkedList
          if(aux.next.data.equals(data)){ // si encontramos una coincidencia
            delvolver = aux.next.data;
            aux.next = aux.next.next; // el siguiente sera la posicion que se encuentra 2 veces mas adelante
            return delvolver;
          }
          else if(aux.next.next == null){ // En este caso preguntamos si last
            if(aux.next.data.equals(data)) {
              delvolver = aux.next.data;
              aux.next = null;
              this.last = aux;
              return delvolver;
            }
          }
          else {
            aux = aux.next; // si no avanzamos
          }
        }
      }
      return delvolver;
    }
  }

  @Override
  public String toString() {
    String str = "";
    Node<E> aux = this.root;
    while(aux != null) {
      str += aux.data;
      aux = aux.next;
    }
    return str;
  }

  public static void main(String [] args){
    LinkedList<String> t =  new LinkedList<>();
    t.insert("hola");
    t.insert("hi");
    t.insert("hello");
    contenido(t);
    System.out.println("Se elmino "+ t.remove("hi"));
    contenido(t);
    System.out.println("Existe ?  buscando  " + t.search("hola") );
    System.out.println("Existe iafa ?  buscando  " + t.search("iafa") );
    System.out.println("Se elmino "+ t.remove("hola"));
    System.out.println("Se elmino "+ t.remove("hola"));
    contenido(t);
    System.out.println("Se elmino "+ t.remove("hello"));
    contenido(t);
  }
  public static <E> void contenido(LinkedList<E> t) {
    System.out.println(t);
    t.getRoot();
    t.getLast();
  }
}

