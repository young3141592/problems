package problems;

import java.util.Arrays;

public class ProgrammersSort3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] citations  = {0, 0, 0};
		int answer = 0;
		int temp = 0;
		
		
		Arrays.sort(citations);
		if(citations[citations.length-1] == 0) {
			answer = 0;
		} else {
			for(int i=0; i<citations.length; i++) {
				for(int j=0; j<citations.length; j++) {
					if(i+1 <= citations[j]) {
						temp = citations.length - j;
						break;
					}
				}
				if(i+1 >= temp) {
					answer = i+1;
					break;
				}
			}			
		}
		
		System.out.println(answer);
		
	}

}
