package ��ָOffer;


public class NumberOf1_32 {

	public static int count(int n){
		if(n<1) return 0;
		int count=0;
		int base=1;
		int round=n;
		while(round>0){
			int weight = round%10;
			round/=10;
			count+=round*base;
			if(weight==1){
				count+=(n%base)+1;
			}else if(weight>1){
				count+=base;
			}
			base*=10;
		}
		return count;
	}
	public static void main(String[] args) {
		int i = 534;
		System.out.println(count(i));
	}
}
