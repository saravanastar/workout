package com.ask.sample;

import java.util.Scanner;

public class MatrixLayerRotation {
	public static void main(String[] args) {
		
		Scanner userInput = new Scanner(System.in);
		int arrayDimension1 = userInput.nextInt();
		int arrayDimension2 = userInput.nextInt();
		int rotation = userInput.nextInt();
		int[][] inputArray = new int[arrayDimension1][arrayDimension2];
		for (int i = 0; i < arrayDimension1; i++) {
			for (int j = 0; j < arrayDimension2; j++) {
				inputArray[i][j] = userInput.nextInt();
			}
		}
		
		for (int i = 0; i < rotation; i++) {
			rotateArray(inputArray, 0,0);
		}
		printArray(inputArray);
		userInput.close();
		
	}

	private static void rotateArray(int[][] inputArray, int i, int j) {
		// TODO Auto-generated meth	od stub
		int maxRota = inputArray[1].length/2;
		if (maxRota > j) {
			int currenti = i;
			int currentj = j;
			int height = inputArray.length;
			int width = inputArray[0].length;
			
			int temp = 0;
			do {
			/*	if (temp == 0) {
					
					inputArray[currenti+1][currentj];
				}*/
				if (temp ==0) {
					temp = inputArray[currenti][currentj];
				}
				if (currenti+(i+1) >= height) {
					if( currentj+(j+1)>= width ) {
						currenti--;
					} else {
						currentj++;
					}
				} else {
					if (currenti+(i+1) <= height) {
						if(currentj+(j+1) >= width) {
							if(currenti-(i+1) >=0){
								currenti--;
							} else{
								currentj--;
							}
						} else{
							if(currenti+(i) ==i && currentj-(j+1) >=0){
								currentj--;
							} else{
								currenti++;
							}
							
						}
						
					}
				}
			/*	if () {
					if (currentj+(j+1) <= width) {
						currenti++;
					} else {
						currentj--;
					}
				} else {
					if (height < currenti+(i+1)) {
						currenti++;
					} else {
						currentj--;
					}
				}*/
				int temp1= inputArray[currenti][currentj];
				inputArray[currenti][currentj] = temp;
				temp = temp1;
				
			} while(i!=currenti || j != currentj);
//			printArray(inputArray);
			rotateArray(inputArray, i+1,j+1);
		}
		
	}

	private static void printArray(int[][] inputArray) {
		// TODO Auto-generated method stub
		
		for (int i = 0; i < inputArray.length; i++) {
			for (int j = 0; j < inputArray[0].length; j++) {
				System.out.print(inputArray[i][j] + "\t");
			}
			System.out.println("");
			
		}
		System.out.println("");
	}

}
