import java.util.*;

public class Matrix {
	public static final int MAX = 100;

	public static void main(String[] args) {
		int[][] arr = new int[MAX][MAX];
		Scanner sc = new Scanner(System.in);
		System.out.print("Please enter number of row: ");
		int row = sc.nextInt();
		System.out.print("Please enter number of column: ");
		int column = sc.nextInt();
// INPUT ARRAY INPUT ARRAY INPUT ARRAY INPUT ARRAY INPUT ARRAY 
		for (int i = 0; i < row; i++) {
			for (int j = 0; j < column; j++) {
				System.out.printf("arr[%d][%d]= ", i, j);
				arr[i][j] = sc.nextInt();
			}
		}
		sc.close();
// OUTPUT ARRAY OUTPUT ARRAY OUTPUT ARRAY OUTPUT ARRAY OUTPUT ARRAY
		for (int i = 0; i < row; i++) {
			for (int j = 0; j < column; j++) {
				System.out.printf("%5d", arr[i][j]);
			}
			System.out.println();
		}
		
// FIND SUM OF MAX ROW FIND SUM OF MAX ROW FIND SUM OF MAX ROW	
		int maxRow = 0;
		for (int i = 0; i < row; i++) {
			int sumRow = 0;
			for (int j = 0; j < column; j++) {
				sumRow += arr[i][j];
			}
			if (sumRow > maxRow)
				maxRow = sumRow;
		}

// FIND LINE OF MAX ROW FIND LINE OF MAX ROW FIND LINE OF MAX ROW 
		for (int i = 0; i < row; i++) {
			int checkSumRow = 0;
			for (int j = 0; j < column; j++) {
				checkSumRow += arr[i][j];
			}
			if (checkSumRow == maxRow) {
				System.out.println(i);
				break;
			}

		}
		
// FIND SUM OF MAX COLUMN FIND SUM OF MAX COLUMN FIND SUM OF MAX COLUMN	
				int maxColumn = 0;
				for (int i = 0; i < row; i++) {
					int sumColumn = 0;
					for (int j = 0; j < column; j++) {
						sumColumn += arr[j][i];
					}
					if (sumColumn > maxColumn)
						maxColumn = sumColumn;
				}

// FIND LINE OF MAX COLUMN FIND LINE OF MAX COLUMN FIND LINE OF MAX COLUMN 
				for (int i = 0; i < row; i++) {
					int checkSumColumn = 0;
					for (int j = 0; j < column; j++) {
						checkSumColumn += arr[j][i];
					}
					if (checkSumColumn == maxColumn) {
						System.out.println(i);
						break;
					}

				}
		
		
		

	}

}
