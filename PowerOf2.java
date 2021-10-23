package classwork.Day2;

import java.util.Scanner;

public class PowerOf2{
	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter a number:");
		int num = sc.nextInt();
		System.out.println("number"+num);
		int a=0;
		if (num>0 && num<32) {
		while(a<=num) {
			System.out.println(" " +Math.pow(2 ,a ));
			a=a+1;
		}
		}
		sc.close();
	}
}