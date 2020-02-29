package problems;

public class ProgrammersHeap2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int stock = 4;
		int day = 0;
		int temp1 = -1;
		int temp2 = -1;
		int[] dates = {4, 10, 15};
		int[] supplies = {20, 5, 10};
		int k = 30;
		int answer = 0;
		
		for(int i = 0; i < dates.length;) {			
			if(day + stock < dates[i]) {
				i = temp1 + 1;
				day = dates[temp1];
				stock = temp2;
				answer++;
				temp1 = -1;
				temp2 = -1;
				if(day + stock >= k) {
					break;
				}
			} else {
				if(temp2 < supplies[i]) {
					temp2 = supplies[i];
					temp1 = i;
					if(i == dates.length - 1) {
						answer++;
					}
				}
				i++;
			}
		}
		
		System.out.println(answer);		
	}

}
