package ˢ���������㷨��;

import java.util.Scanner;

//���������������Լ��
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
