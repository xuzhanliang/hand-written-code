package 刷题遇到的算法题;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

/**
 * 字符串是否为一类
 * 输入：
 * 4
 * abcd
 * bcda
 * dabc
 * cbad
 * 
 * 输出：
 * 1
 * @author xyuser
 *
 */
public class NiuKe2 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Map<String, Integer> map = new HashMap<>();
		int n = sc.nextInt();
		String[] temp = new String[n];
		int count =0;
		for(int i=0;i<n;i++){
			temp[i] = sc.next();
			char[] a =temp[i].toCharArray();
			Arrays.sort(a);
			if(!map.containsKey(String.copyValueOf(a))){
				map.put(String.copyValueOf(a), 1);
				count++;
			}
		}
		System.out.println(count);
	}
}
