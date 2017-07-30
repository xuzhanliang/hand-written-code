package ��ָOffer;

/*
 * ˳ʱ���ӡ����
 */
public class PrintMatrixClockWisely_20 {

	public static void printMatrixClockWisely(int[][] numbers) {
		if (numbers == null) {
			return;
		}
		// ��¼һȦ�Ŀ�ʼλ�õ���
		int x = 0;
		// ��¼һȦ�Ŀ�ʼλ�õ���
		int y = 0;
		while (x * 2 < numbers.length && y * 2 < numbers[0].length) {
			printMatrixInCircle(numbers, x, y);
			x++;
			y++;
		}
	}

	private static void printMatrixInCircle(int[][] numbers, int x, int y) {
		// ���������
		int rows = numbers.length;
		// ���������
		int cols = numbers[0].length;

		// ���������һ�У�����
		for (int i = y; i <= cols - y - 1; i++) {
			System.out.print(numbers[x][i] + " ");
		}
		// ����ұ�һ��
		// ����:��ֹ�С���ʼ��
		if (rows - x - 1 > x) {
			for (int i = x + 1; i <= rows - x - 1; i++) {
				System.out.print(numbers[i][cols - y - 1] + " ");
			}
		}
		// ���������һ��
		// �����������������У��� ��ֹ�С���ʼ�� �� ��ֹ�С���ֹ��
		if (rows - x - 1 > x && cols - y - 1 > y) {
			for (int i = cols - y - 2; i >= y; i--) {
				System.out.print(numbers[rows - x - 1][i] + " ");
			}
		}
		// ��������һ��
		// ����������3��2�У��� ��ֹ�С���ʼ��+2 �� ��ֹ�С���ʼ��
		if (rows - x - 1 > x + 1 && cols - y - 1 > y) {
			for(int i = rows-x-2;i>=x+1;i--){
				System.out.print(numbers[i][y] + " ");
			}
		}
	}
	public static void main(String[] args) {
		int[][] numbers = {
				{1,2,3,4},
				{5,6,7,8},
				{9,10,11,12},
				{13,14,15,16},
		};
		printMatrixClockWisely(numbers);
	}
}
