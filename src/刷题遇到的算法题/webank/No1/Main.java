package ˢ���������㷨��.webank.No1;

import java.util.Scanner;

/*
 * ����
ʱ�����ƣ�C/C++���� 1000MS���������� 3000MS
�ڴ����ƣ�C/C++���� 65536KB���������� 589824KB
��Ŀ������
�����˾�յ���һ��������������̫�����ˣ�������Ҫ�ָ�ɼ����ֽ�����ͬ������������ɡ���˾������Ա����ÿ��Ա���ֱ������5,8,10 KB�������������ڹ����������������������֪���ж����ַ��䷽���ܸոպ��������
����
�����һ��һ������n(1<=n<=10000)����ʾ�������������Ϊn KB��
�������ڶ�����������a,b,c(0<=a,b,c<=10000)���ֱ��ʾ��һ����������Ա����������
���
���һ��һ����������ʾ����������

��������
23
3 2 3
�������
2
 */
public class Main {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		while(scanner.hasNext()){
			int n = scanner.nextInt();
			int a = scanner.nextInt();
			int b = scanner.nextInt();
			int c = scanner.nextInt();
			
			int count = 0;
			for(int i=0;i<=a;i++){
				for(int j=0;j<=b;j++){
					for(int k=0;k<=c;k++){
						int res = i*5+j*8+k*10;
						if(res>n){
							continue;
						}else if(res==n){
							count++;
							continue;
						}else{
							continue;
						}
					}
				}
			}
			System.out.println(count);
		}
	}
}
