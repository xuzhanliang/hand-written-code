package ��ָOffer;

/*
 * 
 * ����������{7, 5, 6, 4} �У� һ������5 ������ԣ��ֱ��ǣ�7, 6������7��5����(7, 4������6, 4���ͣ�5, 4����
 * �ⷨ��
 * ��������������ָ��ֱ�ָ�������������ĩβ����ÿ�αȽ�����ָ��ָ������֡�
 * �����һ���������е����ִ��ڵڶ����������е����֣��򹹳�����ԣ���������Ե���Ŀ���ڵڶ�����������ʣ�����ֵĸ�������ͼ5.2 (a)��ͼ5.2 (c)��ʾ����
 * �����һ�������е�����С�ڻ���ڵڶ��������е����֣��򲻹�������ԣ���ͼ5.2 (b)��ʾ����
 * ÿһ�αȽϵ�ʱ�����Ƕ��ѽϴ�����ִӡ�����ǰ���Ƶ�һ������������ȥ��ȷ�����������е������ǵ�������ġ�
 * �ڰѽϴ�����ָ��Ƶ���������֮�󣬰Ѷ�Ӧ��ָ����ǰ�ƶ�һλ��������������һ�ֱȽϡ� 
��������ǰ����ϸ��ʫ�ۣ� ���ǿ����ܽ��ͳ������ԵĹ��̣��Ȱ�����ָ��������飬 ��ͳ�Ƴ��������ڲ�������Ե���Ŀ��Ȼ����ͳ�Ƴ���������������֮�������Ե���Ŀ��
��ͳ������ԵĹ����У�����Ҫ�������������
���������أ�������Ϥ�����ǲ��ѷ����������Ĺ���ʵ���Ͼ��ǹ鲢����
 */
public class InversePairs_36 {

	public static int inversePairs(int[] data) {
		if (data == null || data.length < 1) {
			return 0;
		}
		int[] copy = new int[data.length];
		System.arraycopy(data, 0, copy, 0, data.length - 1);
		return inversePairsCore(data, copy, 0, data.length - 1);
	}

	private static int inversePairsCore(int[] data, int[] copy, int start, int end) {
		if (start == end) {
			copy[start] = data[start];
			return 0;
		}
		int length = (end - start) / 2;
		int left = inversePairsCore(copy, data, start, start + length);
		int right = inversePairsCore(copy, data, start + length + 1, end);

		// ǰ��ε����һ�������±�
		int i = start + length;
		// �������һ�����ֵ��±�
		int j = end;
		// ��ʼ������λ��
		int indexCopy = end;
		// �����
		int count = 0;
		while (i >= start && j >= start + length + 1){
			if(data[i] > data[j]){
				copy[indexCopy] = data[i];
				indexCopy--;
				i--;
				count += j - (start+length);
			}else{
				copy[indexCopy] = data[j];
				indexCopy--;
				j--;
			}
			for(;i >= start;){
				copy[indexCopy] = data[i];
				indexCopy--;
				i--;
			}
			for(;j >= start+length+1;){
				copy[indexCopy] = data[j];
				indexCopy--;
				j--;
			}
		}
			return count + left + right;
	}

	public static void main(String[] args) {
		int[] data = {7,5,6,4};
		System.out.println(inversePairs(data));
	}
}
