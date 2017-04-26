package 刷题遇到的算法题.qunar.No3;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		while(in.hasNext()){
			String str1 = in.nextLine();
			if(str1.length()!=18){
				System.out.println("ERROR");
			}else{
				System.out.println(str1.substring(6	, 14));
			}
		}
	}
}
