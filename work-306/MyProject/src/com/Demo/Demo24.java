package com.Demo;
/*
 * 主题:跳转语句(流程控制语句)
 *  break:
 *  	使用场景:可以用在switch语句和循环语句中
 *  	作用:停止switch语句和循环语句
 *  continue:
 *  	使用场景:只能用在循环语句中
 *  	作用:跳过本次循环,继续下一次循环;
 */
public class Demo24 {

	public static void main(String[] args) {
		// 任务:累计1-100,当结果大于200时,结束循环
		int sum=0;
		for(int i=1;i<=100;i++) {
			sum+=i;
			if(sum>=200){
				System.out.println(sum);
				break;
			}
		}
		sum=0;
		for(int i=1;i<101;i++) {
			if(i%3==0) {
				continue;
			}
			sum+=i;
		}
		System.out.println(sum+"\n");
		//利用标签结束嵌套循环的外层循环
		i:for(int i=1;i<=3;i++){
			j:for(int j=1;j<=5;j++) {
				if(j==3) {
					break i;
				}
				System.out.println(j);
			}
		}
		//continue:
		for(int i=1;i<=5;i++) {
			if(i==4) {
				continue;
			}
			System.out.println(i);
		}
	}

}
