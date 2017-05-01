package 剑指Offer;

import java.util.ArrayList;
/*
 * 输入一个正数sum，求所有和为sum的连续正数序列（至少有两个数）
 */
public class ContinuesSquenceWithSum_41 {

	public ArrayList<ArrayList<Integer> > FindContinuousSequence(int sum) {
	       int small = 1;
	       int big = 2;
	        int middle = (1+sum) / 2;
	        int curSum = small + big;
	        ArrayList<ArrayList<Integer>> lists = new ArrayList<ArrayList<Integer>>();
	        while(small<middle){
	            if(curSum == sum){
	                lists.add(addContinuousSequence(small,big));
	            }
	            while(small < middle && curSum > sum){
	                curSum -= small;
	                small ++;
	                
	                if(curSum == sum){
	                    lists.add(addContinuousSequence(small,big));
	                }
	            }
	            big++;
	            curSum += big;
	        }
	        return lists;
	    }
	    public static ArrayList<Integer> addContinuousSequence(int small,int big){
	        ArrayList<Integer> list = new ArrayList<Integer>();
	        for(int i=small;i<=big;i++){
	            list.add(i);
	        }
	        return list;
	    }
}
