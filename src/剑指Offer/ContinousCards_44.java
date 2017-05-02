package ½£Ö¸Offer;

import java.util.HashSet;
import java.util.Set;
import java.util.concurrent.locks.Lock;

public class ContinousCards_44 {

	public boolean isContinuous(int [] numbers) {

		if(numbers.length != 5){
			return false;
		}
		int min = Integer.MAX_VALUE;
		int max = Integer.MIN_VALUE;
		Set<Integer> set = new HashSet<Integer>();
		for(int a : numbers){
			if(!set.add(a) && a != 0){
				return false;
			}
			if(a != 0){
				min = Math.min(min, a);
				max = Math.max(max, a);
			}
		}
		if(max - min < 5){
			return true;
		}
		
		return false;
    }
}
