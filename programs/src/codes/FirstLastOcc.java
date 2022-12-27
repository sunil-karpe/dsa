package codes;

public class FirstLastOcc {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println("...Binary Search...");
		int arr[]={10,20,30,30,30,40,50,60};
		int num=30;
		
		BinarySearch(arr,num);
		

	}
	
	public static void BinarySearch(int arr[],int num) {
		int len=arr.length;
		int first=-1,last=-1;
		int start=0,end=len-1;
		
		
		while(start<=end) {
			
			int mid=(start+end)/2;
			
			if(arr[mid]==num) {
				first=mid;
				end=mid-1;
			}else if(num>arr[mid]) {
				start=mid+1;
			}else {
				end=mid-1;
			}
		}
		
		start=0;
		end=len-1;
		
		while(start<=end) {
			
			int mid=(start+end)/2;
			
			if(arr[mid]==num) {
				last=mid;
				start=mid+1;
			}else if(num>arr[mid]) {
				start=mid+1;
			}else {
				end=mid-1;
			}
		}
		
		
		System.out.println(first+" "+last);
	}
	
	

}
