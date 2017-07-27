package CodingInterviewGuide.Chapter8;

/*
 * δ���������������ۼӺ�Ϊ����ֵ��������鳤��
 * 
 * */

public class maxSumSubArr {

	public int getMaxLength(int[] arr,int k){
		if(arr == null || arr.length == 0 || k<=0){
			return 0;
		}
		int left = 0;
		int right = 0;
		int sum = arr[0];
		int len = 0;
		while(right < arr.length){
			if(sum == k){
				len = Math.max(len , right - left +1);
				sum -= arr[left++];
			}else if(sum < k){
				right++;
				if(right==arr.length){
					break;
				}
			}else{
				sum -= arr[left++];
			}
		}
		return len;
		
	}
}
