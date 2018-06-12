// An abstract class using the Draw interface. Different types of shapes like circle, rectangle etc can be added by implementing this class.
// When further shapes are added, all the code does not have to be changed simply the implementation of the shape and its types.
public abstract class Shape {
	protected Draw draw;
    protected Shape(Draw draw){
	  this.draw = draw;
	}
	public abstract void draw();	
}
