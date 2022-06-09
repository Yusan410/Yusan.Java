package JavaPractice;

public class Cat extends Animals {
	
	public static void main(String[] args) {
		
		Animals a = new Animals();
		
		a.age = 1;
		a.name="Tom";
		a.color="Black";
		
		a.eat();
		a.run();
		
		System.out.println(a);
		
		
		
		
	}

}
