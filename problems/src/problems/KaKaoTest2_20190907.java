package problems;

public class KaKaoTest2_20190907 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String p = "()";
		String answer = "";
		
		answer = changeBracket(p);
		
		System.out.println(answer);
	}
	
	static public String changeBracket(String ts) {
		int sum = 1;
		int temp = 0;
        
		if(ts.equals("") || ts.length()==0) {
			return "";
		}
		
		if(correctBraket(ts)) {
			System.out.println(ts);
			return ts;
		}
		
		for(int i=1; i<ts.length(); i++) {
			if(ts.charAt(0) == '(') {
				if(ts.charAt(i) == ')') {
					sum--;
				} else {
					sum++;
				}
			} else {
				if(ts.charAt(i) == '(') {
					sum--;
				} else {
					sum++;
				}
			}
			
			if(sum == 0) {
				temp = i;
				break;
			}
		}
		
		if(temp == ts.length()-1) {
			//System.out.println("1");
			//문자열 변경 및 리턴
			String temp_ = "(";
			for(int i=1; i<ts.length()-1; i++) {
				if(ts.charAt(i) == '(') {
					temp_ += ')';
				} else {
					temp_ += '(';
				}
			}
			temp_+= ")";
			return temp_;
		} else {
			//System.out.println("2");
			//System.out.println(ts.substring(0, temp+1));
			//System.out.println(ts.substring(temp+1, ts.length()));
			return changeBracket(ts.substring(0, temp+1)) + changeBracket(ts.substring(temp+1, ts.length()));	
		}
	}
	
	static public boolean correctBraket(String ts) { 
		int sum = 0;
		for(int i=0; i<ts.length(); i++) {
			if(ts.charAt(i) == '(') {
				sum++;
			} else if(ts.charAt(i) == ')') {
				if(sum<=0) {
					return false;
				} else {
					sum--;
				}
			}
		}
		if(sum==0) {
			return true;
		} else {
			return false;
		}
	}
}
