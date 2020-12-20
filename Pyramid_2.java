package paketche;

import java.util.Scanner;

public class Pyramid_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		int numberOfRows = sc.nextInt();
		for (int i = 0; i < numberOfRows; i++) {
			for (int j = 0; j < i; j++) {
				System.out.print(" ");
			}
			
			for (int j = 0; j < numberOfRows - i; j++) {
				System.out.print("*");
			}
			
			System.out.println();
			
		}

	}

}
