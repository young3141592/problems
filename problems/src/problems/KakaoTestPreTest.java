package problems;

public class KakaoTestPreTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		class Solution {
		    public boolean solution(int[] arr) {
		        boolean answer = true;
		        
		        java.util.Arrays.sort(arr);
		        
		        for(int i=0; i<arr.length; i++){
		            if(arr[i] != i+1){
		                answer = false;
		                break;
		            }
		        }
		        return answer;
		    }
		}
	}

}
