package problems;

import java.util.Arrays;
import java.util.function.BiFunction;

public class ProgrammersStack1 {

	public static void main(String[] args) {
		int[] heights = {3,9,9,3,5,7,2};
		int[] answer =new int[heights.length] ;
		
		BiFunction<Integer, Integer, Integer> f = (x, y) -> {
			int nth = 0;
			
			for(int i=x; i>=0; i--) {
				if(heights[i] > y) {
					nth = i+1;
					break;
				}
			}
			return nth;
		};
		
		for(int i=0; i<heights.length; i++) {
			answer[i] = f.apply(i, heights[i]);
		}
		
		Arrays.stream(answer).forEach(x -> System.out.println(x));
		
	}

}
