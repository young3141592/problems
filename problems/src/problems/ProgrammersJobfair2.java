package problems;

import java.util.Arrays;

public class ProgrammersJobfair2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] people = {2, 3};
		int[] tshirts = {1, 2, 3};
		int answer = 0;
		int temp = 0;
		
		Arrays.sort(people);
		Arrays.sort(tshirts);
		
		for(int i=0; i<people.length; i++) {
			for(int j=temp; j<tshirts.length; j++) {
				if(people[i] <= tshirts[j]) {
					answer++;
					temp = j+1;
					break;
				}
			}
		}
		
		System.out.println(answer);
	}

}
