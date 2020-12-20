package paketche;

import java.util.Scanner;

public class color_change_06 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Enter a color code ");
		
		Scanner sc = new Scanner(System.in);
		double waveLength = sc.nextDouble();
		
		String answer;
		if (waveLength >= 380 && waveLength < 450) {
			answer = "The color is Violet";
		
		} else if (waveLength >= 450 && waveLength < 495) {
			answer = "The color is Blue";
		
		} else if (waveLength >= 495 && waveLength < 570) {
			answer = "The color is Green";
			
		} else if (waveLength >= 570 && waveLength < 590) {
			answer = "The color is Yellow";
			
		} else if (waveLength >= 590 && waveLength < 620) {
			answer = "The color is Orange";
		
		} else if (waveLength >= 620 && waveLength < 750) {
			answer = "The color is Red"; 
			
		} else {
			answer = "The entered wavelength is not a part of the visible spectrum";
		}
		
		System.out.println(answer);
	}

}
