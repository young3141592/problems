package problems;

import java.util.ArrayList;
import java.util.List;

public class ProgrammersFullsearch4 {

	public static void main(String[] args) {
		int[][] baseball = {{123, 1, 1}, {356, 1, 0}, {327, 2, 0}, {489, 0, 1}};
        int answer = 0;
		
        List<String> possible = new ArrayList();

        for(int i=1; i<10; i++) {
        	for(int j=1; j<10; j++) {
        		for(int k=1; k<10; k++) {
        			if(i != j && j != k && k != i) {
        				System.out.println(Integer.toString(i) + Integer.toString(j) + Integer.toString(k));
        				possible.add(Integer.toString(i) + Integer.toString(j) + Integer.toString(k));	
        			}        			
        		}
        	}
        }
        
        int strike = 0;
        int ball = 0;
        
        for(int i=0; i<baseball.length; i++) {
        	for(int j=possible.size()-1; j>=0; j--) {
        		for(int k=0; k<3; k++) {        			
        			for(int l=0; l<3; l++) {
        				if(k==l && possible.get(j).charAt(k) == Integer.toString(baseball[i][0]).charAt(l)) {
        					strike++;
        				} else if (k!=l && possible.get(j).charAt(k) == Integer.toString(baseball[i][0]).charAt(l)) {
        					ball++;
        				}        					
        			}
        		}
        		
        		if(baseball[i][1] != strike || baseball[i][2] != ball) {
        			possible.remove(j);
        		} 
        		
        		// ÃÊ±âÈ­
        		strike = 0;
        		ball = 0;
        	}
        }

        answer = possible.size();
	}
}
