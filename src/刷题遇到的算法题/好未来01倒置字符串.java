package 刷题遇到的算法题;

import java.util.Scanner;

/*
  将一句话的单词进行倒置，标点不倒置。比如 I like beijing. 经过函数后变为：beijing. like I
输入描述:

每个测试输入包含1个测试用例：  I like  beijing. 输入用例长度不超过100

输出描述:

依次输出倒置之后的字符串,以空格分割


输入例子:

I like  beijing.


输出例子:

beijing. like I

 */


public class 好未来01倒置字符串 {
public static void main(String[] args) {
	Scanner scanner = new Scanner(System.in);
	String str = scanner.nextLine();
	System.out.println(inversionString(str));
}
public static String inversionString(String str){
	String[] strs = str.split(" ");
	StringBuilder sb = new StringBuilder();
	for(int i=strs.length-1;i>0;i--){
		sb.append(strs[i]).append(" ");
	}
	sb.append(strs[0]);
	return sb.toString();
}
}
