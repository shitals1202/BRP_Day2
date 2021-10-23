package classwork.Day2;

import java.util.Arrays;
import java.util.Random;
import java.util.stream.DoubleStream;


public class Stats5{
	public static void main(String[] args) {
		double [] arr = new double[5];
	      Random randNum = new Random();
	      for (int i = 0; i < 5; i++) {
	         arr[i] = randNum.nextInt();
	      }
	      System.out.println("Random numbers = "+Arrays.toString(arr));
	      double max =DoubleStream.of(arr).max().orElse(Double.MAX_VALUE);
	     double min = DoubleStream.of(arr).min().orElse(Double.MIN_VALUE);
	     System.out.println("max: "+max);
	     System.out.println("max: "+min);
		}		
}
	