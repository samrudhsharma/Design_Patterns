// The Facade pattern allows us to create a single simplified interface to a different number of interfaces in a sub system.
// Making it easier for the user to access them 
public class Demo {
 public static void main(String[] args) {
  Facade facade = new Facade();
 
  facade.drawSquare();	
  facade.drawTriangle();
  facade.drawCircle();
 }
}
