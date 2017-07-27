package 基础编程题50道;

import java.util.Scanner;

public class Prog6 {

	public static void main(String[] args) {
		Scanner sc =  new Scanner(System.in);
		int m = sc.nextInt();
		int n = sc.nextInt();
		max_min(m,n);
	}

	private static void max_min(int m, int n) {
		int temp = 1;
		int yshu = 1;
		int bshu = m*n;
		if(n<m){
			temp = n;
			n=m;
			m=temp;
		}
		while(m!=0){
			temp = n % m;
			n=m;
			m=temp;
		}
		yshu = n;
		bshu /=n;
		System.out.println(m+"和"+n+"的最大公约数为"+yshu);
		System.out.println(m+"和"+n+"的最小公倍数为"+bshu);
		
	}
}
