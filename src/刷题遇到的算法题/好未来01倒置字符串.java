package ˢ���������㷨��;

import java.util.Scanner;

/*
  ��һ�仰�ĵ��ʽ��е��ã���㲻���á����� I like beijing. �����������Ϊ��beijing. like I
��������:

ÿ�������������1������������  I like  beijing. �����������Ȳ�����100

�������:

�����������֮����ַ���,�Կո�ָ�


��������:

I like  beijing.


�������:

beijing. like I

 */


public class ��δ��01�����ַ��� {
public static void main(String[] args) {
	Scanner scanner = new Scanner(System.in);
	String str = scanner.nextLine();
	System.out.println(inversionString(str));
}
public static String inversionString(String str){
	String[] strs = str.split(" ");
	StringBuilder sb = new StringBuilder();
	for(int i=strs.length-1;i>0;i--){
		sb.append(strs[i]).append(" ");
	}
	sb.append(strs[0]);
	return sb.toString();
}
}
