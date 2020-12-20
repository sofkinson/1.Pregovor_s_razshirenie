package paketche;

import java.util.Scanner;

public class paint_06 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter width:");
		double width = sc.nextDouble();
		System.out.println("Enter height:");
		double height = sc.nextDouble();
		System.out.println("Enter length:");
		double length = sc.nextDouble();
		
		int area = (int) Math.ceil(width * length + 2 * ((width + length) * height));
		
		int fiveLitersPrice = 15, oneLiterPrice = 4;
		int fiveLitersAreaCover = 140, oneLiterAreaCover = 30;
		int fiveLitersBuckets = 0, oneLiterBuckets = 0;
		
		fiveLitersBuckets += area / fiveLitersAreaCover;
		int areaLeft = area % fiveLitersAreaCover;
		oneLiterBuckets = areaLeft / oneLiterAreaCover + ((areaLeft % oneLiterAreaCover != 0) ? 1 : 0);
		
		if (oneLiterBuckets * oneLiterPrice > fiveLitersPrice) {
			oneLiterBuckets = 0;
			fiveLitersBuckets++;
		}
		
		System.out.println("You need " + fiveLitersBuckets + " five liter buckets and " + oneLiterBuckets + " one liter buckets");
		
	}

}
