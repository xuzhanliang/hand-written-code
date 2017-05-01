package 剑指Offer;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class NumbersAppearOnce_40 {

	//num1,num2分别为长度为1的数组。传出参数
	//将num1[0],num2[0]设置为返回结果
	
	public void FindNumsAppearOnce(int [] array,int num1[] , int num2[]) {
	    ArrayList<Integer> list = new ArrayList<Integer>();
	    for(int i = 0;i<array.length;i++){
	    	if(!list.contains(array[i])){
	    		list.add(array[i]);
	    	}else{
	    		list.remove(new Integer(array[i]));
	    	}
	    }
	    if(list.size()>1){
	    	num1[0] = list.get(0);
	    	num2[0] = list.get(1);
	    }
	}
	
}
