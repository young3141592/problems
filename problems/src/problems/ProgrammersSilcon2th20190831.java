package problems;

public class ProgrammersSilcon2th20190831 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[][] office = {{1,0,0,0},{0,0,0,1},{0,0,1,0},{0,1,1,0}};	 
		int k = 2;
		int answer = 0;
		
		for(int i=0; i<=office.length - k; i++) {
			for(int j=0; j<=office.length - k ;j++) {
				int temp = 0;
				for(int l=0; l<k; l++) {
					for(int m=0; m<k; m++) {
						temp += office[i+l][j+m];
					}
				}
				if(temp > answer) {
					answer = temp;
				}
			}
		}
		
		System.out.println(answer);
	}

}
