package ˢ���������㷨��.qunar.No1;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

/*
 * �����������ɴ�дӢ����ĸ��ɵ��ַ�����A-Z��������������ַ����Ƿ��������ͬ����ĸ
����
�����ַ���
��������
FDJ DJDF
MIJJ MOJI
���
true / false
�������
true
false
 */
public class Main {

	
	public static boolean compare(char[]c1,char[] c2){
		Set<Character> set1 = new HashSet<Character>();
		Set<Character> set2 = new HashSet<Character>();
		for(int i=0;i<c1.length;i++){
			set1.add(c1[i]);
		}
		for(int i=0;i<c2.length;i++){
			set2.add(c2[i]);
		}
		if(set1.size()!=set2.size()){
			return false;
		}else{
			return true;
		}
		
	}
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		while(scanner.hasNext()){
			String[] str = scanner.nextLine().split(" ");
			String str1 = str[0];
			String str2 = str[1];
			char[] c1 = str1.toCharArray();
			char[] c2 = str2.toCharArray();
			if(compare(c1, c2)){
				System.out.println("true");
			}else{
				System.out.println("false");
			}
		}
	}
}
