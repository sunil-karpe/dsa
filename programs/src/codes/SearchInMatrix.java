package codes;

//Search element in matrix using Binary search-->log(n*m)
public class SearchInMatrix {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int [][]arr= {{11,12,13,14},{15,16,17,18},{19,20,21,22},{23,24,25,26}};
		int num=17;
		int M=arr[0].length;
		int N=arr.length;
		
		for(int []i:arr) {
			for(int j:i) {
				System.out.print(j+" ");
				
			}
			System.out.println();
		
		}
		
		boolean result=findInMatrix(arr,num,N,M);
		System.out.println(result);
		
			
	}

	private static boolean findInMatrix(int[][] arr, int num,int N,int M) {
		//treating the matrix elements as an single array elements 11,12,13,14,15.....26
		int start=0;
		int end=(N*M)-1;
		
		while(start<=end) {
			int mid=(start+end)/2;
			
			//Finding the mid element position in matrix
			int i=mid/N;	// --->row position
			int j=mid%M;	// --->column position
			
			if(arr[i][j]==num) {
				System.out.println(num+" is present at ["+i+","+j+"]");
				return true;
			}else if(num>arr[i][j]) {
				start=mid+1;
			}else {
				end=mid-1;
			}
		}
		
		return false;
	}

}
