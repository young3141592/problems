package problems;

import java.util.LinkedList;
import java.util.Queue;

public class ProgrammersStack4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] progresses = {93, 30, 55};
		int[] speeds = {1, 30, 5};
        //int[] cal = new int[progresses.length];
        int temp_ = 0;
        int cnt = 0;
        int q_size = 0;
        Queue<Integer> temps = new LinkedList<>();
        Queue<Integer> q = new LinkedList<>();
        Queue<Integer> cals = new LinkedList<>();
        
        for(int i=0; i<progresses.length; i++) {
        	if((100-progresses[i])%speeds[i] == 0) {
        		cals.add((100-progresses[i])/speeds[i]);
        	} else {
        		cals.add((100-progresses[i])/speeds[i] + 1);
        	}
        }
        
        while(cals.size() != 0) {
        	temps.clear();
        	for(Integer cal : cals) {
        		temps.add(cal);
        	}
        	cals.clear();
        	temp_ = temps.poll();
        	cnt = 1;
        	for(Integer temp : temps) {
        		if(temp <= temp_) {
        			cnt++;
        		} else {
        			cals.add(temp);
        		}
        	}

        	q.add(cnt);
        }
/*        
        temp = cal[0];
        for(int k=1; k < cal.length; k++) {
        	cnt++;
        	if(temp < cal[k] || k == cal.length - 1) {
        		q.add(cnt);
        		cnt = 1;
        		temp = cal[k];
        	}
        }
        q.add(cnt);
*/        
        q_size = q.size();
	        
		int[] answer = new int[q_size];
	
		for(int i=0; i<q_size; i++) {
			answer[i] = q.poll();
		}
        for(int j=0; j<answer.length; j++) {
        	System.out.println(answer[j]);
        }
	}
}
