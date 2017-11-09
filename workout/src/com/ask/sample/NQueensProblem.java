package com.ask.sample;

public class NQueensProblem {

	public static void main(String[] args) {
		NQueensProblem nQueensProblem = new NQueensProblem();
		int board[][] = { { 0, 0, 0, 0 }, { 0, 0, 0, 0 }, { 0, 0, 0, 0 }, { 0, 0, 0, 0 } };
		System.out.println(nQueensProblem.solveNQueenProblem(board, 0));
		System.out.println(board);
	}

	private boolean solveNQueenProblem(int[][] input, int col) {
		int length = input.length;
		if (col >= length) {
			return true;
		}
		if (input[0][2] == 1) {
			System.out.println("dsfsdf");
		}
		for (int i = 0; i < length; i++) {

			if (isSafe(input, i, col)) {
				input[i][col] = 1;
				if (solveNQueenProblem(input, col+1) == true) {
					return true;
				}
				input[i][col] = 0;
			}

		}

		return false;

	}

	private boolean isSafe(int[][] input, int row, int col) {

		if (row == 0 && col == 0) {
			return true;
		}

		int i, j;

		for (i = row, j = col; i >= 0 && j >= 0; i--, j--) {
			if (input[i][j] == 1)
				return false;
		}

		for (i = row, j = col; i < input.length && j >= 0; i++, j--) {
			if (input[i][j] == 1)
				return false;
		}

		for (i = row; i >= 0; i--) {
			if (input[i][col] == 1)
				return false;
		}
		
		for (j = col; j >= 0; j--) {
			if (input[row][j] == 1)
				return false;
		}

		return true;
	}

}
