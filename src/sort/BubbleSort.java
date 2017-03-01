package sort;


public class BubbleSort {
    
    public static void bubbleSort(int[] arr) {//��Ҫ��������ַ���һ��������
    	  //�ж���Ҫ����������Ƿ�Ϊ�գ�Ϊ���򲻽�������
        if(arr == null || arr.length == 0)
            return ;
        //i������ѭ�����ܹ���Ҫ�����ٸ����ֽ�������j������ѭ����ÿ��ѭ�����Ὣ�������ŵ��ұ�
        for(int i=0; i<arr.length-1; i++) {
            for(int j=i; j<arr.length-i-1; j++) {
            		//���ǰ������ִ��ں�������־ͽ�ǰ������ֺͺ�������ֽ��н�����ֱ���������ֱ��ŵ����Ҳ�
                if(arr[j] > arr[j+1]) {
                    swap(arr, j+1, j);
                }
            }
        }
    }
    
    //�����������ֵ�λ��
    public static void swap(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
}