package sort;

public class InsertSort {

	public static void insertSort(int[] arr){
		if(arr == null || arr.length ==0){
			return ;
		}
		//�ӵڶ�������ʼѭ��
		for(int i=1;i<arr.length;i++){
			int j = i;//��¼��ǰ�����±����ֵ
			int target = arr[j];
			while(j>0 && target<arr[j-1]){//�ѵ�ǰ����ǰ��Ƚϣ�ֱ���ƶ����ʵ���λ�ã��õ�jֵ
				arr[j] = arr[j-1];
				j--;
			}
			//�ѵ�ǰ��ֵ���뵽���λ��ǰ
			arr[j] = target;
		}
	}
}
