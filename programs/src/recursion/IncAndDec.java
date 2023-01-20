package recursion;

public class IncAndDec {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n=5;
		incDec(n);

	}

	private static void incDec(int n) {
		
		if(n==0)
			return;
		
		//Will print the element in sequence from n to 1. '*' is used for differentiating the result 
		//of this print statement from the other print statement.
		System.out.println(n+"*");
		
		//After printing n, it will invoke itself again to print n-1
		incDec(n-1);
		
		//This statement will execute after base condition is achieved. So we will invoke function many time 
		//unless we incounter the base condition and then will execute the action (return/ print the values)
		//Hence incDec(5)--->incDec(4).....->incDec(0) and then second print statement(below one) will start printing the value
		// i.e 1 as incDec(1) will totally resolved then 2,3,4 and 5
		System.out.println(n);
		
//		return n;
	}

}
