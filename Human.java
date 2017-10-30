
public class Human {
	
	String name;
	int age;
	int heightInInches;
	String eyeColor;
	
	//this is a constructor method, it always has the same name as class name 
	// this method is used to construct Humans
//	public Human() {
//		age = 5;
//		eyeColor = "brown";
//		heightInInches = 72;
//		name = "Tom the man";
//	}
	
	public Human(String name, int age, int heightInInches, String eyeColor) {
		super();
		this.name = name;
		this.age = age;
		this.heightInInches = heightInInches;
		this.eyeColor = eyeColor;
	}
	
	
	// instruction on how our Human can behave
	public void speak() {
		System.out.println("Hello, my name is " + name);
		System.out.println("I am, " + heightInInches + " inches tall");
		System.out.println("I am " + age + "years old");
		System.out.println("My eye color is " + eyeColor);
	}
	


	public void eat() {
		System.out.println("eating");
	}
	
	public void walk() {
		System.out.println("walking");
	}
	
	public void work() {
		System.out.println("working");
	}

}
