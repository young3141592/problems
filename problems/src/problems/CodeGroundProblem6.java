package problems;

import java.util.Scanner;

public class CodeGroundProblem6 {
	
	static long Answer;
	static int x, y;		
	static int size_of_lattics;
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();
		for(int test_case = 0; test_case < T; test_case++) {	
			size_of_lattics = sc.nextInt();
			int number_of_moves = sc.nextInt();
			String moves = sc.next();
			
			for(int i = 0; i < number_of_moves; i++) {
				if(moves.charAt(i) == 'D') {
					y++;
				} 
				if(moves.charAt(i) == 'U') {
					y--;
				} 
				if(moves.charAt(i) == 'R') {
					x++;
				} 
				if(moves.charAt(i) == 'L') {
					x--;
				}
				Answer += calculate_points(x, y);
			}
			
			// Print the answer to standard output(screen).
			System.out.println("Case #"+(test_case+1));
			System.out.println(Answer);
			Answer = 1;
			x = 0;
			y = 0;
		}		
	}
	
	public static long calculate_points(int x, int y) {
		int score = 0;
		if( x + y + 1 <= size_of_lattics) {
			if((x + y) % 2 == 0) {
				score = (x + y) * (x + y + 1) / 2 + x + 1;
			} else {
				score = (x + y) * (x + y + 1) / 2 + y + 1;
			}
		} else {
			if((x + y) % 2 == 0) {
				score = (x + y) * (x + y + 1) / 2 - ((x + y) - size_of_lattics) * ((x + y) - size_of_lattics + 1) + size_of_lattics - y;
			} else {
				score = (x + y) * (x + y + 1) / 2 - ((x + y) - size_of_lattics) * ((x + y) - size_of_lattics + 1) + size_of_lattics - x;
			}
		}
		
		return score;
		
	}
}
