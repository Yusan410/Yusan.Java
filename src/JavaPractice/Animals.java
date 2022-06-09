package JavaPractice;

public class Animals {
	
String name;
int age;
String color;

public void eat () {
	
	
	System.out.println("I am eating");
	
	
}
public void run() {
	
	System.out.println("I am runnig");
}
@Override
public String toString() {
	return "Animals [name=" + name + ", age=" + age + ", color=" + color + "]";
}

}
