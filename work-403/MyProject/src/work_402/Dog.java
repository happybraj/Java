package work_402;

public class Dog extends Animals {

	public Dog() {
		super();
	}

	public Dog(String name, int age, String color) {
		super(name, age, color);
	}

	@Override
	public String toString() {
		return "Dog [getName()=" + getName() + ", getAge()=" + getAge() + ", getColor()=" + getColor() + "]";
	}
	
	@Override //������д��ʽ�Ƿ���ȷ
	public void eat() {
		System.out.println("�Թ���");
	}

}
