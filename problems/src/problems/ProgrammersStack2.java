package problems;

import java.util.ArrayList;
import java.util.List;

public class ProgrammersStack2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] priorities = {1, 1, 9, 1, 1, 1};
		int location = 0;
		int prsnt_loc = 0;
		boolean flag = false;
		int answer = 0;		
		
		List<Integer> list = new ArrayList<>();
		
		while(true) {
			for(int i=0; i<priorities.length; i++) {
				if(priorities[prsnt_loc] < priorities[i]) {
					flag = true;
				}
//				System.out.println(prsnt_loc+ "||" + flag);
			}			
			if(flag == false) {
				priorities[prsnt_loc] = 0;
				answer++;
			}				

			System.out.println(prsnt_loc + "||" + flag);
			if(prsnt_loc == location && flag == false) {
				System.out.println(answer);
				break;				
			}
			
			if(prsnt_loc == priorities.length - 1) {
				prsnt_loc = 0;
				flag = false;
			} else {
				prsnt_loc++;
				flag = false;
			}
		}
		System.out.println(answer);
	}

}
