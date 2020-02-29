package problems;

public class ProgrammersGreedy2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String number = "1924";
		int k = number.length() - 2;
		String answer = getLargeNumber(number, k);
		
		System.out.println(answer);
	}
	
    public static String getLargeNumber(String num, int nth) {
		String largeNum = "-1";
		int largeIdx = -1;
    	
    	if(nth > 0 && num.length() == nth ) {
    		return "";
    	} else if(num.charAt(0) == '9') {
    		for(int i = 0; i < nth; i++) {
    			if(num.charAt(i) != '9') {
    				largeIdx = i;
    				break;
    			}
    			if(i == 0) {
    				largeNum = "9";
    			} else {
    				largeNum += "9";
    			}
    		}
    		
    		if(largeIdx == -1) {
    			largeIdx = nth;
    		}
    		return largeNum + getLargeNumber(num.substring(largeIdx), nth); 
    	} else if(nth > 0 && num.length() > nth) {
			for(int i = 0; i < nth + 1; i++) {
				if(Integer.parseInt(largeNum) < Character.getNumericValue(num.charAt(i))) {
					largeIdx = i;
					largeNum = Character.toString(num.charAt(i));
				}
			}
			if(largeIdx + 1 >= num.length() || nth - largeIdx == 0) {
				return largeNum;
			} else {
				return largeNum + getLargeNumber(num.substring(largeIdx+1), nth - largeIdx);
			}
		} else {
			return num;
		}
	}
}
