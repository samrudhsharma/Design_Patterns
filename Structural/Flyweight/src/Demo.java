// The Fly Weight Pattern is used to keep track and reduce the large number of small objects created in applications.
// It re uses already existing objects and only creates a new one if its not found in its factory and cache 
public class Demo {
  public static void main(String[] args) {

	  Inventory inv = new Inventory();
	  inv.carryOutOrder("Phone", 345);
	  inv.carryOutOrder("Car", 123);
	  inv.carryOutOrder("TV", 222);
	  inv.carryOutOrder("Bag", 334);
	  inv.carryOutOrder("Phone", 543);
	  inv.carryOutOrder("Bag", 34565);
	  inv.carryOutOrder("Car", 34345);
	  inv.carryOutOrder("Phone", 3245);
	  inv.carryOutOrder("TV", 34455);
	  inv.carryOutOrder("Phone", 2314);
	  
	  inv.process();
	  System.out.println( inv.status());
	  
	}

}
