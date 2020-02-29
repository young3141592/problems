package problems;

public class ProgrammersSilcon1th20190831 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        String phrases = "happy-birthday";
        String answer = "";
        int second = 20;
        int secondChange = second%28;
        
        if(secondChange > phrases.length()*2) {
        	answer = "______________";
        } else {
        	if(secondChange >= phrases.length() ) {
        		String temp = "";
        		for(int i=0; i<secondChange - phrases.length(); i++) {
        			temp += "_"; 
        		}
        		answer = phrases.substring(secondChange - phrases.length(), phrases.length()) + temp;
        	} else {
        		String temp = "";
        		for(int i=0; i<phrases.length() - secondChange; i++) {
        			temp += "_"; 
        		}
        		answer = temp + phrases.substring(0, secondChange);
        	}
        }
        
        System.out.println(answer);
	}

}
