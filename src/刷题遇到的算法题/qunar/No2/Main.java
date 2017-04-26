package 刷题遇到的算法题.qunar.No2;

import java.util.Scanner;

public class Main {
	/*
	 * 给定一个数字，获取大于此数字的下一个数字X， 要求 X 为对称数字
	 * */
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		while(sc.hasNext()){
			int num=sc.nextInt();			
			for(int i=num+1;;i++){
				StringBuffer sb=new StringBuffer();
				sb.append(i);
				sb.reverse();				
				if(i==Integer.parseInt(sb.toString())){
					System.out.println(i);
					return;
				}
			}
		}
	}
}
