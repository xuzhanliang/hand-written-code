package ˢ���������㷨��;

import java.util.Scanner;

/*
 * ������������ n �� m��������1��2��3.......n ������ȡ������,ʹ��͵��� m ,Ҫ���������еĿ�������г���
��������:

ÿ�������������2������,n��m



�������:

��ÿ����ϵ��ֵ����������,ÿ�����һ�����


��������:

5 5


�������:

1 4
2 3
5
 */
public class ��δ��03��� {
    public static void main(String[] args) {
	    Scanner scanner = new Scanner(System.in);
	    
	    	int n= scanner.nextInt();
	    	int m = scanner.nextInt();
	    	int i=1,j=n;
	    	while(i<=j){
	    		if(i==m){
	    			System.out.println(i);
	    			break;
	    		}else if(i+j==m){
	    			System.out.println(i+" "+j);
	    			i++;j--;
	    			continue;
	    		}else if(j==m){
	    			System.out.println(j);
	    			j--;
	    			continue;
	    		}else if(i+j>m){
	    			j--;
	    		}
	    	
	    }
    }
}
