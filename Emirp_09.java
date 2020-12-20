package paketche;

public class Emirp_09 {

	public static void main(String[] args) {
		int count = 0;
		int number = 3;
		
		while (count < 120) {
			
			if (!isPrime(number) || isPalindrom(number) || !isPrime(reversedNumber(number)))  {
				number += 2;
				continue;
			}
			
			System.out.print(number + "\t");
			count++;
			number += 2;
			if (count % 10 == 0) {
				System.out.println();
			}
		}
	}
	
	public static boolean isPrime (int aNumber) {
		int maxDivider = (int)Math.ceil(Math.sqrt(aNumber));
		boolean isPrime = true;
		for (int i = 2; i <= maxDivider; i++) {
			if (aNumber % i == 0) {
				isPrime = false;
				break;
			}
		}
		
		return isPrime;
		
	}
	
	public static boolean isPalindrom (int aNumber) {
		return aNumber == reversedNumber(aNumber);
		
	}
	
	public static int reversedNumber(int aNumber) {
		int copyNumber = aNumber;
		int reversedNumber = 0;
		while (copyNumber != 0) {
			int reminder = copyNumber % 10;
			reversedNumber = reversedNumber * 10 + reminder;
			copyNumber /= 10;
		}
		
		return reversedNumber;
		
	}
}
