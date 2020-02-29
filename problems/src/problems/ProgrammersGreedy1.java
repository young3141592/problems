package problems;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;

public class ProgrammersGreedy1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n = 7;
		int[] lost = {2,3,4};
		int[] reserve = {1,2,3,6};
        int answer = 0;
        
        HashSet<Integer> duplicateSet = new HashSet<>();
        for(int i=0; i<lost.length; i++) {
        	for(int j=0; j<reserve.length; j++) {
        		if(lost[i] == reserve[j]) {
        			duplicateSet.add(lost[i]);
        			break;
        		}
        	}
        }

        List<Integer> tempReverse = new ArrayList<>();
        
        for(int i=0; i<reserve.length; i++) {
        	if(!duplicateSet.contains(reserve[i])) {
        		tempReverse.add(reserve[i]);
        	}
        }
        
        HashSet<Integer> set = new HashSet<>();
        for(int i=0; i<lost.length; i++) {
        	if(!duplicateSet.contains(lost[i])) {
        		set.add(lost[i]);
        	}        	
        }
        
        Integer[] newReserve = tempReverse.toArray(new Integer[tempReverse.size()]);
        
        answer = n - set.size();
        Arrays.sort(newReserve);
        for(int i=0; i<newReserve.length; i++) {
        	if(set.contains(newReserve[i])) {
        		answer++;
        		set.remove(newReserve[i]);
        	} else if(set.contains(newReserve[i] - 1)) {
        		answer++;
        		set.remove(newReserve[i] - 1);
        	} else if(set.contains(newReserve[i] + 1)) {
        		answer++;
        		set.remove(newReserve[i] + 1);
        	}
        }
        
        
/*        
        HashSet<Integer> set = new HashSet<>();
        for(int i=0; i<reserve.length; i++) {
        	set.add(reserve[i]);
        }        
        answer = n - lost.length;
        for(int i=0; i<lost.length; i++) {
        	if(set.contains(lost[i] - 1)) {
        		answer++;
        		set.remove(lost[i] - 1);
        	} else if (set.contains(lost[i])) {
        		answer++;
        		set.remove(lost[i]);
        	} else if(set.contains(lost[i] + 1)) {
        		answer++;
        		set.remove(lost[i] + 1);
        	}
        }
*/        
       System.out.println(answer);
        
	}

}
