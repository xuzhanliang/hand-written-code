package CodingInterviewGuide.Chapter4;

/**
 * 矩阵的最小路径和
 * @author Administrator
 *
 */
public class minPathSum {

	public static void main(String[] args) {
		int[][] m=new int[][]{{1,3,5,9},{8,1,3,4},{5,0,6,1},{8,8,4,0}};
		System.out.println(minPathSum1(m));
		}
	
	public static int minPathSum1(int[][] m){
		if(m == null || m.length == 0 || m[0] == null || m[0].length == 0){
			return 0;
		}
		int row = m.length;
		int col = m[0].length;
		int [][] dp = new int[row][col];
		dp[0][0]=m[0][0];
		for(int i=1;i<row;i++){
			dp[i][0]=dp[i-1][0] + m[i][0];
		}
		for(int j=1;j<col;j++){
			dp[0][j] = dp[0][j-1]+m[0][j];
		}
		for(int i=1;i<row;i++){
			for(int j=1;j<col;j++){
				dp[i][j] = Math.min(dp[i-1][j], dp[i][j-1]) + m[i][j];
			}
		}
		return dp[row-1][col-1];
	}
	
}
