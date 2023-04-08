package work_330;

public class Resume {
	
	private String name;
	private String sex;
	private int age;
	
	static {
		System.out.println("我是静态代码块");
	}//静态代码块
	
	{
		System.out.println("我是构造代码块");
	}
	
	public Resume() {
		System.out.println("调用空的构造方法");
	}

	public Resume(String name, String sex, int age) {
		this();//调用本类的构造方法，必须放在第一行
		this.name = name;
		this.sex = sex;
		this.age = age;
	}
	//封装
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getSex() {
		return sex;
	}
	public void setSex(String sex) {
		this.sex = sex;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}

	
}
