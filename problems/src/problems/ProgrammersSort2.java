package problems;

import java.util.Arrays;
import java.util.Comparator;

public class ProgrammersSort2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] numbers = {0, 0, 0};
		Integer[] nums = new Integer[numbers.length];
		for(int i=0; i<numbers.length; i++) {
			nums[i] = numbers[i];
		}
		
		String answer = ""; 
		Arrays.sort(nums, new Comparator<Integer>() {
			@Override
			public int compare(Integer p1, Integer p2) {
				int p_length = 0;
				
				p_length = p1.toString().length() - p2.toString().length();
								
				if(p_length == 0) {
					return p1 - p2;
				} else {
					return Integer.parseInt(p1.toString().concat(p2.toString())) - Integer.parseInt(p2.toString().concat(p1.toString()));
					}
				}
		});
		
		for(int i = numbers.length - 1; i >= 0 ; i--) {
			answer = answer + nums[i].toString();
		}
		if(answer.charAt(0) == '0') {
			answer = "0";
		}
		System.out.println(answer);
	}

}