
public class Demo {
	public static void main(String[] args) {
		RectangleAdapter rectangle = new RectangleAdapter(new Rectangle());
		LineAdapter line = new LineAdapter(new Line());
        Shape[] shapes = {line, rectangle};
        int x0 = 30, x1 = 9, y0 = 100, y1 = 40;
        for (Shape shape : shapes) {
            shape.create(x0, y0, x1, y1);
        }
	}
}
