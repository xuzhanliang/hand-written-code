package ˢ���������㷨��;

import java.awt.List;
import java.util.ArrayList;
import java.util.Scanner;

/*
 * ����һ���ַ���str������ַ���str�е�����������ִ�
��������:

�������������1������������һ���ַ���str�����Ȳ�����255��



�������:

��һ�������str��������������ִ���


��������:

abcd12345ed125ss123456789


�������:

123456789
 */

public class ��δ��04�ַ������ҳ�����������ִ� {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		String string = scanner.nextLine();
		System.out.println(getDigit(string));
	}

	private static String getDigit(String string) {
		ArrayList<String> list = new ArrayList<>();
		
		int max=0;
		for(int i=0;i<string.length();i++){
			if(Character.isDigit(string.charAt(i))){
				int j=i+1;
				while(j<string.length() && Character.isDigit(string.charAt(j))){
					j++;
				}
				if(j-i > max){
					list.add(string.substring(i, j));
					max=j-i;
				}else if(j-i==max){
					list.add(string.substring(i, j));
				}
				i=j;
			}
		}
		for(int i = 0; i < list.size(); i++) {
			if (list.get(i).length()==max) {
				return list.get(i);
				}
			}
		return list.get(0);
	}
}
