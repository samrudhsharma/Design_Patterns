// Shape is an abstract class implementing the Cloneable interface which allows us to clone objects
public abstract class Shape implements Cloneable {

	private String id;
	protected String type;
	   
	abstract void draw();
	public Object clone() {
	  Object clone = null;
	  try {
	        clone = super.clone();
	      } catch (CloneNotSupportedException e) {
	         e.printStackTrace();
	      }
	  return clone;
	} 
	   
	public String getId() {
	  return id;
	}
	   
	public void setId(String id) {
	  this.id = id;
	}
	
	public String getType(){
	  return type;
	}
}
