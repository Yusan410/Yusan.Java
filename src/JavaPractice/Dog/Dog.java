package JavaPractice.Dog;

public class Dog {

	// Instance varible

	String bread;

	String name;

	int age;

	String color;

//behavior of the dog
	public void eat() {

		System.out.println("Dog is eating");
	}
	public void run() {
		
		System.out.println("Dog is running");
	}
	public void sit() {
		
		System.out.println("dog is sitting");
	}
	@Override
	public String toString() {
		return "Dog [bread=" + bread + ", name=" + name + ", age=" + age + ", color=" + color + "]";
	}

}
