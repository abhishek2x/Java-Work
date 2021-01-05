// call it from the main.

public class Imple {

  public static void main(String args[]) {
    Laptop lenovo = new Laptop();
    lenovo.run();
    lenovo.carry();
  }
}

  // created interface
  interface Carry {
    public void carry();
  }

  interface Run{
    public void run();
  }

  // implement it
class Laptop implements Carry, Run {
  public void carry()
  {
    System.out.println("Carrying the laptop");
  }
  public void run()
  {
    System.out.println("Running the laptop");
  }
}
