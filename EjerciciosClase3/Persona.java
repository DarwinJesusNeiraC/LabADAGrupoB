public class Persona{
  protected String relation; // para mostrar con quien tiene una relacion
  protected String [] preference; // Se guaradaran  sus preferencias
  protected int status; // 1 = block, 0 = free
  protected String name;

  // constructor
  public Persona(String [] preference,String name){
    this.preference = preference;
    this.name = name;
  }

  @Override
  public String toString() {
    String str = "";
    str += this.name; 
    str += " : "; 
    for (int i = 0; i < preference.length; i++) {
      str += preference[i] + ", ";
    }
    return str;
  }

}

