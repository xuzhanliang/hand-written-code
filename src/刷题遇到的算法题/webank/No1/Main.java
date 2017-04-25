package 刷题遇到的算法题.webank.No1;

import java.util.Scanner;

/*
 * 分配
时间限制：C/C++语言 1000MS；其他语言 3000MS
内存限制：C/C++语言 65536KB；其他语言 589824KB
题目描述：
最近公司收到了一项任务。这项任务太繁重了，以至于要分割成几部分交给不同的人做才能完成。公司有三类员工，每类员工分别能完成5,8,10 KB代码量。经理在估计了任务所需代码量后，想知道有多少种分配方案能刚刚好完成任务。
输入
输入第一行一个整数n(1<=n<=10000)，表示任务所需代码量为n KB。
接下来第二行三个整数a,b,c(0<=a,b,c<=10000)，分别表示第一、二、三类员工的数量。
输出
输出一行一个整数，表示方案个数。

样例输入
23
3 2 3
样例输出
2
 */
public class Main {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		while(scanner.hasNext()){
			int n = scanner.nextInt();
			int a = scanner.nextInt();
			int b = scanner.nextInt();
			int c = scanner.nextInt();
			
			int count = 0;
			for(int i=0;i<=a;i++){
				for(int j=0;j<=b;j++){
					for(int k=0;k<=c;k++){
						int res = i*5+j*8+k*10;
						if(res>n){
							continue;
						}else if(res==n){
							count++;
							continue;
						}else{
							continue;
						}
					}
				}
			}
			System.out.println(count);
		}
	}
}
