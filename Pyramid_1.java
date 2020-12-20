package paketche;

import java.util.Scanner;

public class Pyramid_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		int numberOfRows = sc.nextInt();
		for (int i = 0; i < numberOfRows; i++) {
			for (int j = numberOfRows - i; j > 0; j--) {
				System.out.print(j + " ");
			}
			
			for (int j = 2; j <= numberOfRows - i; j++) {
				System.out.print(j + " ");
			}
			
			System.out.println();
			
		}

	}

}
