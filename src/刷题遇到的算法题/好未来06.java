package 刷题遇到的算法题;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class 好未来06 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int[] list = new int[100];
		int i=0;
		while(!scanner.hasNext()){
			list[i]=scanner.nextInt();
			i++;
		}
		
		System.out.println(getMoreThanHalfNum(list));
	}

	private static int getMoreThanHalfNum(int[] list) {
		if(list.length==0){
			return 0;
		}
		int res = list[0];
		int counts = 1;
		for(int i=1;i<list.length;i++){
			if(counts==0){
				res=list[i];
				counts=1;
			}else if(list[i]==res){
				counts++;
			}else{
				counts--;
			}
		}
		counts = 0;
		for(int i=0;i<list.length;i++){
			if(list[i]==res){
				counts++;
			}
		}
		if(counts*2>list.length){
			return res;
		}else{
			return 0;
		}
	}
}
