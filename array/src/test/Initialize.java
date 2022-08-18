package test;

public class Initialize {

	public static void main(String[] args) {
	
		System.out.println("Array Initialize program!");
		
		int arr[]= new int[5];
		int brr[]=new int[] {10,20,30,40,50};
		
//		System.out.println(arr); print the address of array
//		System.out.println(arr[6]);throws array indexoutofbount excetion as the array contains only 5 elements
//		System.out.println(arr[-1]);arrayIndexOutOfbound exception
		
		//initialize elements
		for(int i=0;i<arr.length;i++) {
			arr[i]=i;
		}
		
		
		//access the array element
		for(int i=0;i<arr.length;i++) {
			System.out.println(arr[i]);
		}
		
		for(int ele:brr) {
			System.out.println(ele);
		}
		
		
		
			

	}

}
