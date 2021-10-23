package classwork.Day2;

import java.util.Scanner;

public class TemperatureConversion{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter values for celsius and fahrenheit");
		double celsius = sc.nextDouble();
		double fahrenheit = sc.nextDouble();
		isOperation(celsius,fahrenheit);
		sc.close();
	}

	private static void isOperation(double celsius, double fahrenheit) {
		double f, c;
		f = (celsius * 9/5)+32;
		c = (fahrenheit-32)*5/9;
		System.out.println("celsius to fahrenheit: "+f);
		System.out.println("fahrenheit to celsius: "+c);
	}
}