package 刷题遇到的算法题;

public class SwapWithoutAnything {

	//算术运算
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
