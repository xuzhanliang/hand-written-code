package CodingInterviewGuide.Chapter8;

/**
 * ��iλ�ý�β�����
 * ���������
 * 1��max*arr[i] ǰ�涼������
 * 2��min*arr[i] ǰ���Ǹ�����arr[i]Ҳ�Ǹ���
 * 3������arr[i]
 * @author xyuser
 *
 */
public class �����������������۳˻� {

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
