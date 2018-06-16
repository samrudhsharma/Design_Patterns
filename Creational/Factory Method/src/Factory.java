// This class is responsible for deciding the type of object and for which sub class the object is to be created
public class Factory {
	
	public Employee getObjectType(String title) {
      if(title.equalsIgnoreCase("CEO"))
    	  return new CEO();
      else if(title.equalsIgnoreCase("Manager"))
    	  return new Manager();
      else if(title.equalsIgnoreCase("Intern"))
    	  return new Intern(); 
      return null;
	}
	
}
