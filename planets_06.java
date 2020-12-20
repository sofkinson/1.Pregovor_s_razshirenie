package paketche;

import java.util.Scanner;

public class planets_06 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println("Enter weight: ");
		Scanner sc = new Scanner(System.in);
		double weight = sc.nextDouble();
		sc.nextLine();
		
		System.out.println("Enter planet of the solar system: ");
		String planet = sc.nextLine();
		
		double convertingCoeff = 1;
		
		switch (planet) {
		case "Mercury" : convertingCoeff = 0.38; break;
		case "Venus" : convertingCoeff = 0.91; break;
		case "Mars" : convertingCoeff = 0.38; break;
		case "Jupiter" : convertingCoeff = 2.36; break;
		case "Saturn" : convertingCoeff = 0.92; break;
		case "Uranus" : convertingCoeff = 0.89; break;
		case "Neptune" : convertingCoeff = 1.13; break;
		}
		
		System.out.println("Your weight on " + planet + " is " + convertingCoeff * weight);

	}

}
