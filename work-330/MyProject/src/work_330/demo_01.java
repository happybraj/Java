package work_330;
/**
 * 
 * 主题：封装
 * 封装就是将对象中的实现细节进行隐藏，不被外界直接访问。
 * 
 * 封装的优点：可以提高代码的安全性
 * 		
 * 访问修饰符：
 * 		private:私有的
 * 		default:默认的 缺省的
 * 		protected:受保护的
 * 		public:公共的
 *
 */
public class demo_01 {

	public static void main(String[] args) {

		Resume rs = new Resume();
		rs.setAge(-19);
		
		Resume re = new Resume();
		re.setAge(19);
	}
	

}
