package problems;

public class ProgrammersHash2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String[] phone_book = {"12232332", "12", "222222"};
		boolean answer = true;
		
        loop : for(int i=0; i<phone_book.length; i++) {	        	
			for(int j=i+1; j<phone_book.length; j++) {
				if(phone_book[i].length() <= phone_book[j].length()) {
					if(phone_book[i].equals(phone_book[j].substring(0, phone_book[i].length()))) {
						answer = false;
						break loop;
					}
				} else {
					if(phone_book[j].equals(phone_book[i].substring(0, phone_book[j].length()))) {
						answer = false;
						break loop;
					}					
				}
				
					
/*					
				if(phone_book[i].indexOf(phone_book[j]) !=  -1 || phone_book[j].indexOf(phone_book[i]) != -1) {						
						answer = false;									
						break loop;
				}
*/
			}        
        }		
/*		
		for(int i=0; i<phone_book.length; i++) {
			for(int j=i+1; j<phone_book.length; j++) {
				if(phone_book[i].length() <= phone_book[j].length()) {
					if((i != j) && phone_book[j].contains(phone_book[i])) {		
						System.out.println(phone_book[i]+"|"+phone_book[j]);
						answer = false;
					}
				}				
			}
		}
*/		
		System.out.println(answer);
	}
}
