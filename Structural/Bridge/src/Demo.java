// We can Draw the shape Circle with different attributes like the colour red and yellow as defined in the concrete bridge implementer classes.
// Adding another shape requires the implementation of the abstract class shape and its features as concrete bridge implementer classes.
public class Demo {
	public static void main(String[] args) {
      Shape redCircle = new Circle(0, 0, 100, new RedCircle());
      Shape yellowCircle = new Circle(0, 0, 100, new YellowCircle());
      redCircle.draw();
	  yellowCircle.draw();
	}
}
