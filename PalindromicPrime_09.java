package paketche;

public class PalindromicPrime_09 {

	public static void main(String[] args) {
		System.out.print(2 + "\t");
		int count = 1;
		int number = 3;
		
		while (count < 120) {
			if (!isPalindrom(number) || !isPrime(number)) {
				number += 2;
				continue;
			}
			
			System.out.print(number + "\t");
			count++;
			number += 2;
			if (count % 15 == 0) {
				System.out.println();
			}
		}
	}
	
	public static boolean isPrime(int aNumber) {
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
	
	public static boolean isPalindrom(int aNumber) {
		int copyNumber = aNumber;
		int reversedNumber = 0;
		while (copyNumber != 0) {
			int remainder = copyNumber % 10;
			reversedNumber = reversedNumber*10 + remainder;
			copyNumber /= 10;
		}
		
		return aNumber == reversedNumber;
	}
	
}