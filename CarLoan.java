package classwork.Day2;

import java.util.Scanner;

public class CarLoan{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the values of P,Y,R");
		double p = sc.nextDouble();
		double y = sc.nextDouble();
		double R = sc.nextDouble();
		isOperation(p,y,R);
		sc.close();
	}

	private static void isOperation(double p, double y, double R) {
		double n,r,payment;
		n= 12 * y;
		System.out.println("The Value of N is: "+n);
		r = R / (12*100);
		System.out.println("The Value of r is: "+r);
		payment = (p*r)/(1-Math.pow((1+r), (-n)));
		System.out.println("The Payment is: "+payment);
	}
}