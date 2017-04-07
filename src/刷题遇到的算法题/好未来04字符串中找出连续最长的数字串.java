package 刷题遇到的算法题;

import java.awt.List;
import java.util.ArrayList;
import java.util.Scanner;

/*
 * 读入一个字符串str，输出字符串str中的连续最长的数字串
输入描述:

个测试输入包含1个测试用例，一个字符串str，长度不超过255。



输出描述:

在一行内输出str中里连续最长的数字串。


输入例子:

abcd12345ed125ss123456789


输出例子:

123456789
 */

public class 好未来04字符串中找出连续最长的数字串 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		String string = scanner.nextLine();
		System.out.println(getDigit(string));
	}

	private static String getDigit(String string) {
		ArrayList<String> list = new ArrayList<>();
		
		int max=0;
		for(int i=0;i<string.length();i++){
			if(Character.isDigit(string.charAt(i))){
				int j=i+1;
				while(j<string.length() && Character.isDigit(string.charAt(j))){
					j++;
				}
				if(j-i > max){
					list.add(string.substring(i, j));
					max=j-i;
				}else if(j-i==max){
					list.add(string.substring(i, j));
				}
				i=j;
			}
		}
		for(int i = 0; i < list.size(); i++) {
			if (list.get(i).length()==max) {
				return list.get(i);
				}
			}
		return list.get(0);
	}
}
