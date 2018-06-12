// A class implementing the abstract class Shape.
public class Circle extends Shape {
   
   private int x, y, radius;

   public Circle(int x, int y, int radius, Draw draw) {
      super(draw);
      this.x = x;  
      this.y = y;  
      this.radius = radius;
   }

   public void draw() {
      draw.drawCircle(x, y, radius);
   }
}