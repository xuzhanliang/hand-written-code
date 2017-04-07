package 刷题遇到的算法题;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class 好未来05 {
	public static void main(String[] args) {
		Scanner scanner =new Scanner(System.in);
		String string = scanner.nextLine();
		String[] strs = string.split(" ");
		int k = Integer.parseInt(strs[strs.length-1]);
		ArrayList<Integer> list = new ArrayList<Integer>();
		for(int i=0;i<strs.length-1;i++){
			list.add(Integer.parseInt(strs[i]));
		}
		Collections.sort(list);
		for(int i=0;i<k-1;i++){
			System.out.print(list.get(i)+" ");
		}
		System.out.println(list.get(k-1));
	}
}
