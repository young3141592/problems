package problems;

import java.util.Scanner;

public class CodeGorundProblem12 {
	static int Answer;	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();		
		for(int test_case = 0; test_case < T; test_case++) {
			int size = sc.nextInt();
			int x = 0, y = 0, direction = 1;
			String[] the_room = new String[size];
			char[][] the_room_check = new char[size][];
			for(int i = 0; i < size; i++) {
				the_room[i] = sc.next();
				the_room_check[i] = new char[the_room[i].length()];
			}
			while((x >= 0 && x < size) && (y >= 0 && y < size)) {
				if(the_room[y].charAt(x) == '1') {
					if(the_room_check[y][x] != '1') {
						Answer++;
						the_room_check[y][x] = '1';
					}
					if(direction == 1) {
						y--;
						direction = 4;
					} else if(direction == 2) {
						x--;
						direction = 3;
					} else if(direction == 3) {
						y++;
						direction = 2;
					} else {
						x++;
						direction = 1;
					}
				} else if(the_room[y].charAt(x) == '2') {
					if(the_room_check[y][x] != '1') {
						Answer++;
						the_room_check[y][x] = '1';
					}
					if(direction == 1) {
						y++;
						direction = 2;
					} else if(direction == 2) {
						x++;
						direction = 1;
					} else if(direction == 3) {
						y--;
						direction = 4;
					} else {
						x--;
						direction = 3;
					}					
				} else {
					if(direction == 1) {
						x++;
						direction = 1;
					} else if(direction == 2) {
						y++;
						direction = 2;
					} else if(direction == 3) {
						x--;
						direction = 3;
					} else {
						y--;
						direction = 4;
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
