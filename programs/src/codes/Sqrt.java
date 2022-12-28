package codes;

//Square root using Binary search-->log(n)

public class Sqrt {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num=25;
		
		//If num is not perfect square then return nearest lower number's square root.
		//for e.g 24 is not a perfect square of any number hence the answer return by the getSqrt for num 24 will be 4
	
		int sqrt=getSqrt(num);
		
		System.out.println(sqrt);

	}

	private static int getSqrt(int num) {
		int start=1;
		int end=num;
		int sqrt=-1;
		
		while(start<=end) {
			int mid=(start+end)/2;
			
			if(mid*mid==num) {
				return mid;
			}else if(mid*mid>num) {
				end=mid-1;
			}else {
				start=mid+1;
				sqrt=mid;
				
			}
		}
		
		return sqrt;
	}

}
