package problems;

import java.util.Arrays;
import java.util.Comparator;

public class ProgrammersFullsearch1_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] answers = {1,4,1,1,2, 1};
		int[] math_1_way = {1, 2, 3, 4, 5};
		int[] math_2_way = {2, 1, 2, 3, 2, 4, 2, 5};
		int[] math_3_way = {3, 3, 1, 1, 2, 2, 4, 4, 5, 5};
		Nums[] real_nums = new Nums[3];
		int cnt = 0;
		
		for(int i=0; i<3; i++) {
			real_nums[i] = new Nums();
			real_nums[i].idx = i+1;
			real_nums[i].val = 0;
		}
		
		for(int i=0; i<answers.length; i++) {
			if(answers[i] == math_1_way[i%math_1_way.length]) {
				real_nums[0].val = real_nums[0].val + 1;
			} 
			if(answers[i] == math_2_way[i%math_2_way.length]) {
				real_nums[1].val = real_nums[1].val + 1;					
			} 
			if(answers[i] == math_3_way[i%math_3_way.length]) {
				real_nums[2].val = real_nums[2].val + 1;
			}
		}
		
		Arrays.sort(real_nums, new Comparator<Nums>() {
			public int compare(Nums num1, Nums num2) {
				if(num1.val == num2.val) {
					return num2.idx - num1.idx;
				} else {
					return num2.val - num1.val;
				}
			}
		});
		
		for(int i=0; i<3; i++) {
			if(real_nums[i].val != 0) {
				cnt++;
			}
		}
		
		int[] answer = new int[cnt];
		
		for(int i=0; i<answer.length; i++) {
			answer[i] = real_nums[i].idx;
		}
		
		for(int i=0; i<cnt; i++) {
			System.out.println(answer[i]);
		}
		
	}

}

class Nums {
	Integer idx = 0;
	Integer val = 0;
	public Nums() {
		
	}
}