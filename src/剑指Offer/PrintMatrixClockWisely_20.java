package 剑指Offer;

/*
 * 顺时针打印矩阵
 */
public class PrintMatrixClockWisely_20 {

	public static void printMatrixClockWisely(int[][] numbers) {
		if (numbers == null) {
			return;
		}
		// 记录一圈的开始位置的行
		int x = 0;
		// 记录一圈的开始位置的列
		int y = 0;
		while (x * 2 < numbers.length && y * 2 < numbers[0].length) {
			printMatrixInCircle(numbers, x, y);
			x++;
			y++;
		}
	}

	private static void printMatrixInCircle(int[][] numbers, int x, int y) {
		// 数组的行数
		int rows = numbers.length;
		// 数组的列数
		int cols = numbers[0].length;

		// 输出环上面一行，必有
		for (int i = y; i <= cols - y - 1; i++) {
			System.out.print(numbers[x][i] + " ");
		}
		// 输出右边一列
		// 条件:终止行》起始行
		if (rows - x - 1 > x) {
			for (int i = x + 1; i <= rows - x - 1; i++) {
				System.out.print(numbers[i][cols - y - 1] + " ");
			}
		}
		// 输出环下面一行
		// 条件：至少两行两列，即 终止行》起始行 且 终止列》终止列
		if (rows - x - 1 > x && cols - y - 1 > y) {
			for (int i = cols - y - 2; i >= y; i--) {
				System.out.print(numbers[rows - x - 1][i] + " ");
			}
		}
		// 输出环左边一列
		// 条件：至少3行2列，即 终止行》起始行+2 且 终止列》起始列
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
