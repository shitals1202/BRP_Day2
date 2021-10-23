package classwork.Day2;

import java.util.Scanner;

public class WindChill{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter values of T & V");
		double t=sc.nextDouble();
		double v= sc.nextDouble();
		isOperation(t,v);
		sc.close();
	}

	private static void isOperation(double t, double v) {
		double windchill;
		windchill = 35.74+0.6215*t+(0.4575*t-35.75)*Math.pow(v, 0.16);
		System.out.println("windchill: "+windchill);
		
	}
}