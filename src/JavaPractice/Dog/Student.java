package JavaPractice.Dog;

public class Student {

	String name;
	int age;
	String color;
	char sex;
	String country;

	public void eat() {

		System.out.println(name + " runnig");
	}

	public void run() {
		System.out.println(name + " runnig");
	}

	public void drink() {

		System.out.println(name + " drinking");
	}

	@Override
	public String toString() {
		return "Student [name=" + name + ", age=" + age + ", color=" + color + ", sex=" + sex + ", country=" + country
				+ "]";
	}

}
