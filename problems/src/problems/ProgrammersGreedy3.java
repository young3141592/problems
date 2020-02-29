package problems;

import java.util.Arrays;

public class ProgrammersGreedy3 {

	public static void main(String[] args) {
		int[] people = {70, 50, 80, 50};
		int limit = 100;
		int answer = 0;
		int temp = -1;
		
		Arrays.sort(people);
		for(int i=0; i<people.length; i++) {
			
		}
		
		for(int i : people) {
			if(i >= limit) {
				answer++;
			} else {
				if(temp == -1) {
					temp = i;
				} else {
					if(temp + i > limit) {
						temp = i;
						answer++;
					} else {
						temp = -1;
						answer++;
					}
				}
			}
		}
		if(temp > 0) {
			answer++;
		}

		System.out.println(answer);
	}
}
