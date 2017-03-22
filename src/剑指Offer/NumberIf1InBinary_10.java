package ½£Ö¸Offer;

public class NumberIf1InBinary_10 {

	static int NumberOf1(int n){
		int count = 0;
		while(n!=0){
			++count;
			n = (n-1) & n;
		}
		return count;
	}
	public static void main(String[] args) {
		int a = 8;
		System.out.println(NumberOf1(a));
	}
}
