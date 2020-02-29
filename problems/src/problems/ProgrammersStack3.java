package problems;

import java.util.LinkedList;
import java.util.Queue;

public class ProgrammersStack3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int bridge_length = 100;
		int weight = 100;
		int[] truck_weights = {10,10,10,10,10,10,10,10,10,10};
		int bridge_weight = 0;
		int answer = 0;
		Queue<Integer> bridge = new LinkedList<>();
        
        for(int i=0; i<truck_weights.length; i++) {
        	if(bridge.size() >= bridge_length) {
        		bridge_weight -= bridge.poll();
        	}
        	if(weight - bridge_weight >= truck_weights[i]) {
        		bridge.add(truck_weights[i]);
        		answer++;
        		bridge_weight += truck_weights[i];
        	} else {
        		answer += bridge_length - bridge.size();
        		while(weight - bridge_weight < truck_weights[i]) {
        			bridge_weight -= bridge.poll();
        			answer++;
        		}
        		bridge.add(truck_weights[i]);
        		bridge_weight += truck_weights[i];
        	}
        }
        
        answer += bridge_length;
        
/*        
        for(int i=0; i<truck_weights.length; i++) {
        	System.out.println(q.size() + "||" +answer);
        	if(weight >= truck_weights[i]) {
        		if(q.size() <= bridge_length) {
        			if(q.size() < bridge_length) {
            			q.add(truck_weights[i]);
            			weight -= truck_weights[i];
            			if(i==truck_weights.length - 1) {
            				answer = answer + bridge_length + 1;
            			} else {
            				answer++;
            			}            			                		
            		} else {
            			q.add(truck_weights[i]);
            			weight = weight + q.poll() - truck_weights[i];
            			if(i==truck_weights.length - 1) {
            				answer = answer + bridge_length + 1;
            			} else {
            				answer++;
            			}            			
            		}           			
        		} else {
        			//no need
        		}
        	} else {
        		answer += bridge_length - q.size();
        		weight += q.poll();
        		i--;
        	}
        }
*/        
        System.out.println(answer);
	}

}
