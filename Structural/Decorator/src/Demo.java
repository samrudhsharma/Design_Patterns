// The Decorator pattern allows us to add functionality to an already existing object without altering any of its structure.
// Simply wrapping the objects adds features.
public class Demo {

	public static void main(String[] args) {
		Sandwich basic = new BasicSandwich();
		System.out.println(basic.build());
		Sandwich customSandwich = new DressingsDecorator(new ToppingsDecorator(new BasicSandwich()));
		System.out.println(customSandwich.build());
	}

}
