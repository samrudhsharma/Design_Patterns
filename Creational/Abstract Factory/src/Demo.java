// Abstract Factory Pattern provides an interface for creating more Factories.
// It is responsible for creating a factory of related objects without revealing all the classes within each Factory 
public class Demo {

	public static void main(String[] args) {
		// The only types of objects that can be create are for the Cars, Bikes interfaces and the Abstract Factory 
		// The type of Factory object is decided by using an object for the Factory Chooser class
		// After which, the type of sub class can be determined
		AbstractFactory abstractFactoryObject = FactoryChooser.getFactory("Cars");		
		
		Cars carObject1 = abstractFactoryObject.getCarType("Audi R8");
		carObject1.carType();
				
		Cars carObject2 = abstractFactoryObject.getCarType("Lamborghini Huracan");
		carObject2.carType();
				
		AbstractFactory abstractFactoryObject2 = FactoryChooser.getFactory("Bikes");
		
		Bikes bikeObject1 = abstractFactoryObject2.getBikeType("Harley Davidson Heritage Classic");
		bikeObject1.bikeType();
				
		Bikes bikeObject2 = abstractFactoryObject2.getBikeType("Harley Davidson Roadster");
		bikeObject2.bikeType();
				
		

	}

}
