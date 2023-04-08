package work_402;

public class Animals {
	private String name;
	private int age;
	private String color;
	
	public Animals() {}
	public Animals(String name, int age, String color) {
		super();
		this.name = name;
		this.age = age;
		this.color = color;
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	
	public void eat() {
		System.out.println("≥‘∑π¡À");
	}
	@Override
	public String toString() {
		return "Animals [name=" + name + ", age=" + age + ", color=" + color + "]";
	}//toString() alt+shift+s…˙≥…
	
	
}
