package ˢ���������㷨��;

import java.util.Scanner;

/*
 * ��һ��N*N��������Ѱ�����кᣬ�������ϵ����£����ϵ����£����ַ����ֱ������D�����ֵĺ���������ֵ
 * �����ʽ��
 * N D
 * ����
 */
public class findMax {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int N = scanner.nextInt();
		int D = scanner.nextInt();
		
		int[][] Datas = new int[N][N];
		for(int i=0;i<N;i++){
			for(int j=0;j<N;j++){
				Datas[i][j]=scanner.nextInt();
			}
		}
		int maxValue=0;
		//ˮƽ���Һʹ�ֱ����
		for(int i=0;i<N;i++){
			for(int j=0;j<N-D+1;j++){
				int sumLevel =0;
				int sumHigh = 0;
				for(int k=0;k<D;k++){
					sumLevel=sumLevel+Datas[i][j+k];
					sumHigh = sumHigh + Datas[j+k][i];
				}
				int temp;
				if(sumHigh>sumLevel) temp=sumHigh;
				else temp = sumLevel;
				if(temp>maxValue){
					maxValue=temp;
				}
			}
		}
		for (int i=0;i<N-D+1;i++){
            for (int j=0;j<N-D+1;j++){
                int sumL=0;
                int sumR=0;
                for (int k=0;k<D;k++){
                    sumR=Datas[i+k][N-j-1-k]+sumR;
                    sumL=Datas[i+k][j+k]+sumL;
                }
                int temp;
                if (sumR>sumL) temp=sumR;else temp=sumL;
                if (temp>maxValue) maxValue=temp;
            }
        }
		System.out.println(maxValue);
	}
}
