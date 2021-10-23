package classwork.Day2;

import java.util.Scanner;

public class HarmonicNumber{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter nth number");
		int n = sc.nextInt();
		double result =0.0;
		System.out.println("Harmonic series is: ");
		while(n>0) {
			result = result +(double)1/n;
			n--;
			System.out.println(result+" ");
		}
	}
}