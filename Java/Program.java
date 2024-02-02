 * Program to calculate the area and the perimeter

package gitTerminal02;

import java.util.Scanner;

public class Program {
	public static double area(double radius) {

		return Math.PI * Math.pow(radius, 2);
	}
	public static double perimeter(double radius) {

		return (2 * Math.PI) * radius;
	}
	public static void main(String[] args) {

		Scanner in = new Scanner(System.in);

		System.out.println("Enter the radius: ");
		double radi = in.nextDouble();

		in.close();

		System.out.println("\nThe area is: " + area(radi));

		System.out.println("\nThe perimeter is: " + perimeter(radi));

	}
}
