package ˢ���������㷨��.niuke3.No1;

import java.util.Scanner;

/*
 * [�����] ����������
ʱ�����ƣ�1��
�ռ����ƣ�32768K
ţţ��������������Ϊһ��������һ��������������,��������������Ƿǵ������߷ǵݼ�����ġ�
ţţ��һ������Ϊn����������A,��������һ�������ǰ�����A��Ϊ���ɶ�����������,ţţ��֪�������ٿ��԰���������Ϊ��������������.
��������ʾ,ţţ���԰�����A����Ϊ[1,2,3]��[2,2,1]��������������,������Ҫ����Ϊ2������������,�������2 
��������:
����ĵ�һ��Ϊһ��������n(1 �� n �� 10^5)

�ڶ��а���n������A_i(1 �� A_i �� 10^9),��ʾ����A��ÿ�����֡�


�������:
���һ��������ʾţţ���Խ�A���ٻ���Ϊ���ٶ�����������

��������:
6
1 2 3 2 2 1

�������:
2
 */
public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		int f = -1;//��־��-1��ʼ��1������2�ݼ�
		int last = sc.nextInt();
		int res = 0;
		for(int i=1;i<n;i++){
			int now = sc.nextInt();
			if(f== -1){
				if(now>last){
					f=1;
				}else if(now<last){
					f=2;
				}
			}else if(f==1){
				if(now<last){
					f=-1;
					res++;
				}
			}else{
				if(now>last){
					f=-1;
					res++;
				}
			}
			last=now;
		}
		res++;
		System.out.println(res);
	}
}
