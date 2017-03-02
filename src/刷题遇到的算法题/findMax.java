package 刷题遇到的算法题;

import java.util.Scanner;

/*
 * 在一个N*N的数组中寻找所有横，竖，左上到右下，右上到左下，四种方向的直线连续D个数字的和里面最大的值
 * 输入格式：
 * N D
 * 矩阵
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
		//水平查找和垂直查找
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
