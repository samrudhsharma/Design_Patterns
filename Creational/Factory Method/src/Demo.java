// The Factory pattern work by allowing the user to create only type of object but utilising an interface which allows the sub classes within
// to choose which class to instantiate the object for.
public class Demo {

	public static void main(String[] args) {
		// The only types of objects that can be create are for the Employee interface and the Factory class
		// The type of Employee object is decided by using an object for the Factory class
		Factory factoryObject = new Factory();
		
		Employee CEOObject = factoryObject.getObjectType("CEO");
		System.out.println(CEOObject.objectType());
		
		Employee managerObject = factoryObject.getObjectType("Manager");
		System.out.println(managerObject.objectType());
		
		Employee internObject = factoryObject.getObjectType("Intern");
		System.out.println(internObject.objectType());
	}

}
