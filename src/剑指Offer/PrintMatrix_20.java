package ��ָOffer;

public class PrintMatrix_20 {

	public static void main(String[] args) {
		int[][] a = create(5, 5);
		print(a);
		clockWiselyPrint(a,5,5);
	}
	public static void clockWiselyPrint(int[][] a,int columns,int rows){
		if(a == null || columns<=0 || rows <=0){
			return ;
		}
		int start = 0;
		while(columns > start * 2 && rows >start * 2){
			printMatrixInCircle(a,columns,rows,start);
			++start;
		}
	}
	private static void printMatrixInCircle(int[][] a, int columns, int rows,
			int start) {
		int endX = columns - 1 - start;//��ֹ�к�
		int endY = rows - 1 - start;//��ֹ�к�
		//�����Ҵ�ӡһ��
		for(int i =start;i<=endX;i++){
			System.out.print(a[start][i]+" ");
		}
		//���ϵ��´�ӡ��ǰ����ֹ�кŴ�����ʼ�к�
		if(start<endY){
			for(int i = start +1;i<=endY;i++){
				System.out.print(a[i][endX]+" ");
			}
		}
		//���ҵ����ӡһ�У�ǰ����ֹ�к���ֹ�кŶ�������ʼ�к�
		if(start<endX && start < endY){
			for(int i = endX -1;i>=start;i--){
				System.out.print(a[endY][i]+" ");
			}
		}
		//���µ��ϴ�ӡһ��
		if(start<endX && start < endY - 1){
			for(int i=endY-1;i>=start+1;i--){
				System.out.print(a[i][start]+" ");
			}
		}
	}
	public static int[][] create(int columns, int rows) {
		int[][] a=new int[rows][columns];
		int num=1;
		for(int i=0;i<rows;i++){
			for(int j=0;j<columns;j++){
				a[i][j]=num++;
			}
		}
		return a;
	}
	private static void print(int[][] a) {
		for(int i=0;i<a.length;i++){
			for(int j=0;j<a[i].length;j++){
				System.out.print(a[i][j]+" ");
			}
			System.out.println();
		}
	}
}
