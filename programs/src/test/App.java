package test;

public class App {

	public static void main(String a[]) {
		
		String s=convert("PAYPALISHIRING",4);
	}

	public static String convert(String s, int numRows) {
		char[][] arr = new char[numRows][8];

		int j = 0, i = 0, count = 0, temp = 1;

		while (count < s.length()) {

			if (i == 0) {
				while (i < numRows && count < s.length()) {
					System.out.println(s.charAt(count));
					arr[i][j] = s.charAt(count++);

					i++;
				}
				--i;
			} else {

				while (i != 0 && count < s.length()) {
					i--;
					j++;
					System.out.println(s.charAt(count));
					arr[i][j] = s.charAt(count++);

				}
			}

		}

		for (int k = 0; k < numRows; k++) {
			for (int l = 0; l < 8; l++) {
				System.out.print(arr[k][l] + " ");
			}
			System.out.println();
		}

		return "null";

	}

}
