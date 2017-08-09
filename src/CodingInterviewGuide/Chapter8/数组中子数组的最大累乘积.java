package CodingInterviewGuide.Chapter8;

/**
 * 以i位置结尾的情况
 * 三种情况：
 * 1、max*arr[i] 前面都是正数
 * 2、min*arr[i] 前面是负数，arr[i]也是负数
 * 3、仅是arr[i]
 * @author xyuser
 *
 */
public class 数组中子数组的最大累乘积 {

	public static double maxProduct(double[] arr){
		if(arr == null || arr.length == 0){
			return 0;
		}
		double max = arr[0];
		double min = arr[0];
		double res = arr[0];
		double maxEnd = 0;
		double minEnd = 0;
		for(int i = 1;i<arr.length;i++){
			maxEnd = max * arr[i];
			minEnd = max * arr[i];
			max = Math.max(Math.max(maxEnd, minEnd), arr[i]);
			min = Math.min(Math.min(maxEnd, minEnd), arr[i]);
			res = Math.max(res, max);
		}
		return res;
	}
	public static void main(String[] args) {
		double[] arr = new double[]{1,100,-2,-100};
		System.out.println(maxProduct(arr));
	}
}
