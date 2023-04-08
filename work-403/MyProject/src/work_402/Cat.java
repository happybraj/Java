package work_402;

public class Cat extends Animals {

	public Cat() {
		super();
	}

	public Cat(String name, int age, String color) {
		super(name, age, color);
	}

	@Override
	public String toString() {
		return "Cat [getName()=" + getName() + ", getAge()=" + getAge() + ", getColor()=" + getColor() + "]";
	}
	
	public void eat() {
		System.out.println("≥‘√®¡∏");
	}
}
