package problems;

public class ProgrammersSilcon3th20190831 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] estimates = {1, 1, 9, 3, 7, 6, 5, 10};
		int k = 4;
		int answer = 0;
		
		for(int i=0; i<=estimates.length - k; i++) {
			int temp = 0;
			for(int j=0; j<k; j++) {
				temp += estimates[i+j];
			}
			if(temp > answer) {
				answer = temp;
			}
		}
		
		System.out.println(answer);
	}

}
