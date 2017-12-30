package com.ask.sample;

public class MatrixRotation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		int mat[][] = { { 1, 2, 3, 4 }, { 5, 6, 7, 8 }, { 9, 10, 11, 12 }, { 13, 14, 15, 16 } };
		int mat[][] = {
                {1, 2, 3},
                {4, 5, 6},
                {7, 8, 9}
            };
		MatrixRotation matrixRotation = new MatrixRotation();

		matrixRotation.rotateArray(mat.length-1, mat, 90);
		System.out.println(mat);

	}

	private void rotateArray(int length, int[][] mat, int degree) {
		int degreeRotation = degree / 30;
		for (int i = 0; i <= length / 2; i++) {
			for (int j = 0; j < degreeRotation; j++) {
				for (int index = 0; index < length-(2*i); index++) {
					int tmp1 = mat[i][index+i];
					int tmp2 = mat[index+i][length-i];
					int tmp3 = mat[length-i][length-index-i];
					int tmp4 = mat[length-index-i][i];
					
					mat[index+i][length-i] = tmp1;
					mat[length-i][length-index-i] = tmp2;
					mat[length-index-i][i] = tmp3;
					mat[i][index+i] = tmp4;
					
//					mat[i][index-i] = mat[index-i][length-i];
//					
//					mat[index-i][length-i] = mat[length-index][length-i];
//					
//					mat[length-index][length-i] = mat[length-index][index-i];
//					
//					mat[length-index][index-i] = mat[length-i][length-i];
				}

			}

		}

	}

	}
