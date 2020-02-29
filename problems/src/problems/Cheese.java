package problems;

import java.util.Scanner;

public class Cheese {
	static int m, n;
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		m = sc.nextInt();
		n = sc.nextInt();
	}
	
	int chk_cheese(int x, int y){
		int direction_x[] = {-1, 0, 1, 0};
		int direction_y[] = {0, -1, 0, 1};
		int rtrn = -1;
/*
		for(int i=0; i<=3; i++){
			for(int j=0; j<=3; j++){
				if(x+i > 0 and x+i < n-1 and y+j >0 and y+j < m-1){
					if(plate[x+i][y+j] == 0){
						rtrn = 1;
					}
				}			
			}
		}
*/
		return rtrn;
	}


}
