// The Builder Pattern allows you to build complex object from smaller/simpler objects
// Allowing the construction of the complex objects to be separate to its final state making sure that different complex objects can be created using variations in objects
public class Demo {

	public static void main(String[] args) {
	  
	  SandwichBuilder vegSandwich = new VegSandwich();
	  SandwichBuilder chickenTikkaSandwich = new ChickenTikkaSandwich();
	  
	  Order order = new Order();
	  Order order2 = new Order();
	  
	  order.typeOfSandwich(vegSandwich);
	  order.orderSandwich();
	  order.deliverSandwich();
	  
	  order2.typeOfSandwich(chickenTikkaSandwich);
	  order2.orderSandwich();
	  order2.deliverSandwich();
	 

	}

}
