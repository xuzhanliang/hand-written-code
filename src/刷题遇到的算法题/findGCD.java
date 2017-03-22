package 刷题遇到的算法题;

import java.util.Scanner;

//求两个整数的最大公约数
public class findGCD {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		while(scanner.hasNext()){
			int a = scanner.nextInt();
			int b = scanner.nextInt();
			System.out.println(gcd(a,b));
		}
	}
	public static int gcd(int a,int b){
		if(b==0){
			return a;
		}else if(a>b){
			return gcd(a-b, b);
		}else{
			return gcd(a, b-a);
		}
	}
}
