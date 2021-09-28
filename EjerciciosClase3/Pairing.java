public class Pairing{
  public static void main (String[]args){
    /* Autor: Darwin Jesus Neira Carrasco
     * Descripcion: El programa es un implementacion del algortimo de aceptacion diferida de Gale-Shapley
     */
    // people preferences
    // boys
    String [] an = {"Xena","Wendy","Yvonne","Zoe"};
    String [] be = {"Yvonne","Zoe","Xena","Wendy"};
    String [] ca = {"Yvonne","Xena","Zoe","Wendy"};
    String [] de = {"Wendy","Zoe","Yvonne","Xena"};
    // girls
    String [] wen = {"Carlo","Denis","Beto","Andy"};
    String [] xen = {"Carlo","Beto","Andy","Denis"};
    String [] yno = {"Andy","Beto","Carlo","Denis"};
    String [] zo = {"Denis","Carlo","Beto","Andy"};

    Persona [] man = {new Persona(an,"Andy"),new Persona(be,"Beto"),new Persona(ca,"Carlo"),new Persona(de,"Denis")};

    // Variacion de los hombres
    /*Persona [] man = {new Persona(xavi,"Xavier"),new Persona(vic,"Victor"),new Persona(wil,"William"),/*new Persona(xavi,"Xavier"),new Persona(yan,"Yancey"),new Persona(zeu,"Zeus")};*/
    /*Persona [] man = {new Persona(zeu,"Zeus"),new Persona(xavi,"Xavier"),new Persona(vic,"Victor"),new Persona(wil,"William"),new Persona(yan,"Yancey")};*/

    Persona [] woman = {new Persona(wen,"Wendy"),new Persona(xen,"Xena"),new Persona(yno,"Yvonne"),
      new Persona(zo,"Zoe")};
    //print(man, woman);

    // Varias al momento de proponer
    aceptacion(man, woman); // Hombres proponen
    //aceptacion(woman, man); // Mujeres proponen

    System.out.println("\nParejas");
    for (Persona persona : man) {
      System.out.println(persona.name + " - " + persona.relation);
    }
  }

  public static void aceptacion(Persona [] propose, Persona[] receive) {
    for (int i = 0; i < propose.length; i++) {
      if(propose[i].status == 0 && NotEmpty(propose[i].preference)){
        Persona h = propose[i]; // seleccionamos al hombre
        System.out.println("\n" + h.name);
        /*notBlock hace referencia que aun no le hemos pedido salir*/
        Persona m = receive[search(receive, notBlock(propose[i].preference))];
        System.out.println(m.name);
        if(m.status==0){
          System.out.println(h.name + " establecio relacion " + m.name);
          h.relation = m.name;
          m.relation = h.name;
          // Estableciendo estatus
          h.status = 1;
          m.status = 1;
        }
        else if(searchp(m.preference, m.relation) > searchp(m.preference, h.name)) {
          System.out.println(m.name + " reemplaza a " + m.relation + " por " + h.name);
          String old = m.relation; // guardamos el nombre de la anterior pareja
          // Establecemos la nuevos relaciones
          m.relation = h.name;
          h.relation = m.name;
          // establecemos el status de la nueva pareja
          h.status = 1;
          // Bloqueamos a las personas que estaban en relacion
          m.preference[searchp(m.preference, old)] = "";
          Persona oldH = propose[search(propose, old)];
          oldH.preference[searchp(oldH.preference, m.name)] = "";
          // Reestablecemos el status de la anterior pareja como soltera
          oldH.status = 0;
          //print(propose, receive);
          aceptacion(propose, receive);
        }
        else {
          // Bloqueamos a las personas que estaban en relacion
          m.preference[searchp(m.preference, h.name)] = "";
          h.preference[searchp(h.preference, m.name)] = "";
          System.out.println(m.name + " rechaza a " + h.name);
          //print(propose, receive);
          aceptacion(propose, receive);
        }
      }
    }
  }

  // imprime la lista de datos de las personas
  public static void print(Persona [] man,Persona [] woman){
    System.out.println("hombres");
    for (Persona persona : man) {
      System.out.println(persona);
    }
    System.out.println("\nmujeres");
    for (Persona persona : woman) {
      System.out.println(persona);
    }
    System.out.println("\n");
  }

  // Metodo encargado de vericar si aun tenemos a alguien a quien proponerle
  public static boolean NotEmpty(String [] arr){
    boolean rpta = false;
    for (int i = 0; i < arr.length; i++) {
      if(!arr[i].equals("")){
        rpta = true;
      }
    }
    return rpta;
  }

  // busamos una persona
  public static int search(Persona [] arr, String str) {
    for (int i = 0; i < arr.length; i++) {
      if(arr[i].name.equals(str)){
        return i;
      }
    }
    return -1;
  }

  // buscamos el nombre de una persona en su lista de preferencias
  public static int searchp(String[] arr, String str) {
    for (int i = 0; i < arr.length; i++) {
      if(arr[i].equals(str)){
        return i;
      }
    }
    return -1;

  }

  // Este metodo delvera el nombre de la persona que no este bloqueda
  public static String notBlock(String[] preference){
    String str = "";
    for (int i = 0; i < preference.length; i++) {
      if(preference[i].equals("")){
        continue;
      }
      else {
        str = preference[i];
        break;
      }
    }
    return str;
  }
}

