package ���������50��;

/*
 * ָ����������
��һ�����ӣ��ӳ������3������ÿ���¶���һ�����ӣ�С���ӳ����������º�ÿ��������һ�����ӣ��������Ӷ���������ÿ���µ����Ӷ���Ϊ���٣� 
  ��������� ���ӵĹ���Ϊ����1,1,2,3,5,8,13,21....
 */

public class Prog1 {

	public static void main(String[] args) {
		int n = 10;
		System.out.println("��"+n+"������������Ϊ��"+func(n));
	}

	private static int func(int n) {
		// TODO Auto-generated method stub
		if(n==1 || n==2) return 1;
		else return func(n-1)+func(n-2);
	}
}
