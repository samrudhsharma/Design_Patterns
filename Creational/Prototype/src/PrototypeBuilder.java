// This class is responsible for building the prototypes for all the different objects types in our program.
// It uses a HashTable to keep track and attach id's to each object so they can be identified and cloned accordingly
import java.util.Hashtable;

public class PrototypeBuilder {

	private static Hashtable<String, Shape> prototypes = new Hashtable<String, Shape>();

	public static Shape getShape(String objectID) {
		Shape cachedShape = prototypes.get(objectID);
		return (Shape) cachedShape.clone();
	}

	// Initialising and storing each prototype object along with its key to identify by
	public static void initialisePrototypes() {
		Rectangle rectangle = new Rectangle();
		rectangle.setId("1");
		prototypes.put(rectangle.getId(), rectangle);

		Square square = new Square();
		square.setId("2");
		prototypes.put(square.getId(), square);
	}

}
