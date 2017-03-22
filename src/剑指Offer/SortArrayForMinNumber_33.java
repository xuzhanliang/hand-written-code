package ½£Ö¸Offer;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class SortArrayForMinNumber_33 {

	public static void main(String[] args) {
		int[] a = new int[]{3,32,321};
		System.out.println(PrintMinNumber(a));
	}
	public static String PrintMinNumber(int [] numbers) {

		int n = numbers.length;
		String string= "";
		ArrayList<Integer> list = new ArrayList<Integer>();
		for(int i=0;i<n;i++){
			   list.add(numbers[i]);
		}
		Collections.sort(list, new Comparator<Integer>() {

			@Override
			public int compare(Integer str1,Integer str2) {
				String s1 = str1+""+str2;
				String s2 = str2+""+str1;
				return s1.compareTo(s2);
			}
		});
		for(int j:list){
			string+=j;
			  }
		return string; 
		
    }
}
