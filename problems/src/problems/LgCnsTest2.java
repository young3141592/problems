package problems;

public class LgCnsTest2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int N = 3;
		int[][] house = {{0,0}, {1,0}};
		int[][] chk = new int[N][2];
		boolean chk_pnt = false;
		int answer = 0;
		int temp = 99999999;
		
		for(int i=0; i<N; i++) {
			answer = 0;
			for(int x=-100; x<=100; x++) {
				for(int y=-100; y<=100; y++) {
					chk_pnt = false;
					for(int k=0; k<i; k++) {
						if(chk[k][0] == x && chk[k][1] == y) {
							chk_pnt = true;
						}
					}
					if(!chk_pnt) {
						for(int j=0; j<house.length; j++) {
							if( temp > (x-house[j][0])*(x-house[j][0]) + (y-house[j][1])*(y-house[j][1]) ) {
								temp = (x-house[j][0])*(x-house[j][0]) + (y-house[j][1])*(y-house[j][1]);
							}
						}
						if(answer <= temp) {
							answer = temp;
							chk[i][0] = x;
							chk[i][1] = y;
						}											
						temp = 99999999;						
					}
				}
			}
		}
	}

}
