package work_330;

public class Resume {
	
	private String name;
	private String sex;
	private int age;
	
	static {
		System.out.println("���Ǿ�̬�����");
	}//��̬�����
	
	{
		System.out.println("���ǹ�������");
	}
	
	public Resume() {
		System.out.println("���ÿյĹ��췽��");
	}

	public Resume(String name, String sex, int age) {
		this();//���ñ���Ĺ��췽����������ڵ�һ��
		this.name = name;
		this.sex = sex;
		this.age = age;
	}
	//��װ
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
