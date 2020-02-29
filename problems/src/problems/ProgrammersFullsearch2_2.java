package problems;

import java.util.HashSet;
import java.util.Set;

public class ProgrammersFullsearch2_2 {

	 
	
	public static void main(String[] args) {
		String number = "0123";
		int answer = 0;
		Set<String> si;
		
		for(int i=0; i<number.length(); i++) {
			
		}
		
		si = makeNumber(number);
		
		answer = si.size();
		
		System.out.println(answer);
	}
	private static Set<String> makeNumber(String inputNumber) {
		Set<String> ss = new HashSet();
		String temp = "";
		
		if(inputNumber.length() == 2) {
			ss.add(inputNumber.charAt(0) + inputNumber.charAt(1) + "");
			ss.add(inputNumber.charAt(1) + inputNumber.charAt(0) + "");
		} else {
			for(int i=0; i<inputNumber.length(); i++) {
				if(i==0 || i==inputNumber.length() - 1) {
					if(i==0) {
						temp = inputNumber.substring(1);	
					} else {
						temp = inputNumber.substring(0, inputNumber.length() -2);
					}
				}
				for(String s : makeNumber(temp)) {
					ss.add(inputNumber.charAt(i) + s);
				}
			}
		}
		
		return ss;
	}
	
	public static boolean isPrimeNumber(int number) {
		// TODO Auto-generated method stub
		boolean isPrimeNumber = true;
		if(number < 2) {
			isPrimeNumber = false;
		} else if (number == 2 && number == 3) {
			isPrimeNumber = true;
		} else {
			for(int i=2; i<number/2; i++) {
				if(number%i == 0) {
					isPrimeNumber = false;
					break;
				}
			}			
		}

		return isPrimeNumber;
	}
}
