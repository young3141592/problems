package problems;

import java.util.LinkedList;
import java.util.Queue;

public class ProgrammersStack {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String arrangement = "()(((()())(())()))(())";
//		String arrangement = "(((()())(())()))";
		Queue<String> queue = new LinkedList<>();
		int answer = 0;
		
		for(int i=0; i<arrangement.length(); i++) {
//			System.out.println(queue.size());
			if((arrangement.charAt(i) == ')') && (arrangement.charAt(i-1) == '(')) {
				queue.poll();
				answer += queue.size();		
				System.out.println("1 : " + answer);
			} else if ((arrangement.charAt(i) == ')') && !(arrangement.charAt(i-1) == '(')) {
				queue.poll();
				answer += 1;
//				System.out.println("2 : " + answer);
			} else {
				queue.add(Character.toString(arrangement.charAt(i)));
			}
		}
		
		System.out.println(answer);
	}

}
