package JavaPractice;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

public class removeduplicate {
	public static void main(String[] args) {
		
		
		int arr[] = {1,2,3,4,1,2,3,4,12,13,14,15};
		
		ArrayList<Integer> num = new ArrayList<>();
		ArrayList<Integer> uniuqe = new ArrayList<>();//1,2,3,4,5
		Set<Integer> nums = new HashSet<>();//this is also uniqe elemet
		
		
		
		for(Integer a:arr) {
			
			num.add(a);
			
		if(!uniuqe.contains(a)) {
			
			uniuqe.add(a);
			nums.add(a);
		}
			
			
		}
		
		System.out.println("Original element: "+num);
		
		System.out.println("Unique element: "+uniuqe);
		
		System.out.println("Unique elemet: "+nums);
		
		
	}

}
