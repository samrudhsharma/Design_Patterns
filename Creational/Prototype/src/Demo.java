// The Prototype Pattern creates new objects by instantiating the objects with prototypes only once and form there on forward clones 
// the objects if new objects are require. Reducing the number of objects created which helps performance and cost issues.
public class Demo {

	public static void main(String[] args) {
		
		PrototypeBuilder.initialisePrototypes();

	    Shape clonedRectangleObject = (Shape) PrototypeBuilder.getShape("1");
	    System.out.println("Shape: " + clonedRectangleObject.getType());		

	    Shape clonedSquareObject = (Shape) PrototypeBuilder.getShape("2");
	    System.out.println("Shape: " + clonedSquareObject.getType());		

	}

}
