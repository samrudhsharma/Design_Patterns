
public class Demo {
	public static void main(String[] args) {
		
		Employee marketingHead = new Manager("Daniel White","Head of Marketing", 25000);
		Employee marketingIntern1 = new Intern("John Faverau","Marketing", 10000);
		Employee marketingIntern2 = new Intern("David Attenbourough","Marketing", 15000);
		marketingHead.add(marketingIntern1);
		marketingHead.add(marketingIntern2);
		
		Manager generalM = new Manager("Mark","General Manager", 50000);
		Employee techHead = new Intern("Michael","Head of Technology", 20000);
		
		generalM.add(techHead);
		generalM.add(marketingHead);
		generalM.print();
	}
}
