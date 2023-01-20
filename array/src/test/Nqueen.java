package test;
import java.util.*;

public class Nqueen {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n=4;
		List<List<String>>result=new ArrayList<>();
		result=solve(result,n);
		displayResult(result);
		
	}
	
	//Build the initial board and call the main Nqueen logic
	public static List<List<String>> solve(List<List<String>>result,int n) {
		
		char [][]board=new char[n][n];
		
		for(int i=0;i<board.length;i++) {
			for(int j=0;j<board[i].length;j++) {
				board[i][j]='.';
			}
		}
		
		queenLogic(0,board,result);
		return result;
	}
	
	
	//Core logic for adding the queen in the board as per the problem statement.
	//Finding out the different scenarios in which multiple boards can be formed
	//by changing the queens positions in column(provided that it should meet the given condition.)
	//Each valid board can be stored in the 'result' variable
	
	/* 
	 
	 valid board for n=4
	 
	 . Q . .
	 . . . Q
	 Q . . .
	 . . Q .
	 
	 
	 . . Q .
	 Q . . .
	 . . . Q
	 . Q . .
	 
	 
	 
	 */
	
	public static void queenLogic(int col,char[][]board,List<List<String>>result) {
		
		//Congrates!!! we got the valid board where we placed n queens following the given rules.
		if(col==board[0].length) {
			
			List<String>valid_board=buildValidBoard(board);
			result.add(valid_board);
			return;
		}
		
		//Crucial logic for adding the queen in the particular row of the column
		for(int row=0;row<board.length;row++) {
			
			if(checkQueen(board,row,col)) {
				board[row][col]='Q';
				queenLogic(col+1,board,result);
				board[row][col]='.';
			}
		}
		
	}
	
	/* 
	 will check if there is queen already present in the same row or present diagonally for the provided position
	 in the board.
	 If it is present then return false and check for the next position.
	 IF true then Queen can be placed at the given position. i.e. board[row][col] 
	  
	 */
	
	public static boolean checkQueen(char[][] board,int row,int col) {
		
		int dup_row=row;
		int dup_col=col;
		
		//left-upward diagonal check
		while(row>=0&&col>=0) {
			if(board[row][col]=='Q') return false;
			
			row--;
			col--;
		}
		row=dup_row;
		col=dup_col;
		
		//left-horizontal diagonal check
		while(row>=0&&col>=0) {
			if(board[row][col]=='Q') return false;
		
			col--;
		}
		
		row=dup_row;
		col=dup_col;
		
		//left-downward diagonal check
		while(row<board.length&&col>=0) {
			if(board[row][col]=='Q') return false;
			
			row++;
			col--;
		}
		
		return true;
		
	}
	
	
	/*
	 will form the string board which can be added into the final result. 
	 */
	public static List<String> buildValidBoard(char[][] board){
		List<String> valid_board=new ArrayList<>();
		
		for(int i=0;i<board.length;i++) {
			String row=new String(board[i]);
			valid_board.add(row);
		}
		
		return valid_board;
	}
	
	
	/*
	 Not part of problem or logic but just to test the final output 
	 */
	
	public static void displayResult(List<List<String>>result) {
		
		for(List<String>board:result) {
			System.out.println("----Board----");
			for(String row:board) {
				System.out.println(row);
			}
			System.out.println();
		}
	}
	

}
