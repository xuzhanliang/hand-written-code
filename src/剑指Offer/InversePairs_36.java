package 剑指Offer;

/*
 * 
 * 例如在数组{7, 5, 6, 4} 中， 一共存在5 个逆序对，分别是（7, 6）、（7，5），(7, 4）、（6, 4）和（5, 4）。
 * 解法：
 * 　我们先用两个指针分别指向两个子数组的末尾，并每次比较两个指针指向的数字。
 * 如果第一个子数组中的数字大于第二个子数组中的数字，则构成逆序对，并且逆序对的数目等于第二个子数组中剩余数字的个数（如图5.2 (a)和图5.2 (c)所示）。
 * 如果第一个数组中的数字小于或等于第二个数组中的数字，则不构成逆序对（如图5.2 (b)所示〉。
 * 每一次比较的时候，我们都把较大的数字从·后往前复制到一个辅助数组中去，确保辅助数组中的数字是递增排序的。
 * 在把较大的数字复制到辅助数组之后，把对应的指针向前移动一位，接下来进行下一轮比较。 
　　经过前面详细的诗论， 我们可以总结出统计逆序对的过程：先把数组分隔成子数组， 先统计出子数组内部的逆序对的数目，然后再统计出两个相邻子数组之间的逆序对的数目。
在统计逆序对的过程中，还需要对数组进行排序。
如果对排序贺，法很熟悉，我们不难发现这个排序的过程实际上就是归并排序。
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

		// 前半段的最后一个数字下标
		int i = start + length;
		// 后半段最后一个数字的下标
		int j = end;
		// 开始拷贝的位置
		int indexCopy = end;
		// 逆序对
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
