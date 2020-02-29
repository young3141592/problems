package problems;

public class CheckPrimeNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int number = 177;
		boolean isPrimeNumber = true;
		if(number < 2) {
			isPrimeNumber = false;
		} else if (number == 2 && number == 3) {
			isPrimeNumber = true;
		} else {
			for(int i=2; i<number/2; i++) {
				if(number%i == 0) {
					isPrimeNumber = false;
					System.out.println(i);
				}
			}			
		}

		
		System.out.println(isPrimeNumber);
	}
}
