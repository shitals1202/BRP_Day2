package classwork.Day2;

public class FlipCoin{
	public static void main(String[] args) {
		int toss =1, headcount =0, tailcount =0, result;
		double tailper,headper;
		toss = (int) (Math.random()*100);
		CoinToss cls = new CoinToss();
		int i=toss;
		while(i>0) {
			 result =cls.flip();
			 if(result ==0)
			 {
				 headcount += 1;
			 }
			 else
			 {
				 tailcount += 1;
			 }
			 i = i -1;
			 }
		System.out.println("Head count:"+headcount);
		System.out.println("Tail count:"+tailcount);
		System.out.println("Total count:"+toss);
		headper=  (double)headcount/toss;
		tailper = (double)tailcount / toss;
		System.out.println( "Head percentage:  "+headper+" TailPercentage"+ tailper);
	}
}