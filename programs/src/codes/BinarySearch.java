package codes;

//Time complexity of Binary search is O(log(n))
//Only condition of using BS is to have sorted data.
//If data is not sorted then you first have to sort it and then use BS algorithm


public class BinarySearch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("...Binary Search...");
		int arr[]={10,20,30,40,50,60};
		int num=30;
		
		int index=binarySearch(arr,num);
		System.out.println(index);

	}
	
	public static int binarySearch(int arr[],int num){
	    int len=arr.length;
	    int start=0;
	    int end=len-1;
	    
	    while(start<=end){
	        
	        //New mid as the start/end has been changed
	        int mid=(start+end)/2;
	        
	        if(arr[mid]==num){
	            return mid;
	        }
	        else if(num>arr[mid]){
	            start=mid+1;
	        }else{
	            end=mid-1;
	        }
	        
	   
	    }
	    
	    return -1;
	}

}
