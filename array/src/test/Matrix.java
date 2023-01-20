package test;

import java.util.ArrayList;
import java.util.List;

public class Matrix {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		char [][] board=new char[5][4];
		
		for(int i=0;i<board.length;i++) {
			for(int j=0;j<board[0].length;j++) {
				board[i][j]='.';
			}
		}
//		.	.	.	.
//		.	.	.	.
//		.	.	.	.
//		.	.	.	.
		
		List<String> rows=new ArrayList<>();
		
		
		for(int i=0;i<board.length;i++) {
			String row=new String(board[i]);
			rows.add(row);
			System.out.println(row);
		}
		
		
		

	}

}
