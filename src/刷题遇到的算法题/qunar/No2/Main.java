package ˢ���������㷨��.qunar.No2;

import java.util.Scanner;

public class Main {
	/*
	 * ����һ�����֣���ȡ���ڴ����ֵ���һ������X�� Ҫ�� X Ϊ�Գ�����
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
