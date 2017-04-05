package ½£Ö¸Offer;

public class GreatestSumOfSubarrays_31 {
	public static int FindGreatestSumOfSubArray(int[] array) {
        if(array == null || array.length == 0){
            return 0;
        }
        int res = array[0];
        int cur = array[0];
        for(int i = 1;i < array.length;i++){
            cur = cur < 0 ? 0 : cur;
            cur += array[i];
            res = Math.max(res,cur);
        }
        return res;
    }
	public static int solutionByDP(int[] array){
		if(array == null || array.length == 0){
            return 0;
        }
		int[] dp = new int[array.length];
		dp[0]=array[0];
		 for(int i = 1;i < array.length;i++){
			 if(dp[i-1]<=0){
				 dp[i]=array[i];
			 }else{
				 dp[i]=dp[i-1]+array[i];
			 }
		 }
		 return dp[array.length-1];
	}
	public static void main(String[] args) {
		int[] a = new int[]{1,-2,3,10,-4,7,2,-5};
		System.out.println(FindGreatestSumOfSubArray(a));
		System.out.println(solutionByDP(a));
	}
}
