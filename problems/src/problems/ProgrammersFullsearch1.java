package problems;

import java.util.Arrays;
import java.util.Comparator;

public class ProgrammersFullsearch1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] answers = {1,2,3,4,5};
		int[] math1Way = {1, 2, 3, 4, 5};
		int[] math2Way = {2, 1, 2, 3, 2, 4, 2, 5};
		int[] math3Way = {3, 3, 1, 1, 2, 2, 4, 4, 5, 5};
		int correct[] = {0, 0, 0};		
		
		for(int i=0; i<answers.length; i++) {
			if(answers[i] == math1Way[i%math1Way.length]) {
				correct[0]++;				
			}
			if(answers[i] == math2Way[i%math2Way.length]) {
				correct[1]++;
			}
			if(answers[i] == math3Way[i%math3Way.length]) {
				correct[2]++;
			}
		}
		
		System.out.println(correct[0] + "/" + correct[1] + "/" + correct[2]);
		
		if(correct[0] == correct[1] && correct[1] == correct[2]) {
			int answer[] = {1, 2, 3};
			//return answer;
		} else if(correct[0] == correct[1] || correct[1] == correct[2] || correct[2] == correct[0]) {
			if(correct[0] == correct[1]) {
				if(correct[0] > correct[2]) {
					int answer[] = {1, 2};
					//return answer;
				} else {
					int answer[] = {3};
					//return answer;
				}
			} else if(correct[1] == correct[2]) {
				if(correct[1] > correct[0]) {
					int answer[] = {2, 3};
					//return answer;
				} else {
					int answer[] = {1};
					//return answer;
				}				
			} else {
				if(correct[2] > correct[1]) {
					int answer[] = {1, 3};
					//return answer;
				} else {
					int answer[] = {2};
					//return answer;
				}
			}				
		} else {
			int temp1 = 0, temp2 = -1;
			for(int i=0; i<correct.length; i++) {
				if(correct[i] > temp2) {
					temp1 = i;
					temp2 = correct[i];
				}
			}
			
			int answer[] = {temp1+1};
			//return answer;
		}		
	}
}