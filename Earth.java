
public class Earth {
	
	public static void main(String args[]) {
		
//		// tom = is called an instance variable, an object is created when the application runs
//		Human tom;
//		
//		// creating  a new Human
//		tom = new Human();
//		tom.age = 5;
//		tom.eyeColor = "brown";
//		tom.heightInInches = 72;
//		tom.name = "Tom the man";
//		
//		tom.speak();
//		
//		Human mark;
//		
//		mark = new Human();
//		mark.age = 7;
//		mark.eyeColor = "black";
//		mark.heightInInches = 77;
//		mark.name = "Mark the Shark";
//		
//		mark.speak();
		
		Human human1 = new Human("Tom", 25, 77, "Blue");
		Human human2 = new Human("Joe", 22, 78, "green");

		
		human1.speak();
		human2.speak();

	}

}
