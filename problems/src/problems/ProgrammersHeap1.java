package problems;

import java.util.PriorityQueue;

public class ProgrammersHeap1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] scoville = {1, 2, 3, 9, 10, 12};
		int K = 7;
		int answer = 0;
		int temp1 = 0, temp2 = 0;
		
		PriorityQueue<Integer> pq_sco = new PriorityQueue<Integer>();
		for(int i=0; i < scoville.length; i++) {
			pq_sco.add(scoville[i]);
		}
		
		while(pq_sco.size() > 1 && pq_sco.peek() < K) {
			temp1 = pq_sco.poll();
			temp2 = pq_sco.poll();
			pq_sco.add(temp1 + (temp2*2));
			answer++;
		}
			
		if(pq_sco.size() <= 1) {
			if(pq_sco.peek() < K) {
				answer = -1;
			} 
		} 		
		
		System.out.println(answer);
	}

}
