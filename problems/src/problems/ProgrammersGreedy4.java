package problems;

public class ProgrammersGreedy4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String name = "JAN";
		int answer = 0;
		int temp = 0;
		
		for(int i=0; i<name.length(); i++) {
			temp = ((name.charAt(i) - 'A') >= ('Z' - name.charAt(i) + 1))?('Z' - name.charAt(i) + 1):(name.charAt(i) - 'A');
			answer = answer + temp;
		}		
		temp = 0;
		if(name.charAt(1) == 'A') {
			for(int i=1; i<name.length(); i++) {
				if(i == name.length() - 1 && name.charAt(i) == 'A') {
					temp = i;
					break;
				} if(name.charAt(i) != 'A') {
					temp = i - 1;
					break;
				}
			}
			answer = answer + name.length() - 1 - temp;
		} else {
			for(int i=name.length(); i>=0; i--) {
				if(i == 0 && name.charAt(i) == 'A') {
					temp = name.length();
					break;
				} else {
					temp = name.length() - i;
					break;
				}
			}
			answer = answer + name.length() - temp - 1;
		}		
		
		System.out.println(answer);
	}

}
