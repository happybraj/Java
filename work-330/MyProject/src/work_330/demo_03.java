package work_330;
/**
 * 
 * 主题：static
 * 修饰变量:变量可以被所有对象共享。
 *
 * 什么时候将变量定义成静态?
 * 当一个变量被类中所有的对象所共享的时候
 * 
 * 修饰方法:静态方法可以直接通过类名进行访问
 * 静态属于类,随着类的加载而加载
 * 非静态属于对象，随着对象的创建而加载
 * 
 * 静态的访问特点:
 * 静态的只能访问静态的
 * 非静态的既能访问静态的 也能访问非静态的
 * 
 * 静态代码块:
 * 当类加载的时候会被执行，只会执行一次
 * 作用:
 * 注册驱动，加载资源
 * 
 */
public class demo_03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Resume rs = new Resume();
		
		System.out.println(rs);
	}
	
}
