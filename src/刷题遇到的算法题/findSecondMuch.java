package 刷题遇到的算法题;

import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/*
 * 找出数组出现次数第二多的数字
 */

public class findSecondMuch {

	public static int find(int[] array) {
		HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();
		for(int i=0;i<array.length;i++){
			if (map.containsKey(array[i])) {
				int count = map.get(array[i]);
				map.put(array[i], count + 1);
			}else{
				map.put(array[i], 1);
			}
		}
		Collection<Integer> count = map.values();
		int maxCount = Collections.max(count);
		int maxNumber=0;
		for(Map.Entry<Integer, Integer> entry : map.entrySet()){
			if(entry.getValue()==maxCount){
				maxNumber=entry.getKey();
			}
		}
		
		return maxNumber;
	}
	public static void main(String[] args) {
		int[] list= new int[]{1,2,3,4,5,6,7,8,9,1,2,3,3,3,3,3};
		System.out.println(find(list));
	}
}
