package ˢ���������㷨��;

public class SwapWithoutAnything {

	//��������
	public static void swap1(int a,int b){
		a=a+b;
		b=a-b;
		a=a-b;
		System.out.println("a=" +a+", b="+b);
	}
	public static void swap2(int a,int b){
		a=a^b;
		b=a^b;
		a=a^b;
		System.out.println("a=" +a+", b="+b);
	
	}
	public static void main(String[] args) {
		int a = 5;
		int b = 6;
		swap1(a, b);
		swap2(a, b);
	}
}
