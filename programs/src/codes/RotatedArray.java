package codes;

public class RotatedArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("...Binary Search in one time rotated array...");
		int arr[]={5,6,7,8,1,2,3};
		int num=1;
		
		int index=BinarySearch(arr,num);
		System.out.println(index);

	}

	private static int BinarySearch(int[] arr, int num) {
		// TODO Auto-generated method stub
		int len=arr.length;
		int start=0;
		int end=len-1;

		
		while(start<=end) {
			int mid=(start+end)/2;
			if(arr[mid]==num) {
				return mid;
			}
			else if(arr[start]<=arr[mid]) {
				if(arr[start]<=num&&num<=arr[mid]) {
					end=mid-1;
				}else {
					start=mid+1;
				}
			}else {
				if(arr[mid]<=num&&num<=arr[end]) {
					start=mid+1;
				}else {
					end=mid-1;
				}
			}
			
		}
		
		
		return -1;
	}

}
