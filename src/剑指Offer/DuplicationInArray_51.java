package 剑指Offer;

import java.util.Arrays;

/*
 * 数组中重复的数字
 */
public class DuplicationInArray_51 {

	public static boolean duplicate(int[] numbers,int length,int[] duplication) {
			if(numbers == null || numbers.length == 0)
				return false;
			Arrays.sort(numbers);
			int flag = 0;//做标记
			for(int i=0;i<length-1;i++) {
				if(numbers[i] == numbers[i+1]) {
					duplication[0] = numbers[i];
					flag = 1;
					break;
				}
			}
			return flag == 1? true:false;
		
	}
}
