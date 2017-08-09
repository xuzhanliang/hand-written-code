package 刷题遇到的算法题;

import java.util.Scanner;

public class 字符串乘法 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String str = sc.nextLine();
		String[] list = str.split(" ");
		char c1[] = list[0].toCharArray();
		char c2[] = list[1].toCharArray();
		System.out.println(mul(c1,c2));
	}

	private static String mul(char[] c1, char[] c2) {
		int result[] = new int[c1.length + c2.length];
		int n1[] = new int[c1.length];
		int n2[] = new int[c2.length];
		for(int i=0;i<c1.length;i++){
			n1[i]=c1[i]-'0';
		}
		for(int i=0;i<c2.length;i++){
			n2[i]=c2[i]-'0';
		}
		for(int i=0;i<c1.length;i++){
			for(int j=0;j<c2.length;j++){
				result[i+j]+=n1[i]*n2[j];
			}
		}
		for(int i =result.length-1;i>0;i--){
			result[i-1]+=result[i]/10;
			result[i]=result[i]%10;
		}
		String res = "";
		for(int i=0;i<result.length-1;i++){
			res+=""+result[i];
		}
		return res;
	}
}