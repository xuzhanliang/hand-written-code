package ˢ���������㷨��;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

/*
 * ���������ַ������ӵ�һ�ַ�����ɾ���ڶ����ַ��������е��ַ������磬���롱They are students.���͡�aeiou������ɾ��֮��ĵ�һ���ַ�����ɡ�Thy r stdnts.��
��������:

ÿ�������������2���ַ���



�������:

���ɾ������ַ���


��������:

They are students.
aeiou


�������:

Thy r stdnts.
 */

public class ��δ��02ɾ�������ַ� {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		while(scanner.hasNext()){
			String str1 = scanner.nextLine();
			String str2 = scanner.nextLine();
			String res = deleteChars(str1,str2);
			System.out.println(res);
		}
	}

	private static String deleteChars(String str1, String str2) {
		int length1 = str1.length();
		int length2 = str2.length();
		Set<Character> set = new HashSet<Character>();
		int i=0;
		while(i<length2){
			set.add(str2.charAt(i));
			i++;
		}
		StringBuilder sb = new StringBuilder();
		i=0;
		while(i<length1){
			if(!set.contains(str1.charAt(i))){
				sb.append(str1.charAt(i));
			}
			i++;
		}
		return sb.toString();
	}
}
