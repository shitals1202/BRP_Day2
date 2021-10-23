package classwork.Day2;

public class DaysOfWeek{
	public static void main(String[] args) {
		int m=Integer.parseInt(args[0]);
	    int d=Integer.parseInt(args[1]);
	    int y=Integer.parseInt(args[2]);
	    int m0,y0,d0,x;
	    
	    y0=y-(14-m)/m;
	    x=y0+y0/4-y0/100+y0/400;
	    m0=m+12*((14-m)/12)-2;
	    d0=(d+x+(31*m0)/12)%7;
	    System.out.println(d0);
	}
}