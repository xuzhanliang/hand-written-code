package 刷题遇到的算法题;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

/*
 * 输入两个字符串，从第一字符串中删除第二个字符串中所有的字符。例如，输入”They are students.”和”aeiou”，则删除之后的第一个字符串变成”Thy r stdnts.”
输入描述:

每个测试输入包含2个字符串



输出描述:

输出删除后的字符串


输入例子:

They are students.
aeiou


输出例子:

Thy r stdnts.
 */

public class 好未来02删除公共字符 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		while(scanner.hasNext()){
			String str1 = scanner.nextLine();
			String str2 = scanner.nextLine();
			String res = deleteChars(str1,str2);
			System.out.println(res);
		}
	}

	private static String deleteChars(String str1, String str2) {
		int length1 = str1.length();
		int length2 = str2.length();
		Set<Character> set = new HashSet<Character>();
		int i=0;
		while(i<length2){
			set.add(str2.charAt(i));
			i++;
		}
		StringBuilder sb = new StringBuilder();
		i=0;
		while(i<length1){
			if(!set.contains(str1.charAt(i))){
				sb.append(str1.charAt(i));
			}
			i++;
		}
		return sb.toString();
	}
}
