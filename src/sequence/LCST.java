package sequence;



/*
 * 最长公共子串
 */

public class LCST {

	public static void main(String[] args) {
		String s1 = "1ab2345cd";
		String s2 = "12345ef";
		System.out.println(lcst(s1, s2));
	}
	public static String lcst(String s1,String s2){
		if(s1==null || s2 == null || s1.equals("") || s2.equals("")){
			return "";
		}
		char[] chs1 = s1.toCharArray();
		char[] chs2 = s2.toCharArray();
		int [][] dp = getdp(chs1,chs2);
		int end=0;
		int max = 0;
		for(int i=0;i<chs1.length;i++){
			for(int j=0;j<chs2.length;j++){
				if(dp[i][j]>max){
					end=i;
					max=dp[i][j];
				}
			}
		}
		return s1.substring(end-max+1, end+1);
	}

	private static int[][] getdp(char[] chs1, char[] chs2) {
		int [][] dp = new int[chs1.length][chs2.length];
		for(int i=0;i<chs1.length;i++){
			if(chs1[i]==chs2[0]){
				dp[i][0] = 1;
			}
		}
		for(int j=0;j<chs2.length;j++){
			if(chs1[0]==chs2[j]){
				dp[0][j]=1;
			}
		}
		for(int i=1;i<chs1.length;i++){
			for(int j=1;j<chs2.length;j++){
				if(chs1[i]==chs2[j]){
					dp[i][j]=dp[i-1][j-1]+1;
				}
			}
		}
		return dp;
	}
}
