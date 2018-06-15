// The Singleton Pattern revolves around one single class and ensures that only one instance of the class can be created for that class
// Making sure that the created instance is globally accessible
public class Demo {

	public static void main(String[] args) {
	  
	  // The Singleton Pattern makes sure that statements like these cannot be executed and throws a compile time error if called
	  //SingletonClass singleObject = new SingletonClass();

	  // To access the single object for the single class you simply encapsulate it by calling the getInstance method from the Singleton class
	  SingletonClass singleObject = SingletonClass.getInstance();
	  singleObject.print();

	}

}
