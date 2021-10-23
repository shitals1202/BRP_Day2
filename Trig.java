package classwork.Day2;

import java.util.Scanner;

public class Trig{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the angle");
		double angle = sc.nextDouble();
		isOperation(angle);
		sc.close();
	}

	private static void isOperation(double angle) {
		double rad;
		rad = angle* (3.14/180);
		System.out.println("Radian : "+rad);
		double radians = Math.toRadians(rad);
		System.out.println("Toradian: "+radians);
		double sin = Math.sin(rad);
		System.out.println("Sin: "+sin);
		double cos = Math.cos(rad);
		System.out.println("Cos: "+cos);
	}
}