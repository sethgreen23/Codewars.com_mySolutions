public class SudokuValidator {

	public static boolean check(int[][] sudoku) {
		int[] sumColumns = new int[] {0,0,0,0,0,0,0,0,0};
		int[] sumLines = new int[] {0,0,0,0,0,0,0,0,0};
		int[][] sumBoard = new int[3][3];
		
		//Checking Vertical and Horizonal Lines
		for (int i = 0; i < 9; i++) {
			for (int j = 0; j < 9; j++)  {
				int n = (sudoku[i][j] * sudoku[i][j]);		
				
				sumLines[i] = ((sumLines[i]) + n);
				sumColumns[j] = ((sumColumns[j]) + n);
				sumBoard[(i/3)][(j/3)] = (sumBoard[(i/3)][(j/3)]) + n;

				if (i == 8 && sumColumns[j] != 285) break;
			} 
		
			if (sumLines[i] != 285) break;
		}
	  
		//Checking Blocks
		for (int k = 0; k < 3; k++)  {
			for (int l = 0; l < 3; l++) {
				if (sumBoard[k][l] != 285) return false;
			}
		}			
		return true;
    }
}
