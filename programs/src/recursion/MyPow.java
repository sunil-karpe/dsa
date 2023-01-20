package recursion;

public class MyPow {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double n=2.000;
		int x=-5;
		
		//Find the result of 5^3
		double power=myPow(n,x);
		
		
		System.out.println(power);

	}

	private static double myPow(double n, int x) {
		
		if(Math.abs(x)<=1)
			return n;
		
		if(x<0) {
			double result =n*myPow(n,Math.abs(x)-1);
			return (1/result);
		}
		return n*myPow(n,Math.abs(x)-1);
		
	}

}
