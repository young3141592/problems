package problems;

import java.util.Scanner;

public class CodeGroundProblem11 {
	static int Answer;	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();		
		for(int test_case = 0; test_case < T; test_case++) {
			int number = sc.nextInt();			
			int[] stones = new int[number];
			int location = 0;
			int max_leap = 0;
			for(int i = 0; i < number; i++){
				stones[i] = sc.nextInt();
			}
			max_leap = sc.nextInt();
			
			for(int k = 0; k < number; k++) {
				if(k == 0) {
					if(location + max_leap < stones[k]) {
						Answer = -1;
						break;
					}
				} else {
					if(stones[k-1] + max_leap < stones[k]) {
						Answer = -1;
						break;
					}
				} 
				if(location + max_leap < stones[k]) {
					Answer++;
					location = stones[k-1];					
				}
				if(k == number - 1) {
					if(location + max_leap >= stones[k]) {
						Answer++;
						location = stones [k];
					}
				}
			}
			// Print the answer to standard output(screen).
			System.out.println("Case #"+(test_case+1));
			System.out.println(Answer);
			Answer = 0;				
		}
	}
}
