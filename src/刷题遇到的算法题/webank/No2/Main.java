package 刷题遇到的算法题.webank.No2;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Main {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		while(scanner.hasNext()){
			Set<String> set = new HashSet<String>();
           // Set<Integer> lineset = new HashSet<Integer>();
			int[] vx = new int[4];
			int[] vy= new int[4];
			for(int i=0;i<4;i++){
                
				int x1=scanner.nextInt();
				int y1=scanner.nextInt();
				int x2=scanner.nextInt();
				int y2=scanner.nextInt();
				set.add(x1+"-"+y1);
				set.add(x2+"-"+y2);
				vx[i] = x2 - x1;
				vy[i] = y2 - y1;
               // lineset.add((x2-x1)*(x2-x1)+(y2-y1)*(y2-y1));
			}
			if(set.size()!=4){
				System.out.println("NO");
				continue;
			}
            //if(lineset.size()>2){
            //    System.out.println("NO");
			//	continue;
          //  }
			
			boolean flag =false;
			for(int i=0;i<4;i++){
				for(int j=0;j<4;j++){
					if(i!=j){
						if((vx[i]*vx[j]+vy[i]*vy[j] == 0)){
							flag=true;break;
						}
					}
				}
				if(flag==true) break;
			}
			if(flag){
				System.out.println("YES");
			}else{
				System.out.println("NO");
			}
			/*
			boolean flag = true;
			for(int i=1;i<4;i++){
				if(!(vx[0]*vx[i]+vy[0]*vy[i] == 0 || vx[0]*vy[i]-vy[0]*vx[i]==0)){
					flag = false;
					break;
				}
			}
			if(flag){
				System.out.println("YES");
			}else{
				System.out.println("NO");
			}*/
		}
	}
}